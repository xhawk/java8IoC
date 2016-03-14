package dr.tomek;

import java.util.function.*;
import java.lang.*;

public interface Service<T, R> extends Function<T, R> {

	//BiFunction<String, String, String> catenator = (b, a) -> a + b;

	//Function<String, Service<String, String>> currier = config -> name -> catenator.apply(config, name);
	Function<String, Service<String, String>> currier = config -> name -> config + name;

	static Service<String, String> configure(String config) {
		return currier.apply(config);
	}

	default R serve(T term) {
		return this.apply(term);
	}
}
