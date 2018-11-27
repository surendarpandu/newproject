package com.items;
import javax.persistence.Entity;
public class Items {
	private int itemId;
	private int vId;
	private String itemCode;
	private String itemTitle;
	private String itemdesc;
	private String itemImage;
	public int getItemId() {
		return itemId;
	}
	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", vId=" + vId + ", itemCode=" + itemCode + ", itemTitle=" + itemTitle
				+ ", itemdesc=" + itemdesc + ", itemImage=" + itemImage + "]";
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getvId() {
		return vId;
	}
	public void setvId(int vId) {
		this.vId = vId;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemTitle() {
		return itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}
	public String getItemdesc() {
		return itemdesc;
	}
	public void setItemdesc(String itemdesc) {
		this.itemdesc = itemdesc;
	}
	public String getItemImage() {
		return itemImage;
	}
	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}
}
