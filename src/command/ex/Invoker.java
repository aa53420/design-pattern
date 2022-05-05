package command.ex;

public class Invoker {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    // Command 객체에게 작업 요청
    public void buttonWasPushed(){
        command.execute();
    }
}
