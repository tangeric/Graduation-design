package rent.util;

import java.util.UUID;

public class StringUtil {

	public static String getUUID(){
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		return uuid;
	}
}
