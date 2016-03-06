package dr.tomek;

import java.util.function.*;
import java.lang.*;

public class Service {
	
	public static String doo(String name, Function<String, String> callback) {
		return Repository.find((greeting) -> {
			return callback.apply(greeting + " " + name);
		});
	}
}