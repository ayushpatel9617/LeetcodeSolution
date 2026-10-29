import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
            Map<Character, Integer> map = new HashMap<>();
                    map.put('I', 1);
                            map.put('V', 5);
                                    map.put('X', 10);
                                            map.put('L', 50);
                                                    map.put('C', 100);
                                                            map.put('D', 500);
                                                                    map.put('M', 1000);

                                                                            int result = 0;
                                                                                    for (int i = 0; i < s.length(); i++) {
                                                                                                int current = map.get(s.charAt(i));
                                                                                                            
                                                                                                                        // If this isn't the last char and the next char is larger, subtract current
                                                                                                                                    if (i < s.length() - 1 && current < map.get(s.charAt(i + 1))) {
                                                                                                                                                    result -= current;
                                                                                                                                                                } else {
                                                                                                                                                                                result += current;
                                                                                                                                                                                            }
                                                                                                                                                                                                    }
                                                                                                                                                                                                            return result;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                