package model;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBUtil {
        public static ArrayList<Order> getOrderHistory() {
        ArrayList<Order> list = new ArrayList<>();
        try {
            String dbURL = "jdbc:mysql://localhost:3306/db";
            String user = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dbURL, user, password);
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM `order`");

            while (result.next()) {
                Order item = new Order(result.getInt("order_id"), result.getString("order_cargo"), result.getString("order_start_date"),  result.getString("order_location"), result.getString("order_destination")   );

                list.add(item);
            }

            connection.close();

        } catch (Exception e) {
            System.out.println("ERROR! " + e);
        }
        return list;
        }
        
        public static ArrayList<Vehicle> seeVehicleList() {
        ArrayList<Vehicle> list = new ArrayList<>();
        try {
            String dbURL = "jdbc:mysql://localhost:3306/db";
            String user = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dbURL, user, password);
            Statement statement = connection.createStatement();
            
            ResultSet result = statement.executeQuery("SELECT vehicle.vehicle_id, vehicle.vehicle_service_date, vehicle.vehicle_info, vehicle.vehicle_status, vehicle.driver_id, driver.driver_last_name\n" +
"FROM vehicle INNER JOIN driver ON vehicle.driver_id = driver.driver_id");
            while (result.next()) {
                Vehicle i = new Vehicle(result.getInt("vehicle_id"), result.getInt("driver_id"), result.getInt("vehicle_status"),
                result.getString("vehicle_service_date"), result.getString("vehicle_info"), result.getString("driver_last_name"));

                list.add(i);
            }

            connection.close();

        } catch (Exception e) {
            System.out.println("ERROR! " + e);
        }
        return list;
        }
        
        
        
         
   
        
        
        
        
        
        
        
         public static void placeOrder(String date, String cargo, String location, String dest) { 
 try {
            String dbURL = "jdbc:mysql://localhost:3306/db";
            String user = "root";
            String password = "";

            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dbURL, user, password);
           Statement statement = connection.createStatement();
      
            
          
         //String preparedQuery = "INSERT INTO `testtable`(`first`, `second`, `third`) VALUES (1,2,3)";//test!
String preparedQuery = "INSERT INTO `order`(`driver_id`, `customer_id`, `order_cargo`, `order_start_date`,`order_destination`, `order_location`    ) VALUES (1, 1, '"+cargo+"', '"+date+"', '"+dest+"', '"+location+"')";

            
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(preparedQuery);
          //ps.setString(1, "test");
           ps.executeUpdate();
                     connection.close();
        } catch (Exception e) {
            System.out.println("ERROR! " + e);
        }
        
        }
        
         
         
         
                  public static void addEmployee(String role, String lname, String fname, String contact) {
         
        try {
            String dbURL = "jdbc:mysql://localhost:3306/db";
            String user = "root";
            String password = "";

            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dbURL, user, password);
           Statement statement = connection.createStatement();
           String preparedQuery = null;
            
           //add manager
            if(role.equals("manager")){
                preparedQuery =  "INSERT INTO `"+role+"`( `manager_last_name`, `manager_first_name`, `manager_contact`, `manager_password`) "
                    + "VALUES ('"+lname+"', '"+fname+"', '"+contact+"', 'pass')"; 
            }
            
            //add admin
            
            else if(role.equals("admin")){
               preparedQuery =  "INSERT INTO `admin`( `admin_last_name`, `admin_first_name`, `admin_contact`, `admin_password`) "
                    + "VALUES ('"+lname+"', '"+fname+"', '"+contact+"', 'pass')"; 
            }
            
            
            //add driver
            if(role.equals("driver")){  preparedQuery =  "INSERT INTO `driver`( `driver_last_name`, `driver_first_name`, `driver_contact`, `manager_id`, `driver_password`) "
                    + "VALUES ('"+lname+"', '"+fname+"', '"+contact+"', 1, 'pass')"; 
            }
            
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(preparedQuery);
          //ps.setString(1, "test");
           ps.executeUpdate();
                     connection.close();
        } catch (Exception e) {
            System.out.println("ERROR! " + e);
        }
        
        }
         
         
         
                  
                  
                  
                  
                     public static void addVehicle(String info, String date, String id) {
         
        try {
            String dbURL = "jdbc:mysql://localhost:3306/db";
            String user = "root";
            String password = "";

            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dbURL, user, password);
           Statement statement = connection.createStatement();

            String preparedQuery = "INSERT INTO `vehicle`(`vehicle_service_date`, `vehicle_info`, `vehicle_status`, `driver_id`) VALUES ( '"+date+"', '"+info+"', 0, " +id+")"; 
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(preparedQuery);
 
           ps.executeUpdate();
                     connection.close();
            } catch (Exception e) {
            System.out.println("ERROR! " + e);
        }
        
        }
                  
                  
           public static ArrayList<Person> seeEmployeeList() {
        ArrayList<Person> list = new ArrayList<>();
        try {
            String dbURL = "jdbc:mysql://localhost:3306/db";
            String user = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dbURL, user, password);
            Statement statement = connection.createStatement();
            
            ResultSet result = statement.executeQuery("SELECT driver_id, driver_first_name, driver_last_name FROM `driver`");
            while (result.next()) {
                Person i = new Person(result.getInt("driver_id"),result.getString("driver_first_name"), result.getString("driver_last_name") );

                list.add(i);
            }

            connection.close();

        } catch (Exception e) {
            System.out.println("ERROR! " + e);
        }
        return list;
        }
        
        
        
         
 
}