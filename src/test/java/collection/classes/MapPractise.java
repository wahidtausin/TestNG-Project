package collection.classes;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;



public class MapPractise {
	//Map specific method
		Map<Integer, String> m = new Hashtable(); //syncronized and legacy class performance wise slow
		Map<Integer, String> m1 = new HashMap();
		Map<Integer, String> m2 = new HashMap();
		Map<Integer, String> m3 = new HashMap();
@Test
public void test1() {
			Object o1 = m.put(1, "shahid");
			System.out.println(o1);
			m.put(1, "asad");
			m.put(13, "nothing");
			m.put(16, "nahid");
			System.out.println(m.get(1));
			//m.put(null, "asdf"); //no null key
			//m.put(4, "kamla");// no null value 
			
			m1.put(null, "asfd");//only one null key
			m1.put(4, null);// multiple null value.
			
			Iterator<Integer> i = m.keySet().iterator();
			while(i.hasNext()) {
				System.out.println("key is "+i.next());
			}
			Iterator<Integer> i1 = m.keySet().iterator();
			while(i1.hasNext()) {
				System.out.println("key is "+i1.next());
				
			}
			Iterator<Entry<Integer, String>> i2 = m.entrySet().iterator();
					while(i2.hasNext()) {
						Entry<Integer, String> e=i2.next();
						System.out.println(e.getKey());
						System.out.println(e.getValue());
					}
		}


}
