/**
 * Write a description of class AJFrameProgramWithAGridLayout here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BankAccountSystem2Mode{
    private double x = 0.0;         //Value entered by user.
    private double balance = 0.0;   //Current balance.    
      
          
      
    
    public BankAccountSystem2Mode() {
        
        
        //The JFrame window and components that will appear in the window.
        JFrame window = new JFrame("Bank Account");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /* Create a new JPanel that will be the main content panel.
         Give it a GridLayout of 5 rows and 2 columns. */
        JPanel thePanel = new JPanel();
         GridLayout theLayout = new GridLayout(5,2);
         thePanel.setLayout(theLayout);
         thePanel.setOpaque(true);
         thePanel.setBackground(Color.white);
         window.setContentPane(thePanel);
         
         //JLabel with instructions to type in the intial balance value.
         //JLabel label1 = new JLabel("Type in initial money:",SwingConstants.RIGHT);                  
         JLabel label1 = new JLabel("Money(CAD):",SwingConstants.RIGHT);
         label1.setOpaque(true);
         label1.setBackground(Color.LIGHT_GRAY);
         
         //JTextField the user enters the initial current value into.
         JTextField initValueField = new JTextField();
         
         //Blank JLabel to the left of the button.
         JLabel label2 = new JLabel("",SwingConstants.CENTER);
         label2.setOpaque(true);
         label2.setBackground(Color.LIGHT_GRAY);
          
        
                 
         /* Right-hand JLable is initially blank. It will contain a message if a non-number value is entered. */
         JLabel label3 = new JLabel("",SwingConstants.CENTER);
         label3.setOpaque(true);
         label3.setForeground(Color.RED);
         label3.setBackground(Color.LIGHT_GRAY);
         
         /* JButton that triggers the save,check balance etc. The ActionListener will be added later*/
        JButton CheckBalancebutton = new JButton("CHECK YOUR BALANCE");
        JButton SaveMoneybutton = new JButton("SAVE MONEY");
        JButton WithdrawMoneybutton = new JButton("WITHDRAW");
        JButton Exitbutton = new JButton("EXIT");
        
                 
         
         
        
         
         //Add the components to the main content panel.
         thePanel.add(label1);                  //Adds JLabel to 1st row, 1st column.
         thePanel.add(initValueField);          //Adds initValueField to 1st row, 2nd column.
         thePanel.add(label2);                  //Adds label2 to 2nd row, 1st column.
         thePanel.add(label3);                  //Adds label3 to 2nd row, 2nd column.
         thePanel.add(CheckBalancebutton);      //Adds button
         thePanel.add(SaveMoneybutton);         //Adds button.
         thePanel.add(WithdrawMoneybutton);     //Adds button.
         thePanel.add(Exitbutton);              //Adds button.
         
         
        
        
           
           JLabel DisplayLabels = new JLabel();
           thePanel.add(DisplayLabels); 
           
            
            /*Add an ActionListener to the JButton to start calculating money*/
           CheckBalancebutton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
            /*If the user enters a number, calculate and display balance. */
           try {
                    x = Double.parseDouble(initValueField.getText());
                    if (balance>=0) {               
                    DisplayLabels.setText(Double.toString(balance));}
                    else
                    DisplayLabels.setText("Your balance is not enough.");
                }            
            //If the user enters a non number,write warning message in JLabel under the JButton.  */
           catch (NumberFormatException e)  {
              
               DisplayLabels.setText("Not a number.");
            }
        }
        });
        
        SaveMoneybutton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
            /*If the user enters a number, calculate and display balance. */
           try {
                    x = Double.parseDouble(initValueField.getText());
                    balance=x+balance;
                    DisplayLabels.setText(x+" CAD SAVED");
                }            
            //If the user enters a non number,write warning message in JLabel under the JButton.  */
           catch (NumberFormatException e)  {
              
               DisplayLabels.setText("Not a number.");
            }
        }
        });
         WithdrawMoneybutton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
            /*If the user enters a number, calculate and display balance. */
           try {            
                    x = Double.parseDouble(initValueField.getText());
                    balance=balance-x;
                     if (balance>=0) {               
                    DisplayLabels.setText(x+" CAD WITHDRAWAL");}
                    else
                    DisplayLabels.setText("Your balance is not enough.");
                }       
                
                
            //If the user enters a non number,write warning message in JLabel under the JButton. */
           catch (NumberFormatException e)  {
              
               DisplayLabels.setText("Not a number.");
            }
        }
        });
        Exitbutton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
            /*If the user enters a number, exit. */
           try {
                    x = Double.parseDouble(initValueField.getText());
                    System.exit(0);
                }            
            //If the user enters a non number,write warning message in JLabel under the JButton.*/
           catch (NumberFormatException e)  {
              
               DisplayLabels.setText("Not a number.");
            }
        }
        });
           
            //Pack the JFrame window to minimize size and make it visible 
            window.pack();
            window.setVisible(true);
     }
    
     public static void main (String[] args) {
         new BankAccountSystem2Mode();
     }
 }
