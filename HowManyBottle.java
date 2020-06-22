import java.util.Scanner;

public class HowManyBottle {
    public static int BottleNumber(int k){
        int count = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        while(k >= 3){
            a = k / 3;
            b = k % 3;
            c = count;
            count = a + count;
            k = b + count - c;
        }
        if(k==2){
            count ++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        while(k.hasNext()){
            int num = k.nextInt();
            if(num !=0){
                System.out.println(BottleNumber(num));
    }
        }
    }
}
