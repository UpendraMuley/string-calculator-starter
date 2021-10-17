package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        try {
			assertEquals(0, stringCalculator.add(""));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        try {
			assertEquals(1, stringCalculator.add("1"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    @Test
    void string_with_two_number_should_return_sum_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        try {
			assertEquals(3, stringCalculator.add("1,2"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    @Test
    void string_with_multple_number_should_return_sum_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        try {
			assertEquals(6, stringCalculator.add("1,2,3"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    

    @Test
    public void handle_NewLines_Between_Numbers_Return_sum_as_int()throws Exception {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(9,stringCalculator.add("2\n4,3"));
    }
    
    @Test
    public void multiple_Delimiter_ReturnSum_as_int() throws Exception {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(33,stringCalculator.add("24#3&6"));
    }
}

