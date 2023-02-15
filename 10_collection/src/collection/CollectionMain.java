package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {

	@SuppressWarnings("all")
	public static void main(String[] args) {
		Collection coll = new ArrayList();
		
		//중복 허용, 순서
		coll.add("호랑이");
		coll.add("사자");
		coll.add("호랑이");
		coll.add(25);
		coll.add(43.8);
		coll.add("기린");
		coll.add("코끼리");
		
		Iterator it = coll.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());	
		}
		
		//it.next();
	}
	
}
