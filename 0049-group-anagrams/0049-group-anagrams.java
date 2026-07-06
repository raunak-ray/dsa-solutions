class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] dup = new String[strs.length];
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i<strs.length; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            dup[i] = new String(ch);
        }

        for (int i = 0; i<strs.length; i++) {
            if (map.containsKey(dup[i])) {
                map.get(dup[i]).add(strs[i]);
            }
            else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(dup[i], list);
            }
        }

        return new ArrayList<>(map.values());
    }
}