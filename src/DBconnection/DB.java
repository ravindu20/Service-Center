/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ravindu
 */
public class DB {
        public static Connection mycon() throws ClassNotFoundException, SQLException
    {
    Class.forName("com.mysql.jdbc.Driver");
    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3628/servicecentre","root","");
    
        return c;
    }
}
