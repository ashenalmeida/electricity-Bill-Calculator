package Class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnetion {

    public Connection connect() {

        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/electricity bill", "root", "");
//            JOptionPane.showMessageDialog(null, "Connection Succesfull");

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return conn;

    }

}
