import java.util.*;

public class empwage
{
 public static void main(String[] args)
 {
  int Total_Fulltime_Hrs = 8;
  int Total_Parttime_Hrs = 4;
  int Wage_Per_Hr = 20;
  int Total_Wage = 0;
  int Working_Days_Per_Month = 20;
  int Monthly_Wage = 0;
  Random r = new Random();
  for(int i=1;i<=Working_Days_Per_Month;i++)
  {
   int a = r.nextInt(3);
   switch(a) 
   {
    case 0 : System.out.println("Employee Present Full time");
             Total_Wage = Total_Fulltime_Hrs * Wage_Per_Hr;
             break;
    case 1 : System.out.println("Employee Present Part time");
             Total_Wage = Total_Parttime_Hrs * Wage_Per_Hr;
             break;
    case 2 : System.out.println("Employee Absent");
             Total_Wage = 0;
             break;
   default : System.out.println("Invalid");
   }
   Monthly_Wage += Total_Wage;
  }
  System.out.println("Mothly Wage : " + Monthly_Wage);
 }
}


