package com.company;

import java.util.Random;//подключение генератора рандомных чисел
import java.util.Scanner;//подключение ввода
import java.util.Arrays;//работа с массивами

public class Main {
    //горячие клавиши sout-для быстрого написания System.out.println
    //ЛКМ+Alt+ мышь (вверх или вниз) для печати в нескольких строках сразу
    //Ctrl+Alt+L- ФОРМАТИРОВАНИЕ КОДА
    // Ctrl +D копирование и вставка строки


    public static void main(String[] args) {
        byte section = 0; //выбор действия.
        short numberOfPossibleActions = 7;//количество возможных действий
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("1. Решение квадратного уравнения.");
            System.out.println("2.Вычисление периметра и площади треуголька по заданным сторонам.");
            System.out.println("3.Решение задачи при помощи теоремы Пифагора.");
            System.out.println("4. Количество книг в библиотеке.");
            System.out.println("5.Десятиборец.");
            System.out.println("6.Фигурист.");
            System.out.println("7.Массив вещественных чисел.");
            System.out.println("Массив. Простые числа.");
            System.out.println("---------------------------------------------------------------------------------------");

            do {
                System.out.println("Выберите задачу: ");
                section = scan.nextByte();

                if (section == 1) {
                    quadraticEquation();
                    break;
                } else if (section == 2) {
                    triangle();
                    break;
                } else if (section == 3) {
                    PethagoreanTheorem();
                    break;
                } else if (section == 4) {
                    quantityBook();
                    break;
                } else if (section == 5) {
                    decathlete();
                    break;
                } else if (section == 6) {
                    figureSkater();
                    break;
                } else if (section == 7) {
                    arreyDoudle();
                    break;

                }else if (section == 8) {
                    arreyPrimeNumber();
                    break;

                }
                System.out.println("Неверно указанное действие.");
            }
            while (true);


        }
    }




    public static void arreyPrimeNumber(){
        /*
         Задан целочисленный массив размерности n/
          Есть ли среди элементов массива простые числа? Если да, то вывести номера этих элементов.
         */
        //простіе числа - те, которые делятся нацело только на 1 и на себя самих
        System.out.println("Массив. Простые числа.");
        System.out.println("Описание задачи: " + '\n' +
                "Задан целочисленный массив размерности n" +'\n' +
                "          Есть ли среди элементов массива простые числа? Если да, то вывести номера этих элементов.");
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int n=20;
        int[] arreyNumber=new int[n];
        int[] arreyPrimeNumberIndex=new int[n];
        int[] arreyDenominator={2,3,4,5,6,7,8,9,10};
        System.out.println("Исходный массив: ");
        for(int i=0;i<n;i++)
        {
            arreyNumber[i]=random.nextInt(100);
            System.out.print(arreyNumber[i] + "  " + '\t');
        }
        System.out.println();
        for(int i=0;i<n;i++)//если число не делится нацело ни на один элемент массива делитетей, оно простое
        {
            for(int j=0;j<n;j++)
            {
                if(arreyNumber[i]%arreyDenominator[j]==0)
                    continue;
                else
                    arreyPrimeNumberIndex[i]=i;
            }


        }



    }

    public static void arreyDoudle() {

        /*
        Написать программу определения в одномерном массиве вещественных чисел наибольшего количества последовательно расположенных положительых чисел
         */
        System.out.println("Массив вещественных чисел.");
        System.out.println("Описание задачи: " + '\n' +
                "Написать программу определения в одномерном массиве вещественных чисел наибольшего количества последовательно расположенных положительых чисел");
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int n = 30;
        double[] arrey = new double[n];
        System.out.println("Исходный массив: ");
        for (int i = 0; i < n; i++) {
            arrey[i] = 50 - random.nextInt(100);
            System.out.print(arrey[i] + "  " + '\t');
            if (((i + 1) % 10 == 0)
                    && (i != 0))
                System.out.println();
        }
        System.out.println();

        int counter = 0;
        int maxSequence = 0;
        for (int i = 0; i < n; i++) {
            if (arrey[i] >= 0)
                counter++;
            else {
                if (maxSequence < counter)
                    maxSequence = counter;

                counter=0;

            }
        }
        System.out.println("Самая длинная последовательность положительных чисел в массиве равна"+maxSequence);

    }

    public static void decathlete() {
    /*
     В массиве хранится информация о баллах, полученных спортсменом- десятиборцем в каждом из десяти видов спорта.
      Для выхода в следующий этап соревнований общая сумма баллов должна превысить некоторое известное значение.
       Определить, вышел ли данный спортсмен в следующий этап соревновании
     */
        System.out.println("Десятиборец.");
        System.out.println("Описание задачи: " + '\n' +
                "В массиве хранится информация о баллах, полученных спортсменом- десятиборцем в каждом из десяти видов спорта." + '\n' +
                "Для выхода в следующий этап соревнований общая сумма баллов должна превысить некоторое известное значение." + '\n' +
                "Определить, вышел ли данный спортсмен в следующий этап соревновании");
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int[] points = new int[10];//массив с оценками
        int threshold = 0; // порог допуска до следуйщего этапа
        int sumOfPoints = 0;

        for (int i = 0; i < 10; i++) {
            points[i] = random.nextInt(10);
            System.out.println("По виду спорта №" + (i + 1) + " спортсмен получил " + points[i] + " баллов. ");
            sumOfPoints += points[i];
        }
        System.out.println(sumOfPoints);
        System.out.println("Введите количество баллов для перехода на следующий этап соревнований: ");
        threshold = scan.nextByte();
        if (sumOfPoints >= threshold)
            System.out.println("Спортсмен переходит на следующий этап соревнований.");
        else
            System.out.println("Спортсмен не переходит на следующий этап соревнований.");


    }

    public static void quadraticEquation() {
        //квадратное уравнение (решение): ax^2+bx+c=0; D=b^2+4+a+c; x1=(-b+sqrt(D))/2; x2=(-b-sqrt(D))/2 -мат. описание уравнения
        Scanner scan = new Scanner(System.in);

        double a1 = 0;
        double b1 = 0;
        double c1 = 0;
        double D = 0;
        double x1 = 0;
        double x2 = 0;
        System.out.println("Решение квадратного уравнения.");
        System.out.println("Введите коэфициенты a ,b,c");
        a1 = scan.nextDouble();
        b1 = scan.nextDouble();
        c1 = scan.nextDouble();


        D = (b1 * b1) - 4 * a1 * c1;
        System.out.println("D=" + D);
        D = Math.sqrt(D);

        if (D > 0) {
            x1 = (-b1 + D) / 2 * a1;
            x2 = (-b1 - D) / 2 * a1;
            System.out.println("x1=" + x1 + " " + "x2=" + x2);
        } else if (D == 0) {
            x1 = (-b1 + D) / 2 * a1;
            x2 = x1;
            System.out.println("x1=" + x1 + " " + "x2=" + x2);
        } else {
            System.out.println("В области вещественных чисел корней нет.");
        }
    }

    public static void triangle() {
        Scanner scan = new Scanner(System.in);
        double a1, a2, a3 = 0;
        System.out.println("Вычисление периметра и площади треуголька по заданным сторонам.");
        System.out.println("Задайте стороны треугольника:");
        a1 = scan.nextDouble();
        a2 = scan.nextDouble();
        a3 = scan.nextDouble();
        double P, p, S = 0;
        P = a1 + a2 + a3;
        p = P / 2;
        S = Math.sqrt(p * (p - a1) * (p - a2) * (p - a3));

        System.out.println("Периметр треугольника =" + P + "Площадь треугольника = " + S + "кв.ед.");

    }

    public static void PethagoreanTheorem() {
        Scanner scan = new Scanner(System.in);
        byte MethodOfSolution = 0;
        System.out.println("Решение задачи при помощи теоремы Пифагора.");

        System.out.println("1-Вычисление длины  гипотенузы треуголька по заданным катетам.");
        System.out.println("2-Вычисление длины  одного из катетов по гипотенузе и известному катету.");
        do {
            System.out.println("Выберите метод решения:");
            MethodOfSolution = scan.nextByte();
            if (MethodOfSolution == 1
                    || MethodOfSolution == 2)
                break;

            System.out.println("Неверно указанный метод решения.");
        } while (true);
        double a = 0;
        double b = 0;
        double c = 0;

        if (MethodOfSolution == 1) {
            System.out.println("Вычисление длины  гипотенузы треуголька по заданным катетам.");
            System.out.println("Задайте катеты треугольника:");
            a = scan.nextDouble();
            b = scan.nextDouble();
            c = Math.sqrt(a * a + b * b);
            System.out.println("Гипотенуза равна " + c + " .");

        } else if (MethodOfSolution == 2) {
            System.out.println("Вычисление длины  одного из катетов по гипотенузе и известному катету.");
            do {
                System.out.println("Задайте гипотенузу  треугольника:");
                c = scan.nextDouble();
                System.out.println("Задайте известный катет   треугольника:");
                a = scan.nextDouble();
                if (c > a)
                    break;
                System.out.println("Некоректный ввод. Катет не может быть равен или длиннее  гипотенузы!");
            } while (true);

            b = Math.sqrt(c * c - a * a);
            System.out.println("Искомый катет равен " + b + " .");
        }


    }

    public static void figureSkater() {
        /*
        Оценки, полученные спортсменом в соревнованиях по фигурному катанию (в баллах), хранятся в массиве из 18 элементов.
         В первых шести элементах записаны оценки По обязательной программе, с седьмого по двенадцатый по короткой программе, в остальных -по произвольной программе.
        Выяснить, по какому виду программы спортсмен показал Лучший результат
         */

        System.out.println("Фигурист.");
        System.out.println("Описание задачи: " + '\n' +
                "Оценки, полученные спортсменом в соревнованиях по фигурному катанию (в баллах), хранятся в массиве из 18 элементов." + '\n' +
                "В первых шести элементах записаны оценки По обязательной программе, с седьмого по двенадцатый по короткой программе, в остальных -по произвольной программе." + '\n' +
                "Выяснить, по какому виду программы спортсмен показал Лучший результат");
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int[] points = new int[18];//массив с оценками
        int sumOfMandatoryProgram = 0;
        int sumOfShortProgram = 0;
        int sumOfFreeProgram = 0;
        int i;
        System.out.println("Полученные спортсменом оценки: ");
        for (i = 0; i < 18; i++) {
            points[i] = random.nextInt(10);
            System.out.print(points[i] + "  ");
        }
        System.out.println();
        for (i = 0; i < 6; i++)
            sumOfMandatoryProgram += points[i];
        for (i = 6; i < 12; i++)
            sumOfShortProgram += points[i];
        for (i = 12; i < 18; i++)
            sumOfFreeProgram += points[i];

        int[] sum = new int[3];
        sum[0] = sumOfMandatoryProgram;
        sum[1] = sumOfShortProgram;
        sum[2] = sumOfFreeProgram;
        int maxPointsIndex = 0;
        int maxPoints = sumOfFreeProgram;
        for (i = 0; i < 3; i++)
            if (maxPointsIndex < sum[i]) {
                maxPoints = sum[i];
                maxPointsIndex = i;
            }


        if (maxPointsIndex == 0)
            System.out.println("Cпортсмен набрал максимальную сумму баллов по обязательной  программе.");
        if (maxPointsIndex == 1)
            System.out.println("Cпортсмен набрал максимальную сумму баллов по короткой  программе.");
        if (maxPointsIndex == 2)
            System.out.println("Cпортсмен набрал максимальную сумму баллов по произвольной программе.");
    }

    public static void quantityBook() {
        /*
        Постановка задачи.
         В массиве хранится информация о численности книг в каждом из  разделов библиотеки.
         Выяснить, верно ли, что общее число книг в библиотеке есть шестизначное число.
         */
        System.out.println("Описание задачи: " + '\n' +
                "В массиве хранится информация о численности книг в каждом из  разделов библиотеки." + '\n' +
                "Выяснить, верно ли, что общее число книг в библиотеке есть шестизначное число.");
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int quantitySection = 2;
        System.out.println("Введите количество разделов в библиотеке: ");
        quantitySection = scan.nextInt();
        int[] quantityBook;
        quantityBook = new int[quantitySection];

        int summBook = 0;


        for (int i = 0; i < quantitySection; i++) {

            quantityBook[i] = random.nextInt(100);//рандое заполнение массива( количества книг в каждом разделе)
        }

        for (int i = 0; i < quantitySection; i++)
            System.out.println("В разделе №" + (i + 1) + "  " + quantityBook[i] + " книг ");

        for (int num : quantityBook)
            summBook += num;
/*
        for(int i=0;i<quantitySection;i++)
            summBook+=quantityBook[i];
*/
        System.out.println("Общее количество книг в библиотеке: " + summBook + '\n' + "Количество разделов : " + quantitySection);

        if (((summBook / 100000) > 0) && (summBook / 100000) < 10)
            System.out.println("Число книг-шестизначное.");
        else
            System.out.println("Число   книг-не шестизначное.");

    }
}




