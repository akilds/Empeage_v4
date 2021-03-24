import java.util.*;

public class empwage
{
 public static int Total_Fulltime_Hrs = 8;
 public static int Total_Parttime_Hrs = 4;
 public static int Wage_Per_Hr = 20;
 public static int emp_wage_calc()
 {
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
     Monthly_Wage += Total_Wage;
  }
  return Monthly_Wage;
 }
 public static void main(String[] args)
 {
  int Emp_Monthly_Wage;
  Emp_Monthly_Wage = emp_wage_calc();
  System.out.println("Mothly Wage : " + Emp_Monthly_Wage);
 }
}


