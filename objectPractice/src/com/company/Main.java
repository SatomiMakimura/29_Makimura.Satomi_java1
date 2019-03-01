package com.company;
import java.util.Scanner;

        public class Main {

            public static void main( String[] args ) {

                CoinCase MyCase = new CoinCase();

                for( int i = 0 ; i < 6 ; i++ )
                {
                    System.out.print( "硬貨の種類を入力してください。" );
                    int coin = new java.util.Scanner(System.in).nextInt();
                    System.out.print( "硬貨の枚数を入力してください。" );
                    int count = new java.util.Scanner(System.in).nextInt();
                    MyCase.AddCoins( coin, count );
                }

                System.out.print( "500円は" + MyCase.GetCount( 500 ) + "枚" );
                System.out.print( "100円は" + MyCase.GetCount( 100 ) + "枚" );
                System.out.print( "50円は" + MyCase.GetCount( 50 ) + "枚" );
                System.out.print( "10円は" + MyCase.GetCount( 10 ) + "枚" );
                System.out.print( "5円は" + MyCase.GetCount( 5 ) + "枚" );
                System.out.println( "1円は" + MyCase.GetCount( 1 ) + "枚" );
                System.out.println( "総額は" + MyCase.GetAmount() + "円です。" );
            }
        }
