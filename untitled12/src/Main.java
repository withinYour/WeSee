
import java.util.Scanner;

public class Main {
    public static void main(String []args) {
         Sym.first();
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
         System.out.println("\t" + "-------------------------------------");
         Sym.eight();
         System.out.println("\t" + "-------------------------------------");

    }
}
class Sym{
    public static void first(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write any thing :");
        String s = sc.nextLine();
        System.out.println("You write "+ s );
    }
    public static void second(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Print num I will tell is it even or odd");
        int a = sc.nextInt();
        if ( a % 2 == 0){
            System.out.println("The number is " +" even " + a);
        } else {
            System.out.println("The number is "+ "odd " + a);
        }
    }
    public static void third(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number and operator to calculate");
        System.out.print(" 1st number : ");
        int num = sc.nextInt();
        System.out.print(" 2nd number : ");
        int nu = sc.nextInt();sc.nextLine();
        System.out.print("Chose the operator ( + , - , * , / ) : ");
        String  n= sc.nextLine();
        switch (n){
            case "+":
                System.out.println(num +" + "+ nu +" = " + (num + nu));
                break;
            case "-":
                System.out.println(num + " - "+ nu +" = "+ (num-nu));
                break;
            case "*":
                System.out.println(num +" * "+ nu +" = "+ (num*nu));
                break;
            case "/":
                System.out.println(num +" / "+ nu +" = "+ (num/nu));
                break;
            default:
                System.out.println("You enter invalid in operator ");
                break;
        }
    }
    public static void forth(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers and I will find which one is big ");
        System.out.print(" Enter 1st number : ");
        int a = sc.nextInt();sc.nextLine();
        System.out.print(" Entre 2nd number : ");
        int aa = sc.nextInt();sc.nextLine();
        if (a < aa){
            System.out.println(" Maximum number is " +aa);
        } else if (a>aa) {
            System.out.println(" Maximum number is "+ a);
        } else {
            System.out.println(" Something went wrong ");
        }
    }
    public static void fifth(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter anything I check if it's palindrome or not ");
        System.out.print("Write here : ");
        String a = sc.nextLine();
        String in = new StringBuilder(a).reverse().toString();
        if(a.equalsIgnoreCase(in)){
            System.out.println(" The word you type is palindrome ");
        } else {
            System.out.println(" The word you share is not palindrome");
        }

    }
    public static void six(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number I will check if is prime or not : ");
        int a = sc.nextInt();sc.nextLine();
        boolean isPrime = true; // Assuming the number is prime

        if (a < 2) {
            isPrime = false; // Numbers less than 2 are not prime
        } else {
            // Loop to check if a is divisible by any number from 2 to sqrt(a)
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    isPrime = false; // If divisible, not a prime number
                    break; // Exit the loop since we've found a divisor
                }
            }
        }

        if (isPrime) {
            System.out.println(a + " is a prime number.");
        } else {
            System.out.println(a + " is not a prime number.");
        }

        sc.close(); // Closing the scanner
    }
    public static void seven(){
        Scanner sc = new Scanner(System.in);
        System.out.println("I will sum the all digits of the number you will provide ");
        System.out.print("Type here : ");
        int s = sc.nextInt();
        int sum = 0;

        while (s != 0){
            int digit = s % 10;  // Get the last digit
            sum += digit;             // Add the digit to the sum
            s = s / 10;     // Remove the last digit
        }
        System.out.println("Sum of digits: " + sum);
    }
    public static void eight(){
        Scanner sc = new Scanner(System.in);
       System.out.println("Write something and I will tell you how many vowels are there ");
        System.out.print("Write here : ");
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                sum++;
            }
        }
        System.out.println("The sentence contains " + sum + " vowels.");
        sc.close(); // Close the scanner after use
    }
}