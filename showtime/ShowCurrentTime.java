import javax.swing.*;
public class ShowCurrentTime {
  public static void main(String[] args){
    long totalMillsec = System.currentTimeMillis();
    long totalSec = totalMillsec /1000;
    long totalMin = totalSec/60;
    long totalH = totalMin/60;
    long currentH = totalH %24;
    long currentSec =(int) (totalSec % 60);
    long currentMin = totalMin%60;
    System.out.println((currentH+19)+":"+currentMin+":"+currentSec);
    JOptionPane.showMessageDialog(null,(currentH+19)+":"+currentMin+":"+currentSec);
  }
}