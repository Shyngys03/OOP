package week9;

import java.util.Scanner;

public class test {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("IIN: ");
        String iin = sc.nextLine();
        System.out.print("Phone number: ");
        String phone_number = sc.nextLine();
        user testuser = new user(name, iin, phone_number);

        sc.close();

        testuser.checkIIN(iin);
        testuser.checkPhoneNumber(phone_number);
    }
}
