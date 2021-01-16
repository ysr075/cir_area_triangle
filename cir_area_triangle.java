package com.company;

import java.util.Scanner;

class circumference_tri {
    public static void StaticMethod() {
        Scanner input = new Scanner(System.in);
        int line1;
        System.out.print("\nline1: ");
        line1 = input.nextInt();
        int line2;
        System.out.print("line2: ");
        line2 = input.nextInt();
        int line3;
        System.out.print("line3: ");
        line3 = input.nextInt();
        int total_cir = line1 + line2 + line3;
        System.out.print("\ntotal circumference is " + total_cir + "\n");
    }
}

class area_tri {
    public static void StaticMethod() {
        Scanner input = new Scanner(System.in);
        int base;
        System.out.print("\nbase: ");
        base = input.nextInt();
        int height;
        System.out.print("height: ");
        height = input.nextInt();
        int total_area = ((base * height) / 2);
        System.out.print("\ntotal area is " + total_area + "\n");
    }
}

public class triangle {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        do {
            Integer choose;
            System.out.print("\n1.circumference or 2.area: ");
            choose = input.nextInt();
            if (choose.equals(1)) {
                circumference_tri.StaticMethod();
            } else if (choose.equals(2)) {
                area_tri.StaticMethod();
            } else {
                System.exit(1);
            }
        } while(true);
    }
}
