package my.com.cmg.iwp.maintenance.model;

// Generated Jul 9, 2012 4:26:24 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import my.com.cmg.iwp.webui.budget.InventoryConstant;
import my.com.cmg.iwp.webui.constant.RefCodeConstant;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * ItemBrand generated by hbm2java
 */
@Entity
@Table(name = "t_item_brands")
public class ItemBrand implements java.io.Serializable {
	private static final long serialVersionUID = 3946416352210672448L;
	private long itemBrdSeqno = Long.MIN_VALUE;
	private Item item;
	private String parameter1;
	private String parameter2;
	private BigDecimal parameter3;
	private BigDecimal parameter4;
	private Date parameter5;
	private Character activeFlag = 'A';
	private long createdBy;
	private long updatedBy;
	private Date createdDate;
	private Date updatedDate;
	private Brand brand;
	private String brdStatus;
	private String brdName;
	private String regNo;
	private Character defaultFlag = RefCodeConstant.BOOLEAN_FALSE;
	private Manufacturer manufacturer;
	private Long manuSeqno;

	public ItemBrand() {
	}

	public ItemBrand(long itemBrdSeqno, long createdBy, long updatedBy,
			Date createdDate, Date updatedDate) {
		this.itemBrdSeqno = itemBrdSeqno;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public ItemBrand(long itemBrdSeqno, /* long itemSeqno, */
	String parameter1, String parameter2, BigDecimal parameter3,
			BigDecimal parameter4, Date parameter5, Character activeFlag,
			long createdBy, long updatedBy, Date createdDate, Date updatedDate) {
		this.itemBrdSeqno = itemBrdSeqno;
		this.parameter1 = parameter1;
		this.parameter2 = parameter2;
		this.parameter3 = parameter3;
		this.parameter4 = parameter4;
		this.parameter5 = parameter5;
		this.activeFlag = activeFlag;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	@Id
	@Column(name = "item_brd_seqno", unique = true, nullable = false)
	@SequenceGenerator(name = "item_brd_seqno", sequenceName = "t_item_brands_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_brd_seqno")
	public long getItemBrdSeqno() {
		return this.itemBrdSeqno;
	}

	public void setItemBrdSeqno(long itemBrdSeqno) {
		this.itemBrdSeqno = itemBrdSeqno;
	}

	@Column(name = "parameter1", length = 100)
	public String getParameter1() {
		return this.parameter1;
	}

	public void setParameter1(String parameter1) {
		this.parameter1 = parameter1;
	}

	@Column(name = "parameter2", length = 100)
	public String getParameter2() {
		return this.parameter2;
	}

	public void setParameter2(String parameter2) {
		this.parameter2 = parameter2;
	}

	@Column(name = "parameter3", precision = 8, scale = 4)
	public BigDecimal getParameter3() {
		return this.parameter3;
	}

	public void setParameter3(BigDecimal parameter3) {
		this.parameter3 = parameter3;
	}

	@Column(name = "parameter4", precision = 8, scale = 4)
	public BigDecimal getParameter4() {
		return this.parameter4;
	}

	public void setParameter4(BigDecimal parameter4) {
		this.parameter4 = parameter4;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "parameter5", length = 13)
	public Date getParameter5() {
		return this.parameter5;
	}

	public void setParameter5(Date parameter5) {
		this.parameter5 = parameter5;
	}

	@Column(name = "active_flag")
	public Character getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(Character activeFlag) {
		this.activeFlag = activeFlag;
	}

	@Column(name = "default_flag")
	public Character getDefaultFlag() {
		return this.defaultFlag;
	}

	public void setDefaultFlag(Character defaultFlag) {
		this.defaultFlag = defaultFlag;
	}
	
	@Column(name = "created_by", nullable = false)
	public long getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "updated_by", nullable = false)
	public long getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(long updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", nullable = false, length = 29)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_date", nullable = false, length = 29)
	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "brnd_seqno", nullable = false)
	@Fetch(FetchMode.JOIN)
	public Brand getBrand() {
		return this.brand;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "item_seqno")
	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public void setBrdName(String brdName) {
		this.brdName = brdName;
	}

	@Transient
	public String getBrdName() {
		return this.brdName;
	}

	public void setBrdStatus(String brdStatus) {
		this.brdStatus = brdStatus;
	}

	@Transient
	public String getBrdStatus() {
		return brdStatus;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	@Column(name = "reg_no", length = 20)
	public String getRegNo() {
		return regNo;
	}

	@JoinColumn(name = "manu_seqno")
	@ManyToOne(fetch = FetchType.LAZY)
	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setManuSeqno(Long manuSeqno) {
		this.manuSeqno = manuSeqno;
	}

	@Column(name = "manu_seqno", insertable = false, updatable = false)
	public Long getManuSeqno() {
		return manuSeqno;
	}
}