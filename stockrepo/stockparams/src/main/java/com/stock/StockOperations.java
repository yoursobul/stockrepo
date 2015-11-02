package com.stock;

/**
 * @author OBUL
 *
 */
public interface StockOperations {

	public abstract double getDividendYield();
	
	public abstract double getPERatio();
	
	public abstract double getGeometricMean();
	
	public abstract double getStockPrice();
	
}
