import java.time.LocalTime ;

public class StopWatch {
    private LocalTime startTime,stopTime;

    public StopWatch(){
        startTime = LocalTime.now();
    }

    public StopWatch(LocalTime startTime,LocalTime stopTime){
        this.startTime = startTime;
        this.stopTime = stopTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getStopTime() {
        return stopTime;
    }

    public void start(){
        startTime = LocalTime.now();
    }

    public void stop(){
        stopTime = LocalTime.now();
    }

    public int getElapsedTime(){
        int miliSecond = ((stopTime.getHour()-startTime.getHour())*3600 + (stopTime.getMinute()-startTime.getMinute())*60 + (stopTime.getSecond()-startTime.getSecond())*1000);
        return miliSecond;
    }
}
