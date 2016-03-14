package dr.tomek;

import static spark.Spark.*;

public class Application {

	public Application() {
		get("/hello", (req, res) -> {
			String config = "xyz";
			return Service.configure(config).serve("Tomi");
		});

	}
}
