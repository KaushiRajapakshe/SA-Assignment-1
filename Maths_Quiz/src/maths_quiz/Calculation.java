package maths_quiz;


import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author sachin kumara
 */
public class Calculation {
  
  private int[]anserset;
  
  public int[] getCalculation(int num ,String[]cal){
      this.anserset=new int[cal.length+2];
      this.anserset[0]=num;
      int i=1;
      for (String str : cal) {
          int no;
          if(i==1){
              no=0;
          }
          else{
              no=i;
          }
          int[] li=new int[2];
          switch(str){
              case "+":
                  li=Addition(this.anserset[no]);
                  this.anserset[i]=li[0];
                  this.anserset[i+1]=li[1];
                  break;
              case "-":
                  li=Subtraction(this.anserset[no]);
                  this.anserset[i]=li[0];
                  this.anserset[i+1]=li[1];
                  break;
              case "*":
                  li=Multiplication(this.anserset[no]);
                  this.anserset[i]=li[0];
                  this.anserset[i+1]=li[1];
                  break;
              case "/":
                  li=Division(this.anserset[no]);
                  this.anserset[i]=li[0];
                  this.anserset[i+1]=li[1];
                  break;
                  
          }
          i++;
          
      }
      
      return this.anserset;
  }
  public int[] Addition(int num) {
        int randomNum = 0;
        int gen[]=new int[2];
        //while (randomNum == 0) {
        try {
            if(num==1){
                randomNum=1;
            }
            else{
                randomNum = ThreadLocalRandom.current().nextInt(1, num);
            }
        } catch (Exception e) {

            e.printStackTrace();
            //return "ex";
        }
        //}
        int no1, no2;
        no1 = randomNum;
        no2 = num - no1;
        
        gen[0]=no1;
        gen[1]=no2;
        
        return gen;

    }

    public int[] Subtraction(int num) {
        int randomNum = 0;
        int gen[]=new int[2];
        //while (randomNum == 0) {
        try {
            if(num==1){
                randomNum=1;
            }
            else{
                randomNum = ThreadLocalRandom.current().nextInt(1, num);
            }
        } catch (Exception e) {

            e.printStackTrace();
            //return "ex";
        }
        //}
        int no1, no2;
        no1 = randomNum;
        no2 = num + no1;
        gen[0]=no2;
        gen[1]=no1;
        
        return gen;

    }
    
    public int[] Multiplication(int num) {
        int randomNum = 0;
        int gen[]=new int[2];
        //while (randomNum == 0) {
        int k=0;
        do{

            try {
                if(num==1){
                    randomNum=1;
                }
                else{
                    randomNum = ThreadLocalRandom.current().nextInt(1,101);
                }

            } catch (Exception e) {

                e.printStackTrace();
                //return "ex";
            }

            if((k<5000&&randomNum==1)||(k<500000&&randomNum==num)){
                randomNum = ThreadLocalRandom.current().nextInt(1,101);
            }
            k++;
        }while(num%randomNum!=0);
// }
        int no1, no2;
        no1 = randomNum;
        no2 = num / no1;
        gen[0]=no1;
        gen[1]=no2;
        
        return gen;

    }
    
    public int[] Division(int num) {
        int randomNum = 0;
        int gen[]=new int[2];
        int no1, no2;
        //while (randomNum == 0) {
        int k=0;
        do{

            try {
                if(num==1){
                    randomNum=1;
                }
                else{
                    randomNum = ThreadLocalRandom.current().nextInt(1,101);
                }

            } catch (Exception e) {

                e.printStackTrace();
                //return "ex";
            }

            if((k<5000&&randomNum==1)){
                randomNum = 9999;
            }
            k++;

// }

            no1 = randomNum;
            no2 = num * no1;
        }while(no2>90);
        gen[0]=no2;
        gen[1]=no1;
        
        return gen;

    }
    
}

