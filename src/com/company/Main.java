package com.company;


import java.net.Socket;
import java.util.Random; // подключение генератора рандомных чисел
import java.util.Scanner; // подключение ввода
import java.util.Arrays; // работа с массивами

public class Main {
    /*
    горячие клавиши sout-для быстрого написания System.out.println
    ЛКМ+Alt+ мышь (вверх или вниз) для печати в нескольких строках сразу
    Ctrl+Alt+L- ФОРМАТИРОВАНИЕ КОДА
     Ctrl +D копирование и вставка строки
    Ctrl+Навести мышкой на меременную, увидим,  каком методе она создана, если это класс, увидим, что он принимает
    ключевое слов о this указывает на то, что переменная ЯВНО является полем обьекта.
    ключевое поле super используется для обращения к полям и меетодам класса родителя, и может использоваься только внутри класса наследника
    модификатор final делает переменную константой, а для класса  запрещает его следующее наследование. для метода запрещает переопредделение( перекрытие)
    если класс абстрактный, то нельзя создать его экземпляр. интерфейс "обязывает" классы выплолнять одни и те же методы, но по разному

*/
    // ДЗ с седьмой лекции
    public static void main(String[] args) {
        byte section = 0; //выбор действия.

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("==========Основы==========");
            System.out.println("1. Решение квадратного уравнения.");
            System.out.println("2.Вычисление периметра и площади треуголька по заданным сторонам.");
            System.out.println("3.Решение задачи при помощи теоремы Пифагора.");
            System.out.println("4. Количество книг в библиотеке.");
            System.out.println("5.Десятиборец.");
            System.out.println("6.Фигурист.");
            System.out.println("7.Массив вещественных чисел.");
            System.out.println("8.Массив. Простые числа.");
            System.out.println("9.Игра в крестики-нолики");
            System.out.println("10.Кредит в банке.");
            System.out.println("11. Конвертор валют.");
            System.out.println("12.Сортировка массива.");
            System.out.println("==========Классы и методы доступа==========");
            System.out.println("13.Адрес.");
            System.out.println("14.Книга.");
            System.out.println("==========Наследование==========");
            System.out.println("15.Ученики.");
            System.out.println("16.Средство передвижения.");
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
                    arrayDoudle();
                    break;

                } else if (section == 8) {
                    arrayPrimeNumber();
                    break;


                } else if (section == 9) {
                    TicTacToe();
                    break;
                } else if (section == 10) {
                    int payment;
                    System.out.println("Введите сумму платежа: ");
                    payment = scan.nextInt();
                    Credit(payment);
                    break;
                } else if (section == 11) {
                    CurrencyConverter();
                    break;
                } else if (section == 12) {
                    System.out.println("Введите размер массива: ");
                    int n = scan.nextInt();
                    int[] array = new int[n];
                    //int[] result=new int[n];
                    Random random = new Random();
                    for (int i = 0; i < array.length; ++i)
                        array[i] = random.nextInt(100);

                    PrintingArray(array);

                    array = bubbleSorting(array, n);
                    PrintingArray(array);

                    break;
                } else if (section == 13) {
                    addres();
                    break;
                } else if (section == 14) {
                    Book();
                    break;
                } else if (section == 15) {
                    // наследование в джава
                    /*
                    1)	Создать класс, представляющий учебный класс ClassRoom.
                    Создайте класс ученик Pupil. В теле класса создайте методы void Study(), void Read(), void Write(), void Relax().
                     Создайте 3 производных класса ExcelentPupil, GoodPupil, BadPupil от класса базового класса Pupil
                     и переопределите каждый из методов, в зависимости от
                    успеваемости ученика.
                    Конструктор класса ClassRoom принимает аргументы типа Pupil, класс должен состоять из 4 учеников.
                    Предусмотрите возможность того, что пользователь может передать 2 или 3 аргумента. Выведите информацию о том, как все ученики
                    экземпляра класса ClassRoom умеют учиться, читать, писать, отдыхать.

                     */
                    Nasledovanie();
                    break;
                } else if (section == 16) {
                    vehicle();
                    break;
                }
                System.out.println("Неверно указанное действие.");
            }
            while (true);


        }
    }

    public static void PrintingArray(int[] array) {
        int counter = 0;
        System.out.println('\t');
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
            counter++;
            if (i != 0 && (i + 1) % 5 == 0)
                System.out.println('\n');

        }
        System.out.println();
    }

    private static void vehicle() {
        /*
            Создать класс Vehicle. В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год выпуска).
            Создайте 3 производных класса Plane, Саг и Ship. Для класса Plane должна быть определена высота и количество пассажиров.
             Для класса Ship — количество пассажиров и порт приписки. Написать программу, которая выводит на экран информацию о каждом средстве
            передвижения.

         */
        System.out.println("Создать класс Vehicle. В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год выпуска).\n" +
                " Создайте 3 производных класса Plane, Саг и Ship. Для класса Plane должна быть определена высота и количество пассажиров.\n" +
                " Для класса Ship — количество пассажиров и порт приписки. Написать программу, которая выводит на экран информацию о каждом средстве\n" +
                " передвижения.");

        Plane plan1 = new Plane();
        Plane plan2 = new Plane();
        Ship ship1 = new Ship();
        /*
        тут могло біть заполнение полей, с помощью методов доступа,
        но человек-существо ленивое.
        */
        plan1.getInfoPlane(plan1);
        plan2.getInfoPlane(plan2);
        ship1.getInfoShip(ship1);


    }

    private static void Book() {

        System.out.println("Создать класс Book, содержащий поля tring title    String author    String content\n" +
                "для каждого поля создать метод , который выводит на экран значения поля.\n" + " Реализовать возможность добавления в книгу названия, имени автора и содержания.\n" +
                "выведите на экран названия, автора и сожержание.");
        Scanner scan = new Scanner(System.in);
        Book book1 = new Book();

        System.out.println("Введите название книги: ");
        String title = scan.next();
        book1.setTitle(title);


        System.out.println(book1.getTitle() + book1.getAuthor() + book1.getContent());

    }

    public static void addres() {
        Scanner scan = new Scanner(System.in);
        Address address1 = new Address();//создаем єкземпляр

        System.out.println("Введите индекс: ");
        int index = scan.nextInt();
        address1.setIndex(index);

        System.out.println("Введите страну: ");
        String countru = scan.next();
        address1.setCountry(countru);//записываем значение в поле( передаем значение в метод, изменяющий поле)
        System.out.println("Введите город:  ");
        String city = scan.next();
        address1.setCity(city);
        System.out.println("Введите улицу: ");
        String street = scan.next();
        address1.setStreet(street);
        System.out.println("Введите номер дома");
        String apartament = scan.next();
        address1.setApartament(apartament);
        // и так далее


        System.out.println("Адрес: " + address1.getIndex() + ',' + address1.getCountry() + ',' + address1.getCity() + ',' + address1.getStreet() + ',' + address1.getApartament());
        //вывод на экран
    }

    public static int[] bubbleSorting(int[] array, int n) {
        //сортировка пузырьком
        int temp;
        Scanner scan = new Scanner(System.in);
        int arc = 0;//действие
        System.out.println("Выполнить сортировку: ");
        System.out.println("1.По возростанию");
        System.out.println("2.По убыванию");
        while (true) {
            arc = scan.nextByte();
            if (arc > 0 && arc < 3)
                break;
            System.out.println("Неверный выбор. Выберете действие");
        }
        if (arc == 1)
            for (int i = array.length - 1; i >= 0; i--)
                for (int j = 0; j < i; j++) {
                    if (array[j] > array[j + 1]) {
                        temp = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = temp;
                    }
                }
        else
            for (int i = 0; i < array.length - 1; i++)
                for (int j = 0; j < i; j++) {
                    if (array[j] < array[j + 1]) {
                        temp = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = temp;
                    }
                }

         /*   for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
            */
        //PrintingArray(array);
        System.out.println("__________________________");
        return array;
    }

    private static void Nasledovanie() {
        System.out.println("1)\tСоздать класс, представляющий учебный класс ClassRoom. Создайте класс ученик Pupil.\n В теле класса создайте методы void Study(), void Read(), void Write(), void Relax().\n Создайте 3 производных класса ExcelentPupil, GoodPupil, BadPupil от класса базового класса Pupil и переопределите каждый из методов, в зависимости от\n" +
                "успеваемости ученика. Конструктор класса ClassRoom принимает аргументы типа Pupil, класс должен состоять из 4 учеников.\n" +
                "Предусмотрите возможность того, что пользователь может передать 2 или 3 аргумента. Выведите информацию о том, как все ученики\n" +
                "экземпляра класса ClassRoom умеют учиться, читать, писать, отдыхать.\n");
        BadPupil badPupil = new BadPupil();
        GoodPupil goodPupil = new GoodPupil();
        GoodPupil goodPupil12 = new GoodPupil();

        ClassRoom classRoom =
                new ClassRoom(badPupil, goodPupil, goodPupil12);
        classRoom.showPupilsInfo();

        System.out.println();
        //////


    }

    public static void Credit(int payment) {
        /*
        Представьте, что вы реализуете программу для банка, которая помогает определить, поaсил ли клиент кредит или нет: Допустим, ежемесячная сумма платежа должна составлять 100 грн.
         Клиент должен выполни 7 платежей, но может платить реже большими суммами. Т.е. может двумя платежами по 300 и 400 грн.
         Закрыть весь долг. Создайте метод, который будет в качестве аргумента сумму платежа, введенную экономистом банка.
          Метод при выводит на экран информацию о состояни кредита (сумма задожешости, сумма переплаты, сообщение об отсутствии долга)
         */
        System.out.println("Представьте, что вы реализуете программу для банка, которая помогает определить, поaсил ли клиент кредит или нет: Допустим, ежемесячная сумма платежа должна составлять 100 грн." + '\n' +
                "Клиент должен выполнить 7 платежей, но может платить реже большими суммами. Т.е. может двумя платежами по 300 и 400 грн." + '\n' +
                "Закрыть весь долг. Создайте метод, который будет в качестве аргумента сумму платежа, введенную экономистом банка." + '\n' +
                "Метод  выводит на экран информацию о состояни кредита (сумма задоженности, сумма переплаты, сообщение об отсутствии долга ");

        int debt = 700;
        byte countOfPayment = 0;
        debt = debt - payment;
        countOfPayment++;
        if (debt <= 0)
            System.out.println(" Долг погашен.");
        else
            System.out.println("Сумма долга составляет:" + debt + " для погашения задолженности осталось" + (7 - countOfPayment) + " платежей.");


    }

    public static void TicTacToe() {
        //крестики нолики
        System.out.println("Крестики-нолики");
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        char[][] arrey = new char[3][3];// массив, служащий нам игровым полем
        byte counter = 1;
        int i, j;
        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++) {
                arrey[i][j] = '-';
                System.out.print(arrey[i][j] + " "); // заполняем поле прочерками
                if (counter % 3 == 0 && counter != 0)
                    System.out.println();

                counter++;
            }
        counter = 1;
        byte NumberOfPlayer = 1; // номер игрока
        char sumol = 'X';       // символ игрока (для 1 - х, для второго игрока -0)
        byte x = 0;
        byte y = 0;             //оси Оху
        boolean win = false;
        byte travelCounter = 0;// счётчик ходов
        while (win == false) {


            l1:
            while (win == false) {


                while (true) {
                    System.out.println("Ход игрока " + NumberOfPlayer + ". Введите координаты элемента, который хотите ввести.");
                    System.out.print("x: ");
                    x = scan.nextByte();//читаем координату по оси х
                    x -= 1;                // уменьшаем на 1, т к в программировании счет с 0
                    System.out.print("y: ");
                    y = scan.nextByte();    //по аналогии с х
                    y -= 1;
                    System.out.println();
                    if ((x < 3) && (x >= 0) && (y < 3) && (y >= 0)) {//проверка на правильность ввода, чтобы не выйти за массив
                        if (arrey[x][y] == '-') {//проверка, что место , на которое указал игрок-пустое
                            arrey[x][y] = sumol;
                            travelCounter++;
                            break;
                        } else if (arrey[x][y] != '-') {
                            System.out.println("Это место уже занято.");
                            //break l3;// иначе перейти по л1(закончить внешний цикл из внутреннего)

                        }
                    } else {
                        System.out.println("Некоректный ввод.");
                        // break ;// иначе перейти по л1(закончить внешний цикл из внутреннего)
                    }

                }
                counter = 1;
                for (i = 0; i < 3; i++)//печать массива
                    for (j = 0; j < 3; j++) {

                        System.out.print(arrey[i][j] + " ");
                        if (counter % 3 == 0 && counter != 0)
                            System.out.println();

                        counter++;
                    }


                if (NumberOfPlayer == 1) {//передаем ход другому игроку. соответственно меняем его символ (крестик на нолик и наоборот)
                    NumberOfPlayer = 2;
                    sumol = '0';
                } else {
                    NumberOfPlayer = 1;
                    sumol = 'X';
                }
                //проверка на победу.


                if (travelCounter >= 5) {
                    if (win == false) {
                        for (i = 0; i < 3; i++) {
                            //проверка победы по строкам.
                            if (win == true)
                                break;
                            for (j = 0; j < 2; j++) {
                                if (arrey[i][j] == arrey[i][j + 1] && arrey[i][j] == arrey[i][j + 2]) {

                                    if (arrey[i][j] == 'X') {
                                        System.out.println("Победил крестик! (игрок №1)");
                                        win = true;
                                        break;
                                    } else if (arrey[i][j] == '0') {
                                        System.out.println("Победил нолик! (игрок №2)");
                                        win = true;
                                        break;
                                    }
                                } else
                                    break;


                            }
                        }

                        for (j = 0; j < 3; j++) {
                            if (win == true)
                                break;//проверка победы по столбцам.
                            for (i = 0; i < 1; i++) {
                                if (arrey[i][j] == arrey[i + 1][j] && arrey[i][j] == arrey[i + 2][j]) {

                                    if (arrey[i][j] == 'X') {
                                        System.out.println("Победил крестик! (игрок №1)");
                                        win = true;
                                        break;
                                    } else if (arrey[i][j] == '0') {
                                        System.out.println("Победил нолик! (игрок №2)");
                                        win = true;
                                        break;
                                    }
                                } else
                                    break;

                            }
                        }

                        if (win == false) {
                            i = 0;//проверка по главной диагонали
                            if (arrey[i][i] == arrey[i + 1][i + 1] && arrey[i][i] == arrey[i + 2][i + 2]) {
                                if (arrey[i][i] == 'X') {
                                    System.out.println("Победил крестик! (игрок №1)");
                                    win = true;
                                    break;
                                } else if (arrey[i][i] == '0') {
                                    System.out.println("Победил нолик! (игрок №2)");
                                    win = true;
                                    break;
                                }
                            }
                        }

                        if (win == false) {
                            //проверка по дополнительной диагонали
                            if (arrey[0][2] == arrey[1][1] && arrey[0][2] == arrey[2][0]) {
                                if (arrey[1][1] == 'X') {
                                    System.out.println("Победил крестик! (игрок №1)");
                                    win = true;
                                    break;
                                } else if (arrey[1][1] == '0') {
                                    System.out.println("Победил нолик! (игрок №2)");
                                    win = true;
                                    break;
                                }
                            }
                        }


                    }


                }
                if (win == true)
                    break;
                if (travelCounter > 9) {//если счетчик ходов 9(все клетки заполнены, но победа не одержана, то ничья
                    win = true;
                    System.out.println("Победила дружба!");
                }

            }
            System.out.println("Игра окончена. ");
            break;
            // System.out.println();
        }
    }

    public static void CurrencyConverter() {
        //конвертор из одной валюты в другую.
        System.out.println("Конвертор валют");
        Scanner scan = new Scanner(System.in);
        String currency1;
        String currency2;//названия валют
        double valueOfCurrency;


        String repeat;
        double sum = 0;
        double sum1;

        do {
            System.out.println("Введите название первой валюты: ");
            currency1 = scan.next();

            System.out.println("Введите название второй валюты: ");
            currency2 = scan.next();
            System.out.println("Введите текущий курс между валютами: ");
            valueOfCurrency = scan.nextDouble();

            System.out.println("Введите количество денежных едениц: ");
            sum1 = scan.nextDouble();

            sum = sum1 * valueOfCurrency;
            System.out.println(sum1 + " " + currency1 + " = " + sum + " " + currency2);


            System.out.println("Совершить еще одну конвертацию? yes | no");
            repeat = scan.next();

        } while (repeat.equals("yes"));


    }

    public static void arrayPrimeNumber() {
        /*
         Задан целочисленный массив размерности n/
          Есть ли среди элементов массива простые числа? Если да, то вывести номера этих элементов.
         */
        //простіе числа - те, которые делятся нацело только на 1 и на себя самих
        System.out.println("Массив. Простые числа.");
        System.out.println("Описание задачи: " + '\n' +
                "Задан целочисленный массив размерности n" + '\n' +
                "          Есть ли среди элементов массива простые числа? Если да, то вывести номера этих элементов.");
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int n = 20;
        int[] arreyNumber = new int[n];
        int[] arreyPrimeNumberIndex = new int[n];
        int[] arreyDenominator = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Исходный массив: ");
        for (int i = 0; i < n; i++) {
            arreyNumber[i] = random.nextInt(100);
            System.out.print(arreyNumber[i] + "  " + '\t');
        }
        System.out.println();
        for (int i = 0; i < n; i++)//если число не делится нацело ни на один элемент массива делитетей, оно простое
        {
            for (int j = 0; j < n; j++) {
                if (arreyNumber[i] % arreyDenominator[j] == 0)
                    continue;
                else
                    arreyPrimeNumberIndex[i] = i;
            }


        }


    }

    public static void arrayDoudle() {

        /*
        Написать программу определения в одномерном массиве вещественных чисел наибольшего количества последовательно расположенных положительых чисел
         */
        System.out.println("Массив вещественных чисел.");
        System.out.println("Описание задачи: " + '\n' +
                "Написать программу определения в одномерном массиве вещественных чисел наибольшего количества последовательно расположенных положительых чисел");
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int n = 30;
        double[] array = new double[n];
        System.out.println("Исходный массив: ");
        for (int i = 0; i < n; i++) {
            array[i] = 50 - random.nextInt(100);
            System.out.print(array[i] + "  " + '\t');
            if (((i + 1) % 10 == 0)
                    && (i != 0))
                System.out.println();
        }
        System.out.println();





        int counter = 0;
        int maxSequence = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] >= 0)
                counter++;
            else {
                if (maxSequence < counter)
                    maxSequence = counter;

                counter = 0;

            }
        }
        System.out.println("Самая длинная последовательность положительных чисел в массиве равна" + maxSequence);

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




