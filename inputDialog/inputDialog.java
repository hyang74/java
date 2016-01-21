import javax.swing.*;
public class inputDialog
{
  public static void main(String[] args)
  {
    String in = JOptionPane.showInputDialog (null,"plz enter something:","input",JOptionPane.QUESTION_MESSAGE);
    JOptionPane.showMessageDialog(null, in,"output",JOptionPane.INFORMATION_MESSAGE);
  }
}
