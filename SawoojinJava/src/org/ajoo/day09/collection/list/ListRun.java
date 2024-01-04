package org.ajoo.day09.collection.list;

public class ListRun {

	public static void main(String[] args) {
		RList<Integer> list = new RList<Integer>();
		list.add(1113);
		list.add(253);
		list.add(2233);
		
	}
	public void objListSample () {
		ObjectList objList = new ObjectList();
		objList.add(11.13);
		objList.add(425);
		objList.add("종강");
		double start = (double)objList.get(0);
		int end = (int)objList.get(2);
//		String msg = (String)objList;
		
		System.out.println(objList.get(0));
		System.out.println(objList.get(1));
		System.out.println(objList.get(2));
	}
	public void intListSample() {
		
		IntList nums = new IntList();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println(nums.get(0));
		System.out.println(nums.get(1));
		System.out.println(nums.get(2));
		System.out.println(nums.size);
		
	}

}
