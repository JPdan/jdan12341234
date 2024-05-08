/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelsystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author JOHNWELL
 */
public class Client {
    
public class CLIENT {// the client class
// create a function to add a client
    MY_CONNECTION my_connection = new MY_CONNECTION();
public boolean addClient (String fname, String lname, String phone, String email)
{
PreparedStatement st;
ResultSet rs;
String addQuery = "INSERT INTO 'client'('first_name', 'last_name', 'email') VALUES (?,?,?,?)";

        try {
            st = my_connection.createConnection().prepareStatement(addQuery);
            
        st.setString (1, fname);
        st.setString (2, lname);
        st.setString (3, phone);
        st.setString (4, email);
        
           return (st.executeUpdate() > 0);
    
        }catch (SQLException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        
        return false;
        }
        
        
}

public boolean removeClient(int id)
{
    PreparedStatement st;
ResultSet rs;
String deleteQuery = "DELETE FROM 'clients' Where 'id'=?";

        try {
            
            st = my_connection.createConnection().prepareStatement(addQuery);
            
        st.setInt(1, id);
        return (st.executeUpdate() > 0);
        
        } catch (SQLException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        
        return false;
        }
}

public void fillClientJTable() throws SQLException

    
{
PreparedStatement ps; 
ResultSet rs;
String selectQuery= "SELECT FROM 'clients";

try {
    
}
ps = my_connection.createConnection () .preparestatement (selectQuery);

rs = ps.executeQuery();

DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
Object[] row;
while (rs.next())
{
    

row = new Object[5]; 
row [0]= rs.getInt(1); 
row [1]= rs.getString (2); 
row [2]= rs.getString(3); 
row [3]= rs.getString (4); 
row [4]= rs.getString (5);

tableModel.addRow(row);
}

} catch (SQLException ex) {
Logger.getLogger(CLIENT.class.getName()).log (Level. SEVERE, null, ex);
}
}
}


