package ch09;

public class PassWordTest {
	
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PassWordException {
		
		
		if(password == null) {
			throw new PassWordException("비밀번호를 입력해주세요.");
		}
		else if(password.length() < 5) {
			throw new PassWordException("비밀번호는 5자리 이상이어야 합니다.");
		}
		else if(password.matches("[a-zA-Z]+")) {
			throw new PassWordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
		}
		
		this.password = password;
	}

	public static void main(String[] args) {
		
		PassWordTest test = new PassWordTest();
		
		String password = null;
		
		try {
			test.setPassword(password);
			System.out.println("no error1");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abc";
		
		try {
			test.setPassword(password);
			System.out.println("no error2");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcde";
		
		try {
			test.setPassword(password);
			System.out.println("no error3");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcde1#";
		
		try {
			test.setPassword(password);
			System.out.println("no error4");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}

	}

}
