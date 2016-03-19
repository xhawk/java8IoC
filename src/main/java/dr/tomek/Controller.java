package dr.tomek;

import java.util.function.*;
import spark.*;

import static spark.Route.*;

public class Controller {

	private Service service;

	public Controller(Service theService) {
		System.out.println("Controller const");
		this.service = theService;
	}
}
