package Methodes_String;

import java.util.Scanner;
public class Test_Contains {

public static void main(String[] args) 
{   
String str= "AEC internet des objets";
Scanner sc=new Scanner(System.in);

System.out.println("Taper une chaines de caractères : ");
String str_rech=sc.nextLine();


if(str.toLowerCase().contains(str_rech.toLowerCase()))
            System.out.println(str_rech+" existe dans "+str);
        else
           System.out.println(str_rech+" n'existe pas dans "+str);

}}
