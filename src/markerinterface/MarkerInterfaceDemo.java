package markerinterface;

interface Permission{

}

public class MarkerInterfaceDemo implements Permission {
    public static void main(String[] args) {
        MarkerInterfaceDemo markerInterfaceDemo = new MarkerInterfaceDemo();
        if(markerInterfaceDemo instanceof Permission){
            System.out.println("Permission granted");
        }
        else
            System.out.println("Permission denied");

    }
}
