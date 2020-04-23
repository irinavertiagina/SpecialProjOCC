 
package model;

import java.io.Serializable;

 
public class Order implements Serializable {
    private int order_id; 
    private int customer_id;
    private int vehicle_id;
    private int order_status;
    private int manager_id;
    private String order_cargo; 
    private String order_start_date;
    private String order_finish_date;
    private String order_location;
    private String order_destination;

    public Order() {
    }

    public Order(int order_id, String order_cargo, String order_start_date, String order_location, String order_destination) {
        this.order_id = order_id;
        this.order_cargo = order_cargo;
        this.order_start_date = order_start_date;
        this.order_location = order_location;
        this.order_destination = order_destination;
    }

    
    
   

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public int getOrder_status() {
        return order_status;
    }

    public void setOrder_status(int order_status) {
        this.order_status = order_status;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public String getOrder_cargo() {
        return order_cargo;
    }

    public void setOrder_cargo(String order_cargo) {
        this.order_cargo = order_cargo;
    }

    public String getOrder_start_date() {
        return order_start_date;
    }

    public void setOrder_start_date(String order_start_date) {
        this.order_start_date = order_start_date;
    }

    public String getOrder_finish_date() {
        return order_finish_date;
    }

    public void setOrder_finish_date(String order_finish_date) {
        this.order_finish_date = order_finish_date;
    }

    public String getOrder_location() {
        return order_location;
    }

    public void setOrder_location(String order_location) {
        this.order_location = order_location;
    }

    public String getOrder_destination() {
        return order_destination;
    }

    public void setOrder_destination(String order_destination) {
        this.order_destination = order_destination;
    }
    
    
    
}
