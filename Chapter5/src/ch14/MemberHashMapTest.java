package ch14;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap memberHashMap = new MemberHashMap();

		Member memberHong = new Member(1003, "홍길동");
		Member memberKim = new Member(1002, "김유신");
		Member memberLee = new Member(1001, "이순신");
		Member memberKang = new Member(1004, "강감찬");

		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKang);
		
		memberHashMap.showAllMember();
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1001, "Kim");
		hashMap.put(1002, "Lee");
		hashMap.put(1003, "Park");
		hashMap.put(1004, "Hong");
		
		System.out.println(hashMap);
		
	}

}
