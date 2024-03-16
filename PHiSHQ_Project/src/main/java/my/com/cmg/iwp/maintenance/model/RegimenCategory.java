package my.com.cmg.iwp.maintenance.model;

// Generated 19 Mar, 2012 1:13:49 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Regimen generated by hbm2java
 */
@Entity
@Table(name = "t_regimen_category")
public class RegimenCategory implements java.io.Serializable {

	private static final long serialVersionUID = -1338283135078800949L;
	private long rgmCategorySeqno;
	private String category;
	private String type;
	private String remarks;
	private String parameter1;
	private String parameter2;
	private BigDecimal parameter3;
	private BigDecimal parameter4;
	private Date parameter5;
	private Long createdBy;
	private Date createdDate;
	private Long updatedBy;
	private Date updatedDate;
	private Character activeFlag = 'A';

	public RegimenCategory() {
	}

	public RegimenCategory(long rgmCategorySeqno, String category, String type,
			String remarks, Long createdBy, Date createdDate, Long updatedBy,
			Date updatedDate) {
		this.rgmCategorySeqno = rgmCategorySeqno;
		this.category = category;
		this.type = type;
		this.remarks = remarks;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	public RegimenCategory(long rgmCategorySeqno, String category, String type,
			String remarks, Long createdBy, Date createdDate, Long updatedBy,
			Date updatedDate, Character activeFlag) {
		super();
		this.rgmCategorySeqno = rgmCategorySeqno;
		this.category = category;
		this.type = type;
		this.remarks = remarks;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.activeFlag = activeFlag;
	}

	@Id
	@Column(name = "rgm_category_seqno", unique = true, nullable = false)
	@SequenceGenerator(name = "rgmCategorySeqnoGenerator", sequenceName = "t_regimen_category_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rgmCategorySeqnoGenerator")
	public long getRgmCategorySeqno() {
		return rgmCategorySeqno;
	}

	public void setRgmCategorySeqno(long rgmCategorySeqno) {
		this.rgmCategorySeqno = rgmCategorySeqno;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getParameter1() {
		return parameter1;
	}

	public void setParameter1(String parameter1) {
		this.parameter1 = parameter1;
	}

	public String getParameter2() {
		return parameter2;
	}

	public void setParameter2(String parameter2) {
		this.parameter2 = parameter2;
	}

	public BigDecimal getParameter3() {
		return parameter3;
	}

	public void setParameter3(BigDecimal parameter3) {
		this.parameter3 = parameter3;
	}

	public BigDecimal getParameter4() {
		return parameter4;
	}

	public void setParameter4(BigDecimal parameter4) {
		this.parameter4 = parameter4;
	}

	public Date getParameter5() {
		return parameter5;
	}

	public void setParameter5(Date parameter5) {
		this.parameter5 = parameter5;
	}

	@Column(name = "created_by", nullable = false)
	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", nullable = false, length = 29)
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "updated_by")
	public Long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_date", length = 29)
	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Column(name = "active_flag")
	public Character getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(Character activeFlag) {
		this.activeFlag = activeFlag;
	}
	
	@Override
	public int hashCode() {
		return type.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return this.type.trim().equals(((RegimenCategory)obj).getType().trim());
	}
}
