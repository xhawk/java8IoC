package dr.tomek;

<<<<<<< HEAD
import java.util.function.*;

=======
>>>>>>> origin/master
import static spark.Spark.*;

public class Application {

	public Application() {
<<<<<<< HEAD
		get("/hello", (req, res) -> {		

			String config = "prefix";
			Service uo = Service.configure(config);
			return uo.apply("postfix");
		});
=======
		get("/hello", (req, res) -> {
			String config = "xyz";
			return Service.configure(config).serve("Tomi");
		});

>>>>>>> origin/master
	}
}
