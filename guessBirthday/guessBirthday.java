import javax.swing.*;
import java.util.Scanner;

public class guessBirthday
{
  public static void main(String[] args)
  {
    String set1 =" 1  3  5  7\n"+" 9 11 13 15\n"+"17 19 21 23\n"+"25 27 29 31";
    String set2 =" 2  3  6  7\n"+"10 11 14 15\n"+"20 21 22 23\n"+"28 29 30 31";
    String set3 =" 4  5  6  7\n"+"12 13 14 15\n"+"20 21 22 24\n"+"26 27 30 31";
    String set4 =" 8  9 10 11\n"+"12 13 14 15\n"+"24 25 26 27\n"+"28 29 30 31";
    String set5 ="16 17 18 19\n"+"20 21 22 23\n"+"24 25 26 27\n"+"28 29 30 31";
    int date = 0;
    Scanner input = new Scanner(System.in);
    int A,B,C,D,E;
    
    System.out.println("5 questions and find ur birthday");
    System.out.println("Is ur birthay in1 this list: \n"+set1+"\n1 for yes;0 for no");
    A = input.nextInt();
    System.out.println("Is ur birthay in this list:\n"+set2+"\n1 for yes;0 for no");
    B = input.nextInt();
    System.out.println("Is ur birthay in this list:\n"+set3+"\n1 for yes;0 for no");
    C=  input.nextInt();
    System.out.println("Is ur birthay in this list:\n"+set4+"\n1 for yes;0 for no");
    D = input.nextInt();
    System.out.println("Is ur birthay in this list:\n"+set5+"\n1 for yes;0 for no");
    E = input.nextInt(); 
    if (A == 1)
      date += 1;
    if (B == 1)
      date += 2;
    if (C == 1)
      date += 4;
    if (D == 1)
      date += 8;
    if (E == 1)
      date += 16;
    JOptionPane.showMessageDialog(null,"ur birthday must be   "+date);
    
  }
}