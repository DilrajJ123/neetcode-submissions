

class Solution { 

    public boolean isAnagram(String s, String t) { 

        if (s.length() != t.length()) { 
            return false; 
        } 

        HashMap<Character, Integer> counts = new HashMap<>();

        for (char c : s.toCharArray()) { 
            counts.put(c, counts.getOrDefault(c, 0) + 1); 
        } 

        for (char c : t.toCharArray()) { 
            if (counts.getOrDefault(c, 0) == 0) {
                return false; 
            } 

            counts.put(c, counts.get(c) - 1); 
        } 

        return true; 
    } 
} 