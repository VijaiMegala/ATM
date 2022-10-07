package SD;

import java.util.Scanner;

public class ATM3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of value to be inserted");
        int n=sc.nextInt();
        int Denomination[]=new int[n];
        int Number[]=new int[n];
        int value[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the denomination and number");
            Denomination[i]=sc.nextInt();
            Number[i]=sc.nextInt();
            value[i]=Denomination[i]*Number[i];
            System.out.println("the value is "+value[i]);

        }
    }
}
