package my.com.cmg.iwp.backend.model.druglnfo;

// Generated Jun 19, 2012 12:50:11 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import my.com.cmg.iwp.webui.constant.RefCodeConstant;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * PhEnquiryDetails generated by hbm2java
 */
@Entity
@Table(name = "t_enquiry_details")
public class EnquiryDetail{

	private long phEnquirySeqno = Long.MIN_VALUE;
	private DiHdr diHdr;
	private Long enquirerSeqno;
	private Character enqTreatment;
	private Character enqRegulatory;
	private Character enqResearch;
	private Character enqEnforcement;
	private String enqOthers;
	private Character poisoning = RefCodeConstant.BOOLEAN_FALSE; // Poisoning
	private Character di = RefCodeConstant.BOOLEAN_FALSE; // Drug-Interaction
	private Character od = RefCodeConstant.BOOLEAN_FALSE; // Overdose
	private Character ae = RefCodeConstant.BOOLEAN_FALSE; // Adverse Effect
	private Character in = RefCodeConstant.BOOLEAN_FALSE; // indication
	private Character ef = RefCodeConstant.BOOLEAN_FALSE; // Efficacy
	private Character dr = RefCodeConstant.BOOLEAN_FALSE; // Dose range of frequency
	private Character ie = RefCodeConstant.BOOLEAN_FALSE; // Identificeation
	private Character tu = RefCodeConstant.BOOLEAN_FALSE; // Therapeutic use
	private Character as = RefCodeConstant.BOOLEAN_FALSE; // Availability/Substitutes
	private Character ad = RefCodeConstant.BOOLEAN_FALSE; // Administration
	private Character df = RefCodeConstant.BOOLEAN_FALSE; // Drug Formulation
	private Character dh = RefCodeConstant.BOOLEAN_FALSE; // Drug use - Renal / Hepa
	private Character dc = RefCodeConstant.BOOLEAN_FALSE; // Drugs Compatibility
	private Character du = RefCodeConstant.BOOLEAN_FALSE; // Drug use -Preg/Lact
	private Character cd = RefCodeConstant.BOOLEAN_FALSE; // Cytotoxic Drug
	private Character pk = RefCodeConstant.BOOLEAN_FALSE; // Pharmacokinetic
	private Character td = RefCodeConstant.BOOLEAN_FALSE; // Therapeutic Drug Monitoring
	private Character pn = RefCodeConstant.BOOLEAN_FALSE; // Parenteral Nutrition
	private Character pl = RefCodeConstant.BOOLEAN_FALSE; // Pharmacy Legislation
	private Character co = RefCodeConstant.BOOLEAN_FALSE; // Contraindication
	private Character re = RefCodeConstant.BOOLEAN_FALSE; // Treatment regime
	private Character oth= RefCodeConstant.BOOLEAN_FALSE; //Others 
	private String activeFlag;
	private Long createdBy;
	private Date createdDate;
	private Long updatedBy;
	private Date updatedDate;
	private String enqSummaryDetails;
	private RespondDetail respondDetail;
	private int enquiryCount = 1;

	public EnquiryDetail() {
	}

	public EnquiryDetail(DiHdr diHdr, long createdBy, Date createdDate,
			long updatedBy, Date updatedDate) {
		this.diHdr = diHdr;
									}

	public EnquiryDetail(DiHdr diHdr, Long enquirerSeqno, Character enqTreatment,
			Character enqRegulatory, Character enqResearch, Character enqEnforcement,
			String enqOthers, Character poisoning, Character di, Character od,
			Character ae, Character in, Character ef, Character dr, Character ie,
			Character tu, Character as, Character ad, Character df, Character dh,
			Character dc, Character du, Character cd, Character pk, Character pl,
			Character td, Character pn, Character co, Character re,
			String enqSummaryDetails, String parameter1, String parameter2,
			BigDecimal parameter3, BigDecimal parameter4, Date parameter5,
			Character activeFlag, long createdBy, Date createdDate,
			long updatedBy, Date updatedDate, RespondDetail respondDetail, Character oth) {
		this.diHdr = diHdr;
		this.enquirerSeqno = enquirerSeqno;
		this.enqTreatment = enqTreatment;
		this.enqRegulatory = enqRegulatory;
		this.enqResearch = enqResearch;
		this.enqEnforcement = enqEnforcement;
		this.enqOthers = enqOthers;
		this.poisoning = poisoning;
		this.di = di;
		this.od = od;
		this.ae = ae;
		this.in = in;
		this.ef = ef;
		this.dr = dr;
		this.ie = ie;
		this.tu = tu;
		this.as = as;
		this.ad = ad;
		this.df = df;
		this.dh = dh;
		this.dc = dc;
		this.du = du;
		this.cd = cd;
		this.pk = pk;
		this.pl = pl;
		this.td = td;
		this.pn = pn;
		this.co = co;
		this.re = re;
		this.enqSummaryDetails = enqSummaryDetails;
		this.respondDetail = respondDetail;
		this.oth = oth;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "diHdr"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "t_enquiry_seqno", unique = true, nullable = false)
	public long getPhEnquirySeqno() {
		return this.phEnquirySeqno;
	}

	public void setPhEnquirySeqno(long phEnquirySeqno) {
		this.phEnquirySeqno = phEnquirySeqno;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public DiHdr getDiHdr() {
		return this.diHdr;
	}

	public void setDiHdr(DiHdr diHdr) {
		this.diHdr = diHdr;
	}

	@Column(name = "enquirer_seqno")
	public Long getEnquirerSeqno() {
		return this.enquirerSeqno;
	}

	public void setEnquirerSeqno(Long enquirerSeqno) {
		this.enquirerSeqno = enquirerSeqno;
	}

	@Column(name = "enq_treatment")
	public Character getEnqTreatment() {
		return this.enqTreatment;
	}

	public void setEnqTreatment(Character enqTreatment) {
		this.enqTreatment = enqTreatment;
	}

	@Column(name = "enq_regulatory")
	public Character getEnqRegulatory() {
		return this.enqRegulatory;
	}

	public void setEnqRegulatory(Character enqRegulatory) {
		this.enqRegulatory = enqRegulatory;
	}

	@Column(name = "enq_research")
	public Character getEnqResearch() {
		return this.enqResearch;
	}

	public void setEnqResearch(Character enqResearch) {
		this.enqResearch = enqResearch;
	}

	@Column(name = "enq_enforcement")
	public Character getEnqEnforcement() {
		return this.enqEnforcement;
	}

	public void setEnqEnforcement(Character enqEnforcement) {
		this.enqEnforcement = enqEnforcement;
	}

	@Column(name = "enq_others", length = 200)
	public String getEnqOthers() {
		return this.enqOthers;
	}

	public void setEnqOthers(String enqOthers) {
		this.enqOthers = enqOthers;
	}

	@Column(name = "enq_poision")
	public Character getPs() {
		return this.poisoning;
	}

	public void setPs(Character ps) {
		this.poisoning = ps;
	}
	
	@Column(name = "enq_oth")
	public Character getOth() {
		return this.oth;
	}

	public void setOth(Character oth) {
		this.oth = oth;
	}


	@Column(name = "enq_drug_interact")
	public Character getDi() {
		return this.di;
	}

	public void setDi(Character di) {
		this.di = di;
	}

	@Column(name = "enq_overdose")
	public Character getOd() {
		return this.od;
	}

	public void setOd(Character od) {
		this.od = od;
	}

	@Column(name = "enq_adv_effect")
	public Character getAe() {
		return this.ae;
	}

	public void setAe(Character ae) {
		this.ae = ae;
	}

	@Column(name = "enq_indication")
	public Character getIn() {
		return this.in;
	}

	public void setIn(Character in) {
		this.in = in;
	}

	@Column(name = "enq_efficacy")
	public Character getEf() {
		return this.ef;
	}

	public void setEf(Character ef) {
		this.ef = ef;
	}

	@Column(name = "enq_dose_range")
	public Character getDr() {
		return this.dr;
	}

	public void setDr(Character dr) {
		this.dr = dr;
	}

	@Column(name = "enq_identi")
	public Character getIe() {
		return this.ie;
	}

	public void setIe(Character ie) {
		this.ie = ie;
	}

	@Column(name = "enq_therap")
	public Character getTu() {
		return this.tu;
	}

	public void setTu(Character tu) {
		this.tu = tu;
	}

	@Column(name = "enq_avail")
	public Character getAs() {
		return this.as;
	}

	public void setAs(Character as) {
		this.as = as;
	}

	@Column(name = "enq_admin")
	public Character getAd() {
		return this.ad;
	}

	public void setAd(Character ad) {
		this.ad = ad;
	}

	@Column(name = "enq_drug_form")
	public Character getDf() {
		return this.df;
	}

	public void setDf(Character df) {
		this.df = df;
	}

	@Column(name = "enq_drug_ren_hep")
	public Character getDh() {
		return this.dh;
	}

	public void setDh(Character dh) {
		this.dh = dh;
	}

	@Column(name = "enq_drug_compat")
	public Character getDc() {
		return this.dc;
	}

	public void setDc(Character dc) {
		this.dc = dc;
	}

	@Column(name = "enq_drug_preg_lac")
	public Character getDu() {
		return this.du;
	}

	public void setDu(Character du) {
		this.du = du;
	}

	@Column(name = "enq_cd")
	public Character getCd() {
		return this.cd;
	}

	public void setCd(Character cd) {
		this.cd = cd;
	}

	@Column(name = "enq_pc")
	public Character getPk() {
		return this.pk;
	}

	public void setPk(Character PK) {
		this.pk = PK;
	}

	@Column(name = "enq_pharm_legis")
	public Character getPl() {
		return this.pl;
	}

	public void setPl(Character pl) {
		this.pl = pl;
	}

	@Column(name = "enq_summary_details", length = 1000, nullable = false)
	public String getEnqSummaryDetails() {
		return this.enqSummaryDetails;
	}

	public void setEnqSummaryDetails(String enqSummaryDetails) {
		this.enqSummaryDetails = enqSummaryDetails;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "enquiryDetail", cascade = CascadeType.ALL)
	public RespondDetail getRespondDetail() {
		return this.respondDetail;
	}

	public void setRespondDetail(RespondDetail respondDetail) {
		this.respondDetail = respondDetail;
	}

	public void setTd(Character td) {
		this.td = td;
	}

	@Column(name = "enq_therap_drug_moni")
	public Character getTd() {
		return td;
	}

	@Column(name = "enq_parenteral_nut")
	public Character getPn() {
		return pn;
	}

	public void setPn(Character pn) {
		this.pn = pn;
	}

	public void setEnquiryCount(int enquiryCount) {
		this.enquiryCount = enquiryCount;
	}

	@Column(name = "enquiry_count")
	public int getEnquiryCount() {
		return enquiryCount;
	}

	public void setCo(Character co) {
		this.co = co;
	}

	@Column(name = "enq_contraindication")
	public Character getCo() {
		return co;
	}

	public void setRe(Character re) {
		this.re = re;
	}

	@Column(name = "enq_treatmentregime")
	public Character getRe() {
		return re;
	}

	@Column(name = "active_flag")
	public String getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
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
}