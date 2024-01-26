/**
 * Room.java
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
public abstract class Room {
    public abstract boolean isAvailable(int start, int end, int size);

    public abstract ScheduledMeetingDetail blockCalendar(int start, int end);

    public abstract void showCalendar();
}
