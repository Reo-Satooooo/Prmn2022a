package lecture01;

public class Main {
    public static void main(String[] args) {

        // 課題1-1,課題1-2
        int studentNumber = 2191040;
        System.out.println("B" + studentNumber+ " Reo Sato");

        // 課題1-3
        int age = 21;
        if (age < 20){
            System.out.println("I am "+ age +" years old so I cannot drink liquor.");
        }
        else if(age >= 20){
            System.out.println("I am "+ age +" years old so I can drink liquor.");
        }

        // 課題1-4
        int[] array = new int[100];
        int sum = 0;
        for (int i = 0; i<array.length; i++){
            array[i] = i + 1;
            // 偶数の場合
            if (i%2 == 0){
                sum = sum + array[i];
                System.out.println(sum);
            }
        }
        System.out.println("配列arrayの偶数番目の要素の合計："+ sum);

        // 課題1-5
        int[] score = {41,85,72,38,80};
        int minScore = min(score);
        int maxScore = max(score);
        double scoreAvg = average(score);

        // 結果出力
        for (int i = 0; i < score.length; i++){
            if (score[i] < 60){
                //不可表示
                System.out.println(i + "番 " +score[i]+"点 不可");
            }
            else if(score[i] < 70){
                //可表示
                System.out.println(i + "番 " +score[i]+"点 可");
            }
            else if(score[i] < 80){
                //良表示
                System.out.println(i + "番" +score[i]+"点 良");
            }
            else if(score[i] < 90){
                //優表示
                System.out.println(i + "番" +score[i]+"点 優");
            }
            else if(score[i] <= 100) {
                //秀表示
                System.out.println(i + "番" + score[i] + "点 秀");
            }
        }
        System.out.println("最低点："+minScore+"点");
        System.out.println("最高点："+maxScore+"点");
        System.out.println("平均点："+scoreAvg+"点");
    }

    public static int min(int[] score){
        int[]scoreListMin = score;
        int minScore = scoreListMin[0];
        for (int i = 0;i < scoreListMin.length; i++){
            if (minScore > scoreListMin[i]){
                minScore = scoreListMin[i];
            }
        }
        return minScore;
    }

    public static int max(int[] score){
        int[]scoreListMax = score;
        int maxScore = scoreListMax[0];
        for (int i = 0;i < scoreListMax.length; i++){
            if (maxScore < scoreListMax[i]){
                maxScore = scoreListMax[i];
            }
        }
        return maxScore;
    }

    public static double average(int[] score){
        int[] scoreListAvg = score;
        int sum = 0;
        double scoreAvg;
        for (int i = 0;i < scoreListAvg.length; i++){
            sum = sum + scoreListAvg[i];
        }
        scoreAvg = (double)sum/scoreListAvg.length;
        return scoreAvg;
    }
}