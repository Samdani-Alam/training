package com.sd.training.struts2.bean;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Menu  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6284148609738666529L;
	
	 @Id 
	 @GeneratedValue
	private Long menuId;
	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	private String name;
	private Long parentId;
	@Column
	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	private String href;

	@Column
	 public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	@Column
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
