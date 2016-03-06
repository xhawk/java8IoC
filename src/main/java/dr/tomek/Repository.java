package dr.tomek;

import java.util.function.*;

public class Repository {

	public static String find(Function<String, String> callback) {
		return callback.apply("Moi");
	}
}
