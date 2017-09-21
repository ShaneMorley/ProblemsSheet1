import javax.swing.*;

/**
 * Created by t00196165 on 21/09/2017.
 */
public class Quadratic {

    static void Equation(double a, double b, double c)
    {
        double x = (-b + Math.sqrt((b*b) - (4*a)*c))/(2*a);
        double y = (-b - Math.sqrt((b*b) - (4*a)*c))/(2*a);
        JOptionPane.showMessageDialog(null, "x = (" + x + "," + y + ")");

    }

}
