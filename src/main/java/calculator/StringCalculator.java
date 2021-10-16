package calculator;

import java.util.List;

import com.sun.tools.javac.util.Convert;

class StringCalculator {

    public int add(String input) {
    	if(input.isEmpty()) {
    	       	  return 0;
    	          }else {
    	       	   String[] str = input.split(",");
    	       	   
    	       	   List<Integer> list = convert(str,toInt());
    	       	   return sum(list).intValue();
    	         }
    	    	
    	    	}
    public static Converter<String, Integer> toInt(){
    	return new Convert<String, Integer>(){
    		public Integer convert(String from) {
    			return toInt(from);
    		}
    	};
    }
    	    
    		private int toInt(String input) throws NumberFormatException {
    			return Integer.parseInt(input);
    		}
     
}