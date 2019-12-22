package Assignment;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class DataType {

    public static <string> void main(String[] args) {

        //The minimum legal age (in year)to purchase alcohol in USA.
         byte age=21;
        System.out.println("the minimum legal age to purchase alcohol in USA:"+age);

        //Average monthly salary of an automation engineer in NYC.
        short Salary =8650;
        System.out.println(" Average monthly salary of an automation engineer in NYC :"+Salary);

        //Distance between Earth and moon in miles.
         int Distance=238900;
        System.out.println(" Distance between Earth and moon in miles"+Distance);

        //The national debt of the United state in US dollars.
        long AmountofDebt=16760000000000l;
        System.out.println("The national debt of the United state in us dollars"+AmountofDebt);

        //The interest rate in Chase Bank(use float to store value)
        float InterestRate=0.01f;
        System.out.println(" The interest rate in Chase Bank:"+InterestRate);

        //In which data type ,you should store an item's price
        //we can use two primitive floating point types:float and double to store an item's price.
        System.out.println("we can use two primitive floating point types: float and double");

        //Ans for "is your gender female?"
        boolean IsyourGenderFemale=true;
        System.out.println(IsyourGenderFemale);

        //Your name initials
        char name='F';
        System.out.println("My name initial is:"+name);


    }
}
