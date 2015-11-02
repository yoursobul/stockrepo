package com.stock.model;

import java.util.Date;

public class Trade {

	public Trade() {
		// TODO Auto-generated constructor stub
	}
private Date timestamp;

private int quantityofshares;

private double price;

private String buyorsell;

public Trade(Date timestamp, int quantityofshares, double price, String buyorsell) {
	super();
	this.timestamp = timestamp;
	this.quantityofshares = quantityofshares;
	this.price = price;
	this.buyorsell = buyorsell;
}

public Date getTimestamp() {
	return timestamp;
}

public void setTimestamp(Date timestamp) {
	this.timestamp = timestamp;
}

public int getQuantityofshares() {
	return quantityofshares;
}

public void setQuantityofshares(int quantityofshares) {
	this.quantityofshares = quantityofshares;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getBuyorsell() {
	return buyorsell;
}

public void setBuyorsell(String buyorsell) {
	this.buyorsell = buyorsell;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((buyorsell == null) ? 0 : buyorsell.hashCode());
	long temp;
	temp = Double.doubleToLongBits(price);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + quantityofshares;
	result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Trade other = (Trade) obj;
	if (buyorsell == null) {
		if (other.buyorsell != null)
			return false;
	} else if (!buyorsell.equals(other.buyorsell))
		return false;
	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
		return false;
	if (quantityofshares != other.quantityofshares)
		return false;
	if (timestamp == null) {
		if (other.timestamp != null)
			return false;
	} else if (!timestamp.equals(other.timestamp))
		return false;
	return true;
}

@Override
public String toString() {
	return "Trade [timestamp=" + timestamp + ", quantityofshares=" + quantityofshares + ", price=" + price
			+ ", buyorsell=" + buyorsell + "]";
}



}
