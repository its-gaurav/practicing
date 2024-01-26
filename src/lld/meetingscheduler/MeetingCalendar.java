/**
 * Calendar.java

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
