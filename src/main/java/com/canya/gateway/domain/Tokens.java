//package com.canya.gateway.domain;
//
//import java.io.Serializable;
//
//import javax.persistence.Entity;
//import javax.persistence.Table;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//
//import org.springframework.data.annotation.Id;
//
///**
// * A Transaction.
// */
//
//@Entity
//@Table(name = "tokens")
//public class Tokens extends AbstractAuditingEntity implements Serializable {
//
//	private static final long serialVersionUID = 1L;
//	@Id
//	private String id;
//
//	@NotNull
//	private int tokenid;
//
//	@NotNull
//	@Size(min = 1, max = 100)
//	private String name;
//
//	@NotNull
//	@Size(min = 1, max = 100)
//	private String symbol;
//
//	@Size(min = 1, max = 100)
//	private String address;
//
//	private String decimal;
//
//	public String getDecimal() {
//		return decimal;
//	}
//
//	public void setDecimal(String decimal) {
//		this.decimal = decimal;
//	}
//
//	public int getTokenid() {
//		return tokenid;
//	}
//
//	public void setTokenid(int tokenid) {
//		this.tokenid = tokenid;
//	}
//
//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getSymbol() {
//		return symbol;
//	}
//
//	public void setSymbol(String symbol) {
//		this.symbol = symbol;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	@Override
//	public String toString() {
//		return "Tokens [id=" + id + ", tokenid=" + tokenid + ", name=" + name + ", symbol=" + symbol + ", address="
//				+ address + ", decimal=" + decimal + "]";
//	}
//
//}
