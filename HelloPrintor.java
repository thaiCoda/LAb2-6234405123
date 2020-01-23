package com.company;

public class HelloPrintor {

    public static void main(String[] args) {

        //กำหนดค่าตัวแปร
        String init = "Hello,World";

        String changed1 = init.replace('e','A');
        String changed2 = changed1.replace('o','e');
        String changed3 = changed2.replace('A','o');


        String fin = changed3;
        System.out.println(fin);

    }
}
