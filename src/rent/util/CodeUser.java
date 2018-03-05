package rent.util;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class CodeUser {

	  public static String jdkBase64Encoder(String str){  
		  String encoded = null;
	        try {
	            byte[] bytes =str.getBytes("UTF-8");
	            encoded = Base64.getEncoder().encodeToString(bytes);
	        } catch (UnsupportedEncodingException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        return encoded;
  
	    }  
	
	  public static String jdkBase64Dncoder(String str){
		  	byte[] decoded = null;
	        try {
	            byte[] bytes =str.getBytes("UTF-8");
	           decoded = Base64.getDecoder().decode(bytes);
	        } catch (Exception e) {
	            // TODO: handle exception
	        }
	        String aa=new String(decoded);
	        return aa;

		  
	  }

}
