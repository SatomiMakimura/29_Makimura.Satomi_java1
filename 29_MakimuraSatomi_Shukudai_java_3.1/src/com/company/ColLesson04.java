package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ColLesson04 {

    public static void main(String[] args) {

    ArrayList<Word> words = new ArrayList<>();

        System.out.println("わからなかった単語とその意味をスペースで区切って入力してください。");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int index = 0;
        while (!input.equals("e")) {
            String[] tmp = input.split("　");
            Word wd = new Word(tmp[0], tmp[1]);
            words.add (wd);
            index++;
            System.out.print("次の単語と意味を入力してください。" + "e" + "で終了します。");
            input = sc.nextLine();

            try {
                words.add(wd);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("登録制限を越えました。登録済みのデータは以下になります。");
                break;
            }

            for (int i = 0; i < index; i++) {
                System.out.println("単語:" + words.get(i).word + "意味：" + words.get(i).meaning);
            }
            System.out.println( words.size()+ "件登録しました。");

        }
    }
}
