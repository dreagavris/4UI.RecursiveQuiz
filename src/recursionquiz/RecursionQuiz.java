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
    // create the method that will reverse the length of the word  called reverseString
    // The method stores a string called word for the user's input 
    
    public String reverseString(String word) {
       // if the word equals 1 or 0 then return it back to the user
        if (word.length() == 1 || word.length() == 0) {
            return word;

        }
        // The last section of the wordto equal the last word of the the String
        String lastWord = word.substring(word.length() - 1);
        //  reduce word to now be put in the first postion without the last word
        String newWord = word.substring(0, word.length() - 1);
        // return the answer by adding the seperated sections together but now in reverse
        return lastWord + reverseString(newWord);
        

    }
    //test the main method
    public static void main(String[] args) {
        RecursionQuiz test = new RecursionQuiz();
        //Print out the answers for the user
        System.out.println("The reversed number of " + test.reverseString("it"));

    }

}
