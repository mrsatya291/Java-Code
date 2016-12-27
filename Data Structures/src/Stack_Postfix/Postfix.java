package Stack_Postfix;

import java.util.Stack;

public class Postfix {

	int res = 0;

	public int postfixImplement (String[] tokens) {
		Stack<Integer> sc = new Stack<Integer>();

		for(String token:tokens){
			if(Integer.parseInt(token)>=0 || Integer.parseInt(token)<=9){
				sc.push(Integer.parseInt(token));
			}
			
			else{	if(token=="+"){
				int op1=sc.pop();
				int op2=sc.pop();
				res=op1+op2;
				sc.push(res);
		}
			if(token=="-"){
				int op1=sc.pop();
				int op2=sc.pop();
				res=op1-op2;
				sc.push(res);
		}
			if(token=="*"){
				int op1=sc.pop();
				int op2=sc.pop();
			res=op1*op2;
				sc.push(res);
		}
			if(token=="/"){
				int op1=sc.pop();
				int op2=sc.pop();
				res=op1/op2;
				sc.push(res);
		}
			
	}}
return sc.pop();
}}
