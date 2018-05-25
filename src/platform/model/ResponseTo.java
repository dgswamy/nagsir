package platform.model;

public class ResponseTo {
	
	private String info;
	private String error;
	private int code;
	private String data;
	private String status;
	
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int i) {
		this.code = i;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
