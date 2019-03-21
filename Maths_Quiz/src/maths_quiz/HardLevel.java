package maths_quiz;

import java.io.File;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author sachin kumara
 */
public class HardLevel implements Level{
    
    private ArrayList<String> quiz = new ArrayList<String>(); 
    private NumberGenaretor ng=new NumberGenaretor();
    private Scanner scan=new Scanner(System.in);
    
    private int point=0;

    public HardLevel(){
        System.out.println("\n\t\tAnswer the following questions\n");
        System.out.println("\t\t\t  Hard Mode\n");
        String str="Questions\tAnswer\tGiven Answer\tStatus";
        quiz.add(str);
    }
    @Override
    public void level1() {
        System.out.print("01) ");
       String str;
        String[] ca={"+","+"};
        int[] q=ng.GetQuiz(1,100, ca);
        System.out.print(q[1]+"+"+q[2]+"+"+q[3]+"=");
        int an=0;
        try{
            an=scan.nextInt();
        }catch(Exception E){
            E.printStackTrace();
        }
        str=q[1]+"+"+q[2]+"+"+q[3]+"\t"+q[0]+"\t"+an+"\t";
        if(an==q[0]){
            str+="True";
            System.out.println("True");
            this.point++;
        }
        else{
             str+="False";
             System.out.println("False");
        }
        
       quiz.add(str);
    }

    @Override
    public void level2() {
        System.out.print("02) ");
       String str;
        String[] ca={"+","-"};
        int[] q=ng.GetQuiz(1,100, ca);
        System.out.print(q[1]+"+"+q[2]+"-"+q[3]+"=");
        int an=0;
        try{
            an=scan.nextInt();
        }catch(Exception E){
            E.printStackTrace();
        }
        str=q[1]+"+"+q[2]+"-"+q[3]+"\t"+q[0]+"\t"+an+"\t";
        if(an==q[0]){
            str+="True";
            System.out.println("True");
            this.point++;
        }
        else{
             str+="False";
             System.out.println("False");
        }
        
       quiz.add(str);
    }

    @Override
    public void level3() {
        System.out.print("03) ");
       String str;
        String[] ca={"+","*"};
        int[] q=ng.GetQuiz(1,100, ca);
        System.out.print(q[1]+"+"+q[2]+"*"+q[3]+"=");
        int an=0;
        try{
            an=scan.nextInt();
        }catch(Exception E){
            E.printStackTrace();
        }
        str=q[1]+"+"+q[2]+"*"+q[3]+"\t"+q[0]+"\t"+an+"\t";
        if(an==q[0]){
            str+="True";
            System.out.println("True");
            this.point++;
        }
        else{
             str+="False";
             System.out.println("False");
        }
        
       quiz.add(str);
    }

    @Override
    public void level4() {
        System.out.print("04) ");
       String str;
        String[] ca={"+","/"};
        int[] q=ng.GetQuiz(1,100, ca);
        System.out.print(q[1]+"+"+q[2]+"/"+q[3]+"=");
        int an=0;
        try{
            an=scan.nextInt();
        }catch(Exception E){
            E.printStackTrace();
        }
        str=q[1]+"+"+q[2]+"/"+q[3]+"\t"+q[0]+"\t"+an+"\t";
        if(an==q[0]){
            str+="True";
            System.out.println("True");
            this.point++;
        }
        else{
             str+="False";
             System.out.println("False");
        }
        
       quiz.add(str);
    }

    @Override
    public void level5() {
        System.out.print("05) ");
       String str;
        String[] ca={"+","+"};
        int[] q=ng.GetQuiz(1,1000, ca);
        System.out.print(q[1]+"+"+q[2]+"+"+q[3]+"=");
        int an=0;
        try{
            an=scan.nextInt();
        }catch(Exception E){
            E.printStackTrace();
        }
        str=q[1]+"+"+q[2]+"+"+q[3]+"\t"+q[0]+"\t"+an+"\t";
        if(an==q[0]){
            str+="True";
            System.out.println("True");
            this.point++;
        }
        else{
             str+="False";
             System.out.println("False");
        }
        
       quiz.add(str);
       
    }

    @Override
    public void level6() {
        System.out.print("06) ");
       String str;
        String[] ca={"+","-"};
        int[] q=ng.GetQuiz(1,1000, ca);
        System.out.print(q[1]+"+"+q[2]+"-"+q[3]+"=");
        int an=0;
        try{
            an=scan.nextInt();
        }catch(Exception E){
            E.printStackTrace();
        }
        str=q[1]+"+"+q[2]+"-"+q[3]+"\t"+q[0]+"\t"+an+"\t";
        if(an==q[0]){
            str+="True";
            System.out.println("True");
            this.point++;
        }
        else{
             str+="False";
             System.out.println("False");
        }
        
       quiz.add(str);
    }

    @Override
    public void level7() {
        System.out.print("07) ");
       String str;
        String[] ca={"+","+","+"};
        int[] q=ng.GetQuiz(1,100, ca);
        System.out.print(q[1]+"+"+q[2]+"+"+q[3]+"+"+q[4]+"=");
        int an=0;
        try{
            an=scan.nextInt();
        }catch(Exception E){
            E.printStackTrace();
        }
        str=q[1]+"+"+q[2]+"+"+q[3]+"+"+q[4]+"\t"+q[0]+"\t"+an+"\t";
        if(an==q[0]){
            str+="True";
            System.out.println("True");
            this.point++;
        }
        else{
             str+="False";
             System.out.println("False");
        }
        
       quiz.add(str);
    }

    @Override
    public void level8() {
        System.out.print("08) ");
       String str;
        String[] ca={"+","+","-"};
        int[] q=ng.GetQuiz(1,100, ca);
        System.out.print(q[1]+"+"+q[2]+"+"+q[3]+"-"+q[4]+"=");
        int an=0;
        try{
            an=scan.nextInt();
        }catch(Exception E){
            E.printStackTrace();
        }
        str=q[1]+"+"+q[2]+"+"+q[3]+"-"+q[4]+"\t"+q[0]+"\t"+an+"\t";
        if(an==q[0]){
            str+="True";
            System.out.println("True");
            this.point++;
        }
        else{
             str+="False";
             System.out.println("False");
        }
        
       quiz.add(str);
    }

    @Override
    public void level9() {
        System.out.print("09) ");
       String str;
        String[] ca={"+","-","+"};
        int[] q=ng.GetQuiz(1,100, ca);
        System.out.print(q[1]+"+"+q[2]+"-"+q[3]+"+"+q[4]+"=");
        int an=0;
        try{
            an=scan.nextInt();
        }catch(Exception E){
            E.printStackTrace();
        }
        str=q[1]+"+"+q[2]+"-"+q[3]+"+"+q[4]+"\t"+q[0]+"\t"+an+"\t";
        if(an==q[0]){
            str+="True";
            System.out.println("True");
            this.point++;
        }
        else{
             str+="False";
             System.out.println("False");
        }
        
       quiz.add(str);
    }

    @Override
    public void level10() {
        System.out.print("10) ");
       String str;
        String[] ca={"+","+","+"};
        int[] q=ng.GetQuiz(1,1000, ca);
        System.out.print(q[1]+"+"+q[2]+"+"+q[3]+"+"+q[4]+"=");
        int an=0;
        try{
            an=scan.nextInt();
        }catch(Exception E){
            E.printStackTrace();
        }
        str=q[1]+"+"+q[2]+"+"+q[3]+"+"+q[4]+"\t"+q[0]+"\t"+an+"\t";
        if(an==q[0]){
            str+="True";
            System.out.println("True");
            this.point++;
        }
        else{
             str+="False";
             System.out.println("False");
        }
        
       quiz.add(str);
    }

    @Override
    public void level11() {
        System.out.print("11) ");
       String str;
        String[] ca={"+","+","-"};
        int[] q=ng.GetQuiz(1,1000, ca);
        System.out.print(q[1]+"+"+q[2]+"+"+q[3]+"-"+q[4]+"=");
        int an=0;
        try{
            an=scan.nextInt();
        }catch(Exception E){
            E.printStackTrace();
        }
        str=q[1]+"+"+q[2]+"+"+q[3]+"-"+q[4]+"\t"+q[0]+"\t"+an+"\t";
        if(an==q[0]){
            str+="True";
            System.out.println("True");
            this.point++;
        }
        else{
             str+="False";
             System.out.println("False");
        }
        
       quiz.add(str);
    }

    @Override
    public void level12() {
        System.out.print("12) ");
       String str;
        String[] ca={"+","-","+"};
        int[] q=ng.GetQuiz(1,1000, ca);
        System.out.print(q[1]+"+"+q[2]+"-"+q[3]+"+"+q[4]+"=");
        int an=0;
        try{
            an=scan.nextInt();
        }catch(Exception E){
            E.printStackTrace();
        }
        str=q[1]+"+"+q[2]+"-"+q[3]+"+"+q[4]+"\t"+q[0]+"\t"+an+"\t";
        if(an==q[0]){
            str+="True";
            System.out.println("True");
            this.point++;
        }
        else{
             str+="False";
             System.out.println("False");
        }
        
       quiz.add(str);
    }

    @Override
    public void level13() {
        System.out.print("13) ");
       String str;
        String[] ca={"+","+","*"};
        int[] q=ng.GetQuiz(1,100, ca);
        System.out.print(q[1]+"+"+q[2]+"+"+q[3]+"*"+q[4]+"=");
        int an=0;
        try{
            an=scan.nextInt();
        }catch(Exception E){
            E.printStackTrace();
        }
        str=q[1]+"+"+q[2]+"+"+q[3]+"*"+q[4]+"\t"+q[0]+"\t"+an+"\t";
        if(an==q[0]){
            str+="True";
            System.out.println("True");
            this.point++;
        }
        else{
             str+="False";
             System.out.println("False");
        }
        
       quiz.add(str);
    }

    @Override
    public void level14() {
       System.out.print("14) ");
       String str;
        String[] ca={"+","+","/"};
        int[] q=ng.GetQuiz(1,100, ca);
        System.out.print(q[1]+"+"+q[2]+"+"+q[3]+"/"+q[4]+"=");
        int an=0;
        try{
            an=scan.nextInt();
        }catch(Exception E){
            E.printStackTrace();
        }
        str=q[1]+"+"+q[2]+"+"+q[3]+"/"+q[4]+"\t"+q[0]+"\t"+an+"\t";
        if(an==q[0]){
            str+="True";
            System.out.println("True");
            this.point++;
        }
        else{
             str+="False";
             System.out.println("False");
        }
        
       quiz.add(str);
    }

    @Override
    public void level15() {
        System.out.print("15) ");
       String str;
        String[] ca={"+","+","+","+"};
        int[] q=ng.GetQuiz(1,100, ca);
        System.out.print(q[1]+"+"+q[2]+"+"+q[3]+"+"+q[4]+"+"+q[5]+"=");
        int an=0;
        try{
            an=scan.nextInt();
        }catch(Exception E){
            E.printStackTrace();
        }
        str=q[1]+"+"+q[2]+"+"+q[3]+"+"+q[4]+"+"+q[5]+"\t"+q[0]+"\t"+an+"\t";
        if(an==q[0]){
            str+="True";
            System.out.println("True");
            this.point++;
        }
        else{
             str+="False";
             System.out.println("False");
        }
        
       quiz.add(str);
    }

    @Override
    public void level16() {
        System.out.print("16) ");
       String str;
        String[] ca={"+","-","+","+"};
        int[] q=ng.GetQuiz(1,100, ca);
        System.out.print(q[1]+"+"+q[2]+"-"+q[3]+"+"+q[4]+"+"+q[5]+"=");
        int an=0;
        try{
            an=scan.nextInt();
        }catch(Exception E){
            E.printStackTrace();
        }
        str=q[1]+"+"+q[2]+"-"+q[3]+"+"+q[4]+"+"+q[5]+"\t"+q[0]+"\t"+an+"\t";
        if(an==q[0]){
            str+="True";
            System.out.println("True");
            this.point++;
        }
        else{
             str+="False";
             System.out.println("False");
        }
        
       quiz.add(str);
    }

    @Override
    public void level17() {
        System.out.print("17) ");
       String str;
        String[] ca={"+","-","-","+"};
        int[] q=ng.GetQuiz(1,100, ca);
        System.out.print(q[1]+"+"+q[2]+"-"+q[3]+"-"+q[4]+"+"+q[5]+"=");
        int an=0;
        try{
            an=scan.nextInt();
        }catch(Exception E){
            E.printStackTrace();
        }
        str=q[1]+"+"+q[2]+"-"+q[3]+"-"+q[4]+"+"+q[5]+"\t"+q[0]+"\t"+an+"\t";
        if(an==q[0]){
            str+="True";
            System.out.println("True");
            this.point++;
        }
        else{
             str+="False";
             System.out.println("False");
        }
        
       quiz.add(str);
    }

    @Override
    public void level18() {
       System.out.print("18) ");
       String str;
        String[] ca={"+","-","-","-"};
        int[] q=ng.GetQuiz(1,100, ca);
        System.out.print(q[1]+"+"+q[2]+"-"+q[3]+"-"+q[4]+"-"+q[5]+"=");
        int an=0;
        try{
            an=scan.nextInt();
        }catch(Exception E){
            E.printStackTrace();
        }
        str=q[1]+"+"+q[2]+"-"+q[3]+"-"+q[4]+"-"+q[5]+"\t"+q[0]+"\t"+an+"\t";
        if(an==q[0]){
            str+="True";
            System.out.println("True");
            this.point++;
        }
        else{
             str+="False";
             System.out.println("False");
        }
        
       quiz.add(str);
    }

    @Override
    public void level19() {
        System.out.print("19) ");
       String str;
        String[] ca={"+","+","+","*"};
        int[] q=ng.GetQuiz(1,100, ca);
        System.out.print(q[1]+"+"+q[2]+"+"+q[3]+"+"+q[4]+"*"+q[5]+"=");
        int an=0;
        try{
            an=scan.nextInt();
        }catch(Exception E){
            E.printStackTrace();
        }
        str=q[1]+"+"+q[2]+"+"+q[3]+"+"+q[4]+"*"+q[5]+"\t"+q[0]+"\t"+an+"\t";
        if(an==q[0]){
            str+="True";
            System.out.println("True");
            this.point++;
        }
        else{
             str+="False";
             System.out.println("False");
        }
        
       quiz.add(str);
    }

    @Override
    public void level20() {
       System.out.print("20) ");
       String str;
        String[] ca={"+","+","*","/"};
        int[] q=ng.GetQuiz(1,100, ca);
        System.out.print(q[1]+"+"+q[2]+"+"+q[3]+"*"+q[4]+"/"+q[5]+"=");
        int an=0;
        try{
            an=scan.nextInt();
        }catch(Exception E){
            E.printStackTrace();
        }
        str=q[1]+"+"+q[2]+"+"+q[3]+"*"+q[4]+"/"+q[5]+"\t"+q[0]+"\t"+an+"\t";
        if(an==q[0]){
            str+="True";
            System.out.println("True");
            this.point++;
        }
        else{
             str+="False";
             System.out.println("False");
        }
        
       quiz.add(str);
    }

    @Override
    public void runLevel() {
       level1();
       level2();
       level3();
       level4();
       level5();
       level6();
       level7();
       level8();
       level9();
       level10();
       level11();
       level12();
       level13();
       level14();
       level15();
       level16();
       level17();
       level18();
       level19();
       level20();
       quiz.add("\n\n\t\tPoint : "+this.point+"/20");
       print();
    }
    
    @Override
    public void print(){
        Formatter repot;
        
        try{
          repot = new Formatter("Report.txt");
            for (String st : quiz) {
                repot.format("%s\n", st);
                System.out.println(st);
            }
            repot.format("\n");
            System.out.println("");
            
            repot.close();
            
           /* File re=new File("Report.csv");; //reference to your file here 
            String execString = "start excel " + re.getAbsolutePath();
            System.out.println(execString);
            Runtime run = Runtime.getRuntime();
            Process pp = run.exec(execString);*/
            
            File re=new File("Report.txt");
            java.awt.Desktop.getDesktop().edit(re);
            
        }catch(Exception e){
            System.out.println(e);
        }
        
       
        
        
    }
    
    
}

