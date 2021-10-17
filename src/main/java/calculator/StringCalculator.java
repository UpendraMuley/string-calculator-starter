package calculator;

import java.util.ArrayList;
import java.util.List;



class StringCalculator {

  
	public static int add(String input) throws Exception{
		String[] inputs = input.split("[-.;,*%&#@^\n]+");
		int exception =0;
		List<Integer> negNumbers = new ArrayList<>();
		
		int res = 0;
		if("".equals(input) || null ==input) {
			return 0;
		}
		for(int i=0; i<inputs.length;i++) {
			if(Integer.parseInt(inputs[i]) < 0) {
				exception = 1;
				negNumbers.add(Integer.parseInt(inputs[i]));
			}
			if(exception !=1) {
				res = res + ((Integer.parseInt(inputs[i]) >1000)?0:Integer.parseInt(inputs[i]));
			}
		}
		if(exception==1) {
			throw new Exception("Negatives not allowed "+negNumbers);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCalculator stringCalculator = new StringCalculator();
		try {
			System.out.println("Output: "+StringCalculator.add("2**1,\n2"));
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
     
}