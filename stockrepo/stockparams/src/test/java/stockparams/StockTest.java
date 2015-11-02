/**
 * 
 */
package stockparams;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.stock.impl.StockOperationsImpl;
import com.stock.model.Stock;

/**
 * @author OBUL
 *
 */
public class StockTest  {

	/**
	 * 
	 */
	public StockTest() {
		// TODO Auto-generated constructor stub
	}
	
	

@Test
	public void testStockOperations(){

    Stock stock=  new Stock();
    createStock(stock);
	
		StockOperationsImpl stockOps=new StockOperationsImpl(stock);
		
		double dividendYield=stockOps.getDividendYield();
		
		double peratio=stockOps.getPERatio();
		
	assertEquals(3,dividendYield,2);
	assertEquals(2.5,peratio,1);
	
		
	}

private void createStock(Stock stock){
     
	
     stock.setAnnualDividend(34);
     stock.setAnnualdividendspershare(300);
     stock.setEarningspershare(40);
     stock.setStockprice(100);
	
}
}
