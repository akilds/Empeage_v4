import java.util.*;

public class empwage
{
 public static void main(String[] args)
 {
  int Total_Hrs_Per_Day = 8;
  int Wage_Per_Hr = 20;
  int Total_Wage;
  Random r = new Random();
  int a = r.nextInt(2);
  System.out.println(a);
  if(a==0)
  {
   System.out.println("Employee Present");
   Total_Wage = Total_Hrs_Per_Day * Wage_Per_Hr;
  }
  else
  {
   System.out.println("Employee Absent");
   Total_Wage = 0;
  }
  System.out.println("Employee Wage : " + Total_Wage);
 }
}


