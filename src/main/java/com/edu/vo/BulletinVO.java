package com.edu.vo;

import java.util.Date;

public class BulletinVO {

	@Override
	public String toString() {
		return "BulletinVO [bbsId=" + bbsId + ", bbsTitle=" + bbsTitle + ", bbsContent=" + bbsContent + ", bbsWriter="
				+ bbsWriter + ", bbsImage=" + bbsImage + ", bbsCreateDate=" + bbsCreateDate + ", bbsHit=" + bbsHit
				+ ", getBbsId()=" + getBbsId() + ", getBbsTitle()=" + getBbsTitle() + ", getBbsContent()="
				+ getBbsContent() + ", getBbsWriter()=" + getBbsWriter() + ", getBbsImage()=" + getBbsImage()
				+ ", getBbsCreateDate()=" + getBbsCreateDate() + ", getBbsHit()=" + getBbsHit() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	private Integer bbsId;
    private String bbsTitle;
    private String bbsContent;
    private String bbsWriter;
    private String bbsImage;
    private Date bbsCreateDate;
    private int bbsHit;
    
	public Integer getBbsId() {
		return bbsId;
	}
	public void setBbsId(Integer bbsId) {
		this.bbsId = bbsId;
	}
	public String getBbsTitle() {
		return bbsTitle;
	}
	public void setBbsTitle(String bbsTitle) {
		this.bbsTitle = bbsTitle;
	}
	public String getBbsContent() {
		return bbsContent;
	}
	public void setBbsContent(String bbsContent) {
		this.bbsContent = bbsContent;
	}
	public String getBbsWriter() {
		return bbsWriter;
	}
	public void setBbsWriter(String bbsWriter) {
		this.bbsWriter = bbsWriter;
	}
	public String getBbsImage() {
		return bbsImage;
	}
	public void setBbsImage(String bbsImage) {
		this.bbsImage = bbsImage;
	}
	public Date getBbsCreateDate() {
		return bbsCreateDate;
	}
	public void setBbsCreateDate(Date bbsCreateDate) {
		this.bbsCreateDate = bbsCreateDate;
	}
	public int getBbsHit() {
		return bbsHit;
	}
	public void setBbsHit(int bbsHit) {
		this.bbsHit = bbsHit;
	}
	
}
