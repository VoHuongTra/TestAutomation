package example03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập vào một số nguyên dương: ");
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        boolean check = value.matches("-?\\d+(\\.\\d+)?");
        while(!check){
            System.out.println("Nhập vào số nguyên dương: ");
            value = sc.nextLine();
            check = value.matches("-?\\d+(\\.\\d+)?");
        }
        boolean check2 = Integer.valueOf(value) > 0;
        while(!check2){
            System.out.println("Nhập vào số nguyên dương > 0: ");
            value = sc.nextLine();
            check2 = Integer.valueOf(value) > 0;
        }
        if(Integer.valueOf(value)> 0 && Integer.valueOf(value) < 13){
            System.out.println("So ngay trong thang " + validate(Integer.valueOf(value)));
        }
    }
    public static int validate(int month){
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            return 31;
        }else if(month == 2) {
            return 28;
        }else{
            return 30;
        }
    }
}
