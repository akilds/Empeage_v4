import java.util.*;

public class empwage
{
 public static void main(String[] args)
 {
  int Total_Fulltime_Hrs = 8;
  int Total_Parttime_Hrs = 4;
  int Wage_Per_Hr = 20;
  int Total_Wage = 0;
  Random r = new Random();
  int a = r.nextInt(3);
  System.out.println(a);
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
  System.out.println("Employee Wage : " + Total_Wage);
 }
}


