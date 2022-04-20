package bootcamp.oop.basic.enumeration;

public class StatusCode {
	private String msg;
	private final Status status;
	public StatusCode(String msg, Status status) {
		this.msg = msg;
		this.status = status;
	}
	public void checkIfMsgSent() {
		switch(status) {
		case OK:
			System.out.println("Testing send " + msg);
			System.out.println("We did it");
			break;
		case FAIL:
			break;
		case MISSING_INFO:
			break;
		default:
			break;
		}
	}
	
	
	
	
	public static enum Status{
		MISSING_INFO(100),
		ILLIGAL_NAME(101),
		OK(400),
		FAIL(500);
		int code;
		Status(int code){
			this.code = code;
		}
	}

}
