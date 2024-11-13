package lamdaexpression;

interface Addition {
    int addition(int num1, int num2);
}

public class LamdaExpressionExample1 {
    public static void main(String[] args) {
        Addition obj = (num1, num2) -> num1 + num2;
        System.out.println(obj.addition(5,10));
    }
}
