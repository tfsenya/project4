import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        //PART 1

        int i = 1;
        int l =1;


        while (i < 5) {
            System.out.println("Hi!!!");

            i++;
        }

        System.out.println(" ");

        do{
            System.out.println(l);
            l++;
        }while(l<=10);

        System.out.println(" ");

        for(int m=1;m<=10;m++){
            System.out.println(m);
        }

        System.out.println(" ");

        int a=10;
        while(a>1){
            System.out.println(a);
            a--;
        }

        System.out.println(" ");

        int weeks = 3;
        int days = 7;
        int z = 1;


        while (z <= weeks) {
            System.out.println("Week number: " + z);


            for (int j = 1; j <= days; ++j) {
                System.out.println("  Day number: " + j);
            }
            ++z;
        }

        System.out.println(" ");

//        PART 2
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input string ");
//        String str = scanner.nextLine();
//        String str1 = str.toUpperCase();
//        System.out.println(str1);

        Scanner sc = new Scanner(System.in);

        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input string ");
            String str = scanner.nextLine();
            String str1 = str.toUpperCase();
            System.out.println(str1);

            System.out.print("Would you like to continue? Type yes or no ");
            String input = sc.nextLine();
            if(! input.equals("yes")){
                break;
            }
        }
        System.out.println("Goodbye");

        System.out.println(" ");
        System.out.println(" ");


//      PART 3
        Scanner scr = new Scanner(System.in);

        while(true) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Input string to reverse it ");
            String stra = sc1.nextLine();
            String reverse = "";
            for(int k = stra.length()-1; k>=0; k--){
                reverse = reverse + stra.charAt(k);
            }
            System.out.println(reverse);


            System.out.print("Would you like to continue? Type yes or no ");
            String input = sc.nextLine();
            if(! input.equals("yes")){
                break;
            }
        }
        System.out.println("Goodbye");
        System.out.println(" ");
        System.out.println(" ");

        //PART 4
        Scanner scq = new Scanner(System.in);

        while(true) {
            Scanner scanner = new Scanner(System.in);
        Scanner aaa = new Scanner(System.in);
        System.out.println("What is your age");
        int age5 = aaa.nextInt();
        if (age5 <= 11){
            System.out.println("You should read a detective book like sherlock holmes");
        } else if (age5<=18 && age5>=11) {
            System.out.println("You should read a non-fiction book like God:An Anatomy");
        } else if (age5<=30 && age5>=18) {
            System.out.println("You should read a buisness book like Rich dad poor dad");
        } else if (age5>=30 && age5<45) {
            System.out.println("You should read a fiction book like 1984");
        } else {
            System.out.println("You should read a science book like Great picture");
        }
            System.out.print("Would you like to continue? Type yes or no ");
            String input = sc.nextLine();
            if(! input.equals("yes")){
                break;
            }
        }
        System.out.println("Goodbye");



    }



}