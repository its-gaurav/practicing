/**
 * MeetingScheduler.java

 */
package lld.meetingscheduler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author gauravraj01
 * @version 1.0, 26-01-2024
 * @since OpenJDK 17
 */
public class MeetingScheduler {

    private List<Room> meetingRooms;

    public MeetingScheduler() {
        this.meetingRooms = new ArrayList<>();
    }

    public Room bookMeetingRoom(int start, int end, User... attendeeArray) {
        List<User> attendeeList = Arrays.asList(attendeeArray);
        Room meetingRoom = findAvailableMeetingRoom(start, end, attendeeList);
        ScheduledMeetingDetail scheduledMeetingDetail = meetingRoom.blockCalendar(start, end);
        sendNotifications(scheduledMeetingDetail, attendeeList);
        return meetingRoom;
    }

    private void sendNotifications(ScheduledMeetingDetail scheduledMeetingDetail, List<User> attendeeList) {
        attendeeList.forEach(attendee -> {
            System.out.printf("Dear %s, %s meeting has been scheduled. When: %s to %s, Where: Meeting Room Id %s",
                    attendee.getName(), attendee.getEmail(), scheduledMeetingDetail.getStartTime(), scheduledMeetingDetail.getEndTime(), scheduledMeetingDetail.getMeetingRoomId());
            System.out.println();
        });
    }

    private Room findAvailableMeetingRoom(int start, int end, List<User> attendeeList) {
        return meetingRooms.stream()
                .filter(room -> room.isAvailable(start, end, attendeeList.size()))
                .findAny()
                .orElseThrow(() -> new RuntimeException("Meeting Room Currently Not Available"));
    }

    public void addRoom(Room room) {
        if (!meetingRooms.contains(room)) {
            meetingRooms.add(room);
        }
    }
}
