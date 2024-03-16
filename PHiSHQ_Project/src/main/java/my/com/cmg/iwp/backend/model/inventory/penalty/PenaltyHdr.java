package  my.com.cmg.iwp.backend.model.inventory.penalty;

// Generated May 21, 2015 10:21:47 AM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import my.com.cmg.iwp.maintenance.model.ExternalFacility;
import my.com.cmg.iwp.maintenance.model.PenaltyIncident;
import my.com.cmg.iwp.maintenance.model.PoHdr;
import my.com.cmg.iwp.maintenance.model.SecUser;
import my.com.cmg.iwp.webui.constant.RefCodeConstant;
import my.com.cmg.iwp.webui.inventory.penalty.PenaltyConstants;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;



/**
 * TPenaltyHdr generated by hbm2java
 */
@Entity
@Table(name = "T_PENALTY_HDR")
@XmlRootElement(name = "PenaltyHdr")
@JsonIgnoreProperties(ignoreUnknown=true)
public class PenaltyHdr implements java.io.Serializable {

	/** 
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long penHdrSeqno;
	private PoHdr poHdr;
	
	private Long poHdrSeqno;
	
	
	private Long rchSeqno;
	
	
	private Long rthSeqno;
	private Long penaltyIncidentSeqno;
	private PenaltyIncident penaltyIncident;
	private String penaltyIncidentCode;
	private String transactionNumber;
	private String ptjcode;
	private String hospitalcode;
//	private String category;
	private String remarks;
	private String status;
	private String method = PenaltyConstants.PENALTY_METHOD_MANUAL;
	
	private String poNo;
	private String lpoNo;
	
	private String receivedNo;
	private Date epApprovedDateTime;
	private Date receviedDateTime;
	private Date realReceviedDateTime;
	private Date expectedDeliveryDate;
	private Long recommendedDelayDays;
	private Long realDelayDays;
	private Double recommendedPenaltyAmt;
	private Double realPenaltyAmt;
	private String transportationInfo;
	private String deliveryUnit;
	private char sendToHq = RefCodeConstant.BOOLEAN_FALSE;
	private String returnSupplierNo;
	
	private String doNoReturnSuppNo;
	private Date recomNotification;
	private Date realNotification;
	private Date realDeliveryDate;
	private String methodOfNotification;
	private String invoiceNumber;
	private Date invoiceDate;
	private Double invoiceAmount;
	private Date yearEnd;
	private Date yearStartDate;
	private Character abkYn = RefCodeConstant.BOOLEAN_FALSE;
	private Date abkDate;
	private String productRecallNumberLocal;
	private String productRecallNumberHq;
	private Date hqNotificationDate;
	private String degreeProductRecall;
	private String typeOfRecall;
	private String notificationPeriod;
	private Date dateOfNotiFromSupp;
	private String notiNoOfSupp;
	private byte[] attachment;
	private char usedForVefiried=RefCodeConstant.BOOLEAN_FALSE;
	private String supplierCode;
	private String manualLpo;
	private String manualDos;
	private Date checkedDate;
	private String storLocation;
	private String createdUserName;
	private String addressOnLPO;
	private Date eGRNDate;
	private byte[] attachmentNotifi;
	private char sentToFacility=RefCodeConstant.BOOLEAN_FALSE;
	
	Set<PenaltyDtl> penaltyDtls = new HashSet<PenaltyDtl>(0);

	private String approver_designation;
	private String attachmentName;
	private String attachmentNotifName;
	private String createdUserdesignation;
	private String approvedUserName;
	private Date approvedDate;
	private Integer minPayment;
	
	public PenaltyHdr() {
	}

	public PenaltyHdr(SecUser loginUser,PenaltyIncident penaltyIncident) {
		setCreatedBy(loginUser.getId());
		setCreatedUser(loginUser);
		setCreatedUserName(loginUser.getUsrName());
		setCreatedDate(new Date());
		setUpdatedBy(loginUser.getId());
		setUpdatedUser(loginUser);
		setUpdatedDate(new Date());
		setActiveFlag(RefCodeConstant.ACTIVE_FLAG_TRUE);
		setStatus(PenaltyConstants.PENALTY_HDR_STATUS_OPEN);
		setUsedForVefiried(RefCodeConstant.BOOLEAN_FALSE);
		setSentToFacility(RefCodeConstant.BOOLEAN_FALSE);
		setPenaltyIncidentCode(penaltyIncident.getIncidentCode());
		setPenaltyIncident(penaltyIncident);
		setPenaltyIncidentSeqno(penaltyIncident.getIncidentSeqno());
		setHospitalcode(PenaltyConstants.HQ_FACILITY_CODE);
		setPtjcode(PenaltyConstants.HQ_PTJ_CODE);
		setSupplierCode(PenaltyConstants.PHARMANIAGA_LOGISTIC_SDN_BHD_DB_VALUE);
	}

	public PenaltyHdr( PenaltyIncident penaltyIncident, ExternalFacility facilityDetail, String penaltyMethod) {
		setCreatedDate(new Date());		
		setUpdatedDate(new Date());
		setActiveFlag(RefCodeConstant.ACTIVE_FLAG_TRUE);
		setStatus(PenaltyConstants.PENALTY_HDR_STATUS_OPEN);
		setUsedForVefiried(RefCodeConstant.BOOLEAN_FALSE);
		setSentToFacility(RefCodeConstant.BOOLEAN_FALSE);
		setPenaltyIncidentCode(penaltyIncident.getIncidentCode());
		setPenaltyIncident(penaltyIncident);
		setPenaltyIncidentSeqno(penaltyIncident.getIncidentSeqno());
		setMethod(penaltyMethod);
	}

	public PenaltyHdr(SecUser loginUser, PenaltyIncident penaltyIncident2,	ExternalFacility facilityDetail) {
		setCreatedBy(loginUser.getId());
		setCreatedUser(loginUser);
		setCreatedDate(new Date());
		setCreatedUserName(loginUser.getUsrName());
		setUpdatedBy(loginUser.getId());
		setUpdatedUser(loginUser);
		setUpdatedDate(new Date());
		setActiveFlag(RefCodeConstant.ACTIVE_FLAG_TRUE);
		setStatus(PenaltyConstants.PENALTY_HDR_STATUS_OPEN);
		setUsedForVefiried(RefCodeConstant.BOOLEAN_FALSE);
		setSentToFacility(RefCodeConstant.BOOLEAN_FALSE);
		setPenaltyIncidentCode(penaltyIncident2.getIncidentCode());
		setPenaltyIncident(penaltyIncident2);
		setPenaltyIncidentSeqno(penaltyIncident2.getIncidentSeqno());
		setHospitalcode(facilityDetail.getFacilityCode());
		setPtjcode(facilityDetail.getPtjCode());
	}

	@Id
	@Column(name = "P_HDR_SEQNO", unique = true, nullable = false)
	@SequenceGenerator(name = "T_PENALTY_HDR_SEQ", sequenceName = "T_PENALTY_HDR_SEQ", allocationSize  = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "T_PENALTY_HDR_SEQ")
	public long getPenHdrSeqno() {
		return penHdrSeqno;
	}

	public void setPenHdrSeqno(long penHdrSeqno) {
		this.penHdrSeqno = penHdrSeqno;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "incident_seqno")
	@JsonIgnore
	public PenaltyIncident getPenaltyIncident() {
		return penaltyIncident;
	}

	public void setPenaltyIncident(PenaltyIncident penaltyIncident) {
		this.penaltyIncident = penaltyIncident;
	}

	@Column(name = "incident_seqno", insertable= false, updatable = false)
	public Long getPenaltyIncidentSeqno() {
		return penaltyIncidentSeqno;
	}

	public void setPenaltyIncidentSeqno(Long penaltyIncidentSeqno) {
		this.penaltyIncidentSeqno = penaltyIncidentSeqno;
	}

	@Column(name = "P_INCIDENCE_CODE", nullable = false, length = 20)
	public String getPenaltyIncidentCode() {
		return penaltyIncidentCode;
	}

	public void setPenaltyIncidentCode(String penaltyIncidentCode) {
		this.penaltyIncidentCode = penaltyIncidentCode;
	}

	@Column(name = "TRANSACTION_NUMBER", nullable = false, length = 100)
	public String getTransactionNumber() {
		return this.transactionNumber;
	}

	public void setTransactionNumber(String PTransactionNumber) {
		this.transactionNumber = PTransactionNumber;
	}

	@Column(name = "PTJCODE", nullable = false, length = 15)
	public String getPtjcode() {
		return this.ptjcode;
	}

	public void setPtjcode(String ptjcode) {
		this.ptjcode = ptjcode;
	}

	@Column(name = "HOSPITALCODE", length = 20)
	public String getHospitalcode() {
		return this.hospitalcode;
	}

	public void setHospitalcode(String hospitalcode) {
		this.hospitalcode = hospitalcode;
	}


	@Column(name = "REMARKS", length = 500)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "STATUS", nullable = false, length = 1)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "METHOD", nullable = false, length = 1)
	public String getMethod() {
		return this.method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PO_HDR_SEQNO")
	@JsonIgnore
	public PoHdr getPoHdr() {
		return poHdr;
	}

	public void setPoHdr(PoHdr poHdr) {
		this.poHdr = poHdr;
	}

	@Column(name = "PO_HDR_SEQNO", precision = 22, scale = 0, insertable=false, updatable=false)
	public Long getPoHdrSeqno() {
		return this.poHdrSeqno;
	}

	public void setPoHdrSeqno(Long poHdrSeqno) {
		this.poHdrSeqno = poHdrSeqno;
	}

	@Column(name = "PO_NO", length = 100)
	public String getPoNo() {
		return this.poNo;
	}

	public void setPoNo(String poNo) {
		this.poNo = poNo;
	}

	@Column(name = "LPO_NO", length = 100)
	public String getLpoNo() {
		return this.lpoNo;
	}

	public void setLpoNo(String lpoNo) {
		this.lpoNo = lpoNo;
	}

	@Column(name = "RCH_SEQNO", insertable = false, updatable = false)
	public Long getRchSeqno() {
		return this.rchSeqno;
	}

	public void setRchSeqno(Long rchSeqno) {
		this.rchSeqno = rchSeqno;
	}


	@Column(name = "RECEIVED_NO", length = 100)
	public String getReceivedNo() {
		return this.receivedNo;
	}

	public void setReceivedNo(String receivedNo) {
		this.receivedNo = receivedNo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EP_APPROVED_DATE_TIME", length = 7)
	public Date getEpApprovedDateTime() {
		return this.epApprovedDateTime;
	}

	public void setEpApprovedDateTime(Date epApprovedDateTime) {
		this.epApprovedDateTime = epApprovedDateTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RECEVIED_DATE_TIME", length = 7)
	public Date getReceviedDateTime() {
		return this.receviedDateTime;
	}

	public void setReceviedDateTime(Date receviedDateTime) {
		this.receviedDateTime = receviedDateTime;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REAL_RECEVIED_DATE_TIME", length = 7)
	public Date getRealReceviedDateTime() {
		return this.realReceviedDateTime;
	}

	public void setRealReceviedDateTime(Date realReceviedDateTime) {
		this.realReceviedDateTime = realReceviedDateTime;
	}

	//@Temporal(TemporalType.DATE)
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "EXPECTED_DELIVERY_DATE", length = 7)
	public Date getExpectedDeliveryDate() {
		return this.expectedDeliveryDate;
	}

	public void setExpectedDeliveryDate(Date expectedDeliveryDate) {
		this.expectedDeliveryDate = expectedDeliveryDate;
	}

	@Column(name = "RECOMMENDED_DELAY_DAYS", precision = 22, scale = 0)
	public Long getRecommendedDelayDays() {
		return this.recommendedDelayDays;
	}

	public void setRecommendedDelayDays(Long recommendedDelayDays) {
		this.recommendedDelayDays = recommendedDelayDays;
	}

	@Column(name = "REAL_DELAY_DAYS", precision = 22, scale = 0)
	public Long getRealDelayDays() {
		return this.realDelayDays;
	}

	public void setRealDelayDays(Long realDelayDays) {
		this.realDelayDays = realDelayDays;
	}

	@Column(name = "RECOMMENDED_PENALTY_AMT", precision = 15)
	public Double getRecommendedPenaltyAmt() {
		return this.recommendedPenaltyAmt;
	}

	public void setRecommendedPenaltyAmt(Double recommendedPenaltyAmt) {
		this.recommendedPenaltyAmt = recommendedPenaltyAmt;
	}

	@Column(name = "REAL_PENALTY_AMT", precision = 15)
	public Double getRealPenaltyAmt() {
		return this.realPenaltyAmt;
	}

	public void setRealPenaltyAmt(Double realPenaltyAmt) {
		this.realPenaltyAmt = realPenaltyAmt;
	}

	@Column(name = "TRANSPORTATION_INFO", length = 1000)
	public String getTransportationInfo() {
		return this.transportationInfo;
	}

	public void setTransportationInfo(String transportationInfo) {
		this.transportationInfo = transportationInfo;
	}

	@Column(name = "DELIVERY_UNIT", length = 1000)
	public String getDeliveryUnit() {
		return this.deliveryUnit;
	}

	public void setDeliveryUnit(String deliveryUnit) {
		this.deliveryUnit = deliveryUnit;
	}

	@Column(name = "SEND_TO_HQ", nullable = false, length = 1)
	public char getSendToHq() {
		return this.sendToHq;
	}

	public void setSendToHq(char sendToHq) {
		this.sendToHq = sendToHq;
	}

	@Column(name = "RTH_SEQNO",insertable = false, updatable = false)
	public Long getRthSeqno() {
		return this.rthSeqno;
	}

	public void setRthSeqno(Long rthSeqno) {
		this.rthSeqno = rthSeqno;
	}
	

	@Column(name = "RETURN_SUPPLIER_NO", length = 100)
	public String getReturnSupplierNo() {
		return this.returnSupplierNo;
	}

	public void setReturnSupplierNo(String returnSupplierNo) {
		this.returnSupplierNo = returnSupplierNo;
	}

	@Column(name = "DO_NO_RETURN_SUPP_NO", length = 100)
	public String getDoNoReturnSuppNo() {
		return this.doNoReturnSuppNo;
	}

	public void setDoNoReturnSuppNo(String doNoReturnSuppNo) {
		this.doNoReturnSuppNo = doNoReturnSuppNo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "RECOM_NOTIFICATION", length = 7)
	public Date getRecomNotification() {
		return this.recomNotification;
	}

	public void setRecomNotification(Date recomNotification) {
		this.recomNotification = recomNotification;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "REAL_NOTIFICATION", length = 7)
	public Date getRealNotification() {
		return this.realNotification;
	}

	public void setRealNotification(Date realNotification) {
		this.realNotification = realNotification;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REAL_DELIVERY_DATE", length = 7)
	public Date getRealDeliveryDate() {
		return this.realDeliveryDate;
	}

	public void setRealDeliveryDate(Date realDeliveryDate) {
		this.realDeliveryDate = realDeliveryDate;
	}

	@Column(name = "METHOD_OF_NOTIFICATION", length = 1000)
	public String getMethodOfNotification() {
		return this.methodOfNotification;
	}

	public void setMethodOfNotification(String methodOfNotification) {
		this.methodOfNotification = methodOfNotification;
	}

	@Column(name = "INVOICE_NUMBER", length = 1000)
	public String getInvoiceNumber() {
		return this.invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "INVOICE_DATE", length = 7)
	public Date getInvoiceDate() {
		return this.invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	@Column(name = "INVOICE_AMOUNT", precision = 15)
	public Double getInvoiceAmount() {
		return this.invoiceAmount;
	}

	public void setInvoiceAmount(Double invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "YEAR_END", length = 7)
	public Date getYearEnd() {
		return this.yearEnd;
	}

	public void setYearEnd(Date yearEnd) {
		this.yearEnd = yearEnd;
	}

	@Column(name = "PRODUCT_RECALL_NUMBER_LOCAL", length = 100)
	public String getProductRecallNumberLocal() {
		return this.productRecallNumberLocal;
	}

	public void setProductRecallNumberLocal(String productRecallNumberLocal) {
		this.productRecallNumberLocal = productRecallNumberLocal;
	}

	@Column(name = "PRODUCT_RECALL_NUMBER_HQ", length = 100)
	public String getProductRecallNumberHq() {
		return this.productRecallNumberHq;
	}

	public void setProductRecallNumberHq(String productRecallNumberHq) {
		this.productRecallNumberHq = productRecallNumberHq;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "HQ_NOTIFICATION_DATE", length = 7)
	public Date getHqNotificationDate() {
		return this.hqNotificationDate;
	}

	public void setHqNotificationDate(Date hqNotificationDate) {
		this.hqNotificationDate = hqNotificationDate;
	}

	@Column(name = "DEGREE_PRODUCT_RECALL", length = 100)
	public String getDegreeProductRecall() {
		return this.degreeProductRecall;
	}

	public void setDegreeProductRecall(String degreeProductRecall) {
		this.degreeProductRecall = degreeProductRecall;
	}

	@Column(name = "TYPE_OF_RECALL", length = 100)
	public String getTypeOfRecall() {
		return this.typeOfRecall;
	}

	public void setTypeOfRecall(String typeOfRecall) {
		this.typeOfRecall = typeOfRecall;
	}

	@Column(name = "NOTIFICATION_PERIOD", length = 100)
	public String getNotificationPeriod() {
		return this.notificationPeriod;
	}

	public void setNotificationPeriod(String PNotificationPeriod) {
		this.notificationPeriod = PNotificationPeriod;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_OF_NOTI_FROM_SUPP", length = 7)
	public Date getDateOfNotiFromSupp() {
		return this.dateOfNotiFromSupp;
	}

	public void setDateOfNotiFromSupp(Date dateOfNotiFromSupp) {
		this.dateOfNotiFromSupp = dateOfNotiFromSupp;
	}

	@Column(name = "NOTI_NO_OF_SUPP", length = 1000)
	public String getNotiNoOfSupp() {
		return this.notiNoOfSupp;
	}

	public void setNotiNoOfSupp(String notiNoOfSupp) {
		this.notiNoOfSupp = notiNoOfSupp;
	}

	@Column(name = "ATTACHMENT")
	public byte[] getAttachment() {
		return this.attachment;
	}

	public void setAttachment(byte[] attachment) {
		this.attachment = attachment;
	}
	
	
	@Column(name = "notifi_attachment")
	public byte[] getAttachmentNotifi() {
		return attachmentNotifi;
	}

	public void setAttachmentNotifi(byte[] attachmentNoti) {
		this.attachmentNotifi = attachmentNoti;
	}

	@Column(name = "USED_FOR_VEFIRIED", nullable = false, length = 1)
	public char getUsedForVefiried() {
		return this.usedForVefiried;
	}

	public void setUsedForVefiried(char usedForVefiried) {
		this.usedForVefiried = usedForVefiried;
	}

	@Column(name = "SUPPLIER_CODE", nullable = false, length = 10)
	public String getSupplierCode() {
		return this.supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	@Column(name = "MANUAL_LPO", length = 100)
	public String getManualLpo() {
		return this.manualLpo;
	}

	public void setManualLpo(String manualLpo) {
		this.manualLpo = manualLpo;
	}

	@Column(name = "MANUAL_DOS", length = 100)
	public String getManualDos() {
		return this.manualDos;
	}

	public void setManualDos(String manualDos) {
		this.manualDos = manualDos;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CHECKED_DATE", length = 7)
	public Date getCheckedDate() {
		return this.checkedDate;
	}

	public void setCheckedDate(Date checkedDate) {
		this.checkedDate = checkedDate;
	}

	@Column(name = "STOR_LOCATION", length = 500)
	public String getStorLocation() {
		return this.storLocation;
	}

	public void setStorLocation(String storLocation) {
		this.storLocation = storLocation;
	}

	@OneToMany(fetch = FetchType.LAZY,mappedBy ="penaltyHdr",cascade=javax.persistence.CascadeType.REFRESH)
	@Cascade({CascadeType.SAVE_UPDATE,CascadeType.DELETE_ORPHAN})
	@XmlElement
	@JsonManagedReference("PenaltyDtl")
	public Set<PenaltyDtl> getPenaltyDtls() {
		return penaltyDtls;
	}

	public void setPenaltyDtls(Set<PenaltyDtl> penaltyDtls) {
		this.penaltyDtls = penaltyDtls;
	}

	@Column(name = "CREATED_USER_NAME", length = 100)
	public String getCreatedUserName() {
		return createdUserName;
	}

	public void setCreatedUserName(String createdUserName) {
		this.createdUserName = createdUserName;
	}

	
	private String parameter1;
	private String parameter2;
	private BigDecimal parameter3;
	private BigDecimal parameter4;
	private Date parameter5;
	private Character activeFlag = 'A';
	private long createdBy;
	private Date createdDate;
	private Long updatedBy;
	private Date updatedDate;

	private SecUser updatedUser;

	private SecUser createdUser;
	
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

	@Column(name = "parameter3")
	public BigDecimal getParameter3() {
		return this.parameter3;
	}

	public void setParameter3(BigDecimal parameter3) {
		this.parameter3 = parameter3;
	}

	@Column(name = "parameter4")
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

	@Column(name = "active_flag", nullable = false)
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

	@Column(name = "updated_by")
	public Long getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_date", length = 29)
	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "created_by", insertable = false, updatable = false)
	@JsonIgnore
	public SecUser getCreatedUser() {
		return this.createdUser;
	}

	public void setCreatedUser(SecUser createdUser) {
		this.createdUser = createdUser;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "updated_by", insertable = false, updatable = false)
	@JsonIgnore
	public SecUser getUpdatedUser() {
		return this.updatedUser;
	}

	public void setUpdatedUser(SecUser updatedUser) {
		this.updatedUser = updatedUser;
	}

	@Column(name = "send_to_facility", nullable = false, length = 1)
	@JsonIgnore
	public char getSentToFacility() {
		return sentToFacility;
	}

	public void setSentToFacility(char sentToFacility) {
		this.sentToFacility = sentToFacility;
	}

	@Column(name = "ADDRESS_ON_LPO", length = 200)
	public String getAddressOnLPO() {
		return addressOnLPO;
	}

	public void setAddressOnLPO(String addressOnLPO) {
		this.addressOnLPO = addressOnLPO;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "YEAR_START_DATE", length = 7)
	public Date getYearStartDate() {
		return yearStartDate;
	}

	public void setYearStartDate(Date yearStartDate) {
		this.yearStartDate = yearStartDate;
	}

	@Column(name = "ABK_YN", length = 1)
	public Character getAbkYn() {
		return abkYn;
	}

	public void setAbkYn(Character abkYn) {
		this.abkYn = abkYn;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ABK_DATE", length = 7)
	public Date getAbkDate() {
		return abkDate;
	}

	public void setAbkDate(Date abkDate) {
		this.abkDate = abkDate;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "egrn_date")
	public Date getEGRNDate() {
		return this.eGRNDate;
	}
	
	public void setEGRNDate(Date eGRNDate) {
		this.eGRNDate = eGRNDate;
	}
	@Column(name = "APPROVER_DESIGNATION", length = 100)
	public String getApprover_designation() {
		return approver_designation;
	}

	public void setApprover_designation(String approver_designation) {
		this.approver_designation = approver_designation;
	}

	@Column(name = "attachment_name")
	public String getAttachmentName() {
		return attachmentName;
	}

	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}

	@Column(name = "notifi_attachment_name")
	public String getAttachmentNotifName() {
		return attachmentNotifName;
	}

	public void setAttachmentNotifName(String attachmentNotifName) {
		this.attachmentNotifName = attachmentNotifName;
	}
	
	@Column(name = "createduser_designation")
	public String getCreatedUserdesignation() {
		return createdUserdesignation;
	}

	public void setCreatedUserdesignation(String createdUserdesignation) {
		this.createdUserdesignation = createdUserdesignation;
	}
	@Column(name = "approved_user_name")
	public String getApprovedUserName() {
		return approvedUserName;
	}

	public void setApprovedUserName(String approvedUserName) {
		this.approvedUserName = approvedUserName;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "approved_date")
	public Date getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}
	
	@Column(name = "min_payment")
	public Integer getMinPayment() {
		return minPayment;
	}

	public void setMinPayment(Integer minPayment) {
		this.minPayment = minPayment;
	}
	
}
