package example02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mat khau: ");
        String password = sc.nextLine();
        Boolean check = password.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$*%^&+=])(?=\\\\S+$).{10,}");
        if(!check){
            if(password.length() < 10){
                System.out.println("Mat khau yeu, chua du 10 ky tu tro len");
            }else{
                System.out.println("Mat khau chua du manh");
            }
        }else{
            System.out.println("Dat mat khau thanh cong");
        }

    }
}
