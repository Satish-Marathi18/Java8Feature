package functionalinterface;

@FunctionalInterface
interface MyFunctionalInterface {
    void show();
}

class FunctionalInterFaceExample  {
    static MyFunctionalInterface functionalInterface = () -> System.out.println("I am in functional interface");
    public static void main(String[] args) {
        functionalInterface.show();
    }
}
