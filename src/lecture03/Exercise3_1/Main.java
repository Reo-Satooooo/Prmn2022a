package lecture03.Exercise3_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("任意の文字列を入力してください。");
        String input = scanner.nextLine();
        System.out.println("入力した文字列："+input);
    }
}
