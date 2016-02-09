package ch.aranea.test;
import java.sql.Connection;
import java.sql.DriverManager;

import org.h2.tools.Server;

public class DBServer {

	public static void main(String[] args) {

		Server server = null;
		try {
			server = Server.createTcpServer("-tcpAllowOthers").start();
		    Server.createWebServer(new String[]{"-webPort", "8085", "-ifExists"}).start();
			Class.forName("org.h2.Driver");
			Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
			System.out.println("Connection Established: " + conn.getMetaData().getDatabaseProductName() + "/" + conn.getCatalog());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
