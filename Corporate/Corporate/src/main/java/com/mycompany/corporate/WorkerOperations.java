package com.mycompany.corporate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WorkerOperations {
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public Connection getCon() {
        return con;
    }
    
    public void addWorker(String name,String surname,String field,String wage){
        String code = "INSERT INTO calisanlar (ad,soyad,departman,maas) values(?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(code);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,surname);
            preparedStatement.setString(3,field);
            preparedStatement.setString(4,wage);
            preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(WorkerOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void deleteWorker(int id){
        String code = "DELETE FROM calisanlar WHERE id = ?";
        try {
            preparedStatement = con.prepareStatement(code);
            preparedStatement.setInt(1,id);
            preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(WorkerOperations.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    public void updateWorker(int id,String name,String surname,String field,String wage){
        String code = "UPDATE calisanlar SET ad = ? , soyad = ? , departman = ? , maas = ? WHERE id = ?";
         try {
            preparedStatement = con.prepareStatement(code);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,surname);
            preparedStatement.setString(3,field);
            preparedStatement.setString(4,wage);
            preparedStatement.setInt(5, id);
            preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(WorkerOperations.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public WorkerOperations(){
        String url = "jdbc:mysql://" + Corporate.host + ":" + Corporate.port + "/" + Corporate.dbName + "?useUnicode=true&characterEncoding=utf-8";
     
        try {
            con = DriverManager.getConnection(url,Corporate.userID,Corporate.password);
        } catch (SQLException ex) {
            Logger.getLogger(WorkerOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean Login(String id,String password){
        boolean flag = false;
        String code = "SELECT * FROM adminler WHERE username = ? AND password = ?";
        try {
            preparedStatement = con.prepareStatement(code);
            preparedStatement.setString(1,id);
            preparedStatement.setString(2,password);
            ResultSet rs = preparedStatement.executeQuery();
            if(rs.next() == false){
                flag = false;
            }
            else{
                flag = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(WorkerOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }
    
    public ArrayList<Worker> getWorkers(){
        ArrayList<Worker> workers = new ArrayList<Worker>();
        try {
            statement = con.createStatement();
            String code = "SELECT * FROM calisanlar";
            ResultSet rs = statement.executeQuery(code);
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("ad");
                String surname = rs.getString("soyad");
                String field = rs.getString("departman");
                String wage = rs.getString("maas");
                workers.add(new Worker(id,name,surname,field,wage));
            }
        } catch (SQLException ex) {
            Logger.getLogger(WorkerOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return workers;
    }
    

}
