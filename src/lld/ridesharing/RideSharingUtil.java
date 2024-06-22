package lld.ridesharing;

public class RideSharingUtil {
    public static void main(String[] args) {
        RideSharingApplication rideSharingApplication = new RideSharingApplication();

        User rohan = new User("Rohan","M", 36);
        rideSharingApplication.addUser(rohan);
        rideSharingApplication.addVehicle(rohan, new Vehicle("Swift", "KA-01-12345"));

        User shashank = new User("Shashank","M", 29);
        rideSharingApplication.addUser(shashank);
        rideSharingApplication.addVehicle(shashank, new Vehicle("Baleno","TS-05-62395"));

        User nandini = new User("Nandini","F", 27);
        rideSharingApplication.addUser(nandini);

        User shipra = new User("Shipra","F", 36);
        rideSharingApplication.addUser(shipra);
        rideSharingApplication.addVehicle(shipra, new Vehicle("Polo","KA-05-41491"));
        rideSharingApplication.addVehicle(shipra, new Vehicle("Activa","KA-12-12332"));

        User gaurav = new User("Gaurav","M", 29);
        rideSharingApplication.addUser(gaurav);

        User rahul = new User("Rahul","M", 35);
        rideSharingApplication.addUser(rahul);
        rideSharingApplication.addVehicle(rahul, new Vehicle("XUV","KA-05-1234"));

        RideDetails ride1 = rideSharingApplication.offerRide("Hyderabad", "Bangalore", "KA-01-12345", rohan, 1);
        RideDetails ride2 = rideSharingApplication.offerRide("Bangalore", "Mysore", "KA-12-12332", shipra, 1);
        RideDetails ride3 = rideSharingApplication.offerRide("Bangalore", "Mysore", "KA-05-41491", shipra, 2);
        RideDetails ride4 = rideSharingApplication.offerRide("Hyderabad", "Bangalore", "TS-05-62395", shashank, 2);
        RideDetails ride5 = rideSharingApplication.offerRide("Hyderabad", "Bangalore", "KA-05-1234", rahul, 5);
        RideDetails ride6 = rideSharingApplication.offerRide("Bangalore", "Pune", "KA-01-12345", rohan, 1);

        rideSharingApplication.selectRide(
                "Bangalore", "Mysore", nandini, 1, null);

        rideSharingApplication.selectRide(
                "Bangalore", "Mysore", gaurav, 1, "Activa");

        rideSharingApplication.selectRide(
                "Mumbai", "Bangalore", shashank, 1, null);

        rideSharingApplication.selectRide(
                "Hyderabad", "Bangalore", rohan, 1, "Baleno");

        rideSharingApplication.selectRide(
                "Hyderabad", "Bangalore", shashank, 1, "Polo");

        rideSharingApplication.endRide(ride1);
        rideSharingApplication.endRide(ride2);
        rideSharingApplication.endRide(ride3);
        rideSharingApplication.endRide(ride4);


        rideSharingApplication.printRideStat();

    }
}
