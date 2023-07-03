package kr.co.jhta.vo;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("Product")
public class Product {

	private int no;
	private String name;
	private String maker;
	private String description;
	private int price;
	private int discountPrice;
	private String onSell;
	private int stock;
	private Date updateDate;
	private Date createDate;
	private int catNo;
	private String catName;
	
	public Product() {}
	
	public String getCatName() {
		return catName;
	}
	
	public void setCatName(String catName) {
		this.catName = catName;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscountPrice() {
		return discountPrice;
	}
	public void setDiscountPrice(int discountPrice) {
		this.discountPrice = discountPrice;
	}
	public String getOnSell() {
		return onSell;
	}
	public void setOnSell(String onSell) {
		this.onSell = onSell;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getCatNo() {
		return catNo;
	}
	public void setCatNo(int catNo) {
		this.catNo = catNo;
	}
	
	
}
