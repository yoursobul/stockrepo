/**
 * 
 */
package com.stock.impl;

import com.stock.StockOperations;
import com.stock.model.Stock;

/**
 * @author OBUL
 *
 */
public class StockOperationsImpl implements StockOperations {

	private Stock currentStock;
	
	public StockOperationsImpl(Stock currentStock) {
		super();
		this.currentStock = currentStock;
	}

	/**
	 * 
	 */
	public StockOperationsImpl() {
		
	}

	/* (non-Javadoc)
	 * @see com.stock.StockOperations#getDividendYield()
	 */
	@Override
	public double getDividendYield() {
		// TODO Auto-generated method stub
		return (currentStock.getAnnualdividendspershare()/currentStock.getStockprice());
	}

	/* (non-Javadoc)
	 * @see com.stock.StockOperations#getPERatio()
	 */
	@Override
	public double getPERatio() {
		// TODO Auto-generated method stub
		return (currentStock.getStockprice() / currentStock.getEarningspershare() );
	}

	/* (non-Javadoc)
	 * @see com.stock.StockOperations#getGeometricMean()
	 */
	@Override
	public double getGeometricMean() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.stock.StockOperations#getStockPrice()
	 */
	@Override
	public double getStockPrice() {
		// TODO Auto-generated method stub
		return currentStock.getStockprice();
	}

}
