package com.company;

public class CoinCase {

   int coin500 = 0;
   int coin100 = 0;
   int coin50 = 0;
   int coin10 = 0;
   int coin5 = 0;
   int coin1 = 0;


   public void AddCoins(int coin,int count) {
      switch( coin )
      {
         case 500:
            coin500 += count;
            break;
         case 100:
            coin100 += count;
            break;
         case 50:
            coin50 += count;
            break;
         case 10:
            coin10 += count;
            break;
         case 5:
            coin5 += count;
            break;
         case 1:
            coin1 += count;
            break;
      }
   }

   public int GetCount(int coin){

      switch( coin )
      {
         case 500:
            return coin500;
         case 100:
            return coin100;
         case 50:
            return coin50;
         case 10:
            return coin10;
         case 5:
            return coin5;
         case 1:
            return coin1;
      }
      return 0 ;
   }


   public int GetAmount(){
      return(coin500 * 500)+(coin100 * 100)+(coin50 * 50)+(coin10 * 10)+(coin5 * 5)+coin1;
   }
}
