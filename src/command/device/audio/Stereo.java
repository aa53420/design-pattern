package command.device.audio;

public class Stereo {
    private String target;

    public Stereo(String name) {
        this.target = name;
    }

    public void on(){
        System.out.println("[" + target + "] Stereo On");
    }

    public void off(){
        System.out.println("[" + target + "] Stereo Off");
    }

    public void setCd(){
        System.out.println("[" + target + "] Stereo Set CD");
    }

    public void setDvd(){
        System.out.println("[" + target + "] Stereo Set DVD");
    }

    public void setRadio(){
        System.out.println("[" + target + "] Stereo Set Radio");
    }

    public void setVolume(int volume){
        System.out.println("[" + target + "] Stereo Set Volume => " + volume);
    }
}
