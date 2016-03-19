package dr.tomek;

import java.util.function.*;
import java.lang.*;

public interface Service {

	Function<String, UnaryOperator> intFun = (config) -> {
		UnaryOperator iuo = (b) -> config + b;
		return iuo;
	};

	default Service configure(String config) {
		intFun.apply(config);
		return this;
	}

	default Service serve(String name) {
		return intFun.apply(name);
	}
}
