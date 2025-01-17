package com.demo.talent.domain;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Talent {

	static long TEN_DAYS = (1000 * 60 * 60 * 24 * 10);

	String name;
	Level level; 
	boolean active;
	Date recentActivityDate;

	@Id @GeneratedValue
	Long id;


	public boolean check잠수(){
		
		Date today = new Date();

		if(today.before( new Date(getRecentActivityDate().getTime() + TEN_DAYS) ) ){
			return false;
		}else
			return true;
	}



	//////// setters / getters ///

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}




	public boolean isActive() {
		return active;
	}



	public void setActive(boolean active) {
		this.active = active;
	}



	public Date getRecentActivityDate() {
		return recentActivityDate;
	}



	public void setRecentActivityDate(Date recentActivityDate) {
		this.recentActivityDate = recentActivityDate;
	}



	public Level getLevel() {
		return level;
	}



	public void setLevel(Level level) {
		this.level = level;
	}

	
	
}
