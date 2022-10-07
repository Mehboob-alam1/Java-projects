package Advanced;

import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;
    private long currentTime=System.currentTimeMillis();

    public StopWatch(){
        this.startTime=currentTime;
    }
    public void start(long startTime){

       this. startTime=startTime;
    }
    public void stop(long endTime){
        this.endTime=endTime;
    }
    public long getElapsedTime(){
      return   endTime-startTime;
    }
}
