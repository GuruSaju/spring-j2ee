package guru.springmvc.model;


import java.util.HashSet;
/**
 * 
 * @author Srisarguru
 *
 */

public class ID {
      HashSet<String> ids = new HashSet();
      
      public ID(){
    	  ids.add("1");
    	  ids.add("2");
      }
      
     public boolean Idexists(String id){
    	 if(ids.contains(id)){
    		 return true;
    	 }
    	 else{
    		 return false;
    	 }
     }
}
