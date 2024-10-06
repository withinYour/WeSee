import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     /*   Sym.first();
        System.out.println("\t" + "-------------------------------------");
        Sym.second();
        System.out.println("\t" + "-------------------------------------");
        Sym.third();
        System.out.println("\t" + "-------------------------------------");
        Sym.forth();
        System.out.println("\t" + "-------------------------------------");
        Sym.fifth();
        System.out.println("\t" + "-------------------------------------");
        Sym.six();
        System.out.println("\t" + "-------------------------------------");
        Sym.seven();
        System.out.println("\t" + "-------------------------------------");*/
        Sym.eight();
        System.out.println("\t" + "-------------------------------------");
        Sym.nine();
    }
}

class Sym {
    // Use a single scanner instance throughout the program
    static Scanner sc = new Scanner(System.in);

    public static void first() {
        System.out.println("Write anything:");
        String s = sc.nextLine();
        System.out.println("You wrote: " + s);
    }

    public static void second() {
        System.out.println("Print num I will tell you if it's even or odd:");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("The number is even: " + a);
        } else {
            System.out.println("The number is odd: " + a);
        }
    }

    public static void third() {
        System.out.println("Enter two numbers and operator to calculate:");
        System.out.print("1st number: ");
        int num = sc.nextInt();
        System.out.print("2nd number: ");
        int nu = sc.nextInt();
        sc.nextLine(); // consume the newline
        System.out.print("Choose the operator (+, -, *, /): ");
        String n = sc.nextLine();
        switch (n) {
            case "+":
                System.out.println(num + " + " + nu + " = " + (num + nu));
                break;
            case "-":
                System.out.println(num + " - " + nu + " = " + (num - nu));
                break;
            case "*":
                System.out.println(num + " * " + nu + " = " + (num * nu));
                break;
            case "/":
                System.out.println(num + " / " + nu + " = " + (num / nu));
                break;
            default:
                System.out.println("Invalid operator entered.");
                break;
        }
    }

    public static void forth() {
        System.out.println("Enter two numbers, and I will tell which one is bigger:");
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int aa = sc.nextInt();
        if (a < aa) {
            System.out.println("Maximum number is " + aa);
        } else if (a > aa) {
            System.out.println("Maximum number is " + a);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }

    public static void fifth() {
        System.out.println("Enter anything, and I will check if it's a palindrome or not:");
        System.out.print("Write here: ");
        sc.nextLine(); // Consume newline from previous input
        String a = sc.nextLine();
        String in = new StringBuilder(a).reverse().toString();
        if (a.equalsIgnoreCase(in)) {
            System.out.println("The word you typed is a palindrome.");
        } else {
            System.out.println("The word you shared is not a palindrome.");
        }
    }

    public static void six() {
        System.out.print("Enter a number, and I will check if it's prime or not: ");
        int a = sc.nextInt();
        boolean isPrime = true;

        if (a < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(a + " is a prime number.");
        } else {
            System.out.println(a + " is not a prime number.");
        }
    }

    public static void seven() {
        System.out.println("I will sum all the digits of the number you provide.");
        System.out.print("Type here: ");
        int s = sc.nextInt();
        int sum = 0;

        while (s != 0) {
            int digit = s % 10;
            sum += digit;
            s = s / 10;
        }
        System.out.println("Sum of digits: " + sum);
    }

    public static void eight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write something, and I will count the vowels:");
        //sc.nextLine(); // Consume leftover newline
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ("AEIOUaeiou".indexOf(ch) != -1) {
                sum++;
            }
        }
        System.out.println("The sentence contains " + sum + " vowels.");
    }
    public static  void nine(){
        Scanner sc = new Scanner(System.in);
        System.out.println("I can calculate the power of a number!");

        // Taking input for the base number
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        // Taking input for the exponent
        System.out.print("Enter its power: ");
        int b = sc.nextInt();

        // Initializing result as 1 (since anything raised to the power of 0 is 1)
        int result = 1;

        // Loop to multiply 'a' by itself 'b' times
        for (int i = 1; i <= b; i++) {
            result *= a; // result = result * a;
        }

        // Displaying the result
        System.out.println(a + " raised to the power of " + b + " is: " + result);
    }
}
