package command.device.garage;

import command.Command;

public class GarageLightOffCommand implements Command {

    private final GarageDoor garageDoor;

    public GarageLightOffCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.lightOff();
    }

    @Override
    public void undo() {
        garageDoor.lightOn();
    }
}
