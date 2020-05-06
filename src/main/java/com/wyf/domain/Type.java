package com.wyf.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Type implements Serializable{

	
	    /**
	    * @Fields serialVersionUID : TODO
	    */
	    
	private static final long serialVersionUID = 1L;
	private BigInteger tid;
	private String tname;
	private BigDecimal money;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tid == null) ? 0 : tid.hashCode());
		result = prime * result + ((tname == null) ? 0 : tname.hashCode());
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
		Type other = (Type) obj;
		if (tid == null) {
			if (other.tid != null)
				return false;
		} else if (!tid.equals(other.tid))
			return false;
		if (tname == null) {
			if (other.tname != null)
				return false;
		} else if (!tname.equals(other.tname))
			return false;
		return true;
	}
	public BigInteger getTid() {
		return tid;
	}
	public void setTid(BigInteger tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Type [tid=" + tid + ", tname=" + tname + ", money=" + money + "]";
	}
	
}
