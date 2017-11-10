import java.util.ArrayList;

public class StringsAreEqual {

	public boolean equalStrings(String input1 , String input2) {
		char[] array1 = input1.toCharArray();
		char[] array2 = input2.toCharArray();
		if(array1.length != array2.length) {
			return false;
		}
		for(int i=0; i<array1.length ;i++) {
			if(array1[i] == array2[i]) {
				continue;
			}
			return false;
		}
		return true;
	}
	
	//array[100]
	//Array --> array[0]=1, array[1]
	//Queue --> enQueue, deQueue
	//Stack --> push, pop
	//LinkedList --> add, delete, remove
	//ArrayList -->array.get(0). array.add(10); 
	
	public static void main(String[] args) {
		StringsAreEqual se = new StringsAreEqual();
		System.out.println(se.equalStrings("pavani", "pavani") +"  equal");

	}








}
