package starbucks;

public class Nike {
	public void register(Form form) {
		String [] menu = form.getMenu();
		for(int i =0; i<menu.length; i++) {
			System.out.println(menu[i]);
		}
		
		//무료나눔경우
		if(form instanceof FormAdapter) {
			System.out.println("무료매장 입니다.");
			return;
		}
	}
}
