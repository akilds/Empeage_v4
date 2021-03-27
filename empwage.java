import java.util.*;

class CompanyEmpWage
{
 int Empwage;
 static ArrayList<Integer> Dailywage_store = new ArrayList<Integer>();
 CompanyEmpWage(int EmpWage, ArrayList<Integer> Dailywage)
 {
  this.Empwage = EmpWage;
  this.Dailywage_store = Dailywage;
 }
 public int EmpWageShow()
 {
  return Empwage;
 }
 public ArrayList<Integer> WageShow()
 {
  return Dailywage_store;
 }
}
public class empwage
{
 public static int Total_Fulltime_Hrs = 8;
 public static int Total_Parttime_Hrs = 4;
 public static int Wage_Each_Company;
 public static int Emp_Monthly_Wage;
 static ArrayList<Integer> Dailywage_copy = new ArrayList<Integer>();
 public static int emp_wage_calc(int Total_Working_Hrs, int Total_Working_Days, int Wage_Per_Hr)
 {
  int Total_Wage = 0 ;
  int Monthly_Wage = 0;
  int Total_Hrs = 0;
  int Total_Days = 0;
  ArrayList<Integer> Daily_Wage = new ArrayList<Integer>();
  Random r = new Random();
  while(Total_Days<Total_Working_Days || Total_Hrs<Total_Working_Hrs)
  {
   int a = r.nextInt(3);
   switch(a)
   {
    case 0 : Total_Wage = Total_Fulltime_Hrs * Wage_Per_Hr;
             Daily_Wage.add(Total_Wage);
             Total_Hrs = Total_Hrs + Total_Fulltime_Hrs;
             Total_Days++;
             break;
    case 1 : Total_Wage = Total_Parttime_Hrs * Wage_Per_Hr;
             Daily_Wage.add(Total_Wage);
             Total_Hrs += Total_Fulltime_Hrs;
             Total_Days++;
             break;
    case 2 : Total_Wage = 0;
             Daily_Wage.add(Total_Wage);
             break;
    default : System.out.println("Invalid");
   }
     Monthly_Wage += Total_Wage;
  }
  Dailywage_copy = Daily_Wage;
  return Monthly_Wage;
 }
 public static void Emp_Wage_Builder(char c)
 {
  ArrayList<CompanyEmpWage> emwage = new ArrayList<CompanyEmpWage>();
  ArrayList<Integer> wage_show = new ArrayList<Integer>();
  emwage.add(new CompanyEmpWage(Emp_Monthly_Wage,Dailywage_copy));
  Wage_Each_Company = emwage.get(0).EmpWageShow();
  wage_show = emwage.get(0).WageShow();
  if(c=='Y'||c=='y')
  {
   System.out.println("Mothly Wage of company : " + Wage_Each_Company);
   System.out.println("Daily Wage : \n" + wage_show);
  }
 }
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  char choice;
  Emp_Monthly_Wage = emp_wage_calc(100,20,20);
  System.out.println("Do you want to display (Y/N)");
  choice = sc.next().charAt(0);
  if(choice=='Y'||choice=='y')
  {
    Emp_Wage_Builder(choice);
  }
  Emp_Monthly_Wage = emp_wage_calc(110,21,25);
  System.out.println("Do you want to display (Y/N)");
  choice = sc.next().charAt(0);
  if(choice=='Y'||choice=='y')
  {
    Emp_Wage_Builder(choice);
  }
  Emp_Monthly_Wage = emp_wage_calc(120,22,30);
  System.out.println("Do you want to display (Y/N)");
  choice = sc.next().charAt(0);
  if(choice=='Y'||choice=='y')
  {
    Emp_Wage_Builder(choice);
  }
 }
}




