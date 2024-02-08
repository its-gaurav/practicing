package lld.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // four-wheeler spots
        ParkingSpot b1 = new FourWheelerSpot();
        ParkingSpot b2 = new FourWheelerSpot();
        ParkingSpot b3 = new FourWheelerSpot();
        List<ParkingSpot> fourWheelerSpots = new ArrayList<>();
        fourWheelerSpots.add(b1);
        fourWheelerSpots.add(b2);
        fourWheelerSpots.add(b3);
        ParkingStrategy nearToExitStrategy = new NearToExitParkingStrategy();
        ParkingSpotManager fourWheelerSpotManager = new FourWheelerSpotManager(fourWheelerSpots, nearToExitStrategy);

        // two-wheeler spots
        ParkingSpot a1 = new TwoWheelerSpot();
        ParkingSpot a2 = new TwoWheelerSpot();
        ParkingSpot a3 = new TwoWheelerSpot();
        List<ParkingSpot> twoWheelerSpots = new ArrayList<>();
        twoWheelerSpots.add(a1);
        twoWheelerSpots.add(a2);
        twoWheelerSpots.add(a3);
        ParkingStrategy defaultParkingStrategy = new DefaultParkingStrategy();
        ParkingSpotManager twoWheelerSpotManager = new TwoWheelerSpotManager(twoWheelerSpots, defaultParkingStrategy);
        ParkingSpotManagerFactory parkingSpotManagerFactory = new ParkingSpotManagerFactory(twoWheelerSpotManager, fourWheelerSpotManager);
        EntryGate entryGate = new EntryGate(parkingSpotManagerFactory);
        ExitGate exitGate = new ExitGate();

        Vehicle maruti800 = new FourWheeler("maruti800", VehicleType.FOUR_WHLR, "hx-1234");
        Vehicle sonet = new FourWheeler("kia-sonet", VehicleType.FOUR_WHLR, "hx-5678");
        Vehicle meteor = new TwoWheeler("re-meteor350", VehicleType.TWO_WHLR, "hx-3424");
        Vehicle hness = new TwoWheeler("honda-hness", VehicleType.TWO_WHLR, "hx-2435");
        Vehicle himalayn = new TwoWheeler("himayan-425", VehicleType.TWO_WHLR, "hx-5282");

        ParkingSpot parkingSpot = entryGate.findParkingSpot(maruti800);
        Ticket ticket = entryGate.parkVehicle(parkingSpot, maruti800);
        exitGate.calculateFare(ticket);

        parkingSpot = entryGate.findParkingSpot(sonet);
        ticket = entryGate.parkVehicle(parkingSpot, sonet);
        exitGate.calculateFare(ticket);

        parkingSpot = entryGate.findParkingSpot(meteor);
        ticket = entryGate.parkVehicle(parkingSpot, meteor);
        exitGate.calculateFare(ticket);

        parkingSpot = entryGate.findParkingSpot(hness);
        ticket = entryGate.parkVehicle(parkingSpot, hness);
        exitGate.calculateFare(ticket);

        parkingSpot = entryGate.findParkingSpot(himalayn);
        ticket = entryGate.parkVehicle(parkingSpot, himalayn);
        exitGate.calculateFare(ticket);

        // all 2-wheeler spots status
        for (ParkingSpot spot: twoWheelerSpotManager.getParkingSpots()){
            System.out.println(spot);
        }
        // all 4-wheeler spots status
        for (ParkingSpot spot: fourWheelerSpotManager.getParkingSpots()){
            System.out.println(spot);
        }

    }
}
