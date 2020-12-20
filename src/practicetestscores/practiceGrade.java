
package practicetestscores;

import javax.swing.JOptionPane;

/**
 *
 * @author Shanell Spann
 */
public class practiceGrade {
    String inputString;  // allows dialog box to read input since it cannot operate math on string data types.
    int total;
    int Score1;
    int Score2;
    int Score3;
    int sum;
    
    public void userInput()
    {     
        inputString = JOptionPane.showInputDialog("Enter Test Score #1");
        Score1 = Integer.parseInt(inputString);
        
        inputString = JOptionPane.showInputDialog("Enter Test Score #2");
        Score2 = Integer.parseInt(inputString);
        
        inputString = JOptionPane.showInputDialog("Enter Test Score #3");
        Score3 = Integer.parseInt(inputString);
    }
    
    
    public void sumOfInput() 
    { 
        sum = Score1 + Score2 + Score3;
   
    }
        
    public int averageScore()
    {
        int average;
        
        average = (sum / 3);
        return average;
    }
    
    public void displayAverage()
    {
        JOptionPane.showMessageDialog(null, "Hello, your average score =  " + averageScore());
    }
    
     public void LetterGrade()
    {
        if (averageScore() <= 60)
        {
            JOptionPane.showMessageDialog(null, "Your Letter Grade =  F");
        }
        else if (averageScore() <= 70)
        {
            JOptionPane.showMessageDialog(null, "Your Letter Grade =  D");
        }
        else if(averageScore() <= 80)
        {
            JOptionPane.showMessageDialog(null, "Your Letter Grade =  C");
        }
        else if (averageScore() <= 90)
        {
            JOptionPane.showMessageDialog(null, "Your Letter Grade =  B");
        }
        else if (averageScore() <= 100)
        {
            JOptionPane.showMessageDialog(null, "Your Letter Grade =  A");
        }
        else 
        {
           JOptionPane.showMessageDialog(null, "Your Letter Grade = A+  (You earned extra credit.)"); 
        }
    }   
}
