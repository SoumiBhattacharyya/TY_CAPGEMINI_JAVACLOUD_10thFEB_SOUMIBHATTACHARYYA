package com.tyss.capgemini.beans;

public class RequestBean {
	private Integer requestId;
	private Integer userID;
	private Integer assetId;
	private String title;

	private Integer quantity;
	private String status;
	private String processed;

	
	public RequestBean(Integer requestId, Integer userID, Integer assetId, String title, Integer quantity,
			String status, String processed) {
		super();
		this.requestId = requestId;
		this.userID = userID;
		this.assetId = assetId;
		this.title = title;
		this.quantity = quantity;
		this.status = status;
		this.processed = processed;
	}

	public Integer getRequestId() {
		return requestId;
	}

	public String getProcessed() {
		return processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}

	public void setRequestId(Integer requestId) {
		this.requestId = requestId;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public Integer getAssetId() {
		return assetId;
	}

	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
