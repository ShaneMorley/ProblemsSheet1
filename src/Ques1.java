/**
 * Created by t00196165 on 21/09/2017.
 */
import java.util.Scanner;
public class Ques1 {

    public static void main(String[] args)
    {

        Scanner Input = new Scanner(System.in);

        int x = 1;


        while(x > 0)
        {
            System.out.print("please enter value to convert in euros: ");
            x = Input.nextInt();
            Convert.Converted(x);
        }

    }

}
