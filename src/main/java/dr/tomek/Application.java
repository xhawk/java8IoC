package dr.tomek;

import java.util.function.*;

import static spark.Spark.*;

public class Application {

	public Application() {
		get("/hello", (req, res) -> {
			return Service.doo("Tomi", (result) -> {
				return result;
			});
		});

	}
}