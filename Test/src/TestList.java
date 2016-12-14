import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.linkedlist.demo.TestInterface;

public class TestList implements TestInterface{
	public static void main(String[] arg){

	LinkedList<String> friends=new LinkedList<String>();
     friends.add("Satya");
     friends.add("Satya");
     friends.add("Satya");
     friends.add("Satya");
     friends.add("Satya");
     friends.add("Satya");
     System.out.println(friends);
     ArrayList<Integer> list=new ArrayList<Integer>();
     list.add(1);
     list.add(1);
     list.add(1);
     list.add(1);
     list.add(1);
     list.add(1);
     list.add(1);
     list.add(1);
     list.add(1);
     System.out.println(list);
     ListIterator<String> ltr=friends.listIterator();
    
     while(ltr.hasNext()){
    	 System.out.println(ltr.next());
     }
    		 
     
	
	
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Inside Interface");
		
	}

	public void test2(){
		System.out.println("Second Inteface");
	}
	
	
	
}
