package platform;

import com.google.gson.Gson;

public class PlatformTools {
	
	static Gson gson = new Gson();
	
	public static String toJson(Object obj) {
		if(obj != null) {
			return gson.toJson(obj);
		}
		return null;
	}

}
