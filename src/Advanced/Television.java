package Advanced;

public class Television {
    int channel = 1;
    int volume = 25;
    boolean isOn = false;

    public Television() {

    }

    public void turnOn(){
        isOn=true;
    }
    public void turnOf(){
        isOn=false;
    }

    public void setChannel(int newChannel){
        if (isOn &&channel>=1 &&channel<120){
            channel=newChannel;

        }
    }
    public void setVolume(int newVolume){
        if (isOn && volume>=1 &&volume<100){
            volume=newVolume;
        }
    }
    public void channelUp(){
        if (isOn && channel<120 && channel>1){
            channel+=1;
        }
    }
    public void channelDown(){
        if (isOn && channel<120 && channel>1){
            channel-=1;

        }
    }
    public void volumeUp(){
        if (isOn && volume>1 && volume<100){
            volume++;
        }
    }
    public void volumeDown(){
        if (isOn && volume>1 && volume<100){
            volume--;
        }
    }
    public void mute(){
        if (isOn && volume >1 && volume<100){
            volume=0;
        }
    }

}
