package Methodes_String;

import java.util.Scanner;
public class Test_equals
{ 
public static void main ( String [ ] args ) 
{ 
Scanner sc=new Scanner (System.in);
String ch1, ch2; 

System.out.println("Taper ch1 : ");
ch1=sc.next();
System.out.println("Taper ch2 : ");
ch2=sc.next();
if(ch1.toLowerCase().equals(ch2.toLowerCase()))
System . out . println ("Les 2 chaines sont égaux");  

else
System . out . println ("Les 2 chaines différentes");
}}
