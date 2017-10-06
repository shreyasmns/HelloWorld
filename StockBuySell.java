
/**
 * @author ${Shreyas MN}
 * 
 */
public class StockBuySell {

	public static void main(String[] args) {
        
        // stock prices on consecutive days
        int price[] = {100, 180, 260, 310, 40, 535, 695};
        int n = price.length;
        
        StockBuySell stock = new StockBuySell();
        stock.stockBuySell(price, n);
	}

	
	private void stockBuySell(int[] price, int n) {
		if(n <= 1) return;
		int buy, sell, i=0;
		
	 while(i < n-1){
		while((i < n-1) && (price[i+1] <= price[i]))
				i++;
			if(i == n-1)
			   break;
			buy = i++;
			
		while((i<n-1) && price[i] >= price[i-1])
			 i++;
		  sell = i-1;
		System.out.println("Buy on day : "+buy +" and Sell on day : "+sell );
	  }	
   }
}
