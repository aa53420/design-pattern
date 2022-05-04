package command;

public class RemoteControl {
    private final int MAX_SLOT = 7;
    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[MAX_SLOT];
        offCommands = new Command[MAX_SLOT];

        Command noCommand = new NoCommand();

        for (int i = 0; i < MAX_SLOT; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n------ 리모콘 -----\n");

        for (int i = 0; i < MAX_SLOT; i++) {
            sb.append("[slot " + i + "] " + onCommands[i].getClass().getName() + " :: " + offCommands[i].getClass().getName() + "\n");
        }

        sb.append("[undo] " + undoCommand.getClass().getName() + "\n");

        return sb.toString();
    }
}
