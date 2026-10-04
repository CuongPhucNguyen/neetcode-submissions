class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> mapThing = new HashMap();

        for (String i : strs) {
            if (mapThing.get(stringCharFreqTracker(i)) != null) {
                ArrayList<String> tempList = mapThing.get(stringCharFreqTracker(i));
                tempList.add(i);

                mapThing.put(stringCharFreqTracker(i), tempList);
            } else {
                mapThing.put(stringCharFreqTracker(i), new ArrayList(Arrays.asList(i)));
            }
        }

        ArrayList<List<String>> result = new ArrayList<>();
        for (String characterFreqKey : mapThing.keySet()) {
            result.add(mapThing.get(characterFreqKey));
        }

        return result;
    }

    private String stringCharFreqTracker(String input) {
        int[] characterFreq = new int[26];

        for (Character i : input.toCharArray()) {
            characterFreq[(int) i - (int) 'a'] += 1;
        }

        return Arrays.toString(characterFreq);
    }
}
