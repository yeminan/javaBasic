package sec3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		Map<String,Integer> map =new HashMap<>();
		map.put("이이병",103);
		map.put("이일병",105);
		map.put("이상병",107);
		map.put("이병장",109);
		map.put("이하사",110);
		System.out.println("저장된 데이터 건수 : "+map.size());
		System.out.println("이일병의 점수 : "+map.get("이일병"));
		System.out.println("이병장의 점수 : "+map.get("이병장"));
		map.remove("이상병");
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterater = keySet.iterator();
		while(keyIterater.hasNext()) {
			String key = keyIterater.next();
			Integer value =map.get(key);
			System.out.println("key : "+key+", value : "+value);
		}
	
	}

}
