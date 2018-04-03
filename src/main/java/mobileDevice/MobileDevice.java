package mobileDevice;

public class MobileDevice {

    private String manufacturer;
    private String device;
    protected String operatingSystem; //os
    private double cost; // price



    //constructor
    public MobileDevice(String manufacturer, String device, String os, double cost){
        this.manufacturer = manufacturer;
        this.device = device;
        this.operatingSystem = os;
        this.cost = cost;
    }

@Override
public String toString(){
        return "Deice name: " + device + "\n" + "Manufacturer" + manufacturer +
                "\n" + "Operating System" + operatingSystem + "\n" + "Cost" + cost;
}

    //methods
    public String calculateDiscount(double discount){
        return "\n The price of this device is " + cost * (discount/100) + " USD. \n";
    }


   public String listMyApps(){
    return "";
   }












//getter setter methods

    public String getManufacturer() {
        return manufacturer;
    }

    public String getDevice() {
        return device;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public double getCost() {
        return cost;
    }



}
