/**
 * Created by t00196165 on 21/09/2017.
 */
import javax.swing.*;
public class Ques5 {

    public static void main(String[] args) {

        double b, a, c;

        a = Double.parseDouble(JOptionPane.showInputDialog("please enter a value"));
        b = Double.parseDouble(JOptionPane.showInputDialog("please enter b value"));
        c = Double.parseDouble(JOptionPane.showInputDialog("please enter c value"));

        Quadratic.Equation(a,b,c);
    }

}
