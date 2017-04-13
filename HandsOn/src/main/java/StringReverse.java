import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by makeshk.kathirvel on 4/10/2017.
 */
public class StringReverse {
   public static void main(String args[]){
   String InputString = "";
    try{
        System.out.println("Enter the Input String");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        InputString = br.readLine();
        StringReverse stringReverse = new StringReverse();
        char[] StringReverse = stringReverse.StringReverseusingCharArray(InputString);

        System.out.println("String Reverse using character Array method");
        System.out.println(StringReverse);
        StringBuilder result = stringReverse.StringReverseusingStringBuilder(InputString);
        System.out.println("String Reverse using String Builder method \n" +result);
    }catch(Exception e) {
        e.printStackTrace();
    }
}
    public char[] StringReverseusingCharArray(String s){
        char[] charArray = s.toCharArray();
        char[] result = new char[charArray.length];
        try {
            for (int i = charArray.length-1, j=0; i>=0; i--,j++) {
                result[j] = charArray[i];
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;

}
    public StringBuilder StringReverseusingStringBuilder(String s){
        StringBuilder sb = new StringBuilder();
        try{
            sb.append(s);
            sb.reverse();
        }catch (Exception e){
            e.printStackTrace();
        }
        return sb;
    }
}
