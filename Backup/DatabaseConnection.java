/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stellar;

/**
 * @author aturn
 */

import java.sql.*;
import javax.swing.*;

public class DatabaseConnection {
    Connection conn = null;

    public static Connection dbConnector() {


        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\IdeaProjects\\Stellar\\src\\stellar\\DataBase.db");
//		JOptionPane.showMessageDialog(null, "Connection Successful");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

}