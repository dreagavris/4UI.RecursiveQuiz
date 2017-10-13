/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionquiz;

/**
 *
 * @author andreeagavris
 */
public class RecursionQuiz {

    /**
     * @param args the command line arguments
     */
    public String reverseString(String word) {
        if (word.length() == 1 || word.length() == 0) {
            return word;

        }
        String lastPostion = word.substring(word.length() - 1);
        String newWord = word.substring(0, word.length() - 1);

        return lastPostion + reverseString(newWord);

    }

    public static void main(String[] args) {
        RecursionQuiz test = new RecursionQuiz();

        System.out.println("The reversed number of " + test.reverseString("it"));

    }

}
