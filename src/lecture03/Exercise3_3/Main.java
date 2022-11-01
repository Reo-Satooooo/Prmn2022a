package lecture03.Exercise3_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1つめの整数を入力してください。");
        int input1 = scanner.nextInt();
        System.out.println("2つめの整数を入力してください。");
        int input2 = scanner.nextInt();
        int sum =  input1 + input2;
        System.out.println(input1+ "+" + input2 + "=" + sum);
    }

}
