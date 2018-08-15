package fa.edu.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    private static Properties prop;
    private static String url;
    private static String driver;
    private static Connection conn;

    static {
        try {
            InputStream in = DBConnection.class.getResourceAsStream("db.properties");
            prop = new Properties();
            prop.load(in);
            url = prop.getProperty("url");
            driver = prop.getProperty("driver");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        try {
            Class.forName(driver);
            conn=DriverManager.getConnection(url, prop);
            return conn;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
