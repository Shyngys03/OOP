import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> aListofIntegers = new ArrayList<Integer>();
        System.out.println("List of integers: ");
        while(true){
            int x = sc.nextInt();
            if(x == 0) break;

            aListofIntegers.add(x);
        }

        int num;
        System.out.print("Enter a number: ");

        boolean finded = false;
        num = sc.nextInt();
        for(Integer x : aListofIntegers){
            if(x == num){
                finded = true;
                break;
            }
        }
        if(finded){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

        sc.close();
    }
}
