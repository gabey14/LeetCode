class Solution {
    public boolean isAnagram(String s, String t) {
        // Using HashMap
		Map<Character, Integer> map = new HashMap<>();
		Map<Character, Integer> map1 = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}

		for (int j = 0; j < t.length(); j++) {
			map1.put(t.charAt(j), map1.getOrDefault(t.charAt(j), 0) + 1);
		}

		System.out.println(map);
		System.out.println(map1);

		if (map.equals(map1)) {
			return true;
		}

		return false;
    }
}