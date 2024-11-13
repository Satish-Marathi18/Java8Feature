package lamdaexpression;

interface Display {
    void display(String str);
}

public class LamdaExpressionString {
    public static void main(String[] args) {
        Display obj = str -> System.out.println(str);
        obj.display("hello");
    }
}
