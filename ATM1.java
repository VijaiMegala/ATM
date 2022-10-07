package SD;
import java.util.Scanner;
public class ATM1 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of values to be inserted");
        int i,n=sc.nextInt();
        int accno[]=new int[n];
        String acchol[]=new String[n];
        int pinno[]=new int[n];
        int accbal[]=new int[n];
        for(i=0;i<n;i++)
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
        System.out.println("Account number Account holder pin number Account Balance");
        for(i=0;i<n;i++)
        {
            System.out.println("     "+accno[i]+"          "+acchol[i]+"         "+pinno[i]+"         "+accbal[i]);
        }
    }
}
