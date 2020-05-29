package javaPractice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution4 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
       
        
        
     
       // if(N>=2 & N<=22) {
        
        for (int i=1; i <=10; i++) {
        	
             if (N>=2 & N<=22) {
        	System.out.println(N +" * "+ i +" = " + i*N);}
             else {
            	 break;
             }
        }
       // }
        	
        
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
    }
}
