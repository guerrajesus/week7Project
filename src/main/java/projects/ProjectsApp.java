package projects;

import projects.dao.DBConnection;

public class ProjectsApp {

	public static void main(String[] args) {

		DBConnection.getConnection();
	}

}
