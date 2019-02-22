import java.util.Scanner;

public class shindan_kadai {
    public static void main(String[] args) {

        String[] question = new String[5];

        question[0] = "休日の過ごし方は？";
        question[1] = "体を動かすことが好きだ";
        question[2] = "お酒は飲むときは？";
        question[3] = "あなたのストレス発散方法は？";
        question[4] = "好きな本のジャンルは？";

        String[] Answer = new String[5];

        Answer[0] = "1:家でのんびり 2:遠くまでドライブ 3:話題のスポットにいく 4:友達と会う";
        Answer[1] = "1:とても好き　2:まぁまぁ好き　3:あまり好きじゃない　4;むしろきらい";
        Answer[2] = "1:家で飲む　2:友達と飲みに行く　3:仕事の付き合い程度　4:全く飲まない";
        Answer[3] = "1:買い物をする　2:カラオケに行く　3:運動をする　4:お酒を飲む　5:その他";
        Answer[4] = "1:小説　2:ノンフィクション　3:自己啓発　4:趣味系　5:参考書";



        for (int i = 0; i < 5; i++) {

            System.out.println(question[i]);
            System.out.println(Answer[i]);

            int kaitou = new java.util.Scanner(System.in).nextInt();


//        Answer[0] = "1:家でのんびり 2:遠くまでドライブ 3:話題のスポットにいく 4:友達と会う";
            if (i == 0) {
                if ( kaitou == 1) {
                    int num0 = 0;
                } else if (kaitou == 2) {
                    int num0 =5;
                } else if (kaitou == 3) {
                    int num0 =0;
                } else if (kaitou == 4) {
                    int num0 =10;
                }
            }
//        Answer[1] = "1:とても好き　2:まぁまぁ好き　3:あまり好きじゃない　4;むしろきらい";
            if (i == 1) {
                if ( kaitou == 1) {
                    int num1 = 5;
                } else if (kaitou == 2) {
                    int num1 = 10;
                } else if (kaitou == 3) {
                    int num1 = 5;
                } else if (kaitou == 4) {
                    int num1 = 0;
                }
            }
//        Answer[2] = "1:家で飲む　2:友達と飲みに行く　3:仕事の付き合い程度　4:全く飲まない";
            if (i == 2) {
                if ( kaitou == 1) {
                    int num2 = 0;
                } else if (kaitou == 2) {
                    int num2 = 10;
                } else if (kaitou == 3) {
                    int num2 = 5;
                } else if (kaitou == 4) {
                    int num2 = 0;
                }
            }
//        Answer[3] = "1:買い物をする　2:カラオケに行く　3:運動をする　4:お酒を飲む　5:その他";
            if (i == 3) {
                if ( kaitou == 1) {
                    int num3 = 10;
                } else if (kaitou == 2) {
                    int num3 = 5;
                } else if (kaitou == 3) {
                    int num3 = 5;
                } else if (kaitou == 4) {
                    int num3 = 0;
                } else if (kaitou == 5) {
                    int num3 = 0;
                }
            }

//        Answer[4] = "1:小説　2:ノンフィクション　3:自己啓発　4:趣味系　5:参考書";
            if (i == 4) {
                if ( kaitou == 1) {
                    int num4 = 10;
                } else if (kaitou == 2) {
                    int num4 = 0;
                } else if (kaitou == 3) {
                    int num4 = 5;
                } else if (kaitou == 4) {
                    int num4 = 5;
                } else if (kaitou == 5) {
                    int num4 = 0;
                }
            }

            int score;
            score = num0 + num1 + num2 + num3 + num4;


            if (score >= 40) {
                System.out.println("あなたとはすぐに仲良くなれそう！");

            } else if (20 <= score && score < 40) {
                System.out.println("まぁまぁです。");

            } else {
                System.out.println("ノーコメント！");

            }


        }
    }

}

