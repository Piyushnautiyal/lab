package provsiongrequestconverter;

public class Subscription {

	private String msisdn;
	private String appTid;
	private String reqType;
	private String shortCode;
	private String circleId;
	private String aon;
	private String loanId;
	private String userInterface;
	private String preBalance;
	private String configVersion;
	private ParamExt paramExt;

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getAppTid() {
		return appTid;
	}

	public void setAppTid(String appTid) {
		this.appTid = appTid;
	}

	public String getReqType() {
		return reqType;
	}

	public void setReqType(String reqType) {
		this.reqType = reqType;
	}

	public String getShortCode() {
		return shortCode;
	}

	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}

	public String getCircleId() {
		return circleId;
	}

	public void setCircleId(String circleId) {
		this.circleId = circleId;
	}

	public String getAon() {
		return aon;
	}

	public void setAon(String string) {
		this.aon = string;
	}

	public String getLoanId() {
		return loanId;
	}

	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}

	public String getUserInterface() {
		return userInterface;
	}

	public void setUserInterface(String userInterface) {
		this.userInterface = userInterface;
	}

	public String getPreBalance() {
		return preBalance;
	}

	public void setPreBalance(String preBalance) {
		this.preBalance = preBalance;
	}

	public ParamExt getParamExt() {
		return paramExt;
	}

	public void setParamExt(ParamExt paramExt) {
		this.paramExt = paramExt;
	}

	public String getConfigVersion() {
		return configVersion;
	}

	public void setConfigVersion(String configVersion) {
		this.configVersion = configVersion;
	}

}
