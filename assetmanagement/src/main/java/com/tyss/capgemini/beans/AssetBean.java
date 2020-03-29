package com.tyss.capgemini.beans;

public class AssetBean {
	private Integer assetId;
	private String title;
	private String category;
	private Integer quantity;
	private Double price;

	

	public AssetBean(Integer assetId, String title, String category, Integer quantity, Double price) {
		super();
		this.assetId = assetId;
		this.title = title;
		this.category = category;
		this.quantity = quantity;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public Integer getAssetId() {
		return assetId;
	}

	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "AssetBean [assetId=" + assetId + ", title=" + title + ", category=" + category + ", quantity="
				+ quantity + ", price=" + price + "]";
	}

}
