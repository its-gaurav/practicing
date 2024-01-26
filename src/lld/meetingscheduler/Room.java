/**
 * Room.java

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
