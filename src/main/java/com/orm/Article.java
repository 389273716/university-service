package com.orm;

/**
 * ����
 * 
 * @author ��̫��
 * @category ʵ��
 */
public class Article {

	private Integer id;

	private String title;

	private String titleDate;

	private String inputDate;

	private String url;

	private Integer type;
	
	private String tags;
	
	private String authorId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitleDate() {
		return titleDate;
	}

	public void setTitleDate(String titleDate) {
		this.titleDate = titleDate;
	}

	public String getInputDate() {
		return inputDate;
	}

	public void setInputDate(String inputDate) {
		this.inputDate = inputDate;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}
	
	
}
