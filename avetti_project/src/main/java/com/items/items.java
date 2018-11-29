package com.items;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Table;;

@Entity
@Table(appliesTo = "")
public class items  {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)// for auto incrementation
	private int itemId;
	@Column
	private int vId;
	@Column
	private String itemCode;
	@Column
	private String itemTitle;
	@Column
	private String itemdesc;
	//@Column
	//private String itemImage;
	
	public  items(){}
	
	
	public items(int itemId, int vId, String itemCode, String itemTitle, String itemdesc) {
		super();
		this.itemId = itemId;
		this.vId = vId;
		this.itemCode = itemCode;
		this.itemTitle = itemTitle;
		this.itemdesc = itemdesc;
		//this.itemImage = itemImage;
	}


	public int getItemId() {
		return itemId;
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
	/*public String getItemImage() {
		return itemImage;
	}
	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}*/
	
	

	
	
}


