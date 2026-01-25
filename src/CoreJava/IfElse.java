package CoreJava;

public class IfElse {
	public static void main(String[] args) {
		boolean issunny = true;
		if(issunny) {
			System.out.println(true);
		}
		else {
			System.out.println(false );
		}
		
		if(issunny == true) {
			
		}
		else if(issunny = false) {
			
		}
		else {
			
		}
		
		int day =3 ;
		switch(day) {
			case 1 :
				System.out.println(day);
				break;
			case 2 :
				System.out.println(day);
				break ;
			case 3 :
				System.out.println(day);
				break ;
			default :
				System.out.println(day);
				break ;
		}
		
		// ternary operator
		String value = day>5 ? "test": "large";
		System.out.println(value);
		
		
	}
}
