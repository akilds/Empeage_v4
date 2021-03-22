import java.util.*;

public class pg1
{
 public static void main(String[] args)
 {
  Random r = new Random();
  int a = r.nextInt(2);
  System.out.println(a);
  if(a==0)
  {
   System.out.println("Employee Present");
  }
  else
  {
   System.out.println("Employee Absent");
  }
 }
}


