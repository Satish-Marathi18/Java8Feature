package markerinterface;

import java.io.*;

public class SerializableDemo implements Serializable {
    String name;
    int age;

    public SerializableDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Example {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializableDemo sd = new SerializableDemo("John Doe", 20);

        //Serializing
        FileOutputStream fos = new FileOutputStream("objects.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(sd);

        FileInputStream fis = new FileInputStream("objects.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        SerializableDemo sd2 = (SerializableDemo) ois.readObject();

        System.out.println(sd2.name);
        System.out.println(sd2.age);

        oos.close();
        ois.close();
    }
}
