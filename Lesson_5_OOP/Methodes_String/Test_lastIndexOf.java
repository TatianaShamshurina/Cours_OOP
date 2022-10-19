package Methodes_String;

public class Test_lastIndexOf 
{ public static void main ( String [ ] args ) 
{ 
String s ="AEC internet des objets";  

int i = s . lastIndexOf ('t');
System.out.println(i);       //-> 21

int j = s . lastIndexOf ("de");
System.out.println(j);      //-> 13

int m  =  s . lastIndexOf ("abc") ;
System.out.println(m);  //-> -1 
}}
