/**
 * Main.java

 */
package observer.temperatureobserver;

/**
 * @author gauravraj01
 * @version 1.0, 17-01-2024
 * @since OpenJDK 17
 */

public class Main {
    public static void main(String[] args) {

        Observable observable = new WeatherStation();

        Observer tvScreen1 = new TVScreen("ts1");
        Observer tvScreen2 = new TVScreen("ts2");
        Observer mobileScreen1 = new MobileScreen("ms1");
        Observer mobileScreen2 = new MobileScreen("ms2");
        Observer mobileScreen3 = new MobileScreen("ms3");

        observable.addObserver(tvScreen1);
        observable.addObserver(mobileScreen1);
        observable.updateTemperature(34);

        observable.addObserver(tvScreen2);
        observable.updateTemperature(32);

        observable.updateTemperature(40);

        observable.removeObserver(tvScreen1);
        observable.updateTemperature(38);

        observable.addObserver(mobileScreen2);
        observable.addObserver(mobileScreen3);
        observable.updateTemperature(43);
    }
}
