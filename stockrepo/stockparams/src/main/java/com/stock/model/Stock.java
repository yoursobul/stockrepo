/**
 * 
 */
package com.stock.model;

/**
 * @author OBUL
 *
 */
public class Stock {

    private double stockprice;
	
	private double earningspershare;
	
	private int annualdividendspershare;
	
	private double annualDividend;
	
	
	/**
	 * 
	 */
	public Stock() {
		
	}
	public Stock(double stockprice, double earningspershare, int annualdividendspershare) {
		super();
		this.stockprice = stockprice;
		this.earningspershare = earningspershare;
		this.annualdividendspershare = annualdividendspershare;
	}

	

	/**
	 * @return the stockprice
	 */
	public double getStockprice() {
		return stockprice;
	}


	/**
	 * @param stockprice the stockprice to set
	 */
	public void setStockprice(double stockprice) {
		this.stockprice = stockprice;
	}


	/**
	 * @return the earningspershare
	 */
	public double getEarningspershare() {
		return earningspershare;
	}


	/**
	 * @param earningspershare the earningspershare to set
	 */
	public void setEarningspershare(double earningspershare) {
		this.earningspershare = earningspershare;
	}


	/**
	 * @return the annualdividendspershare
	 */
	public double getAnnualdividendspershare() {
		return annualdividendspershare;
	}


	/**
	 * @param annualdividendspershare the annualdividendspershare to set
	 */
	public void setAnnualdividendspershare(int annualdividendspershare) {
		this.annualdividendspershare = annualdividendspershare;
	}

	/**
	 * @return the annualDividend
	 */
	public double getAnnualDividend() {
		return annualDividend;
	}
	/**
	 * @param annualDividend the annualDividend to set
	 */
	public void setAnnualDividend(double annualDividend) {
		this.annualDividend = annualDividend;
	}
	


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Stock [stockprice=" + stockprice + ", earningspershare=" + earningspershare
				+ ", annualdividendspershare=" + annualdividendspershare + "]";
	}
}
