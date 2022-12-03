import java.util.Scanner;
import java.io.IOException;
public class Yo {
    public static void main(String[] args) throws IOException {

        //InputStreamReader isr = new InputStreamReader(System.in);
        //BufferedReader br = new BufferedReader(isr);
        //long s1 = br.lines().count();
        //br.reset();
        //br.close();
        //br = null;
        //System.out.println(s1);

        Scanner object = new Scanner(System.in);
        String s1 = "";
        while(object.hasNext()){
            String s2 = object.next();

            if(s2.equals("end")){
                break;
            }
            s1 = s1+s2+'\n';
        }
        //String input = object.next();
        System.out.println(s1.substring(0,s1.length()-1));

// using dataInputStream
    }
}
