// Last updated: 7/15/2026, 8:06:15 PM
1import java.util.*;
2
3class Solution {
4    public List<Integer> findSubstring(String s, String[] words) {
5        List<Integer> result = new ArrayList<>();
6
7        if (s == null || s.length() == 0 || words.length == 0)
8            return result;
9
10        int wordLen = words[0].length();
11        int wordCount = words.length;
12        int totalLen = wordLen * wordCount;
13
14        if (s.length() < totalLen)
15            return result;
16
17        HashMap<String, Integer> map = new HashMap<>();
18
19        for (String word : words)
20            map.put(word, map.getOrDefault(word, 0) + 1);
21
22        for (int i = 0; i < wordLen; i++) {
23            int left = i;
24            int count = 0;
25            HashMap<String, Integer> window = new HashMap<>();
26
27            for (int right = i; right + wordLen <= s.length(); right += wordLen) {
28
29                String word = s.substring(right, right + wordLen);
30
31                if (map.containsKey(word)) {
32                    window.put(word, window.getOrDefault(word, 0) + 1);
33                    count++;
34
35                    while (window.get(word) > map.get(word)) {
36                        String leftWord = s.substring(left, left + wordLen);
37                        window.put(leftWord, window.get(leftWord) - 1);
38                        left += wordLen;
39                        count--;
40                    }
41
42                    if (count == wordCount) {
43                        result.add(left);
44
45                        String leftWord = s.substring(left, left + wordLen);
46                        window.put(leftWord, window.get(leftWord) - 1);
47                        left += wordLen;
48                        count--;
49                    }
50                } else {
51                    window.clear();
52                    count = 0;
53                    left = right + wordLen;
54                }
55            }
56        }
57
58        return result;
59    }
60}