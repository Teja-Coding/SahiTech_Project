// default package
// Generated Jul 16, 2012 2:26:41 PM by Hibernate Tools 3.4.0.CR1
package my.com.cmg.iwp.maintenance.model;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PhFormulationHeader generated by hbm2java
 */
@Entity
@Table(name = "t_formulation_header_audit")
public class FormulationHeaderAudit implements java.io.Serializable {

	private long formulaSeqno;
	private String formulaItemCode;
	private Byte versionNum;
	private Character status;
	private Character typeOfManufacturing;
	private Date dateModified;
	private String modifiedBy;
	private Date approvedDate;
	private String approvedBy;
	private BigDecimal formulaQty;
	private String formulaQtyUom;
	private Character quarantine;
	private String preparationType;
	private String packSize;
	private String remarks;
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
	private Set<FormulationMaterial> formulationMaterials = new HashSet<FormulationMaterial>(
			0);
	
//	private Set<WorkorderHeader> workorderHeaders = new HashSet<WorkorderHeader>(
//			0);
	
	private Set<FormulationSop> formulationSops = new HashSet<FormulationSop>(0);

	public FormulationHeaderAudit() {
	}

	public FormulationHeaderAudit(long formulaSeqno, long createdBy,
			Date createdDate, long updatedBy, Date updatedDate) {
		this.formulaSeqno = formulaSeqno;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	public FormulationHeaderAudit(long formulaSeqno, String formulaItemCode,
			Byte versionNum, Character status, Character typeOfManufacturing,
			Date dateModified, String modifiedBy, Date approvedDate,
			String approvedBy, BigDecimal formulaQty, String formulaQtyUom,
			Character quarantine, String preparationType, String packSize,
			String remarks, String parameter1, String parameter2,
			BigDecimal parameter3, BigDecimal parameter4, Date parameter5,
			Character activeFlag, long createdBy, Date createdDate,
			long updatedBy, Date updatedDate,
			Set<FormulationMaterial> phFormulationMaterialses,
			Set<FormulationSop> phFormulationSops) {
		this.formulaSeqno = formulaSeqno;
		this.formulaItemCode = formulaItemCode;
		this.versionNum = versionNum;
		this.status = status;
		this.typeOfManufacturing = typeOfManufacturing;
		this.dateModified = dateModified;
		this.modifiedBy = modifiedBy;
		this.approvedDate = approvedDate;
		this.approvedBy = approvedBy;
		this.formulaQty = formulaQty;
		this.formulaQtyUom = formulaQtyUom;
		this.quarantine = quarantine;
		this.preparationType = preparationType;
		this.packSize = packSize;
		this.remarks = remarks;
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
		this.formulationMaterials = phFormulationMaterialses;
//		this.workorderHeaders = phWorkorderHeaders;
		this.formulationSops = phFormulationSops;
	}

	@Id
	@Column(name = "formula_seqno", unique = true, nullable = false)
	public long getFormulaSeqno() {
		return this.formulaSeqno;
	}

	public void setFormulaSeqno(long formulaSeqno) {
		this.formulaSeqno = formulaSeqno;
	}

	@Column(name = "formula_item_code", length = 20)
	public String getFormulaItemCode() {
		return this.formulaItemCode;
	}

	public void setFormulaItemCode(String formulaItemCode) {
		this.formulaItemCode = formulaItemCode;
	}

	@Column(name = "version_no", precision = 2, scale = 0)
	public Byte getVersionNum() {
		return this.versionNum;
	}

	public void setVersionNum(Byte versionNum) {
		this.versionNum = versionNum;
	}

	@Column(name = "status", length = 1)
	public Character getStatus() {
		return this.status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

	@Column(name = "type_of_manufacturing", length = 1)
	public Character getTypeOfManufacturing() {
		return this.typeOfManufacturing;
	}

	public void setTypeOfManufacturing(Character typeOfManufacturing) {
		this.typeOfManufacturing = typeOfManufacturing;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_modified", length = 13)
	public Date getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	@Column(name = "modified_by", length = 10)
	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "approved_date", length = 13)
	public Date getApprovedDate() {
		return this.approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}

	@Column(name = "approved_by", length = 10)
	public String getApprovedBy() {
		return this.approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	@Column(name = "formula_qty", precision = 9, scale = 5)
	public BigDecimal getFormulaQty() {
		return this.formulaQty;
	}

	public void setFormulaQty(BigDecimal formulaQty) {
		this.formulaQty = formulaQty;
	}

	@Column(name = "formula_qty_uom", length = 4)
	public String getFormulaQtyUom() {
		return this.formulaQtyUom;
	}

	public void setFormulaQtyUom(String formulaQtyUom) {
		this.formulaQtyUom = formulaQtyUom;
	}

	@Column(name = "quarantine")
	public Character getQuarantine() {
		return this.quarantine;
	}

	public void setQuarantine(Character quarantine) {
		this.quarantine = quarantine;
	}

	@Column(name = "preparation_type", length = 3)
	public String getPreparationType() {
		return this.preparationType;
	}

	public void setPreparationType(String preparationType) {
		this.preparationType = preparationType;
	}

	@Column(name = "pack_size", length = 20)
	public String getPackSize() {
		return this.packSize;
	}

	public void setPackSize(String packSize) {
		this.packSize = packSize;
	}

	@Column(name = "remarks", length = 50)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "formulationHeader")
	public Set<FormulationMaterial> getFormulationMaterials() {
		return formulationMaterials;
	}

	public void setFormulationMaterials(
			Set<FormulationMaterial> formulationMaterials) {
		this.formulationMaterials = formulationMaterials;
	}


//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "formulationHeader")
//	public Set<WorkorderHeader> getWorkorderHeaders() {
//		return workorderHeaders;
//	}
//
//	public void setWorkorderHeaders(Set<WorkorderHeader> workorderHeaders) {
//		this.workorderHeaders = workorderHeaders;
//	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "formulationHeader")
	public Set<FormulationSop> getFormulationSops() {
		return formulationSops;
	}

	public void setFormulationSops(Set<FormulationSop> formulationSops) {
		this.formulationSops = formulationSops;
	}

}
