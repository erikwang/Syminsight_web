<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<TITLE>Eclipse BIRT Home</TITLE>
		<META http-equiv=Content-Type content="text/html; charset=iso-8859-1">
		<LINK href="styles/iv/index.css" type=text/css rel=stylesheet>
		<LINK href="http://www.eclipse.org/images/eclipse.ico" type=image/x-icon rel="shortcut icon">
		<STYLE>
			.warningMessage { color:red; }
		</STYLE>
	<%
		String javaVersion = System.getProperty("java.version");
		String viewerVersion = "4.5.0";
		String engineVersion = "4.5.0";
	%>
	</HEAD>
	<BODY>
		<!-- Page banner -->
		Welcome to Symphony VEMKD performance reporting tool
		<p><a href="<%= request.getContextPath( ) + "/frameset?__report=sym_vemkd_perf.rptdesign" %>">View VEMKD performance report</a>
		<p><a href="<%= request.getContextPath( ) + "/frameset?__report=weeklycoverage.rptdesign" %>">View Symphony NA team coverage report</a>
		<p><a href="<%= request.getContextPath( ) + "/frameset?__report=pmrreview.rptdesign" %>">View PMR review analysis report</a>
		
	</BODY>
</HTML>
