package com.sist.dao;

import lombok.Getter;
import lombok.Setter;

/*
 *	NO      NOT NULL NUMBER         
	CNO              NUMBER         
	TITLE   NOT NULL VARCHAR2(200)  
	SCORE   NOT NULL NUMBER(2,1)    
	ADDRESS NOT NULL VARCHAR2(200)  
	TEL     NOT NULL VARCHAR2(30)   
	TYPE    NOT NULL VARCHAR2(100)  
	PRICE            VARCHAR2(100)  
	IMAGE   NOT NULL VARCHAR2(2000) 
	GOOD             NUMBER         
	SOSO             NUMBER         
	BAD              NUMBER         
	TAG              VARCHAR2(2000) 
 */
@Getter
@Setter
public class FoodVO {
	private int no,cno;
	private String title;
	private double score;
	private String address,tel,type,price,image;
	private int good,soso,bad;
	private String tag;	
	
}
