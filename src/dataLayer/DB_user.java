package dataLayer;

import java.sql.*;

public class DB_user {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/webapp";

    static final String USER = "webappuser";
    static final String PASSWORD = "password";

    public boolean isValid(String login, String password){
        boolean isValidUser = false;

        Connection connection = null;
        Statement statement = null;
        String query = "";

        try {
            Class.forName(JDBC_DRIVER);

            System.out.println("Connecting to DB...");
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            System.out.println("Creating statement...");
            statement = connection.createStatement();

            query = "select * from user WHERE login = \"" + login + "\" and password = \"" + password + "\"";
            System.out.println(query);

            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next())
                isValidUser = true;

            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("***ERROR: CLASS NOT FOUND***");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("***ERROR: SQL EXCEPTION***");
            e.printStackTrace();
        } finally {
            try {
                if (statement != null)
                    statement.close();
            } catch (SQLException e) {
                System.out.println("***ERROR: STATEMENT CANNOT BE CLOSED***");
                e.printStackTrace();
            }
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                System.out.println("***ERROR: CONNECTION CANNOT BE CLOSED***");
                e.printStackTrace();
            }
        }
        System.out.println("All is closed. Finished.");

        return isValidUser;
    }
}
