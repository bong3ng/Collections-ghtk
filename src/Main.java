import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.event.ListSelectionEvent;

public class Main {

	public static void main(String[] args) {
		Set<Integer> target = new HashSet<Integer>();
		int[] array1 = {3,4,2,1,5,7,1,7,8,9,10};
		System.out.println("Danh sach 1: ");
		for(int i: array1) {
			System.out.print(i + "\t");
			
			target.add(i);
		}
		System.out.println();
		
		int[] array2 = {3,5,2,5,6,1,6,8,9};
		System.out.println("Danh sach 2: ");
		
		for(int i: array2) {
			System.out.print(i + "\t");
			
			target.add(i);
		}
		System.out.println();
		System.out.println("Danh sach ket qua: ");
		System.out.println(target);
		
	}
}
