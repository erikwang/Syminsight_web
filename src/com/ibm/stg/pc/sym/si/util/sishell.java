package com.ibm.stg.pc.sym.si.util;

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
					VemkdPerfWidget vpwidget = new VemkdPerfWidget();
					vpwidget.getDbConnection(conn);
					vpwidget.runWidget();
					break;
				case "by":
					System.out.println("bye - thank you for use");
					return;
					
				default:
					System.out.println("Unknown command, please try again. ? for help");
			}
		}
	}
	
	public void loadConfig(String _confFile){
		XmlReader xmlReader= new XmlReader();
		String suser = xmlReader.getFromConf("SUSER",_confFile);
		String duser = xmlReader.getFromConf("DUSER",_confFile);
		String spswd = xmlReader.getFromConf("SPSWD",_confFile);
		String dpswd = xmlReader.getFromConf("DPSWD",_confFile);
	}
}