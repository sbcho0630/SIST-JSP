package com.sist.temp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Sawon {
	private int sabun;
	private String name;
	private String dept;
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	

	//lombok의 @AllArgsConstructor 이 하는 일
    public Sawon(int sabun, String name, String dept) {
        this.sabun = sabun;
    	this.name = name;
        this.dept = dept;
    }
	
	
}
