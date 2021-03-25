import java.util.*;

public class empwage
{
 public static int Total_Fulltime_Hrs = 8;
 public static int Total_Parttime_Hrs = 4;
 public static int emp_wage_calc(int Total_Working_Hrs, int Total_Working_Days, int Wage_Per_Hr)
 {
  int Total_Wage = 0 ;
  int Monthly_Wage = 0;
  int Total_Hrs = 0;
  int Total_Days = 0;
  Random r = new Random();
  while(Total_Days<Total_Working_Days || Total_Hrs<Total_Working_Hrs)
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
  int Emp_Monthly_Wage_c1, Emp_Monthly_Wage_c2, Emp_Monthly_Wage_c3;
  Emp_Monthly_Wage_c1 = emp_wage_calc(100,20,20);
  System.out.println("Mothly Wage of company 1 : " + Emp_Monthly_Wage_c1);
  Emp_Monthly_Wage_c2 = emp_wage_calc(110,21,25);
  System.out.println("Mothly Wage of company 2 : " + Emp_Monthly_Wage_c2);
  Emp_Monthly_Wage_c3 = emp_wage_calc(120,22,30);
  System.out.println("Mothly Wage of company 3 : " + Emp_Monthly_Wage_c3);

 }
}


