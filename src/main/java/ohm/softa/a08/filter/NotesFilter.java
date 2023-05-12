package ohm.softa.a08.filter;

import ohm.softa.a08.model.Meal;

public class NotesFilter extends FilterBase{

	private final String filterNote;

	NotesFilter (String filterNote) {
		this.filterNote = filterNote.toLowerCase();
	}

	@Override
	protected boolean include(Meal m) {
		return m.getNotes().stream().noneMatch(n -> n.toLowerCase().equals(filterNote));
	}
}
