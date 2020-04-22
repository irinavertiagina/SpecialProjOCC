 
package model;

 
public class Vehicle {
   private int id;
   private int driverId;
   private int status;
   private String serviceDate;
   private String info;

    public Vehicle() {
    }

    public Vehicle(int id, int driverId, int status, String serviceDate, String info) {
        this.id = id;
        this.driverId = driverId;
        this.status = status;
        this.serviceDate = serviceDate;
        this.info = info;
    }

   
   
   
   
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
   
   
   
   
   
   
}
