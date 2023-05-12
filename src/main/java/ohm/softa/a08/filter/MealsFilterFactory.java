package ohm.softa.a08.filter;

import java.util.HashMap;
import java.util.Map;

public abstract class MealsFilterFactory {
	private static  final Map<String, IMealsFilter> filters = new HashMap<>();
	static {
		filters.put("All", new NoFilter());
		filters.put("Vegetarian", new CategoryFilter(false, "vegetarisch", "vegan"));
		filters.put("No pork", new CategoryFilter(true, "schwein"));
		filters.put("No soy", new NotesFilter("mit soja"));
	}
	public static IMealsFilter getStrategy(String key) {
		if(key == null) {
			return new NoFilter();
		}
		return filters.get(key);
	}
}
