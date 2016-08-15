/**
 * Created by jc320658 on 15/08/2016.
 */
import java.util.Scanner;
public class InchestoFeetInteractive {
    public static void main(String[] args){
        int inches;
        int feet;
        int inchesLeft;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of Inches: ");
        inches = input.nextInt();
        feet = inches / 12;
        inchesLeft = inches % 12;
        System.out.println(inches + " inches is " +
                feet + " feet and " + inchesLeft + " inches");
    }

}
