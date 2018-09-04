package xmlBasedConfigurations.injection.ConstructorInjection;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SomeDemoClass {
    
    private Map<String,String> hm;
    private List<String> list;
    private String arg1;
    private int arg2;
    
    public SomeDemoClass(Map<String,String> hm,List<String> list,String arg1,int arg2) {
        this.hm     = hm;
        this.list   = list;
        this.arg1   = arg1;
        this.arg2   = arg2;
    }
    

    @Override
    public String toString() {
        return "SomeDemoClass [hm=" + hm + ", list=" + list + ", arg1=" + arg1 + ", arg2=" + arg2 + "]";
    }
}
