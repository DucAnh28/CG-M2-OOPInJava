package QuanDemo;

public class StopWatch {
    private long startTime;
    private long stopTime;

    public long getStartTime() {
        return startTime;
    }

    public long getStopTime() {
        return stopTime;
    }

    class startTime{
        long startTime = System.currentTimeMillis();
    }

    public StopWatch(long startTime){
        this.startTime = startTime;
        stopTime = System.currentTimeMillis();
    }

    public double getElapsedTime(){
        long now = System.currentTimeMillis();
        return (now - startTime)/1000.0;
    }
}
