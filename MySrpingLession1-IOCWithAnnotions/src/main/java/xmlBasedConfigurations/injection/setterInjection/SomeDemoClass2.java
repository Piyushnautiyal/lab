package xmlBasedConfigurations.injection.setterInjection;

import java.util.HashMap;
import java.util.ArrayList;

public class SomeDemoClass2 {
    
    private HashMap hashMap;
    private ArrayList list;
    private String arg1;
    private int arg2;
    
    private HashMap arg3;
    
    public SomeDemoClass2() {
    }
    
    
    public void setsomeHashMap(HashMap hashMap) {
        this.hashMap = hashMap;
    }
    
    public void setHashMap(HashMap arg3) {
        this.arg3 = arg3;
    }
    
    public void setList(ArrayList list) {
        this.list   = list;
    }

    @Override
    public String toString() {
        return "SomeDemoClass [hm=" + hashMap + ", list=" + list + ", arg1=" + arg1 + ", arg2=" + arg2 + ", arg3=" + arg3 + "]";
    }
}
