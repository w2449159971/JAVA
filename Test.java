import java.util.Scanner;
public class Test {
    public static int PalindromoicStringNumber(String a , String b){
        int number = 0;
        for(int  n = 0; n <= a.length(); n++){
            StringBuffer sb = new StringBuffer(a);
            sb.insert(n, b);
            StringBuffer c = sb.reverse();
            String q = new String(c);
            String p = new String(sb);
            if(p.equals(q)){
                number++;
            }
        }
        return number;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println(PalindromoicStringNumber(a,b));
    }
}
