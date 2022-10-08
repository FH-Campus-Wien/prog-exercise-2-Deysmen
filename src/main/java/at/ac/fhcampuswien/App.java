package at.ac.fhcampuswien;


import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
       Scanner scanner = new Scanner(System.in);
        double zahl, biggestnumber = 0;
        int anzahl = 1;
        System.out.print("Number " + anzahl + ": ");
        zahl = scanner.nextDouble();
        if(zahl <= 0.0)
        {
            System.out.println("No number entered.");
        }
        else
        {
            while (zahl > 0.0) {
                anzahl++;
                System.out.print("Number " + anzahl + ": ");
                zahl = scanner.nextDouble();
                if (zahl > 0 && zahl > biggestnumber) {
                    biggestnumber = zahl;
                }
            }
            System.out.println("The largest number is " + String.format("%.2f", biggestnumber));
        }


    }

    //todo Task 2
    public void stairs(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int number = scanner.nextInt();
        int anzahl = 1;
        if (number > 0)
        {

            for (int i = 1; i < number+1; i++)
            {
                for(int j = 1; i >= j;j++)
                {
                    System.out.print(anzahl + " ");
                    anzahl++;
                }
                System.out.println("");
            }
        }else {
            System.out.println("Invalid number!");
        }
    }

    //todo Task 3
    public void printPyramid(){
        int pyramide = 6;
        int leerzeichen = pyramide;
        int output = 0;
        for(int i =0; i < pyramide;i++)
        {

            for (int j = 0; j < leerzeichen-1; j++)
            {
                System.out.print(" ");
            }
            for(int a = 0; a< output+1; a++)
            {
                System.out.print("*");
            }

            output = output+2;
            leerzeichen--;
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("h: ");
        int empty;
        int anzahl =0;
        int hilfe=0;
        int h = scanner.nextInt();
        System.out.print("c: ");
        char c = scanner.next().charAt(0);
        if(h%2 != 0)
        {
            empty = (h/2);
            for (int i = 0; i < (h/2)+1;i++)
            {
                    for(int j = 0; j < empty;j++)
                    {
                        System.out.print(" ");
                    }
                    hilfe = ((anzahl+1)/2)*(-1);
                    for(int a = 0; a < anzahl+1; a++)
                    {
                        if(hilfe > 0)
                        {
                            System.out.print((char) (c-hilfe));
                        } else if(hilfe < 0)
                        {
                            System.out.print((char) (c+hilfe));
                        } else {
                            System.out.print(c);
                        }
                        hilfe++;
                    }
                    empty--;
                    anzahl+=2;
                    System.out.println("");
            }
            empty =0;
            anzahl = ((h/2)*2)-2;
            hilfe=0;
            for (int i = 0; i< (h/2);i++)
            {
                empty++;
                for(int em = 0; em < empty;em++)
                {
                    System.out.print(" ");
                }
                hilfe = ((anzahl+1)/2)*(-1);
                for(int j = 0; j < anzahl+1;j++)
                {
                    if(hilfe > 0)
                    {
                        System.out.print((char) (c-hilfe));
                    } else if(hilfe < 0)
                    {
                        System.out.print((char) (c+hilfe));
                    } else {
                        System.out.print(c);
                    }
                    hilfe++;
                }
                anzahl-=2;
                System.out.println("");
            }
        }
        else {
            System.out.println("Invalid number!");
        }

    }

    //todo Task 5
    public void marks(){
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int input;
        int sum=0;
        double averge = 0.00;
        int negativmarks = 0;
        do {
            System.out.print("Mark " + count + ": ");
            input = scanner.nextInt();

            if (input < 6 && input != 0)
            {
                sum+=input;
                if(input == 5)
                {
                    negativmarks++;
                }
                count++;

            } else if(input != 0)
            {
                System.out.println("Invalid mark!");
            } else
            {
                count--;
            }
        }while(input != 0);
        if (count != 0)
        {
            averge = (double) sum/count;
        }
        System.out.println("Average: "+ String.format("%.2f", averge));
        System.out.println("Negative marks: " + negativmarks);
    }

    //todo Task 6
    public void happyNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        int helper = 0;
        while(n != 1 && n != 4)
        {
            while (n != 0) {
                helper += Math.pow((n % 10), 2);
                n = n / 10;
            }
            n = helper;
            helper = 0;
        }
        if (n == 1)
        {
            System.out.println("Happy number!");
        } else
        {
            System.out.println("Sad number!");
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}