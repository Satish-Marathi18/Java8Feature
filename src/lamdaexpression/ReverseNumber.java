package lamdaexpression;

interface Reverse {
    int reverse(int num);
}

public class ReverseNumber {
    public static void main(String[] args) {
        Reverse obj = num -> {
            int rev =0;
            while(num!=0){
                int d = num%10;
                rev= rev*10+d;
                num=num/10;
            }
            return rev;
        };
        System.out.println(obj.reverse(115));
    }
}
