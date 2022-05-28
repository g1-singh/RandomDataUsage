package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String imsi;
	private Integer uploadData;
	private Integer downloadData;
	private Long currTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public Integer getUploadData() {
		return uploadData;
	}

	public void setUploadData(Integer uploadData) {
		this.uploadData = uploadData;
	}

	public Integer getDownloadData() {
		return downloadData;
	}

	public void setDownloadData(Integer downloadData) {
		this.downloadData = downloadData;
	}

	public Long getCurrTime() {
		return currTime;
	}

	public void setCurrTime(Long currTime) {
		this.currTime = currTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", imsi=" + imsi + ", uploadData=" + uploadData + ", downloadData="
				+ downloadData + ", currTime=" + currTime + "]";
	}

}
