// default package
// Generated Jul 16, 2012 2:26:41 PM by Hibernate Tools 3.4.0.CR1
package my.com.cmg.iwp.maintenance.model;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PhFormulationSop generated by hbm2java
 */
@Entity
@Table(name = "t_formulation_sop_audit")
public class FormulationSopAudit implements java.io.Serializable {

	private long formulaSopSeqno;
	private FormulationHeader formulationHeader;

	private String formulaItemCode;
	private Byte versionNum;
	private Short seqNo;
	private String taskDesc;
	private String parameter1;
	private String parameter2;
	private BigDecimal parameter3;
	private BigDecimal parameter4;
	private Date parameter5;
	private Character activeFlag = 'A';
	private long createdBy;
	private Date createdDate;
	private long updatedBy;
	private Date updatedDate;

	public FormulationSopAudit() {
	}

	public FormulationSopAudit(long formulaSopSeqno,
			FormulationHeader phFormulationHeader, long createdBy,
			Date createdDate, long updatedBy, Date updatedDate) {
		this.formulaSopSeqno = formulaSopSeqno;
		this.formulationHeader = phFormulationHeader;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	public FormulationSopAudit(long formulaSopSeqno,
			FormulationHeader phFormulationHeader, String formulaItemCode,
			Byte versionNum, Short seqNo, String taskDesc, String parameter1,
			String parameter2, BigDecimal parameter3, BigDecimal parameter4,
			Date parameter5, Character activeFlag, long createdBy,
			Date createdDate, long updatedBy, Date updatedDate) {
		this.formulaSopSeqno = formulaSopSeqno;
		this.formulationHeader = phFormulationHeader;
		this.formulaItemCode = formulaItemCode;
		this.versionNum = versionNum;
		this.seqNo = seqNo;
		this.taskDesc = taskDesc;
		this.parameter1 = parameter1;
		this.parameter2 = parameter2;
		this.parameter3 = parameter3;
		this.parameter4 = parameter4;
		this.parameter5 = parameter5;
		this.activeFlag = activeFlag;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	@Id
	@Column(name = "formula_sop_seqno", unique = true, nullable = false)
	public long getFormulaSopSeqno() {
		return this.formulaSopSeqno;
	}

	public void setFormulaSopSeqno(long formulaSopSeqno) {
		this.formulaSopSeqno = formulaSopSeqno;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "formula_seqno", nullable = false)
	public FormulationHeader getFormulationHeader() {
		return formulationHeader;
	}

	public void setFormulationHeader(FormulationHeader formulationHeader) {
		this.formulationHeader = formulationHeader;
	}

	@Column(name = "formula_item_code", length = 20)
	public String getFormulaItemCode() {
		return this.formulaItemCode;
	}

	public void setFormulaItemCode(String formulaItemCode) {
		this.formulaItemCode = formulaItemCode;
	}

	@Column(name = "version_num", precision = 2, scale = 0)
	public Byte getVersionNum() {
		return this.versionNum;
	}

	public void setVersionNum(Byte versionNum) {
		this.versionNum = versionNum;
	}

	@Column(name = "seq_no", precision = 3, scale = 0)
	public Short getSeqNo() {
		return this.seqNo;
	}

	public void setSeqNo(Short seqNo) {
		this.seqNo = seqNo;
	}

	@Column(name = "task_desc", length = 90)
	public String getTaskDesc() {
		return this.taskDesc;
	}

	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
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

	@Column(name = "created_by", nullable = false)
	public long getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", nullable = false, length = 29)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "updated_by", nullable = false)
	public long getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(long updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_date", nullable = false, length = 29)
	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}
