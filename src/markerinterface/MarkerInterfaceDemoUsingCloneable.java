package markerinterface;

public class MarkerInterfaceDemoUsingCloneable implements Cloneable {
    String name;
    int age;

    public MarkerInterfaceDemoUsingCloneable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        MarkerInterfaceDemoUsingCloneable obj1 = new MarkerInterfaceDemoUsingCloneable("Satish", 20);
        MarkerInterfaceDemoUsingCloneable obj2 = (MarkerInterfaceDemoUsingCloneable) obj1.clone();
        System.out.println(obj2.name);
        System.out.println(obj2.age);
    }
}