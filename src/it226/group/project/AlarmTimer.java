package it226.group.project;

import java.util.Timer;
import java.util.Date;

/**
 * @author Brandon Manke
 * @author Colin Koepke
 * @author Ben Dworkin
 * http://docs.oracle.com/javase/7/docs/api/java/util/concurrent/ScheduledExecutorService.html
 */
public class AlarmTimer extends Alarm { // implements IClock?? maybe otherwise we don't need clock interface
    private Timer timer;
    private long milliseconds;
    
    public AlarmTimer() {
        super();
    }

    public AlarmTimer(Date date, int hours, int minutes, int seconds, String optionalMessage) {
        super(date, optionalMessage);
        timer = new Timer();
        milliseconds = (seconds * 1000) + (minutes * 60000) + (hours * 3600000);
        date = new Date(milliseconds);
        this.setDate(date);
    }

    //public Alarm writeToJson() {
    //    return null;
    //}

    //public Alarm readFromJson() {
    //    return null;
    //}

    private Date convertTimerToDate() {


        return this.getDate();
    }

    // Getters

    public long getMilliseconds() { return milliseconds; }

    public Timer getTimer() { return timer; }

    // Setters

    public void setMilliseconds(long milliseconds) { this.milliseconds = milliseconds; }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

}
