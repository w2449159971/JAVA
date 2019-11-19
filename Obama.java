import java.util.Scanner;

public class Obama {
    public static void zhengFangXing(int a, String b){
        if(a == 3){
            System.out.printf(b);
            System.out.printf(b);
            System.out.printf(b);
            System.out.printf("\n");
            System.out.printf(b);
            System.out.printf(b);
            System.out.printf(b);
        }
        if(a==4){
            System.out.printf(b);
            System.out.printf(b);
            System.out.printf(b);
            System.out.printf(b);
            System.out.printf("\n");
            System.out.printf(b);
            System.out.printf(b);
            System.out.printf(b);
            System.out.printf(b);
        }
        while (a!=4){
        for(int i = 0; i < a; i++ ){
            System.out.print(b);
        }
        System.out.printf("\n");
        int c = a/2;
        if(a%2 != 0){
            c = c + 1;
        }
        for(int j = 1; j < c-1; j++){
            System.out.printf(b);
            for (int p = 2; p < a; p++){
                System.out.printf("  ");
            }
            System.out.println(b);
        }

        for(int k = 0; k < a; k++ ){
            System.out.printf(b);
        }
        break;
    }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String b = scanner.nextLine();
        zhengFangXing(a,b);
    }
}
