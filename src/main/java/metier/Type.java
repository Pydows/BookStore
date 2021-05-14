package metier;

import javax.persistence.Entity;

@Entity
public enum Type {
	Roman, Manga, BD, RecueilPoesie, PieceTheatre;
	
	private Type() {
	}

}
