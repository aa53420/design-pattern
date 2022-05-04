package command.device.garage;

public class GarageDoor {
    private String target;

    public GarageDoor(String target) {
        this.target = target;
    }

    public void up() {
        System.out.println("[" + target + "] GarageDoor Up");
    }

    public void down() {
        System.out.println("[" + target + "] GarageDoor Down");
    }

    public void stop() {
        System.out.println("[" + target + "] GarageDoor Stop");
    }

    public void lightOn() {
        System.out.println("[" + target + "] GarageDoor Light On");
    }

    public void lightOff() {
        System.out.println("[" + target + "] GarageDoor Light Off");
    }
}
