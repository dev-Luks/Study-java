package collectionTask;

import java.util.ArrayList;
import java.util.Random;

public class UserField2 {
	
	public static void start(int i) {
		System.out.println("1. ȸ������\n2. �α���\n3. ��й�ȣã��\n4. ������ ");
	}
	
//	 UserField Ŭ���� ����
//	   - ȸ�� ������ ���� DB�� ArrayList�� ����
//	   - ���̵� �ߺ��˻�
//	   - ȸ������
//	   - �α���
//	   - ��ȣȭ
//	   - ��й�ȣ ����(��й�ȣ ã�� ����)
//	   - ������ȣ ����
	public ArrayList<User> users = DBConnecter.users;
	private char key;
	public static final int key = 3;
	
//	���̵� �ߺ��˻�
	public User check_id(String id) {
		for(int i =0; i<users.size(); i++) {
			if(users.get(i).getId().equals(id)) {
				System.out.println("�ߺ��� ���̵� �Դϴ�.");
				return users.get(i);
			}
		}
		System.out.println("��� ������ ���̵�!");
		return null;
	}
	
//	�α���
	public boolean login(String id, String password) {
		if(check_id(id) != null) { 
			if(check_id(id).getPw().equals(password)) {
		System.out.println("�α��� �Ǿ����ϴ�.");
		return true;
		}
	}
		System.out.println("�α����� �ٽ� �õ����ּ���");
		return false;
}		
//	ȸ������
	public boolean joinMembership(String id,String pw, String name, String phone) { //User ��ü�� ���� �� �ִ�.
		if(check_id(id) ==null) {
			User user = new User();
			user.setId(id);
			user.setPw(pw);
			user.setName(name);
			user.setPhone(phone);
			users.add(user);
			System.out.println("ȸ������ ����");
			return true;
		}
		return false;
	}
//	��ȣȭ
	public String systemKey(String password) {
		String result = "";
		for(int i=0; i< password.length(); i++) {
			result += (char)(password.charAt(i)*key);
		}
		return result;
	}
//	��й�ȣ ����(��й�ȣ ã�� ����)
	public void changePassword(String id, String newPaswword, int number) {
		if(check_id(id).getNumber() ==number) {  //���� ������ȣ�� ��ġ�ϸ�
			System.out.println("������ȣ ����");
			System.out.println("��й�ȣ ���� ����");
			check_id(id).setPw(systemKey(newPaswword)); // �����
			System.out.println("��й�ȣ��"+newPassword+ "�κ���");
			return newPassword;
		}
		System.out.println("������ȣ�� ��ġ����");
		System.out.println("�������");
		return null;
	}
	
//	������ȣ ����
	public void checkPhone(String id,String phoneNumber) {
		Random r = new Random();
		int number=0;
		if(check_id(id).getPhone().equals(phoneNumber)) {
			number = 123456;
			check_id(id).setNumber(number);
			System.out.println("������ȣ: "+number);
		}
	}

}
