package mobileDevice;

public class Main {
    public static void main(String[] args) {

        MobileDevice tabletOne = new Tablet("Google", "Samsung Galaxy Note", "Android Popcorn",
                449.99, 9.7, new String[]{"Chrome", "YouTube", "Google Play"});

        MobileDevice tabletTwo = new Tablet("Apple", "Ipad Pro", "ios",
                248, 12.9, new String[]{"itunes", "ibisPaint X", "Fortnite Mobile"});

        MobileDevice[] tablets = new MobileDevice[]{tabletOne, tabletTwo};

        for(MobileDevice tablet : tablets){
            System.out.print("Device: " + tablet.getDevice() + " Apps: " + tablet.listMyApps() + " Cost: " + tablet.calculateDiscount(40));
    }




    }




}
