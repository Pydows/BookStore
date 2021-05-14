package metier;

import javax.persistence.Entity;

@Entity
public enum Genre {
	Policier, Historique, Comedie, SF, Biographie,Romance;
	
	private Genre() {
	}

}
