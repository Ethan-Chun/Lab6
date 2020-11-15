import java.util.Scanner;

public class GradeCalc
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);  
        int i; int lab=0; int pro=0; int test=0; int total=0;
        
        //User input grades
        System.out.print("How many Practice Problems grades are you entering?");
        int num = scan.nextInt();
        //if user enter more grades than the amount of grades there actually is, restart the program 
        if(num > 8){System.out.println("Error, you do not have this much practice problem grades to enter"); System.out.println("Restarting"); System.exit(0); }
        int marks[] = new int[num];
        
        for(i=0; i<marks.length; i++) { 
           System.out.print("Enter Grades of Practice Problems "+(i+1)+":");
           marks[i] = scan.nextInt();
           pro = pro + marks[i];
        }
        
        System.out.print("How many Lab grades are you entering?");
        int num2 = scan.nextInt();
        if(num2 > 7){System.out.println("Error, you do not have this much lab grades to enter"); System.out.println("Restarting"); System.exit(0); }
        int marks2[] = new int[num2];
         
        for(i=0; i<marks2.length; i++) { 
           System.out.print("Enter Grades of Lab "+(i+1)+":");
           marks2[i] = scan.nextInt();
           lab = lab + marks2[i];
        }
        
        System.out.print("How many Test grades are you entering?");
        int num3 = scan.nextInt();
        if(num3 > 3){System.out.println("Error, you do not have this much tests grades to enter"); System.out.println("Restarting"); System.exit(0); }
        int marks3[] = new int[num3];
        
        for(i=0; i<marks3.length; i++) { 
           System.out.print("Enter Grades of Test "+(i+1)+":");
           marks3[i] = scan.nextInt();
           test = test + marks3[i];
        }
        scan.close();
        total = lab + pro +test;
        
        
        //Calculates grade here
        System.out.println("Your total grade is: ");
        System.out.println(total);
        int plan = 0;
        int dif =0;
        
        //Calculates how many points you need for a desired letter grade
        Scanner letter = new Scanner(System.in);
        System.out.println("What Grade do you want? Enter 'A' 'B' 'C' 'D'");
        String choice = letter.nextLine();
        if(choice.equals("A")){
          plan = 90;
          if(total >= plan)
          {
            System.out.println("You have already achieved this grade");
          }
          else{
            dif = plan - total;
            System.out.println("You need "+ dif + " more points for A"); 
          }
        }
        else if(choice.equals("B")){
          plan = 80;
          if(total >= plan)
          {
            System.out.println("You have already achieved this grade");
          }
          else{
            dif = plan - total;
            System.out.println("You need "+ dif + " more points for B"); 
          }
        }
        else if(choice.equals("C")){
          plan = 70;
          if(total >= plan)
          {
            System.out.println("You have already achieved this grade");
          }
          else{
            dif = plan - total;
            System.out.println("You need "+ dif + " more points for C"); 
          }
        }
        else if(choice.equals("D")){
          plan = 60;
          if(total >= plan)
          {
            System.out.println("You have already achieved this grade");
          }
          else{
            dif = plan - total;
            System.out.println("You need "+ dif + " more points for D"); 
          }
        }
        
        //Calculates how much assignments you have left to do 
        int proleft = 8 - marks.length;
        int lableft = 7-  marks2.length;
        int testleft = 3 - marks3.length;
        System.out.println("You still have "+proleft+" practice problems left");
        System.out.println("You still have "+lableft+" labs left");
        System.out.println("You still have "+testleft+" tests left");
         
    }
}