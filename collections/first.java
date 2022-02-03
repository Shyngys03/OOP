import java.util.*;

public class first {
    public static void main(String[] args){
        List<String> l = new ArrayList<String>();

        HashMap<String, Integer> m = new HashMap<String, Integer>(); 

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word which frequency you want to know: ");
        String word = sc.nextLine();

        System.out.print("List of words: \n");
        while(true){
            String s = sc.nextLine();
            if(s == "") break;

            l.add(s);
            if(m.get(s) == null){
                m.put(s, 1);
            } else {
                int value = m.get(s) + 1;
                m.remove(s);
                m.put(s, value);
            }
        }
        System.out.println();
        System.out.println(m.get(word));

        sc.close();

    }
}