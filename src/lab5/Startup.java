package lab5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author dworgolet
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Employee e1 = new Employee("Wargolet", "Daniel", "333-333-3333", "187813");
       Employee e2 = new Employee("Wargolet", "Daniel", "333-333-3333", "187813");
       Employee e3 = new Employee("Buth", "Steven", "444-444-4444", "189211"); 
       Employee e4 = new Employee("Buth", "Matthew", "555-555-5555", "983813");  
        
        
       //using employee ID for the key as employees should not share IDs
       
       
        Map<String, Employee> map = new HashMap<String, Employee>();
        
        map.put("983813", e4);
        map.put("189211", e3);
        map.put("187813", e2);
        map.put("187813", e1);
        
        Employee requestedEmp = map.get("983813");
        System.out.println("Requested employee: " + requestedEmp +"\n");
        
        
        Employee origEmp = map.put("983813", e3);
        System.out.println("Replacing Matthew Buth with: " + e3);
        System.out.println("Original entry: " + origEmp + "\n");

        
        

        // now output to prove it works:
        
        
        //printing out all keys
        Set<String> keys = map.keySet();
        for(String key : keys) {
            Employee found = map.get(key);
            System.out.println(found.toString());
        }
         System.out.println("\n");
        //employee values
        Collection<Employee> values = map.values();
        for(Object emp : values) {
            System.out.println(emp);
        }
    }
    
}
