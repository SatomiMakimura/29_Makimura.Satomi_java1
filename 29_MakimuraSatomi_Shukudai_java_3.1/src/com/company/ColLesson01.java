package com.company;
import java.util.Scanner;

public class ColLesson01 {



    public static void main(String[] args) {

        String[]word = new String[10];
        String[]meaning=new String[10];
        int i = 0;

        Word input = new Word();

        System.out.println("わからなかった単語とその意味をスペースで区切って入力してください。");
            while(i < 10){
                Scanner sc = new Scanner(System.in);
                String input_word = sc.nextLine();
                String input_meaning = sc.nextLine();
                input.InputWord(input_word,input_meaning);
                i=i++;

                System.out.print("次の単語と意味を入力してください。" + "e" + "で終了します。");

                if("e".equals(input)) break;
            }

        for (int j = 0; j < word.length; j++) {
            System.out.println("単語:" + word[i] + "意味：" + meaning[i]);
            System.out.println( word.length + "件登録しました。");
        }


    }

}
