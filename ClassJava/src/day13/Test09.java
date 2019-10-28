package day13;

import java.util.*;

public class Test09 {

	public Test09() {
		Vector vec = new Vector();
		
		vec.add(new Sname()); 	// 0
		vec.add(new Sname());	// 1
		vec.add(new Nname());	// 2 *
		vec.add(new Nname());	// 3 *
		vec.add(new Sname());	// 4
		vec.add(new Nname());	// 5 *
		
		int no = 0;
		for(Object o : vec) {
			NameInterf n = (NameInterf)o;
			if(no++ % 2 == 0) {
				n.getName("박송림");
			} else {
				n.getName("박송림");
			}
		}
	}

	public static void main(String[] args) {
		new Test09();
	}

}
