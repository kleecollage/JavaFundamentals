package fit_zone;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    public static Connection getConnection() {
        Connection connection = null;
        var dataBase = "fit_zone_db";
        var url = "jdbc:mysql://localhost:3306/" + dataBase;
        var user = "root";
        var password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println("Error in connection: " + e.getMessage());
        }

        return connection;
    }

    public static void main(String[] args) {
        var connection = DbConnection.getConnection();
        if (connection != null) {
            System.out.println("Connection successful " + connection);
        } else {
            System.out.println("Connection failed");
        }
    }
}
