import java.util.Scanner;

public class Menu {
    public static Scanner scanner = new Scanner(System.in);

    public static void calculateCircle() {   //פונקציה 1
        System.out.println("Please enter the radius of the circle: ");
        float radius = scanner.nextFloat();
        double scope = radius * 2 * 3.14;
        double area = radius * radius * 3.14;
        System.out.println("The scope of the circle is " + scope + ". And the area of the circle is " + area);
    }

    public static void degreesConvert() {   //פונקציה 2
        System.out.println("Please enter the degrees: ");
        float degrees = scanner.nextFloat();
        System.out.println("Enter C - for celsius, or F - for fahrenheit: ");
        char degreesType = scanner.next().charAt(0);
        if (degreesType == 'c') {
            double celsius = (degrees * 9 / 5) + 32;
            System.out.println("The degrees in fahrenheit are " + celsius);
        } else {
            double fahrenheit = (degrees - 32) * 5 / 9;
            System.out.println("The degrees in celsius are " + fahrenheit);
        }
    }

    public static void calculateFactorial() {    //פונקציה 3
        int num;
        do {
            System.out.println("Enter a positive neutral number: ");
            num = scanner.nextInt();
        } while (num < 0);
        int factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= num;
        }
        System.out.println("The factorial of the number is " + factorial);
    }

    public static void calculateSumOfNumbers() {    //פונקציה 4
        int start;
        int end;
        do {
            System.out.println("Enter the range of the two numbers. The numbers can't be the same.");
            start = scanner.nextInt();
            end = scanner.nextInt();
        } while (start == end);
        int sum = 0;
        if (start < end) {
            for (int i = start; i <= end; i++) {
                sum += i;
            }
        } else {
            for (int i = end; i <= start; i++) {
                sum += i;
            }
        }
        System.out.println("The sum of the numbers in the range you put is " + sum);
    }

    public static boolean checkingIfPrimeNumber(int number) {
        boolean isPrime = number != 1;
        int divisor = 2;
        while (divisor * divisor <= number) {
            if (number % divisor == 0) {
                isPrime = false;
                break;
            }
            divisor = divisor + 1;
        }
        return isPrime;
    }

    public static void isPrimeNumber() {  //פונקציה 5
        System.out.println("Enter a positive number: ");
        int number = scanner.nextInt();
        if (checkingIfPrimeNumber(number))
            System.out.println("It's a prime number!");
        else
            System.out.println("it's not a prime number.");
    }

    public static int howMAnyDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int getReverseNumber(int number) {
        int reversedNumber = number % 10;
        while (number > 10) {
            reversedNumber = reversedNumber * 10 + (number / 10) % 10;
            number /= 10;
        }
        return reversedNumber;
    }

    public static void isNumberPalindrome() { //פונקציה 6
        int number;
        do {
            System.out.println("Enter a positive five digit number: ");
            number = scanner.nextInt();
        } while (howMAnyDigits(number) != 5); //12321
        if (number == getReverseNumber(number)) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("It's not a palindrome.");
        }
    }

    public static void printPrimeNumbers() { //פונקציה 7
        System.out.println("enter the start and the end of the range: ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        for (int i = start; i <= end; i++) {
            if (checkingIfPrimeNumber(i))
                System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void findGCD() { //פונקציה 8
        System.out.println("Enter two numbers: ");
        int number = scanner.nextInt();
        int number2 = scanner.nextInt();
        int biggestDivide = 1;
        for (int i = 2; i <= number * number2; i++) {
            if (number % i == 0 && number2 % i == 0)
                biggestDivide = i;
        }
        System.out.println("The GCD is " + biggestDivide);
    }

    public static void calculateQuadraticEquation() { //פונקציה 9
        System.out.println("Enter the coefficient a: ");
        float a = scanner.nextInt();
        System.out.println("Enter the coefficient b: ");
        float b = scanner.nextInt();
        System.out.println("Enter the coefficient c: ");
        float c = scanner.nextInt();
        double inSqrt = (b * b - 4 * a * c);
        if (inSqrt < 0) {
            System.out.println("There are no real solutions.");
        } else {
            double firstSolution = (-b - Math.sqrt(inSqrt)) / (2 * a);
            double secondSolution = (-b + Math.sqrt(inSqrt)) / (2 * a);
            if (firstSolution == secondSolution) {
                System.out.println("There is only one solution: " + firstSolution);
            } else {
                System.out.println("There are two solutions: " + firstSolution + ", " + secondSolution);
            }
        }
    }

    public static void calculateCompoundInterest() { //פונקציה 10
        System.out.println("Enter the found: ");
        double found = scanner.nextFloat();
        double currentFound = found;
        System.out.println("Enter the intrest: ");
        double intrest = scanner.nextFloat();
        double profit;
        double withdrawMoney = 0;
        System.out.println("After how many months do you want to withdraw from the found?");
        int months = scanner.nextInt();
        for (int i = 3; i <= 36; i += 3) {
            currentFound += (currentFound * (intrest * 0.01));
            profit = currentFound - found;
            System.out.println("Your current found for " + i + " months is " + currentFound);
            if (months == i) {
                if (months % 12 == 0) {
                    withdrawMoney = currentFound;
                } else {
                    withdrawMoney = currentFound - (profit / 2);
                }
            }
        }
        System.out.println();
        System.out.println("The money you will withdraw is " + withdrawMoney);
    }

    public static void isNumberFromFibonacci() { //פונקציה 11
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        double fibonacciFormula1 = Math.sqrt(5 * number * number + 4);
        double fibonacciFormula2 = Math.sqrt(5 * number * number - 4);
        if (fibonacciFormula1 % 1 == 0 || fibonacciFormula2 % 1 == 0) {
            System.out.println("The number is from the Fibonacci sequence!");
        } else {
            System.out.println("The number is not from the Fibonacci sequence.");
        }
    }

    public static int calculatePower(int base, int power) {
        int result = base;
        for (int i = 1; i < power; i++) {
            result *= base;
        }
        return result;
    }

    public static boolean isNarcissistic(int number) {
        int power = howMAnyDigits(number);
        int numberDup = number;
        int sum = 0;
        while (numberDup > 0) {
            sum += calculatePower(numberDup % 10, power);
            numberDup /= 10;
        }
        return sum == number;
    }

    public static void getNarcissisticNumber() {  //פונקציה 12
        System.out.println("Enter a positive neutral number: ");
        int number = scanner.nextInt();
        if (isNarcissistic(number)) {
            System.out.println("The narcissistic number closest to what you entered is " + number);
        } else {
            int narcissisticNumber1 = number;
            int narcissisticNumber2 = number;
            while (!isNarcissistic(narcissisticNumber1)) {
                narcissisticNumber1++;
            }
            while (!isNarcissistic(narcissisticNumber2)) {
                narcissisticNumber2--;
            }
            if (number - narcissisticNumber1 > (number - narcissisticNumber2) * -1) {
                System.out.println("The narcissistic number closest to what you entered is " + narcissisticNumber1);
            } else {
                System.out.println("The narcissistic number closest to what you entered is " + narcissisticNumber2);
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("Details on actions: ");
        System.out.println("1 - calculate area and scope of a circle.");
        System.out.println("2 - convert temp from fahrenheit to celsius and vise versa.");
        System.out.println("3 - calculating factorial of a number.");
        System.out.println("4 - calculating of natural numbers in given range.");
        System.out.println("5 - checking if a number is a prime number.");
        System.out.println("6 - checking if a five digit number is a palindrome.");
        System.out.println("7 - printing prime numbers in a given range.");
        System.out.println("8 - calculating GCD of two numbers.");
        System.out.println("9 - calculating solutions of quadratic equation.");
        System.out.println("10 - calculating compound interest.");
        System.out.println("11 - checking if a number if from the Fibonacci sequence.");
        System.out.println("12 - locate the closest narcissistic number to a given number.");
        System.out.println("0 - ending the program.");
        int menu;
        do {
            System.out.println("Choose your next action: ");
            menu = scanner.nextInt();
            switch (menu) {
                case 1 -> calculateCircle();
                case 2 -> degreesConvert();
                case 3 -> calculateFactorial();
                case 4 -> calculateSumOfNumbers();
                case 5 -> isPrimeNumber();
                case 6 -> isNumberPalindrome();
                case 7 -> printPrimeNumbers();
                case 8 -> findGCD();
                case 9 -> calculateQuadraticEquation();
                case 10 -> calculateCompoundInterest();
                case 11 -> isNumberFromFibonacci();
                case 12 -> getNarcissisticNumber();
                case 0 -> System.out.println("Menu ended. Goodbye!");
                default -> System.out.println("No such action.");
            }
        } while (menu != 0);
    }
}