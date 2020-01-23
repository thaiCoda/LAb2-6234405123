package com.company;

import java.util.Random;
import java.awt.Rectangle;

public class IntersectionPrinter {


    public static void main(String[] args) {

        //สุ่มตัวเลข
        Random rd = new Random();
        // ของ R1
        int x1 = rd.nextInt(50);
        int x11 = x1+1;

        int y1 = rd.nextInt(50);
        int y11 = y1+1;

        int w1 = rd.nextInt(50);
        int w11 = y1+1;

        int h1 = rd.nextInt(50);
        int h11 = y1+1;

        //ของ R2
        int x2 = rd.nextInt(50);
        int x22 = x2+1;

        int y2 = rd.nextInt(50);
        int y22 = y2+1;

        int w2 = rd.nextInt(50);
        int w22 = w2+1;

        int h2 = rd.nextInt(50);
        int h22 = h2+1;

        //สร้าง Rectangle

        Rectangle r1 = new Rectangle(x11,y11,w11,h11);
        Rectangle r2 = new Rectangle(x22,y22,w22,h22);
        Rectangle r3 = r1.intersection(r2);

        //แสดงผล
        System.out.println(r1);
        System.out.println(r2);
        System.out.println("Is the intersected rectangle empty?:"+r3.isEmpty());




    }

}
