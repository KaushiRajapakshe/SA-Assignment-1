package maths_quiz;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author sachin kumara
 */
public class NumberGenaretor {
    
    public int[] GetQuiz(int min, int max, String [] level) {
       
       return new Calculation().getCalculation(Genaretint(min,max),level);   
         
    }
    public int Genaretint(int min, int max) {
        // for get randam frist number

        int randomNum=0;
        
            
         while(randomNum==0){
             randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
         }
         
         return randomNum;
    }
}

