package Stack_Postfix;


public class DoPostfix {

	public static void main(String...strings ){
		String[] st={"6","8","1","+","-","5","*"};
		Postfix pst=new Postfix();
		System.out.println("result is Equals to:"+pst.postfixImplement(st));
	}
	

}
