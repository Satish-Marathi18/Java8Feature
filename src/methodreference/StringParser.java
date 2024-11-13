package methodreference;

interface Parser {
    String parse(String str);

}

class StringParserExample {
    public static String convert(String s){
        if(s.length()>3)
            return s.toLowerCase();
        else
            return s.toUpperCase();
    }
}

class MyPrinter {
    public void print(String str, Parser p) {
        str = p.parse(str);
        System.out.println(str);
    }
}

public class StringParser {
    public static void main(String[] args) {
        String str = "Sat";
        MyPrinter printer = new MyPrinter();
        printer.print(str, (StringParserExample::convert));
    }
}
