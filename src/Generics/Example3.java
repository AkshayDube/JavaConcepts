package Generics;

import java.util.ArrayList;
import java.util.List;

//Create a generic method restricting to accept any list(ArrayList,LL or Vector) and duplicate the list and return the same
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList<>(List.of("10","20","30","Akshay",10,25,36f,48L));
		list=duplicateList(list);
		System.out.println(list.toString());

	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	static <T extends List> T duplicateList(T list) {
		list.addAll(list);
		return list;
	}

}
