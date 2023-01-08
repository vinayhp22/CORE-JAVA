package com.xworkz.map.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PgNamesRunner {
	public static void main(String[] args) {

		Map<String, Double> pgs = new HashMap<String, Double>();
		pgs.put("Siddaganag PG", 5300D);
		pgs.put("Ramya PG", 6000D);
		pgs.put("Annapoorneshwari PG", 6500D);
		pgs.put("Gangadar pgs", 4500D);
		pgs.put("Angels pg", 9000D);
		pgs.put("Unique pg", 6500D);
		pgs.put("Kiran PG", 5000D);
		pgs.put("Lakshmi pg", 8000D);
		pgs.put("Ignite PG", 4000D);
		pgs.put("Lights PG", 6100D);

		System.out.println("Loop keys==========");
		Set<String> keys = pgs.keySet();
		keys.forEach(e -> System.out.println(e));

		System.out.println("\nLoop values=========");
		Collection<Double> values = pgs.values();
		values.forEach(e -> System.out.println(e));

		System.out.println("\nLoop in pairs=======");
		Collection<Entry<String, Double>> entries  = pgs.entrySet(); 
		System.out.println(entries);
		entries.forEach(e->System.out.println(e.getKey()+"  "+e.getValue()));
	}
}
