/**
 * Calendar.java
 * <p>
 * Copyright (c) 2023 Mercedes-Benz USA, LLC. All Rights Reserved.
 * <p>
 * This software is the confidential and proprietary information of Mercedes-Benz USA, LLC. ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only in accordance with the terms you entered into with
 * Mercedes-Benz USA, LLC.
 */
package lld.meetingscheduler;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gauravraj01
 * @version 1.0, 26-01-2024
 * @since OpenJDK 17
 */
public class MeetingCalendar {

    private List<ScheduledMeetingDetail> scheduledMeetingDetails;

    public MeetingCalendar() {
        this.scheduledMeetingDetails = new ArrayList<>();
    }

    public List<ScheduledMeetingDetail> getScheduledMeetingDetails() {
        return scheduledMeetingDetails;
    }
}
