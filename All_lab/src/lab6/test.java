package lab6;

import java.util.Scanner;

public class test {
//	 points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
//        String s1 = s.replaceAll("[!,?._'@]", " ");
        String []arr = s.split("[!,?._'@ ]");
        int count = 0;
        for(String i: arr)
        {if(i != "") {count ++;}}
        System.out.println(count);
        for(String i: arr)
        {if(i != "") {System.out.println(i);}}
}}
//