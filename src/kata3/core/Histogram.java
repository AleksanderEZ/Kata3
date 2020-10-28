package kata3.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Histogram {
    private final Map<String, Integer> count = new HashMap<>();
    
    public Histogram(){
        
    }
    
    public Set<String> getKeys(){
        Set<String> keys = count.keySet();
        return keys;
    } 
    
    public int getCount(String string) {
        return count.get(string);
    }
    
    public void add(String string) {
        if(count.containsKey(string)) count.replace(string, count.get(string) + 1);
        else count.put(string, 1);
    }
}
