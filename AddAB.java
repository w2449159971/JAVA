import java.util.Scanner;

public class AddAB {
    public static int addAB(int a, int b){
        while (b != 0){
            int tmp = a^b;
            b = (a&b)<<1;
            a = tmp;
        }
        return a;
    }

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int a = scanner.nextInt();
         int b = scanner.nextInt();
         System.out.println(addAB(a,b));
     }
}
