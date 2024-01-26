/**
 * Main.java
 * <p>
 * Copyright (c) 2023 Mercedes-Benz USA, LLC. All Rights Reserved.
 * <p>
 * This software is the confidential and proprietary information of Mercedes-Benz USA, LLC. ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only in accordance with the terms you entered into with
 * Mercedes-Benz USA, LLC.
 */
package lld.meetingscheduler;

/**
 * @author gauravraj01
 * @version 1.0, 26-01-2024
 * @since OpenJDK 17
 */
public class Main {
    public static void main(String[] args) {
        MeetingScheduler meetingScheduler = new MeetingScheduler();
        Room meetingRoom1 = new MeetingRoom("orion", 2);
        Room meetingRoom2 = new MeetingRoom("nebula", 4);
        Room meetingRoom3 = new MeetingRoom("hibiscus", 6);

        meetingScheduler.addRoom(meetingRoom1);
        meetingScheduler.addRoom(meetingRoom2);
        meetingScheduler.addRoom(meetingRoom3);

        // users
        User user1 = new Attendee("123","Gaurav","gaurav@gmail.com");
        User user2 = new Attendee("456","Ankit","Ankit@gmail.com");
        User user3 = new Attendee("789","Aditya","Aditya@gmail.com");
        User user4 = new Attendee("321","Shaurya","Shaurya@gmail.com");
        User user5 = new Attendee("654","Ramesh","Ramesh@gmail.com");
        User user6 = new Attendee("987","Suresh","Suresh@gmail.com");
        User user7 = new Attendee("546","John","John@gmail.com");

        meetingScheduler
                .bookMeetingRoom(2, 4, user1, user2)
                        .showCalendar();
        meetingScheduler.bookMeetingRoom(2,4,user3,user4)
                .showCalendar();
        meetingScheduler.bookMeetingRoom(2,4,user5,user6)
                .showCalendar();
        meetingScheduler.bookMeetingRoom(1,2,user7)
                .showCalendar();
        meetingScheduler.bookMeetingRoom(1,2,user5)
                .showCalendar();


    }
}
