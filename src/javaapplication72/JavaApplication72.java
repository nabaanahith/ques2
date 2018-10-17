/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication72;

import java.util.Scanner;

/**
 *
 * @author nabaa96
 */
public class JavaApplication72 {

     public String []  pw2(int n[]){
             String [] s=new String [n.length];
        
              JavaApplication72 a = new JavaApplication72();
              for(int i=0; i<n.length; i++){
                       String t=" ";
              
                 
        t+=a.pw((n[i]/1000000000)," billion");
       t+=a.pw((n[i]/1000000)%100," million");
         t+=a.pw((n[i]/100000000)%10,"  hundred million");
     t+=a.pw((n[i]/100000)%10,"  hundred thousand");
       t+=a.pw(((n[i]/1000)%100)," thousand");
       t+=a.pw(((n[i]/100)%10)," hundred");
      t+=a.pw((n[i]%100)," ");
        s[i]=t;
        //  System.out.print(s);
     }
             
            return s;         
     }
     
     public String pw(int n,String ch)
  {
      String f,m;
      m=" ";
  
    String  one[]={" "," one"," two"," three"," four"," five"," six"," seven"," eight"," Nine"," ten"," eleven"," twelve"," thirteen"," fourteen","fifteen"," sixteen"," seventeen"," eighteen"," nineteen"};
 
    String ten[]={" "," "," twenty"," thirty"," forty"," fifty"," sixty","seventy"," eighty"," ninety"};
 
    if(n > 19) 
    { f=(ten[n/10]+" "+one[n%10]);
    }
    
    else { f=(one[n]);
    }
    if(n > 0){
       m=(ch);
    }
    
  return (f+m);
  }

    

    /**
     * @param args the command line arguments
     */

   

  public static void main(String[] args)
  {
      int leng;
          System.out.println("Enter length of your list : ");
      Scanner input = new Scanner(System.in);
      leng=input.nextInt();
      String [] ss=new String [leng];
    
         int [] n=new int [leng];
    
    System.out.println("Enter an "+String.valueOf(leng)+" integer number that greater than zero please : ");
    for(int i=0; i<n.length; i++){
    n[i] = input.nextInt();}
    input.close();
   
 
        JavaApplication72 a = new JavaApplication72();
        
   ss=a.pw2(n);
   
         System.out.print("[");
   for(int i=0; i<ss.length; i++){
     
       System.out.print(ss[i]+",");
       
       
   }
     System.out.print("]");
  
  }
}
    

