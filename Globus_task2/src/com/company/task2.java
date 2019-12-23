package com.company;

import java.io.*;
import java.util.Scanner;

public class task2 {

    public static int inputInt(){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }
    public static double inputdouble(){
        Scanner in = new Scanner(System.in);
        double num = in.nextDouble();
        return num;
    }

    public static class Triangle {
        private double a;
        private double h;
        public double c;
        private double r;

        Triangle(double a, double h)
        {
            this.a = a;
            this.h = h;
            this.c = 1;
        }
        Triangle(double a, double h, double c)
        {
            this.a = a;
            this.h = h;

        }
        Triangle(double a, double h, double c, double r)
        {
            this.a = a;
            this.h = h;
            this.c = c;
            this.r = r;
        }

        public Triangle() {
        }


        double square(){
            return a*h/2*c;
        }
        double square_r(){
            return (a+h+c)/2 *r;
        }
        double square_R(){
            return (a*h*c)/(4*r);
        }

    }
    static class Circle extends Triangle{
        private double r;
        private double pi;
        private double a;
        private double h;
        {
            pi = 3.14;
        }
        Circle(double r)
        {
            this.r = r;
        }
        Circle(double a, double h){
            this.a=a;
            this.h=h;
        }

        double square(){
            return pi * r * r ;
        }
        double square_r(){
            return a * h /4;
        }

    }
    public static class Rectangle {
        private double a;
        private double b;

        Rectangle(double a)
        {
            this.a = a;
        }
        Rectangle(double a,double b)
        {
            this.a = a;
            this.b =b;
        }
        double square(){
            return a*a;
        }
        double squareRec(){
            return a*b;
        }
        double squareDia(){
            return a*a /2 * b;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        MyInterface info = new MyInterface();
        double a;
        double h;
        double c;
        double r;
        boolean flag_q;
        info.instrakshen();
        info.input();
        switch (inputInt()){
            case 1:
                System.out.println("введи сторону квадрата");
                a = inputdouble();
                Rectangle square = new Rectangle(a);
                System.out.println("S = "+square.square());
                break;
            case 2:
                info.triangle();
                do {
                    flag_q=true;
                    switch (inputInt()) {
                        case 1:
                            info.inputZnach("ac");
                            a = inputdouble();
                            info.inputZnach("h");
                            h = inputdouble();
                            Triangle triangleS0 = new Triangle(a, h);
                            System.out.println("S = " + triangleS0.square());
                            break;
                        case 2:
                            info.inputZnach("a");
                            a = inputdouble();
                            info.inputZnach("b");
                            h = inputdouble();
                            info.inputZnach("sin C");
                            c = inputdouble();
                            Triangle triangleS1 = new Triangle(a, h, c);
                            System.out.println("S = " + triangleS1.square());
                            break;
                        case 3:
                            info.inputZnach("a");
                            a = inputdouble();
                            info.inputZnach("b");
                            h = inputdouble();
                            info.inputZnach("c");
                            c = inputdouble();
                            info.inputZnach("r");
                            r = inputdouble();
                            Triangle triangleS2 = new Triangle(a, h, c, r);
                            System.out.println("S = " + triangleS2.square_r());
                            break;
                        case 4:
                            info.inputZnach("a");
                            a = inputdouble();
                            info.inputZnach("b");
                            h = inputdouble();
                            info.inputZnach("c");
                            c = inputdouble();
                            info.inputZnach("R");
                            r = inputdouble();
                            Triangle triangleS3 = new Triangle(a, h, c, r);
                            System.out.println("S = " + triangleS3.square_R());
                            break;
                        case 5:
                            info.designationTria();
                            System.out.println();
                            info.triangle();
                            flag_q=false;
                            break;
                    }
                }while (flag_q !=true);
                break;
            case 3:
                info.circle();
                do {
                    flag_q=true;
                    switch (inputInt()) {
                        case 1:
                            info.inputZnach("R");
                            a = inputdouble();
                            Circle circleS0 = new Circle(a);
                            System.out.println("S = " + circleS0.square());
                            break;
                        case 2:
                            info.inputZnach("C");
                            a = inputdouble();
                            info.inputZnach("d");
                            h = inputdouble();
                            Circle circleS1 = new Circle(a,h);
                            System.out.println("S = "+ circleS1.square_r());
                            break;
                        case 3:
                            info.inputZnach("d");
                            a = inputdouble()/2;
                            Circle circleS2 = new Circle(a);
                            System.out.println("S = "+ circleS2.square());
                            break;
                        case 4:
                            info.designationCirc();
                            System.out.println();
                            info.circle();
                            flag_q=false;
                            break;
                    }
                }while (flag_q !=true);
                break;
            case 4:
                info.rectangle();
                do {
                    flag_q=true;
                    switch (inputInt()) {
                        case 1:
                            info.inputZnach("a");
                            a = inputdouble();
                            info.inputZnach("b");
                            h = inputdouble();
                            Rectangle rectangleS0 = new Rectangle(a,h);
                            System.out.println("S = "+ rectangleS0.squareRec());
                            break;
                        case 2:
                            info.inputZnach("d");
                            a = inputdouble();
                            info.inputZnach("sin C");
                            c = inputdouble();
                            Rectangle rectangleS1 = new Rectangle(a,c);
                            System.out.println("S = "+ rectangleS1.squareDia());
                            break;
                        case 3:
                            info.designationRect();
                            System.out.println();
                            info.rectangle();
                            flag_q=false;
                            break;
                    }
                }while (flag_q !=true);
                break;
        //    case 5:
        //        WordSearch search = new WordSearch();
       //         search.qwe();

        }
    }
}
