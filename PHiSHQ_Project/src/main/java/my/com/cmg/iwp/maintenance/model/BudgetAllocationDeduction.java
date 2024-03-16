package my.com.cmg.iwp.maintenance.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * PhBudgetAllocationDeduction generated by hbm2java
 */
@Entity
@Table(name = "T_BUDGET_ALLOCATION_DEDUCTION", uniqueConstraints = @UniqueConstraint(columnNames = "allocation_deduction_no"))
public class BudgetAllocationDeduction implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3837159612052799526L;
	private Long budgetAllocationDeductionSeqno = 0l;
	private CBMaster currentBudgetMasterHq;
	private String budgetType;
	private String ptj_Code;
	private String allocationDeductionNo;
	private String transactionType;
	private String warrantNo;
	private String warrantType;
	private Date warrantDate;
	private Double currentBalance;
	private Double allocationDeductionAmount;
	private Double newBalance;
	private String remarks;
	private char activeFlag;
	private String parameter1;
	private String parameter2;
	private BigDecimal parameter3;
	private BigDecimal parameter4;
	private Date parameter5;
	private SecUser createdBy;
	private Date createdDate;
	private Long updatedBy;
	private Date updatedDate;
	private String referenceNo;
	private String facilityCode;
	private String transactionStatus;
	private VoteCode voteCode;
	private Integer financialYear;
	private String rejectremarks;

	@Column(name = "finacial_year")
	public Integer getFinancialYear() {
		return this.financialYear;
	}

	public void setFinancialYear(Integer financialYear) {
		this.financialYear = financialYear;
	}
	@Id
	@Column(name = "BUDGET_ALLOC_DEDUCTION_SEQNO", unique = true, nullable = false)
	@SequenceGenerator(name = "ph_budget_allocation_deduction_seq_hq", sequenceName = "T_BUDGET_ALLOC_DEDUCTION_SEQ", allocationSize = 1)
	@GeneratedValue(generator = "ph_budget_allocation_deduction_seq_hq")
	public Long getBudgetAllocationDeductionSeqno() {
		return budgetAllocationDeductionSeqno;
	}

	public void setBudgetAllocationDeductionSeqno(
			Long budgetAllocationDeductionSeqno) {
		this.budgetAllocationDeductionSeqno = budgetAllocationDeductionSeqno;
	}
	@Column(name = "budget_type", length = 13)
	public String getBudgetType() {
		return this.budgetType;
	}
	
	public void setBudgetType(String budgetType) {
		this.budgetType = budgetType;
	}
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "CB_MSTR_SEQNO")
	public CBMaster getCurrentBudgetMasterHq() {
		return currentBudgetMasterHq;
	}

	public void setCurrentBudgetMasterHq(CBMaster currentBudgetMasterHq) {
		this.currentBudgetMasterHq = currentBudgetMasterHq;
	}

	@Column(name = "allocation_deduction_no", unique = true, nullable = false, length = 20)
	public String getAllocationDeductionNo() {
		return this.allocationDeductionNo;
	}

	public void setAllocationDeductionNo(String allocationDeductionNo) {
		this.allocationDeductionNo = allocationDeductionNo;
	}

	@Column(name = "transaction_type", length = 1)
	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	@Column(name = "warrant_no", length = 20)
	public String getWarrantNo() {
		return this.warrantNo;
	}

	public void setWarrantNo(String warrantNo) {
		this.warrantNo = warrantNo;
	}

	@Column(name = "warrant_type", length = 20)
	public String getWarrantType() {
		return this.warrantType;
	}

	public void setWarrantType(String warrantType) {
		this.warrantType = warrantType;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "warrant_date", length = 13)
	public Date getWarrantDate() {
		return this.warrantDate;
	}

	public void setWarrantDate(Date warrantDate) {
		this.warrantDate = warrantDate;
	}

	@Column(name = "current_balance", precision = 16, scale = 4)
	public Double getCurrentBalance() {
		return this.currentBalance;
	}

	public void setCurrentBalance(Double currentBalance) {
		this.currentBalance = currentBalance;
	}

	@Column(name = "allocation_deduction_amount", precision = 16, scale = 4)
	public Double getAllocationDeductionAmount() {
		return this.allocationDeductionAmount;
	}

	public void setAllocationDeductionAmount(
			Double allocationDeductionAmount) {
		this.allocationDeductionAmount = allocationDeductionAmount;
	}

	@Column(name = "new_balance", precision = 16, scale = 4)
	public Double getNewBalance() {
		return this.newBalance;
	}

	public void setNewBalance(Double newBalance) {
		this.newBalance = newBalance;
	}

	@Column(name = "remarks", length = 50)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "active_flag", nullable = false, length = 1)
	public char getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(char activeFlag) {
		this.activeFlag = activeFlag;
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

	@ManyToOne()
	@JoinColumn(name = "created_by")
	public SecUser getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(SecUser createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", nullable = false, length = 29)
	@OrderBy
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "updated_by")
	public Long getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
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

	@Column(name = "reference_no", length = 20)
	public String getReferenceNo() {
		return this.referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	@Column(name = "source_ptj_code", nullable = false, length = 20)
	public String getPtj_Code() {
		return ptj_Code;
	}

	public void setPtj_Code(String ptj_Code) {
		this.ptj_Code = ptj_Code;
	}

	@Column(name = "facility_code", nullable = false, length = 20)
	public String getFacilityCode() {
		return facilityCode;
	}

	public void setFacilityCode(String facilityCode) {
		this.facilityCode = facilityCode;
	}
	
	@Column(name = "transaction_status", length = 20)
	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "vote_seqno")
	public VoteCode getVoteCode() {
		return voteCode;
	}

	public void setVoteCode(VoteCode voteCode) {
		this.voteCode = voteCode;
	}
	@Column(name = "reject_remark", length = 500)
	public String getRejectremarks() {
		return rejectremarks;
	}

	public void setRejectremarks(String rejectremarks) {
		this.rejectremarks = rejectremarks;
	}
}
