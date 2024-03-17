package Problem2;

import java.util.Scanner;

// import Time;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer hh,mm,ss;
        System.out.println("Enter the hour");
        hh=sc.nextInt();
        System.out.println("Enter the minute");
        mm=sc.nextInt();
        System.out.println("Enter the second");
        ss=sc.nextInt();
        Time tt=new Time(hh,mm,ss);
        System.out.println("Current Time: "+tt.toString());
        System.out.printf("%02d:%02d:%02d%n",tt.getHour(),tt.getMinute(),tt.getSecond());
        System.out.println("Previous Second: "+tt.prevSecond().toString());
        System.out.println("Next Second: "+tt.nextSecond().toString());
        sc.close();

    }
}