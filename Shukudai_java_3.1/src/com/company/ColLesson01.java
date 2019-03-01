package com.company;
import java.util.Scanner;

public class ColLesson01 {



    public static void main(String[] args) {


       int i = 0;

        Word inputword = new Word();

        System.out.println("わからなかった単語とその意味をスペースで区切って入力してください。");

            while(i< 10){
                String word = new java.util.Scanner(System.in).next();
                String meaning = new java.util.Scanner(System.in).next();
                inputword.InputWord(word,meaning);

                System.out.print("次の単語と意味を入力してください。" + "e" + "で終了します。");

                if(word.equals("e")) {
                    break;
                }
            }

        for (int j = 0; j < word.length; j++) {
            System.out.println("単語:" + word[i] + "意味：" + meaning[i]);
            System.out.println( word.length + "件登録しました。");
        }


    }

}
