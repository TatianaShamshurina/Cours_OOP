package Methodes_String;

public class Test_indexOf 
{ 
public static void main ( String [ ] args ) 
{ 
String s ="abcdefghijklmnopqrstuvwxyz";  


System.out.println(s . indexOf ('c'));       //-> 2

int j = s . indexOf ("def");
System.out.println(j);      //-> 3

int k = s . indexOf ("abc");
System.out.println(k);   //-> 0

int m  =  s . indexOf ("smi") ;
System.out.println(m);  //-> -1 
}}
