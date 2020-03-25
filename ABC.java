import java.util.Scanner;

public class ABC {
    public static int lowestCommonMultiple(int a, int b){
        int c = 0;
        int d = a;
        int e = b;
        while (d!= e)
        {
            if (d > e)
                d = d - e;
            if (d < e)
                e = e - d;
        }
        a = a / d ;
        b = b / d ;
        return a*b*d;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(lowestCommonMultiple(a,b));
    }
}