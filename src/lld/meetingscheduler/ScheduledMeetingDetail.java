/**
 * MeetingScheduled.java

 */
package lld.meetingscheduler;

/**
 * @author gauravraj01
 * @version 1.0, 26-01-2024
 * @since OpenJDK 17
 */
public class ScheduledMeetingDetail {
    private int startTime;
    private int endTime;
    private String meetingRoomId;

    private boolean isActive;

    public ScheduledMeetingDetail(int startTime, int endTime, String meetingRoomId) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.meetingRoomId = meetingRoomId;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public String getMeetingRoomId() {
        return meetingRoomId;
    }

    public void setMeetingRoomId(String meetingRoomId) {
        this.meetingRoomId = meetingRoomId;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
