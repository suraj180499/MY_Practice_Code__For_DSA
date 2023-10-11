public class StockBuySell {
     public static int bestTimeToBuyAndSellStock(int [] v) {
        // Write your code here.

        int b=v[0];
        int mp=0;
        for(int x:v){
            if(b>x){
                b=x;
            }
            else{
                mp=Math.max(x-b, mp);
            }
        }
        return mp;
    }
    
}
