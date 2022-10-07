package SD;

import java.util.*;

public class ATM2 {
    static Scanner sc=new Scanner(System.in);
   //System.out.println("enter the value to be inserted");
    static int i,m=sc.nextInt();
    static int n=sc.nextInt();
    static int Denomination[]=new int[n];
    static int Number[]=new int[n];
    static int[] value =new int[n];
    static int accno[]=new int[m];
    static String acchol[]=new String[m];
    static int pinno[]=new int[m];
    static int accbal[]=new int[m];
    static int[] value1 =new int[10];
    public static void main(String[]args)
    {
        call();
        balance();
       System.out.println("1.Atm balance 2.withdrawal money 3.balance 4.transfer money");

        int n=sc.nextInt();

       switch(n)
       {
           case 1: atmcheckbal(); break;
           case 2: withdraw(); break;
           case 3: holdbalance();break;
           case 4: transmoney();break;
       }
    }

    private static void transmoney() {
        System.out.println("Enter the user name and pin");
        String a=sc.next();
        int b=sc.nextInt();
        for(i=0;i<m;i++) {
            if (acchol[i].equals(a) && pinno[i]==b) {
                System.out.println("enter the account number and amount to be send");
                int c=sc.nextInt();
                int d=sc.nextInt();

                for(i=0;i<m;i++) {
                    if (accno[i] == c) {
                        accbal[i]=accbal[i]+d;
                        System.out.println("Account number "+c+" credited amount "+ d);
                    }
                }
                accbal[i]=accbal[i]-d;
                System.out.println("balance "+ accbal[i]);
            }
            else {
                System.out.println("check the username/pin ");
            }
            }
    }

    private static void holdbalance() {
        System.out.println("Account number Account holder pin number Account Balance");

        for(i=0; i<m; i++)
        {
            System.out.println("     "+accno[i]+"          "+acchol[i]+"         "+pinno[i]+"         "+accbal[i]);
        }
    }

    private static void balance() {
        for(i=0; i<m; i++)
        {
            System.out.println("enter the account number");
            accno[i]=sc.nextInt();
            System.out.println("enter the account holder");
            acchol[i]=sc.next();
            System.out.println("enter the pin number");
            pinno[i]=sc.nextInt();
            System.out.println("enter the account balance");
            accbal[i]=sc.nextInt();
        }

    }

    private static void withdraw() {
        System.out.println("Enter the user name and pin");
        String a=sc.next();
        int b=sc.nextInt();
        for(i=0;i<m;i++) {
            if (acchol[i].equals(a) && pinno[i]==b) {
                System.out.println("enter the amount to be withdraw");
                int c = sc.nextInt();
                accbal[i]=accbal[i]-c;
                System.out.println("balance "+ accbal[i]);
            }
            else {
                System.out.println("check the username/pin ");
            }
        }

    }

    private static void call() {

        System.out.println("enter the number of value to be inserted");
//        int n=sc.nextInt();
//        int Denomination[]=new int[n];
//        int Number[]=new int[n];
//        int[] value =new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("enter the denomination and number");
            Denomination[i]=sc.nextInt();
            Number[i]=sc.nextInt();
            value[i]=Denomination[i]*Number[i];
            value1 [i]=value[i];
            //System.out.println("the value is "+value[i]);

        }
    }

    private static void atmcheckbal() {
        for( i=0;i<n;i++) {
            System.out.println("Denomination Number Value");
            System.out.println("    "+Denomination[i]+"      "+Number[i]+"    "+value[i]);
        }
    }
}
