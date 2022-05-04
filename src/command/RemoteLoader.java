package command;

import command.device.audio.Stereo;
import command.device.audio.StereoOffCommand;
import command.device.audio.StereoOnCommand;
import command.device.light.Light;
import command.device.light.LightOffCommand;
import command.device.light.LightOnCommand;

public class RemoteLoader {
    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("kitchen");
        Stereo livingRoomStereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        StereoOnCommand livingRoomStereoOnCommand = new StereoOnCommand(livingRoomStereo);
        StereoOffCommand livingRoomStereoOffCommand = new StereoOffCommand(livingRoomStereo);

        remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControl.setCommand(2, livingRoomStereoOnCommand, livingRoomStereoOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

        remoteControl.undoButtonWasPushed();
    }
}
