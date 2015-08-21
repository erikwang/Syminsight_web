package com.ibm.stg.pc.sym.si.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ibm.stg.pc.sym.si.widget.Widget;
import com.mysql.jdbc.Connection;

public class VemkdPerfWidget implements Widget {
	Connection conn = null;
	@Override
	public void runWidget() {
		// TODO Auto-generated method stub
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

	@Override
	public void verifyWidget() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean loadWidget() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void getDbConnection(Connection conn1) {
		// TODO Auto-generated method stub
		this.conn = conn1;
		
	}

}
