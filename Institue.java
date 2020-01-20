package com.lti.model;

public class Institue {

	private int instituteId;
	private String state;
	private String instituteName;
	private int instituteCode;
	private int discCode;
	private String universityState;
	private String universityName;
	private String setPassword;

	public Institue() {
		super();
	}

	public Institue(int instituteId, String state, String instituteName, int instituteCode, int discCode,
			String universityState, String universityName, String setPassword) {
		super();
		this.instituteId = instituteId;
		this.state = state;
		this.instituteName = instituteName;
		this.instituteCode = instituteCode;
		this.discCode = discCode;
		this.universityState = universityState;
		this.universityName = universityName;
		this.setPassword = setPassword;
	}

	public int getInstituteId() {
		return instituteId;
	}

	public void setInstituteId(int instituteId) {
		this.instituteId = instituteId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public int getInstituteCode() {
		return instituteCode;
	}

	public void setInstituteCode(int instituteCode) {
		this.instituteCode = instituteCode;
	}

	public int getDiscCode() {
		return discCode;
	}

	public void setDiscCode(int discCode) {
		this.discCode = discCode;
	}

	public String getUniversityState() {
		return universityState;
	}

	public void setUniversityState(String universityState) {
		this.universityState = universityState;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getSetPassword() {
		return setPassword;
	}

	public void setSetPassword(String setPassword) {
		this.setPassword = setPassword;
	}

	@Override
	public String toString() {
		return "Institue [instituteId=" + instituteId + ", state=" + state + ", instituteName=" + instituteName
				+ ", instituteCode=" + instituteCode + ", discCode=" + discCode + ", universityState=" + universityState
				+ ", universityName=" + universityName + ", setPassword=" + setPassword + "]";
	}
}
