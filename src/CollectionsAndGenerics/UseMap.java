package CollectionsAndGenerics;

import java.util.HashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();
		map.put("たつめそうせき", "夏目漱石");
		map.put("bogyoat", "Aung San");
		map.put("amaysu", "Aung San Su Kyi");
		map.put("pdf", "generation Z");

		System.out.println(map.get("pdf"));

		for (String str : map.values()) {
			System.out.println(str);
		}
		System.out.println("=================key==============");
		for (String str : map.keySet()) {
			System.out.println(str);
		}
		System.out.println("==================both=============");
		for (Map.Entry<String, String> ent : map.entrySet()) {
			System.out.print("Key :" + ent.getKey());
			System.out.println(",Value :" + ent.getValue());
		}
		System.out.println("=================after put=============");
		map.put("pdf", "Yannainghtwe");
		for (Map.Entry<String, String> ent : map.entrySet()) {
			System.out.print("Key :" + ent.getKey());
			System.out.println(",Value :" + ent.getValue());
		}

	}

}
