import java.util.Scanner;

public class Number {
    public static String NumberReverse(String a){
        StringBuffer sb = new StringBuffer(a);
        StringBuffer c = sb.reverse();
        String q = new String(c);
        return q;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println(NumberReverse(a));
    }
}
