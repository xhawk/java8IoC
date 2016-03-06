package dr.tomek;

import java.util.function.*;

public class Repository {

	public static String find(Function<String, String> cons) {
		return cons.apply("Moi");
	}
}