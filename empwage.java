import java.util.*;

public class empwage
{
 public static void main(String[] args)
 {
  int Total_Fulltime_Hrs = 8;
  int Total_Parttime_Hrs = 4;
  int Wage_Per_Hr = 20;
  int Total_Wage = 0 ;
  int Monthly_Wage = 0;
  int Total_Hrs = 0;
  int Total_Days = 0;
  Random r = new Random();
  while(Total_Days<20 || Total_Hrs<100)
  {
   int a = r.nextInt(3);
   switch(a) 
   {
    case 0 : System.out.println("Employee Present Full time");
             Total_Wage = Total_Fulltime_Hrs * Wage_Per_Hr;
             Total_Hrs = Total_Hrs + Total_Fulltime_Hrs;
             Total_Days++;
				 break;
    case 1 : System.out.println("Employee Present Part time");
             Total_Wage = Total_Parttime_Hrs * Wage_Per_Hr;
             Total_Hrs += Total_Fulltime_Hrs;
				 Total_Days++;
				 break;
    case 2 : System.out.println("Employee Absent");
             Total_Wage = 0;
             break;
    default : System.out.println("Invalid");
   }
  }
  System.out.println("Mothly Wage : " + Monthly_Wage);
 }
}


