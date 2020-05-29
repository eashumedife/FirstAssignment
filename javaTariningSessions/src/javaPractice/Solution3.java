package javaPractice;

import java.util.Scanner;

public class Solution3 {

	  public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("================================");
          for(int i=0;i<3;i++){
              String s1=sc.next();
              int x=sc.nextInt();
              
              System.out.printf("%-15s%03d%n", s1, x);
               /* String s2 = String.valueOf(x);
               
       
                
                
                System.out.format("%15d", "s1");
                if (s2.length()==2) 
                {
                	
                	System.out.println("0"+s2);
                }else if (s2.length()== 1) {
                	
                	System.out.println("00"+s2);
                }else {
                	
                	System.out.println(s2);
                } */
              //Complete this line
          }
          System.out.println("================================");

  }
}
