package command.ex;

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ConcreteCommand concreteCommand = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker();
        invoker.setCommand(concreteCommand);

        // 커맨드 동작
        invoker.buttonWasPushed();
    }
}
