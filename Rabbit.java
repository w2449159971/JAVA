import java.util.Scanner;

public class Rabbit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        System.out.println(rabbit(month));
    }

    public static int rabbit(int month){
        if(month < 3) {
            return 1;
        }
        else
            return rabbit(month - 2) + rabbit(month - 1);

    }
}
