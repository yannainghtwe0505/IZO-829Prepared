package CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo3 {

	public static void main(String[] args) {
		List<Map<String, List<Student>>> list = new ArrayList<>();
		Map<String, List<Student>> m1 = new HashMap<>();

		List<Student> stuListM1_1 = new ArrayList<>();
		stuListM1_1.add(new Student("張1_1", "m1_1", 1));
		stuListM1_1.add(new Student("張2_1", "m1_1", 1));
		stuListM1_1.add(new Student("張3_1", "m1_1", 1));

		List<Student> stuListM1 = new ArrayList<>();
		stuListM1.add(new Student("張1", "m1", 2));
		stuListM1.add(new Student("張2", "m1", 2));
		stuListM1.add(new Student("張3", "m1", 2));

		/*3人分のデータを格納したListをキー「1001」と関連付け*/
		m1.put("1004", stuListM1);
		m1.put("1005", stuListM1_1);

		Map<String, List<Student>> m2 = new HashMap<>();
		List<Student> stuListM2 = new ArrayList<>();

		stuListM2.add(new Student("李1", "m2", 1));
		stuListM2.add(new Student("李2", "m2", 1));
		stuListM2.add(new Student("李3", "m2", 1));

		/*3人分のデータを格納したListをキー「1002」と関連付け*/
		m2.put("1002", stuListM2);

		Map<String, List<Student>> m3 = new HashMap<>();
		List<Student> stuListM3 = new ArrayList<>();

		stuListM3.add(new Student("付1", "m3", 1));
		stuListM3.add(new Student("付2", "m3", 1));
		stuListM3.add(new Student("付3", "m3", 1));

		/*3人分のデータを格納したListをキー「1003」と関連付け*/
		m3.put("1003", stuListM3);

		list.add(m1);
		list.add(m2);
		list.add(m3);

		for (int i = 0; i < list.size(); i++) {
			Map<String, List<Student>> map = list.get(i);
			for (String key : map.keySet()) {
				/*m1~m3のからStudent型のデータを格納したlistを取得*/
				List<Student> stuList = map.get(key);
				System.out.println(key + "学校の生徒情報");
				for (Student st : stuList) {
					System.out.print(st.getName());
					System.out.print("," + st.getCname());
					System.out.println("," + st.getAttend());
				}
			}

		}

	}

}
