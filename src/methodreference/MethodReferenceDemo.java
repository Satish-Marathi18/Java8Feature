package methodreference;

import java.util.function.Supplier;

public class MethodReferenceDemo {
    void print() {
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        Supplier<MethodReferenceDemo> supplier = MethodReferenceDemo::new;

        supplier.get().print();
    }
}
