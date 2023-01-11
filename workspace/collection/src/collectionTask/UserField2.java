package collectionTask;

import java.util.ArrayList;
import java.util.Random;

public class UserField2 {
	
	public static void start(int i) {
		System.out.println("1. 회원가입\n2. 로그인\n3. 비밀번호찾기\n4. 나가기 ");
	}
	
//	 UserField 클래스 선언
//	   - 회원 정보를 담을 DB를 ArrayList로 선언
//	   - 아이디 중복검사
//	   - 회원가입
//	   - 로그인
//	   - 암호화
//	   - 비밀번호 변경(비밀번호 찾기 서비스)
//	   - 인증번호 전송
	public ArrayList<User> users = DBConnecter.users;
	private char key;
	public static final int key = 3;
	
//	아이디 중복검사
	public User check_id(String id) {
		for(int i =0; i<users.size(); i++) {
			if(users.get(i).getId().equals(id)) {
				System.out.println("중복된 아이디 입니다.");
				return users.get(i);
			}
		}
		System.out.println("사용 가능한 아이디!");
		return null;
	}
	
//	로그인
	public boolean login(String id, String password) {
		if(check_id(id) != null) { 
			if(check_id(id).getPw().equals(password)) {
		System.out.println("로그인 되었습니다.");
		return true;
		}
	}
		System.out.println("로그인을 다시 시도해주세요");
		return false;
}		
//	회원가입
	public boolean joinMembership(String id,String pw, String name, String phone) { //User 객체로 받을 수 있다.
		if(check_id(id) ==null) {
			User user = new User();
			user.setId(id);
			user.setPw(pw);
			user.setName(name);
			user.setPhone(phone);
			users.add(user);
			System.out.println("회원가입 성공");
			return true;
		}
		return false;
	}
//	암호화
	public String systemKey(String password) {
		String result = "";
		for(int i=0; i< password.length(); i++) {
			result += (char)(password.charAt(i)*key);
		}
		return result;
	}
//	비밀번호 변경(비밀번호 찾기 서비스)
	public void changePassword(String id, String newPaswword, int number) {
		if(check_id(id).getNumber() ==number) {  //받은 인증번호가 일치하면
			System.out.println("인증번호 ㅇㅋ");
			System.out.println("비밀번호 변경 ㅇㅋ");
			check_id(id).setPw(systemKey(newPaswword)); // 물어보자
			System.out.println("비밀번호가"+newPassword+ "로변경");
			return newPassword;
		}
		System.out.println("인증번호가 일치ㄴㄴ");
		System.out.println("변경실패");
		return null;
	}
	
//	인증번호 전송
	public void checkPhone(String id,String phoneNumber) {
		Random r = new Random();
		int number=0;
		if(check_id(id).getPhone().equals(phoneNumber)) {
			number = 123456;
			check_id(id).setNumber(number);
			System.out.println("인증번호: "+number);
		}
	}

}
