package com.lula.regionnewspaper.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Newspaper")
public class Newspaper {

	@Id 
	@GeneratedValue
	@Column(name="Id_Newspaper", nullable=false)
	private int Id_Newspaper;
	
	@Column(name="Name", length=15, nullable=false)
    private String Name;
	
	@Column(name="FileName", length=15)
    private String FileName;
	
	@Column(name="Description", length=50)
    private String Description;
	
	@Column(name="StartDate")
    private Date StartDate;
	
	@Column(name="EndDate")
    private Date EndDate;
	
	@Column(name="SerialNumber")
	private int SerialNumber;
	
	@Column(name="GrossSerialNumber")
	private int GrossSerialNumber;
	
	@Column(name="CountPages")
	private int CountPages;

	public int getId_Newspaper() {
		return Id_Newspaper;
	}

	public void setId_Newspaper(int id_Newspaper) {
		Id_Newspaper = id_Newspaper;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getFileName() {
		return FileName;
	}

	public void setFileName(String fileName) {
		FileName = fileName;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

	public int getSerialNumber() {
		return SerialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		SerialNumber = serialNumber;
	}

	public int getGrossSerialNumber() {
		return GrossSerialNumber;
	}

	public void setGrossSerialNumber(int grossSerialNumber) {
		GrossSerialNumber = grossSerialNumber;
	}

	public int getCountPages() {
		return CountPages;
	}

	public void setCountPages(int countPages) {
		CountPages = countPages;
	}
	
	
}
