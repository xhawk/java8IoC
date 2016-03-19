package dr.tomek;

import java.util.function.*;

import static spark.Spark.*;

public class Application {

	public Application() {
		get("/hello", (req, res) -> {		

			String config = "prefix";
			Service uo = Service.configure(config);
			return uo.apply("postfix");
		});
	}
}
