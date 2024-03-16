package my.com.cmg.iwp.backend.model.integration.spub;

// default package
// Generated Nov 5, 2012 10:47:34 AM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * PhSpubHdrsInt generated by hbm2java
 */
@Entity
@Table(name = "t_spub_hdrs_int")
@XmlRootElement(name = "SpubHdrsInt")
@JsonIgnoreProperties(ignoreUnknown=true)
public class SpubHdrsInt implements java.io.Serializable {

	private long spubHdrSeqno;
	private Integer version;
	private String ptjCode;
	private String facCode;
	private String patientId;
	private String patientIdType;
	private String spubNo;
	private String contactPersonFrom;
	private String contactNoFrom;
	private String extNoFrom;
	private String faxNoFrom;
	private Date nextColDate;
	private String remarks;
	private String referredTo;
	private String referredPtjTo;
	private String contactPersonTo;
	private String contactNoTo;
	private String extNoTo;
	private String faxNoTo;
	private String counsellingYn;
	private String sendFlag;
	private Date nextColDateTo;
	private String dotYn;
	private String takeAwayYn;
	private Long orderSeqno;
	private String parameter1;
	private String parameter2;
	private BigDecimal parameter3;
	private BigDecimal parameter4;
	private Date parameter5;
	private String activeFlag;
	private String nationality;
	private String patientName;
	private Date patientDob;
	private String patientGender;
	private String patientMrn;
	private String visitNumber;
	private Date visitDate;
	private BigDecimal height;
	private BigDecimal weight;
	private String religion;
	private String patientAddress1;
	private String patientAddress2;
	private String patientAddress3;
	private String city;
	private String state;
	private String country;
	private String mobileContactNo;
	private String homeContactNo;
	private String officeContactNo;
	private String orderType;
	private String orderNumber;
	private Date requestDate;
	private String status;
	private Long createdBy;
	private Date createdDate;
	private Long updatedBy;
	private Date updatedDate;
	private String originalPrescriberName;
	private String referredFrom;
	private Character isMethadone;
	private Date spubDateFrom;
	private Date spubDateTo;
	private Set<SpubAllergiesInt> spubAllergiesInts = new HashSet<SpubAllergiesInt>(
			0);
	private Set<SpubDtlsInt> spubDtlsInts = new HashSet<SpubDtlsInt>(0);
	private Set<SpubDiagnosisInt> spubDiagnosisInts = new HashSet<SpubDiagnosisInt>(
			0);
	private String otherIdno;
	private String otherIdType;
	
	private String refPatientMrn;
	
	private String spubType;
	private Character spubStatus;
	private Character spubRegistered;
	private Date orderDate;
	private String originalPharmacistName;
	private String departmentName;
	private String designation;
	
	private String pharmacistDesignation;
	
	
	public SpubHdrsInt() {
	}

	public SpubHdrsInt(long spubHdrSeqno) {
		this.spubHdrSeqno = spubHdrSeqno;
	}

	public SpubHdrsInt(long spubHdrSeqno, String ptjCode, String facCode,
			String patientId, String patientIdType, String spubNo,
			String contactPersonFrom, String contactNoFrom, String extNoFrom,
			String faxNoFrom, Date nextColDate, String remarks,
			String referredTo, String referredPtjTo, String contactPersonTo,
			String contactNoTo, String extNoTo, String faxNoTo,
			String counsellingYn, Date nextColDateTo, String dotYn,
			String takeAwayYn, Long orderSeqno, String parameter1,
			String parameter2, BigDecimal parameter3, BigDecimal parameter4,
			Date parameter5, String activeFlag, String nationality,
			String patientName, Date patientDob, String patientGender,
			String patientMrn, String visitNumber, Date visitDate,
			BigDecimal height, BigDecimal weight, String religion,
			String patientAddress1, String patientAddress2,
			String patientAddress3, String city, String state, String country,
			String mobileContactNo, String homeContactNo,
			String officeContactNo, String orderType, String orderNumber,
			Date requestDate, String status, Long createdBy, Date createdDate,
			Long updatedBy, Date updatedDate,
			Set<SpubAllergiesInt> spubAllergiesInts,
			Set<SpubDtlsInt> spubDtlsInts,
			Set<SpubDiagnosisInt> spubDiagnosisInts) {
		this.spubHdrSeqno = spubHdrSeqno;
		this.ptjCode = ptjCode;
		this.facCode = facCode;
		this.patientId = patientId;
		this.patientIdType = patientIdType;
		this.spubNo = spubNo;
		this.contactPersonFrom = contactPersonFrom;
		this.contactNoFrom = contactNoFrom;
		this.extNoFrom = extNoFrom;
		this.faxNoFrom = faxNoFrom;
		this.nextColDate = nextColDate;
		this.remarks = remarks;
		this.referredTo = referredTo;
		this.referredPtjTo = referredPtjTo;
		this.contactPersonTo = contactPersonTo;
		this.contactNoTo = contactNoTo;
		this.extNoTo = extNoTo;
		this.faxNoTo = faxNoTo;
		this.counsellingYn = counsellingYn;
		this.nextColDateTo = nextColDateTo;
		this.dotYn = dotYn;
		this.takeAwayYn = takeAwayYn;
		this.orderSeqno = orderSeqno;
		this.parameter1 = parameter1;
		this.parameter2 = parameter2;
		this.parameter3 = parameter3;
		this.parameter4 = parameter4;
		this.parameter5 = parameter5;
		this.activeFlag = activeFlag;
		this.nationality = nationality;
		this.patientName = patientName;
		this.patientDob = patientDob;
		this.patientGender = patientGender;
		this.patientMrn = patientMrn;
		this.visitNumber = visitNumber;
		this.visitDate = visitDate;
		this.height = height;
		this.weight = weight;
		this.religion = religion;
		this.patientAddress1 = patientAddress1;
		this.patientAddress2 = patientAddress2;
		this.patientAddress3 = patientAddress3;
		this.city = city;
		this.state = state;
		this.country = country;
		this.mobileContactNo = mobileContactNo;
		this.homeContactNo = homeContactNo;
		this.officeContactNo = officeContactNo;
		this.orderType = orderType;
		this.orderNumber = orderNumber;
		this.requestDate = requestDate;
		this.status = status;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.spubAllergiesInts = spubAllergiesInts;
		this.spubDtlsInts = spubDtlsInts;
		this.spubDiagnosisInts = spubDiagnosisInts;
	}

	@Id
	@Column(name = "spub_hdr_seqno", unique = true, nullable = false)
	@SequenceGenerator(name = "spub_hdr_seqno", sequenceName = "t_spub_hdrs_int_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "spub_hdr_seqno")
	public long getSpubHdrSeqno() {
		return this.spubHdrSeqno;
	}

	public void setSpubHdrSeqno(long spubHdrSeqno) {
		this.spubHdrSeqno = spubHdrSeqno;
	}

	@Version
	@Column(name = "version")
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name = "ptj_code", length = 100)
	public String getPtjCode() {
		return this.ptjCode;
	}

	public void setPtjCode(String ptjCode) {
		this.ptjCode = ptjCode;
	}

	@Column(name = "fac_code", length = 50)
	public String getFacCode() {
		return this.facCode;
	}

	public void setFacCode(String facCode) {
		this.facCode = facCode;
	}

	@Column(name = "patient_id", length = 20)
	public String getPatientId() {
		return this.patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	@Column(name = "patient_id_type", length = 20)
	public String getPatientIdType() {
		return this.patientIdType;
	}

	public void setPatientIdType(String patientIdType) {
		this.patientIdType = patientIdType;
	}

	@Column(name = "spub_no", length = 20)
	public String getSpubNo() {
		return this.spubNo;
	}

	public void setSpubNo(String spubNo) {
		this.spubNo = spubNo;
	}

	@Column(name = "contact_person_from")
	public String getContactPersonFrom() {
		return this.contactPersonFrom;
	}

	public void setContactPersonFrom(String contactPersonFrom) {
		this.contactPersonFrom = contactPersonFrom;
	}

	@Column(name = "contact_no_from", length = 20)
	public String getContactNoFrom() {
		return this.contactNoFrom;
	}

	public void setContactNoFrom(String contactNoFrom) {
		this.contactNoFrom = contactNoFrom;
	}

	@Column(name = "ext_no_from", length = 50)
	public String getExtNoFrom() {
		return this.extNoFrom;
	}

	public void setExtNoFrom(String extNoFrom) {
		this.extNoFrom = extNoFrom;
	}

	@Column(name = "fax_no_from", length = 50)
	public String getFaxNoFrom() {
		return this.faxNoFrom;
	}

	public void setFaxNoFrom(String faxNoFrom) {
		this.faxNoFrom = faxNoFrom;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "next_col_date", length = 29)
	public Date getNextColDate() {
		return this.nextColDate;
	}

	public void setNextColDate(Date nextColDate) {
		this.nextColDate = nextColDate;
	}

	@Column(name = "remarks", length = 300)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "referred_to", length = 50)
	public String getReferredTo() {
		return this.referredTo;
	}

	public void setReferredTo(String referredTo) {
		this.referredTo = referredTo;
	}

	@Column(name = "referred_ptj_to", length = 100)
	public String getReferredPtjTo() {
		return this.referredPtjTo;
	}

	public void setReferredPtjTo(String referredPtjTo) {
		this.referredPtjTo = referredPtjTo;
	}

	@Column(name = "contact_person_to")
	public String getContactPersonTo() {
		return this.contactPersonTo;
	}

	public void setContactPersonTo(String contactPersonTo) {
		this.contactPersonTo = contactPersonTo;
	}

	@Column(name = "contact_no_to", length = 20)
	public String getContactNoTo() {
		return this.contactNoTo;
	}

	public void setContactNoTo(String contactNoTo) {
		this.contactNoTo = contactNoTo;
	}

	@Column(name = "ext_no_to", length = 50)
	public String getExtNoTo() {
		return this.extNoTo;
	}

	public void setExtNoTo(String extNoTo) {
		this.extNoTo = extNoTo;
	}

	@Column(name = "fax_no_to", length = 50)
	public String getFaxNoTo() {
		return this.faxNoTo;
	}

	public void setFaxNoTo(String faxNoTo) {
		this.faxNoTo = faxNoTo;
	}

	@Column(name = "counselling_yn", length = 1)
	public String getCounsellingYn() {
		return this.counsellingYn;
	}

	public void setCounsellingYn(String counsellingYn) {
		this.counsellingYn = counsellingYn;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "next_col_date_to", length = 29)
	public Date getNextColDateTo() {
		return this.nextColDateTo;
	}

	public void setNextColDateTo(Date nextColDateTo) {
		this.nextColDateTo = nextColDateTo;
	}

	@Column(name = "dot_yn", length = 1)
	public String getDotYn() {
		return this.dotYn;
	}

	public void setDotYn(String dotYn) {
		this.dotYn = dotYn;
	}

	@Column(name = "take_away_yn", length = 1)
	public String getTakeAwayYn() {
		return this.takeAwayYn;
	}

	public void setTakeAwayYn(String takeAwayYn) {
		this.takeAwayYn = takeAwayYn;
	}

	@Column(name = "order_seqno")
	public Long getOrderSeqno() {
		return this.orderSeqno;
	}

	public void setOrderSeqno(Long orderSeqno) {
		this.orderSeqno = orderSeqno;
	}

	@Column(name = "parameter1", length = 50)
	public String getParameter1() {
		return this.parameter1;
	}

	public void setParameter1(String parameter1) {
		this.parameter1 = parameter1;
	}

	@Column(name = "parameter2", length = 50)
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

	@Column(name = "active_flag", length = 1)
	public String getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	@Column(name = "nationality", length = 50)
	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Column(name = "patient_name")
	public String getPatientName() {
		return this.patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "patient_dob", length = 13)
	public Date getPatientDob() {
		return this.patientDob;
	}

	public void setPatientDob(Date patientDob) {
		this.patientDob = patientDob;
	}

	@Column(name = "patient_gender", length = 1)
	public String getPatientGender() {
		return this.patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	@Column(name = "patient_mrn", length = 20)
	public String getPatientMrn() {
		return this.patientMrn;
	}

	public void setPatientMrn(String patientMrn) {
		this.patientMrn = patientMrn;
	}

	@Column(name = "visit_number", length = 20)
	public String getVisitNumber() {
		return this.visitNumber;
	}

	public void setVisitNumber(String visitNumber) {
		this.visitNumber = visitNumber;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "visit_date", length = 13)
	public Date getVisitDate() {
		return this.visitDate;
	}

	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}

	@Column(name = "height", precision = 5)
	public BigDecimal getHeight() {
		return this.height;
	}

	public void setHeight(BigDecimal height) {
		this.height = height;
	}

	@Column(name = "weight", precision = 5)
	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	@Column(name = "religion", length = 20)
	public String getReligion() {
		return this.religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	@Column(name = "patient_address1", length = 100)
	public String getPatientAddress1() {
		return this.patientAddress1;
	}

	public void setPatientAddress1(String patientAddress1) {
		this.patientAddress1 = patientAddress1;
	}

	@Column(name = "patient_address2", length = 100)
	public String getPatientAddress2() {
		return this.patientAddress2;
	}

	public void setPatientAddress2(String patientAddress2) {
		this.patientAddress2 = patientAddress2;
	}

	@Column(name = "patient_address3", length = 100)
	public String getPatientAddress3() {
		return this.patientAddress3;
	}

	public void setPatientAddress3(String patientAddress3) {
		this.patientAddress3 = patientAddress3;
	}

	@Column(name = "city", length = 100)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "state", length = 20)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "country", length = 20)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "mobile_contact_no", length = 20)
	public String getMobileContactNo() {
		return this.mobileContactNo;
	}

	public void setMobileContactNo(String mobileContactNo) {
		this.mobileContactNo = mobileContactNo;
	}

	@Column(name = "home_contact_no", length = 20)
	public String getHomeContactNo() {
		return this.homeContactNo;
	}

	public void setHomeContactNo(String homeContactNo) {
		this.homeContactNo = homeContactNo;
	}

	@Column(name = "office_contact_no", length = 20)
	public String getOfficeContactNo() {
		return this.officeContactNo;
	}

	public void setOfficeContactNo(String officeContactNo) {
		this.officeContactNo = officeContactNo;
	}

	@Column(name = "order_type", length = 20)
	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	@Column(name = "order_number", length = 20)
	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "request_date", length = 13)
	public Date getRequestDate() {
		return this.requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	@Column(name = "status", length = 15)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "created_by")
	public Long getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", length = 29)
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

	@OneToMany(mappedBy = "spubHdrsInt")
	@XmlElement
	@JsonManagedReference("SpubAllergiesInt")
	public Set<SpubAllergiesInt> getSpubAllergiesInts() {
		return this.spubAllergiesInts;
	}

	public void setSpubAllergiesInts(Set<SpubAllergiesInt> spubAllergiesInts) {
		this.spubAllergiesInts = spubAllergiesInts;
	}

	@OneToMany(mappedBy = "spubHdrsInt")
	@XmlElement
	@JsonManagedReference("SpubDtlsInt")
	public Set<SpubDtlsInt> getSpubDtlsInts() {
		return this.spubDtlsInts;
	}

	public void setSpubDtlsInts(Set<SpubDtlsInt> spubDtlsInts) {
		this.spubDtlsInts = spubDtlsInts;
	}

	@OneToMany(mappedBy = "spubHdrsInt")
	@XmlElement
	@JsonManagedReference("SpubDiagnosisInt")
	public Set<SpubDiagnosisInt> getSpubDiagnosisInts() {
		return this.spubDiagnosisInts;
	}

	public void setSpubDiagnosisInts(Set<SpubDiagnosisInt> spubDiagnosisInts) {
		this.spubDiagnosisInts = spubDiagnosisInts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (this.spubHdrSeqno ^ this.spubHdrSeqno >>> 32);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		SpubHdrsInt other = (SpubHdrsInt) obj;
		if (this.spubHdrSeqno != other.spubHdrSeqno) {
			return false;
		}
		return true;
	}

	@Column(name = "send_flag", length = 1)
	public String getSendFlag() {
		return this.sendFlag;
	}

	public void setSendFlag(String sendFlag) {
		this.sendFlag = sendFlag;
	}

	@Column(name="original_prescriber_name")
	public String getOriginalPrescriberName() {
		return this.originalPrescriberName;
	}

	public void setOriginalPrescriberName(String originalPrescriberName) {
		this.originalPrescriberName = originalPrescriberName;
	}

	@Column(name="referred_from")
	public String getReferredFrom() {
		return this.referredFrom;
	}

	public void setReferredFrom(String referredFrom) {
		this.referredFrom = referredFrom;
	}
	
	@Column(name="other_id_type")
	public String getOtherIdType() {
		return otherIdType;
	}

	public void setOtherIdType(String otherIdType) {
		this.otherIdType = otherIdType;
	}

	@Column(name="order_idno")
	public String getOtherIdno() {
		return otherIdno;
	}

	public void setOtherIdno(String otherIdno) {
		this.otherIdno = otherIdno;
	}
	
	@Column(name = "ref_patient_mrn")
	public String getRefPatientMrn() {
		return refPatientMrn;
	}

	public void setRefPatientMrn(String refPatientMrn) {
		this.refPatientMrn = refPatientMrn;
	}
	
	@Column(name = "is_methadone")
	public Character getIsMethadone() {
		return isMethadone;
	}

	public void setIsMethadone(Character isMethadone) {
		this.isMethadone = isMethadone;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "spub_date_from", length = 29)
	public Date getSpubDateFrom() {
		return spubDateFrom;
	}

	public void setSpubDateFrom(Date spubDateFrom) {
		this.spubDateFrom = spubDateFrom;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "spub_date_to", length = 29)
	public Date getSpubDateTo() {
		return spubDateTo;
	}

	public void setSpubDateTo(Date spubDateTo) {
		this.spubDateTo = spubDateTo;
	}
	
	@Column(name = "spub_type")
	public String getSpubType() {
		return spubType;
	}

	public void setSpubType(String spubType) {
		this.spubType = spubType;
	}
	
	@Column(name = "spub_status")
	public Character getSpubStatus() {
		return spubStatus;
	}

	public void setSpubStatus(Character spubStatus) {
		this.spubStatus = spubStatus;
	}

	@Column(name = "spub_registered")
	public Character getSpubRegistered() {
		return spubRegistered;
	}

	public void setSpubRegistered(Character spubRegistered) {
		this.spubRegistered = spubRegistered;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "order_date", length = 29)
	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	@Column(name = "original_pharmacist_name")
	public String getOriginalPharmacistName() {
		return originalPharmacistName;
	}

	public void setOriginalPharmacistName(String originalPharmacistName) {
		this.originalPharmacistName = originalPharmacistName;
	}
	
	@Column(name = "department_name")
	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	@Column(name = "designation")
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Column(name = "pharmacist_designation")
	public String getPharmacistDesignation() {
		return pharmacistDesignation;
	}

	public void setPharmacistDesignation(String pharmacistDesignation) {
		this.pharmacistDesignation = pharmacistDesignation;
	}
	
	
	
	
}