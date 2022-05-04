package command.device.light;

public class Light {

    private String target;

    public Light(String name){
        this.target = name;
    }

    public void on(){
        System.out.println("[" + target + "] Light On");
    }

    public void off(){
        System.out.println("[" + target + "] Light Off");
    }
}

