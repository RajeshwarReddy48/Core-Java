package collection.framework.com;
import java.util.*;  
class TreeMapExample{  
 public static void main(String args[])
 {  
   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
      map.put(101,"Vijay");    
      map.put(102,"Ravi");    
      map.put(100,"Vijay");    
      map.put(103,"Rahul");    
        
      for(Map.Entry m:map.entrySet())
      {    
       System.out.println(m.getKey()+" "+m.getValue());    
      }    
 }  
}  
