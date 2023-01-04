package Wallet.DataAccess.Context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Talha Bera
 */
public class AppContext {
    private final static String url = "jdbc:mysql://localhost:3306/sswallet";
    private final static Connection CONNECTION;

    static {
        try {
            CONNECTION = DriverManager.getConnection(url, "root", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() {
        return CONNECTION;
    }
}
