package ohm.softa.a08.filter;

import ohm.softa.a08.model.Meal;
import java.util.List;

public interface IMealsFilter {
	List<Meal> filter(List<Meal> meals);
}
