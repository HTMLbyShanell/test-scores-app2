/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicetestscores;

/**
 *
 * @author Shanell Spann
 */
public class PracticeTestScores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        practiceGrade pg = new practiceGrade();
        pg.userInput();
        pg.sumOfInput();
        pg.averageScore();
        pg.displayAverage();
        pg.LetterGrade();
        System.exit(0);
    }
    
}
