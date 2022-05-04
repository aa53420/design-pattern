package command.device.garage;

import command.Command;

public class GarageLightOnCommand implements Command {

    private final GarageDoor garageDoor;

    public GarageLightOnCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.lightOn();
    }

    @Override
    public void undo() {
        garageDoor.lightOff();
    }
}
