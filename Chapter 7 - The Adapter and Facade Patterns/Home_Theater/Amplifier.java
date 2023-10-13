package Home_Theater;

public class Amplifier {
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;

    public void on(){

    }

    public void off(){

    }

    public void setCd(CdPlayer cdPlayer){
        this.cdPlayer = cdPlayer;
    }

    public void setDvd(DvdPlayer dvdPlayer){
        this.dvdPlayer = dvdPlayer;
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setStereoSound(){
        
    }

    public void setSurroundSound(){
        
    }

    public void setVolume(int value){

    }
}
