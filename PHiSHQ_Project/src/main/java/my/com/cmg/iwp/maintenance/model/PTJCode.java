package my.com.cmg.iwp.maintenance.model;

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
import javax.persistence.UniqueConstraint;

/**
 * ItemCategory generated by hbm2java
 */
@Entity
@Table(name = "t_ptj_code", uniqueConstraints = @UniqueConstraint(columnNames = "ptj_code"))
public class PTJCode implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private long ptjCodeSeqno = Long.MIN_VALUE;
	private String ptjCode;
	private String ptjName;
	private Character activeFlag = 'A';
	private Date createdDate;
	private long createdBy;
	private Date updatedDate;
	private long updatedBy;

	public PTJCode() {
	}

	public PTJCode(long ptjCodeSeqno, String ptjCode,
			String ptjName, Character activeFlag,
			long createdBy, Date createdDate, 
			long updatedBy, Date updatedDate) {
		this.ptjCodeSeqno = ptjCodeSeqno;
		this.ptjCode = ptjCode;
		this.ptjName = ptjName;
		this.activeFlag = activeFlag;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	@Id
	@Column(name = "ptj_code_seqno", unique = true, nullable = false)
	@SequenceGenerator(name = "ptj_code_seqno", sequenceName = "t_ptj_code_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ptj_code_seqno")
	public long getPtjCodeSeqno() {
		return this.ptjCodeSeqno;
	}

	public void setPtjCodeSeqno(long ptjCodeSeqno) {
		this.ptjCodeSeqno = ptjCodeSeqno;
	}

	@Column(name = "ptj_code", unique = true, nullable = false, length = 20)
	public String getPtjCode() {
		return this.ptjCode;
	}

	public void setPtjCode(String ptjCode) {
		this.ptjCode = ptjCode;
	}

	@Column(name = "ptj_name", length = 100)
	public String getPtjName() {
		return this.ptjName;
	}

	public void setPtjName(String ptjName) {
		this.ptjName = ptjName;
	}

	@Column(name = "created_by", nullable = false, length = 10)
	public long getCreateBy() {
		return this.createdBy;
	}

	public void setCreateBy(long createdBy) {
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

	@Column(name = "updated_by", nullable = false, length = 10)
	public long getUpdateBy() {
		return this.updatedBy;
	}

	public void setUpdateBy(long updatedBy) {
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

	public void setActiveFlag(Character activeFlag) {
		this.activeFlag = activeFlag;
	}

	@Column(name = "active_flag")
	public Character getActiveFlag() {
		return activeFlag;
	}
}
