/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Suyog Varpe
 */
public class Tables {
    public static void main(String args[])
    {
        Connection con=null;
        Statement st=null;
        try
        {
            con=ConnectionProvider.getCon();
            st=con.createStatement();
            st.executeUpdate("create table users(name varchar(200), email varchar(200), password varchar(200), securityQuetion varchar(500), answer varchar(200), address varchar(200), status varchar(20))");
            st.executeUpdate("create table room(roomNo varchar(10),roomType varchar(200),bed varchar(200),price int, status varchar(20))");
            st.executeLargeUpdate("create table customer(id int , name varchar(200),mobilenumber varchar(20), nationality varchar(200), gender varchar(50), email varchar(200), idproof  varchar(200), address varchar(500),checkin varchar(50),roomno varchar(10), bed varchar(200), roomtype varchar(200) , priceperday int, numberofdaysstay int, totalamount varchar(200), checkout varchar(50))");
            JOptionPane.showMessageDialog(null, "Table created succesfully");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    finally
        {
             try
             {
                con.close();
                st.close();
             }
            catch(Exception e)
             {
             }
    
        }
    }
}
