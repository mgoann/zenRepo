package zenmobile.beans.vo;

import java.util.Date;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class AppVO {
  private String name;
  private String path;
  private CommonsMultipartFile fileData;
  private String createdBy;
  private Date createdOn;
  private String updatedBy;
  private Date updatedOn; 
  
  public AppVO() {
	  
  }

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public CommonsMultipartFile getFileData() {
		return fileData;
	}
	
	public void setFileData(CommonsMultipartFile fileData) {
		this.fileData = fileData;
	}
	
	public String getCreatedBy() {
		return createdBy;
	}
	
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	public Date getCreatedOn() {
		return createdOn;
	}
	
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	
	public String getUpdatedBy() {
		return updatedBy;
	}
	
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	public Date getUpdatedOn() {
		return updatedOn;
	}
	
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	  
  
}
