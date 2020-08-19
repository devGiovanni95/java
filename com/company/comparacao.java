package com.company;

import java.util.Scanner;

public class comparacao {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        float a1 = (4/2)+(2/4);
        float a2 = 4/2+2/4;

        float b1 = 4/(2+2)/4;
        float b2 = 4/2+2/4;

        float c1 = (4+2)*2-4;
        float c2 = 4+2*2-4;

        boolean a = (a1==a2);
        boolean b = (b1==b2);
        boolean c = (c1==c2);

        System.out.println("Os resultado das conta são: ");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println("Os dois resultados são iguais ?");
        System.out.println(a);

        System.out.println("Os resultado das conta são: ");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println("Os dois resultados são iguais ?");
        System.out.println(b);

        System.out.println("Os resultado das conta são: ");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("Os dois resultados são iguais ?");
        System.out.println(c);
    }
}
