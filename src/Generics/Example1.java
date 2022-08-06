package Generics;

import java.util.ArrayList;

class CustomList<T>{
	ArrayList<T> list=new ArrayList<>();
	
	public void addElement(T element) {
		list.add(element);
	}
	
	public void removeElement(T element) {
		list.remove(element);
	}
	public T getElement(int index) {
		return list.get(index);
	}
	
	public String toString() {
		return list.toString();
	}
}

public class Example1 {

	public static void main(String[] args) {
		//List 1 String list
		CustomList<String> list1=new CustomList<>();
		list1.addElement("Dubey");
		list1.addElement("Akshay");
		list1.addElement("Rajul");
		list1.removeElement("Dubey");
		System.out.println(list1 +"First element : "+list1.getElement(0));
		
		//List 2 Integer List
		CustomList<Integer> list2=new CustomList<>();
		list2.addElement(10);
		list2.addElement(Integer.valueOf(20));
		System.out.println(list2 +"First element : "+list2.getElement(0));
		
		//List 3 Float List
		CustomList<Float> list3=new CustomList<>();
		list3.addElement(10f);
		list3.addElement(Float.valueOf(20.35f));
		System.out.println(list3 +"First element : "+list3.getElement(0));
		
		//List 4 Boolean List
		CustomList<Boolean> list4=new CustomList<>();
		list4.addElement(true);
		list4.addElement(false);
		System.out.println(list4 +"First element : "+list4.getElement(0));
		
	}

}
