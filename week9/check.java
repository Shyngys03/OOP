package week9;

import java.io.FileWriter;

public abstract class check {

    // public check(){}
    
    public void checkIIN(String IIN) throws Exception{
        FileWriter writer = new FileWriter("output.txt", true);

        if(IIN.length() != 12){
            writer.append("ERROR: INCORRECT FORMAT OF IIN: " + IIN + '\n');
        }
        else {
            System.out.println("Correct");
        }
        writer.close();
    }

    public void checkPhoneNumber(String phoneNumber) throws Exception{
        FileWriter writer = new FileWriter("output.txt", true);

        if((phoneNumber.charAt(0) == '+' && phoneNumber.length() != 12) || (phoneNumber.charAt(0) != '+' && phoneNumber.length() != 11)){
            writer.append( "ERROR: INCORRECT FORMAT OF Phone number: " + phoneNumber + '\n');
        }  
        else {
            System.out.println("Correct");
        }
        writer.close();
    }
}
