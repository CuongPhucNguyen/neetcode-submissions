class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> charCountS = new HashMap();
        Map<Character, Integer> charCountT = new HashMap();
        
        charCountS = getCharCount(s);
        charCountT = getCharCount(t);

        if (charCountS.keySet().size() == charCountT.keySet().size()) {
            for (Character i : charCountS.keySet()) {
                if ((charCountT.get(i) == null) || (!charCountT.get(i).equals(charCountS.get(i)))) {
                    return false;
                }
            }
        } else {
            return false;
        }

        return true;
    }
    
    private Map<Character, Integer> getCharCount(String input) {
        Map<Character, Integer> charCountInput = new HashMap();
        for (Character i : input.toCharArray()){
            if (charCountInput.get(i) == null) {
                charCountInput.put(i, 1);
            } else {
                charCountInput.put(i, charCountInput.get(i) + 1);
            }
        }
        return charCountInput;
    }
}
