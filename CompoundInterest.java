//Noble Finsand 
package compoundinterest;

import javax.swing.JOptionPane;
import java.text.NumberFormat;

/**
 *
 * @author nfinsand
 */
public class CompoundInterest
{

    public static void main(String[] args)
    {
        String dialogInputSavings;
        String dialogInputInterest;
        String dialogInputMonths;
        String dialogInputAgain;
        String answer;
        double savingsAmount;
        double interestAmountMonthly;
        int totalMonths;

        do
        {
            //Prompt user how much they will save
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            dialogInputSavings = JOptionPane.showInputDialog("Please enter how much you will save each month");
            savingsAmount = Double.parseDouble(dialogInputSavings);

            //Prompt user how much their annual interest rate is
            dialogInputInterest = JOptionPane.showInputDialog("Please enter your annual interest rate");
            interestAmountMonthly = Double.parseDouble(dialogInputInterest) / 12 / 100;

            //Prompt user to enter how many months
            dialogInputMonths = JOptionPane.showInputDialog("After how many months would you like to see your total savings?");
            totalMonths = (int) Double.parseDouble(dialogInputMonths);

            //Calculate total savings and display 
            double total = savingsAmount * (1 + interestAmountMonthly);

            for (int math = 2; math <= totalMonths; math++)
            {
                total = (savingsAmount + total) * (1 + interestAmountMonthly);
            }
            JOptionPane.showMessageDialog(null, "You will have a total of " + formatter.format(total) + " after " + totalMonths + " month(s)");

            //Asks user if they want to calculate again
            dialogInputAgain = JOptionPane.showInputDialog("Would you like to calculate another amount, y or n?");
            answer = dialogInputAgain;
        } while (answer.equals("y"));

        JOptionPane.showMessageDialog(null, "Have a wonderful day!");
    }
}
