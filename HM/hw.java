import java.util.HashMap;
import java.util.Scanner;

public class hw {
    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap<>();
        m.put("key", 4);
        m.put("sss", 3);
        m.put("dwa", 9);
        m.put("s", 1);
        m.put("qwerty", 45);
        m.put("point", 100);

        Scanner inp = new Scanner(System.in);

        String s = inp.nextLine();

        if(m.containsKey(s)){
            System.out.println("Value of " + s + " : " + m.get(s));
        }
        else{
            System.out.println("Map doesn't contain the specified key");
        }

        inp.close();
    }
}