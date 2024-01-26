/**
 * MeetingRoom.java

 */
package lld.meetingscheduler;

import java.util.Objects;

/**
 * @author gauravraj01
 * @version 1.0, 26-01-2024
 * @since OpenJDK 17
 */
public class MeetingRoom extends Room {
    private String id;
    private int capacity;
    private MeetingCalendar calendar;

    public MeetingRoom(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
        this.calendar = new MeetingCalendar();
    }

    @Override
    public boolean isAvailable(int start, int end, int numberOfUsers) {
        if (numberOfUsers > capacity ){
            return false;
        }
        return calendar.getScheduledMeetingDetails()
                .stream()
                .noneMatch(scheduledMeetingDetail -> isTimeConflicting(scheduledMeetingDetail, start, end));
    }

    @Override
    public ScheduledMeetingDetail blockCalendar(int start, int end) {
        ScheduledMeetingDetail scheduledMeetingDetail = new ScheduledMeetingDetail(start,end,id);
        this.calendar.getScheduledMeetingDetails().add(scheduledMeetingDetail);
        return scheduledMeetingDetail;
    }

    @Override
    public void showCalendar() {
        calendar.getScheduledMeetingDetails().forEach(scheduledMeetingDetail -> {
            System.out.printf("room %s : %s to %s", scheduledMeetingDetail.getMeetingRoomId(), scheduledMeetingDetail.getStartTime(), scheduledMeetingDetail.getEndTime());
            System.out.println();
        });
    }

    private boolean isTimeConflicting(ScheduledMeetingDetail scheduledMeetingDetail, int start, int end) {
        int scheduledStartTime = scheduledMeetingDetail.getStartTime();
        int scheduledEndTime = scheduledMeetingDetail.getEndTime();
        return !((start < end) &&
                (end <= scheduledStartTime || start >= scheduledEndTime));
    }

    public String getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public MeetingCalendar getCalendar() {
        return calendar;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeetingRoom that = (MeetingRoom) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
