package Day_2;

public class LogException extends RuntimeException {
	private static final long EXC=1L;
	public LogException() {
		super();
	};
	public LogException(String name) {
		super(name);
	};
	public LogException(String name,Throwable msg) {
		super(name,msg);
	}
	
}
