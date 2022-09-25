
package com.mycompany.commitrollback;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CommitRollBack{
    static Scanner scanner = new Scanner(System.in);
    private String userId = "root";
    private String password = "";
    private String dbName = "demo";
    private String host =  "localhost";
    private int port = 3306;
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public void commitAndRollBack(){
        try {
            con.setAutoCommit(false);
            String code1 = "DELETE FROM Workers WHERE ID = 3";
            String code2 = "UPDATE Workers SET Email = 'sumerelif@outlook.com' WHERE ID = 3";
            System.out.println("Before Updating:\n");
            getWorkers();
            statement = con.createStatement();
            statement.executeUpdate(code1);
            statement.executeUpdate(code2);
            String answer = "";
            System.out.print("Do you want to save: ");
            answer = scanner.nextLine();
            if(answer.equals("Yes")){
                con.commit();
                System.out.println("Database updated");
            }
            else{
                con.rollback();
                System.out.println("Database reverted");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CommitRollBack.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getWorkers(){
        String code = "SELECT * FROM Workers where id > 2";
        //String code = "SELECT * FROM Workers";
        try {
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery(code);
            while(rs.next()){
                int id = rs.getInt("ID");
                String name = rs.getString("Name");
                String surname = rs.getString("Surname");
                String email = rs.getString("Email");
                System.out.println("*********************************");
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Surname: " + surname);
                System.out.println("Email: " + email);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CommitRollBack.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void addWorkers(){
        System.out.print("Name: ");
        String name = scanner.nextLine(); 
        System.out.print("Surname: ");
        String surname = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        String code = "INSERT INTO Workers (Name,Surname,Email) values (?,?,?)";
        try {
            preparedStatement = con.prepareStatement(code);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,surname);
            preparedStatement.setString(3,email);
            preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CommitRollBack.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void updateWorkers(){
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Email: ");
        String newEmail = scanner.nextLine();
        String code = "UPDATE Workers SET Email = ? WHERE id = ?";
        try {
            preparedStatement = con.prepareStatement(code);
            preparedStatement.setString(1, newEmail);
            preparedStatement.setInt(2,id);
            preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CommitRollBack.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void close(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CommitRollBack.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteWorkers(){
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        String code = "DELETE FROM Workers WHERE ID = ?";
        try {
            preparedStatement = con.prepareStatement(code);
            preparedStatement.setInt(1,id);
            preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CommitRollBack.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("User Deleted Succesfully");

                
    }
    
    public CommitRollBack() {
        
        // "jbdc:mysql://localhost:3306/demo" 
        String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName + "?useUnicode=true&characterEncoding=utf-8";
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Not Found");
        }
        
        
        try {
            con = DriverManager.getConnection(url, userId, password);
            System.out.println("Connection Success");
            
            
        } catch (SQLException ex) {
            System.out.println("Connection Failed");
            //ex.printStackTrace();
        }
        
    }
    public static void main(String[] args) {
        CommitRollBack connection = new CommitRollBack();
        connection.getWorkers();
        //connection.addWorkers();
        //connection.updateWorkers();
        //connection.deleteWorkers();
        connection.commitAndRollBack();
        connection.getWorkers();
        connection.close();


        
        
    }
    
    
}

