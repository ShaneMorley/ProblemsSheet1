/**
 * Created by t00196165 on 21/09/2017.
 */
import javax.swing.JOptionPane;
public class Q4Count
{

    static void NameCheck(String Name)
    {
       String LastName = "", CapsName;
       int Counter, NameLen = 0;
       char Ch, Initial, Letter;

       NameLen = Name.length();

       CapsName = Name.toUpperCase();

       Ch = CapsName.charAt(0);

for (Counter = Name.lastIndexOf(' '); Counter < NameLen; Counter++) {
    if (Counter > Name.lastIndexOf(' '))
    {
        Letter = Name.charAt(Counter);
        LastName += Letter;
    }
}
       JOptionPane.showMessageDialog(null, "number of characters in name: " + NameLen + "\nFirst Initial: " + Ch + "\nName in Caps: " + CapsName + "\nLast name: " + LastName);
    }

}
