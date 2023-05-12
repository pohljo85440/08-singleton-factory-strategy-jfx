package ohm.softa.a08.filter;

import ohm.softa.a08.model.Meal;

import java.util.Arrays;

public class CategoryFilter extends FilterBase{
	private String[] filterCategories;
	private final boolean exclude;

	CategoryFilter (boolean exclude, String... filterCategories) {
		this.filterCategories = filterCategories;
		this.filterCategories = Arrays.stream(this.filterCategories).map(s -> s.toLowerCase()).toArray(String[]::new);
		this.exclude = exclude;
	}

	@Override
	protected boolean include(Meal m) {
		return exclude != Arrays.stream(filterCategories).anyMatch(f -> m.getCategory().toLowerCase().contains(f));
	}
}
