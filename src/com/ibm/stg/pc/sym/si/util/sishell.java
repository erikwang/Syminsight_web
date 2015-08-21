package com.ibm.stg.pc.sym.si.util;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.Connection;

public class sishell {

	static Dbconn db;

	
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		Connection conn = null;
		// TODO Auto-generated method stub
		System.out.println("Hello SI!");
		try {
			db = new Dbconn("/proxool.xml");
			conn = db.getConn();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true){
			System.out.println("> Please enter your command / ? for help");
			String name = sca.nextLine();
			
			switch(name){
				case "?":
					//ShowHelp();
					break;
				case "cdb":
					
					break;
				case "l":
					showMessage(conn);
					break;
				case "by":
					System.out.println("bye - thank you for use");
					return;
					
				default:
					System.out.println("Unknown command, please try again. ? for help");
			}
		}
	}
	
	public static void showMessage(Connection conn){
		
		String sql1 = "SELECT * FROM sym.vemkd where func = 'chanPoll'";
		Statement stmt1 = null;
		ResultSet rst1 = null;
		String para1;
		String para2;
		String para3;

		try {
			stmt1 = conn.createStatement();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			rst1 = stmt1.executeQuery(sql1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			try {
				for (;rst1.next();){
					para1 = rst1.getString(1);
					para2 = rst1.getString(2);
					para3 = rst1.getString(3);
					System.out.println("[OUTPUT]"+para1+" "+para2+" "+para3);
				}
				rst1.close();
				stmt1.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		//	allcards.showAllcards();
		//	allcardshash.showAllcards();
	}
	
}