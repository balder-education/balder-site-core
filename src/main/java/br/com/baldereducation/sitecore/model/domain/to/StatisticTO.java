package br.com.baldereducation.sitecore.model.domain.to;

public class StatisticTO {
	
	@SuppressWarnings("unused")
	private static final String URL_CLIENT = "api/statistics";

	private int studentCode;
	private int contentLevel;
	private int contentId;

	public int getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}

	public int getContentLevel() {
		return contentLevel;
	}

	public void setContentLevel(int contentLevel) {
		this.contentLevel = contentLevel;
	}

	public int getContentId() {
		return contentId;
	}

	public void setContentId(int contentId) {
		this.contentId = contentId;
	}

}
