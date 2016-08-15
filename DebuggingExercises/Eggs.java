/**
 * Created by jc320658 on 15/08/2016.
 */
import java.util.Scanner;
public class Eggs {
    public static void main(String[] args)
    {
        int amount;
        double dozenEggs = 3.25;
        double soloEggs = 0.45;
        int orderSize;
        System.out.println("How many eggs would you like?: ");
        Scanner amountofEggs = new Scanner(System.in);
        orderSize = (int) amountofEggs.nextDouble();
        System.out.println("You ordered " + orderSize + " eggs, Which will cost " + (((orderSize/12) * dozenEggs) + ((orderSize%12) * soloEggs)));
        System.out.println(orderSize);




    }

}
