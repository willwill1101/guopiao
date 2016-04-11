package org.guopiao.bean;

public class Pinfo {
	/**
	 * 股票名字；
	 */
	private String name;
	/*
	 * 今日开盘价；
	 */
	private Long jk;
	/*
	 * 昨日收盘价；
	 */
	private Long zs;
	/**
	 * 当前价格；
	 */
	private Long dqjg;
	/**
	 * 今日最高价；
	 */
	private Long jrzg;
	/**
	 * 今日最低价；
	 */
	private Long jrzd;
	/**
	 * 竞买价，即“买一”报价；
	 */
	private Long jmj;
	/**
	 * 竞卖价，即“卖一”报价；
	 */
	private Long jm2j;
	/**
	 * 成交的股票数，由于股票交易以一百股为基本单位，所以在使用时，通常把该值除以一百；
	 */
	private Long cjs;
	/**
	 * 成交金额，单位为“元”，为了一目了然，通常以“万元”为成交金额的单位，所以通常把该值除以一万；
	 */
	private Long cjje;
	/**
	 * 买一”申请4695股，即47手；
	 */
	private Long mqsl1;
	/**
	 * “买一”报价；
	 */
	private Long mqbj1;
	/**
	 * 同mqsl1
	 */
	private Long mqsl2;
	/**
	 * 同mqbj1
	 */
	private Long mqbj2;
	/**
	 * 同mqsl1
	 */
	private Long mqsl3;
	/**
	 * 同mqbj1
	 */
	private Long mqbj3;
	/**
	 * 同mqsl1
	 */
	private Long mqsl4;
	/**
	 * 同mqbj1
	 */
	private Long mqbj4;
	/**
	 * 同mqsl1
	 */
	private Long mqsl5;
	/**
	 * 同mqbj1
	 */
	private Long mqbj5;
	/**
	 * “卖一”申报3100股，即31手；
	 */
	private Long m2qsl1;
	/**
	 * “卖一”报价
	 */
	private Long m2qbj1;
	/**
	 * 同m2qsl1
	 */
	private Long m2qsl2;
	/**
	 * 同m2qbj1
	 */
	private Long m2qbj2;
	/**
	 * 同m2qsl1
	 */
	private Long m2qsl3;
	/**
	 * 同m2qbj1
	 */
	private Long m2qbj3;
	/**
	 * 同m2qsl1
	 */
	private Long m2qsl4;
	/**
	 *  同m2qbj1
	 */
	private Long m2qbj4;
	/**
	 * 同m2qsl1
	 */
	private Long m2qsl5;
	/**
	 *  同m2qbj1
	 */
	private Long m2qbj5;
	/**
	 * 日期 ”2008-01-11″，日期；
	 */
	private String rq;
	/**
	 * ”15:05:32″，时间；
	 */
	private String sj;
	
	
	
	
	public Pinfo(String name, Long jk, Long zs, Long dqjg, Long jrzg, Long jrzd, Long jmj, Long jm2j, Long cjs,
			Long cjje, Long mqsl1, Long mqbj1, Long mqsl2, Long mqbj2, Long mqsl3, Long mqbj3, Long mqsl4, Long mqbj4,
			Long mqsl5, Long mqbj5, Long m2qsl1, Long m2qbj1, Long m2qsl2, Long m2qbj2, Long m2qsl3, Long m2qbj3,
			Long m2qsl4, Long m2qbj4, Long m2qsl5, Long m2qbj5, String rq, String sj) {
		super();
		this.name = name;
		this.jk = jk;
		this.zs = zs;
		this.dqjg = dqjg;
		this.jrzg = jrzg;
		this.jrzd = jrzd;
		this.jmj = jmj;
		this.jm2j = jm2j;
		this.cjs = cjs;
		this.cjje = cjje;
		this.mqsl1 = mqsl1;
		this.mqbj1 = mqbj1;
		this.mqsl2 = mqsl2;
		this.mqbj2 = mqbj2;
		this.mqsl3 = mqsl3;
		this.mqbj3 = mqbj3;
		this.mqsl4 = mqsl4;
		this.mqbj4 = mqbj4;
		this.mqsl5 = mqsl5;
		this.mqbj5 = mqbj5;
		this.m2qsl1 = m2qsl1;
		this.m2qbj1 = m2qbj1;
		this.m2qsl2 = m2qsl2;
		this.m2qbj2 = m2qbj2;
		this.m2qsl3 = m2qsl3;
		this.m2qbj3 = m2qbj3;
		this.m2qsl4 = m2qsl4;
		this.m2qbj4 = m2qbj4;
		this.m2qsl5 = m2qsl5;
		this.m2qbj5 = m2qbj5;
		this.rq = rq;
		this.sj = sj;
	}
	
	
	public Pinfo() {
		super();
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getJk() {
		return jk;
	}
	public void setJk(Long jk) {
		this.jk = jk;
	}
	public Long getZs() {
		return zs;
	}
	public void setZs(Long zs) {
		this.zs = zs;
	}
	public Long getDqjg() {
		return dqjg;
	}
	public void setDqjg(Long dqjg) {
		this.dqjg = dqjg;
	}
	public Long getJrzg() {
		return jrzg;
	}
	public void setJrzg(Long jrzg) {
		this.jrzg = jrzg;
	}
	public Long getJrzd() {
		return jrzd;
	}
	public void setJrzd(Long jrzd) {
		this.jrzd = jrzd;
	}
	public Long getJmj() {
		return jmj;
	}
	public void setJmj(Long jmj) {
		this.jmj = jmj;
	}
	public Long getJm2j() {
		return jm2j;
	}
	public void setJm2j(Long jm2j) {
		this.jm2j = jm2j;
	}
	public Long getCjs() {
		return cjs;
	}
	public void setCjs(Long cjs) {
		this.cjs = cjs;
	}
	public Long getCjje() {
		return cjje;
	}
	public void setCjje(Long cjje) {
		this.cjje = cjje;
	}
	public Long getMqsl1() {
		return mqsl1;
	}
	public void setMqsl1(Long mqsl1) {
		this.mqsl1 = mqsl1;
	}
	public Long getMqbj1() {
		return mqbj1;
	}
	public void setMqbj1(Long mqbj1) {
		this.mqbj1 = mqbj1;
	}
	public Long getMqsl2() {
		return mqsl2;
	}
	public void setMqsl2(Long mqsl2) {
		this.mqsl2 = mqsl2;
	}
	public Long getMqbj2() {
		return mqbj2;
	}
	public void setMqbj2(Long mqbj2) {
		this.mqbj2 = mqbj2;
	}
	public Long getMqsl3() {
		return mqsl3;
	}
	public void setMqsl3(Long mqsl3) {
		this.mqsl3 = mqsl3;
	}
	public Long getMqbj3() {
		return mqbj3;
	}
	public void setMqbj3(Long mqbj3) {
		this.mqbj3 = mqbj3;
	}
	public Long getMqsl4() {
		return mqsl4;
	}
	public void setMqsl4(Long mqsl4) {
		this.mqsl4 = mqsl4;
	}
	public Long getMqbj4() {
		return mqbj4;
	}
	public void setMqbj4(Long mqbj4) {
		this.mqbj4 = mqbj4;
	}
	public Long getMqsl5() {
		return mqsl5;
	}
	public void setMqsl5(Long mqsl5) {
		this.mqsl5 = mqsl5;
	}
	public Long getMqbj5() {
		return mqbj5;
	}
	public void setMqbj5(Long mqbj5) {
		this.mqbj5 = mqbj5;
	}
	public Long getM2qsl1() {
		return m2qsl1;
	}
	public void setM2qsl1(Long m2qsl1) {
		this.m2qsl1 = m2qsl1;
	}
	public Long getM2qbj1() {
		return m2qbj1;
	}
	public void setM2qbj1(Long m2qbj1) {
		this.m2qbj1 = m2qbj1;
	}
	public Long getM2qsl2() {
		return m2qsl2;
	}
	public void setM2qsl2(Long m2qsl2) {
		this.m2qsl2 = m2qsl2;
	}
	public Long getM2qbj2() {
		return m2qbj2;
	}
	public void setM2qbj2(Long m2qbj2) {
		this.m2qbj2 = m2qbj2;
	}
	public Long getM2qsl3() {
		return m2qsl3;
	}
	public void setM2qsl3(Long m2qsl3) {
		this.m2qsl3 = m2qsl3;
	}
	public Long getM2qbj3() {
		return m2qbj3;
	}
	public void setM2qbj3(Long m2qbj3) {
		this.m2qbj3 = m2qbj3;
	}
	public Long getM2qsl4() {
		return m2qsl4;
	}
	public void setM2qsl4(Long m2qsl4) {
		this.m2qsl4 = m2qsl4;
	}
	public Long getM2qbj4() {
		return m2qbj4;
	}
	public void setM2qbj4(Long m2qbj4) {
		this.m2qbj4 = m2qbj4;
	}
	public Long getM2qsl5() {
		return m2qsl5;
	}
	public void setM2qsl5(Long m2qsl5) {
		this.m2qsl5 = m2qsl5;
	}
	public Long getM2qbj5() {
		return m2qbj5;
	}
	public void setM2qbj5(Long m2qbj5) {
		this.m2qbj5 = m2qbj5;
	}
	public String getRq() {
		return rq;
	}
	public void setRq(String rq) {
		this.rq = rq;
	}
	public String getSj() {
		return sj;
	}
	public void setSj(String sj) {
		this.sj = sj;
	}
	
	
	
	
	
}
