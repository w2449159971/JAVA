import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class toLowerCase {
    public static String ToLowerCase(String str){
        int len = str.length();
        char[] a = str.toCharArray();
        for(int i = 0; i < len; i++){
            if (a[i] >= 'A' && a[i] <= 'Z'){
                a[i] += 32;
            }
        }
        return String.valueOf(a);
    }
    public static void main(String[] args) throws IOException {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader reader1 = new BufferedReader(reader);
        System.out.println("输入字符串");
        String str = reader1.readLine();
        System.out.println(ToLowerCase(str));
    }
}
