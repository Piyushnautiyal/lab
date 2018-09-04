package xmlBasedConfigurations.injection.setterInjection;

import java.util.HashMap;
import java.util.ArrayList;

public class SomeDemoClass {
    
    private HashMap hashMap;
    private ArrayList list;
    private String arg1;
    private int arg2;
    
    public SomeDemoClass() {
    }
    
    
    /*
     * Only setting value of hashmap and list
     */
    
    public void setHm(HashMap hashMap) {
        this.hashMap = hashMap;
    }
    
    public void setList(ArrayList list) {
        this.list   = list;
    }

    @Override
    public String toString() {
        return "SomeDemoClass [hm=" + hashMap + ", list=" + list + ", arg1=" + arg1 + ", arg2=" + arg2 + "]";
    }
}
