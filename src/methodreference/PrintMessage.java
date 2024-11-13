package methodreference;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class PrintMessage {
    public String printMessage() {
        return "Hello World";
    }

    public static void main(String[] args) {
        PrintMessage obj = new PrintMessage();
        Supplier<String> print = obj::printMessage;

        System.out.println(print.get());

    }
}
