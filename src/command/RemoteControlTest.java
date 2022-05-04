package command;

import command.device.audio.Stereo;
import command.device.garage.GarageDoor;
import command.device.garage.GarageDoorUpCommand;
import command.device.light.Light;
import command.device.light.LightOnCommand;

public class RemoteControlTest {
    public static void main(String[] args){
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light("거실");
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        GarageDoor garageDoor = new GarageDoor("차고");
        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);

        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();

        simpleRemoteControl.setCommand(garageDoorUpCommand);
        simpleRemoteControl.buttonWasPressed();


    }
}
