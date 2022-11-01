package lecture03.Exercise3_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> inputs = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("何行分入力しますか?");
        int inputNum = scanner.nextInt();
        for (int i = 0; i < inputNum; i++){
            System.out.println((i+1)+"行目：");
            String str = scanner.nextLine();
            inputs.add(str);
        }
        for (int j = 0; j < inputNum; j++){
            System.out.println("["+j+"]"+inputs.get(j));
        }
    }
}
