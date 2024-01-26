/**
 * Main.java
 * <p>
 * Copyright (c) 2023 Mercedes-Benz USA, LLC. All Rights Reserved.
 * <p>
 * This software is the confidential and proprietary information of Mercedes-Benz USA, LLC. ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only in accordance with the terms you entered into with
 * Mercedes-Benz USA, LLC.
 */
package stockobserver;

/**
 * @author gauravraj01
 * @version 1.0, 20-01-2024
 * @since OpenJDK 17
 */
public class Main {
    public static void main(String[] args) {

        Observable hpLaptopObservable = new LaptopObservable("hplaptop-obs1","hp","r0017tx",false);
        Observable mobileObservable = new MobileObservable("realme-obs1", "realme", "c2x00", false);
        Observable washingMachineObservable = new WashingMachineObservable("samsung-obs1", "samsung", "cxt98", false);

        Observer mobileObserver = new MobilePhoneObserver("mobile1", "9884598845");
        Observer mobileObserver2 = new MobilePhoneObserver("mobile2", "7679284593");
        Observer gauravEmailObserver = new EmailObserver("email1", "gauravraj9234@gmail.com");
        Observer ankitEmailObserver = new EmailObserver("email2", "ankit.r@abc.com");
        Observer jaiEmailObserver = new EmailObserver("email3", "jai.viru@alpha.com");
        Observer nayakEmailObserver = new EmailObserver("email4", "viru.nayak@outlook.com");

        // adding subscribers who want to get notified when hp-laptop comes in stock
        hpLaptopObservable.addSubscriber(mobileObserver);
        hpLaptopObservable.addSubscriber(mobileObserver2);
        hpLaptopObservable.addSubscriber(gauravEmailObserver);

        hpLaptopObservable.updateStockStatus(true);

        // adding subscribers who want to get notified when real-me comes in stock
        mobileObservable.addSubscriber(jaiEmailObserver);
        mobileObservable.addSubscriber(mobileObserver2);
        mobileObservable.addSubscriber(nayakEmailObserver);
        // stock is available
        mobileObservable.updateStockStatus(true);

        // stock got finished
        mobileObservable.updateStockStatus(false);
        // removing subscriber
        mobileObservable.removeSubscriber(nayakEmailObserver);
        // stock is available
        mobileObservable.updateStockStatus(true);



    }
}
