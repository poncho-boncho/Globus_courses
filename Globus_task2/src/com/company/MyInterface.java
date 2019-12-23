package com.company;

public  class MyInterface{
    void instrakshen(){

        System.out.println("Выбери Площадь чего ты хочешь расчитать:\n" +
                "1 - Площадь квадрата\n" +
                "2 - Площадь треугольника\n" +
                "3 - Площадь окружности\n" +
                "4 - Площадь прямоугольника \n" +
                "------------------------------ \n" +
                "5 - Подсчет частоты встречаемости слов из файла\n" );
    }
    void triangle(){
        System.out.println("Выберите формулу которую будите использовать \n" +
                "1) S = (ac * h) / 2       \n" +
                "2) S = (a * b) /2 * sin C \n" +
                "3) S = (a+b+c) /2 * r     \n" +
                "4) S = (a*b*c) /(4*R)     \n" +
                "5) информация по обозначению!");
    }
    void circle(){
        System.out.println("Выберите формулу которую будите использовать \n" +
                "1) S = pi * R*R          \n" +
                "2) S = (C * d) / 4       \n" +
                "3) S = (pi * d*d) /4     \n" +
                "4) информация по обозначению!");
    }
    void rectangle(){
        System.out.print("Выберите формулу которую будите использовать \n" +
                        "1) S = a * b \n" +
                        "2) S = d*d /2 *sin C \n" +
                        "3) информация по обозначению!\n");
    }
    void designationTria(){
        System.out.println("ГДЕ: \n ac = основание треугольника \n" +
                "a b c = стороны треугольника       \n" +
                "sic C = Угол между двух сторон   \n" +
                "r = радиус вписаной окружности \n" +
                "R = радиус описаной окружности \n" +
                "Для ввода sin C используйте значение \n" +
                "Пример ввода с sin C = 0,707");
    }
    void designationCirc(){
        System.out.println("ГДЕ: \n R = радиус укружности \n" +
                             "С = длина окружности       \n" +
                               "d = диаметр окружности   \n");
    }
    void designationRect(){
        System.out.println("ГДЕ: \n R = радиус укружности \n" +
                           "a = длина \n" +
                           "b = ширина \n" +
                           "d = диагональ \n" +
                           "sic C = Угол между двух сторон \n" +
                           "Для ввода sin C используйте значение \n" +
                           "Пример ввода с sin C = 0,707");
    }
    void input(){
        System.out.print("Ввод: ");
    }
    void inputZnach(String znach){
        System.out.print(znach+" = ");
    }
}
