import javax.naming.NameNotFoundException;
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
        for (int i = Math.min(start, end); i <= Math.max(start, end); i++) {
            sum += i;
        }
        System.out.println("The sum of the numbers in the range you put is " + sum);
    }

    public static boolean isPrimeNumber(int number) {
        if (number == 1)
            return false;
        int divisor = 2;
        while (divisor * divisor <= number) {
            if (number % divisor == 0) {
                return false;
            }
            divisor = divisor + 1;
        }
        return true;
    }

    public static void isPrimeNumber() {  //פונקציה 5
        System.out.println("Enter a positive number: ");
        int number = scanner.nextInt();
        if (isPrimeNumber(number))
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

    public static void isNumberPhilindrome() { //פןנקציה 6
        int number;
        do {
            System.out.println("Enter a positive five digit number: ");
            number = scanner.nextInt();
        } while (howMAnyDigits(number) != 5);
        String dupNumber = "" + number;
        if (dupNumber.charAt(0) == dupNumber.charAt(4) && dupNumber.charAt(1) == dupNumber.charAt(3)) {
            System.out.println("This is a philindrome!");
        } else {
            System.out.println("This is not a philindrome.");
        }
    }

    public static void printPrimeNumbers() { //פונקציה 7
        System.out.println("enter the start and the end of the range: ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        for (int i = start; i <= end; i++) {
            if (isPrimeNumber(i))
                System.out.println(i);
        }
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
        double firstSolution = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double secondSolution = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        if (firstSolution == secondSolution) {
            System.out.println("There is one solution: " + firstSolution);
        } else if (firstSolution != secondSolution) {
            System.out.println("There are two solutions: " + firstSolution + ", " + secondSolution);
        } else {
            System.out.println("There are no solutions.");
        }
    }

    public static void calculateCompoundInterest() { //פןנקציה 10
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

    public static void isNumberFromFibonacci() { //פןנקציה 11
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        double fibonacciFormola1 = Math.sqrt(5 * number * number + 4);
        double fibonacciFormola2 = Math.sqrt(5 * number * number - 4);
        if (fibonacciFormola1 % 1 == 0 || fibonacciFormola2 % 1 == 0) {
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

    public static void getNarcissisticNumber() {
        System.out.println("Enter a positive neutral number: ");
        int number = scanner.nextInt();
        if (isNarcissistic(number)) {
            System.out.println("The narcissistic number closest to what you entered is " + number);
        } else {
            int narcissisticNumber1 = 0;
            int narcissisticNumber2 = 0;
            for (int i = number + 1; i <= Integer.MAX_VALUE; i++) {
                if (isNarcissistic(i)) {
                    narcissisticNumber1 = i;
                    break;
                }
            }
            for (int i = number - 1; i >= Integer.MIN_VALUE; i++) {
                if (isNarcissistic(i)) {
                    narcissisticNumber2 = i;
                    break;
                }
            }
            if (number - narcissisticNumber1 > number - narcissisticNumber2) {
                System.out.println("The narcissistic number closest to what you entered is " + narcissisticNumber1);
            } else {
                System.out.println("The narcissistic number closest to what you entered is " + narcissisticNumber2);
            }
        }
    }


    public static void main(String[] args) {
        getNarcissisticNumber();
    }
}