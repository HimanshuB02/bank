import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to got a mortgage?( yes or no)");
        String option = scan.nextLine();
        switch (option){
            case "yes":
                System.out.println("\nGreat! In one line" + "\n How much money do you have in your savings?" + "\n And ,how much do you owe in credit card debt?");break;
            case "YES":
                System.out.println("\nGreat! In one line" + "\n How much money do you have in your savings?" + "\n And ,how much do you owe in credit card debt?");break;
            
            case "Yes":
                System.out.println("\nGreat! In one line" + "\n How much money do you have in your savings?" + "\n And ,how much do you owe in credit card debt?");break;
                
            case "no":
                System.out.println("\n OK. Have a nice day!");break;
            case "No":
                System.out.println("\n OK. Have a nice day!");break;
            default:
                System.out.println("\n Please enter valid option");break;
        }

        int savings = scan.nextInt();
        int debt = scan.nextInt();
        System.out.println("How many years have you worked for?");
         int years = scan.nextInt();

        System.out.println("What is your name?");
        String name = scan.next();
        if (savings>=10000 && debt<5000 && years>=2){
            System.out.println("Congratulation " + name + " ,you have been approved!");

        } else{
            System.out.println("Sorry,you are not eligible for a mortage.");
        }
    }
}


