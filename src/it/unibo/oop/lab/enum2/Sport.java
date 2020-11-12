/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 */
public enum Sport {
	
	BASKET(5, "Basketball", Place.INDOOR),
	VOLLEY(6, "Volleyball", Place.INDOOR),
	TENNIS(1, "Tennis", Place.OUTDOOR),
	BIKE(1, "Bike", Place.OUTDOOR),
	F1(1, "Formula 1", Place.OUTDOOR),
	MOTOGP(1, "MotoGP", Place.OUTDOOR),
	SOCCER(11, "Soccer", Place.OUTDOOR);

    /*
     * Number of members each team is composed of.
     */
	private final int nPlayers;
	/*
	 * Actual name of the sport.
	 */
	private final String actualName;
	/*
	 * Define if the sport is practiced indoor or outdoor.
	 */
	private final Place place;

	/**
	 * @param nPlayers
	 * 			number of members each team is composed of;
	 * @param actualName
	 * 			name of the sports;
	 * @param place
	 * 			where it's practiced the sport: indoor or outdoor.
	 */
	private Sport(final int nPlayers, final String actualName, final Place place) {
		this.nPlayers = nPlayers;
		this.actualName = actualName;
		this.place = place;
	}

	/**
	 * 
	 * @return true if called on individual sports.
	 */
	public boolean isIndividualSport() {
		return this.nPlayers == 1;
	}

	/**
	 * 
	 * @return true in case the sport is practiced indoor.
	 */
	public boolean isIndoorSport() {
		return this.place.equals(Place.INDOOR);
	}
	
	/**
	 * 
	 * @return the place where this sport is practiced.
	 */
	public Place getPlace() {
		return this.place;
	}
	
	/**
	 * 
	 * @return the string representation of a sport
	 */
	public String toString() {
		return "Sport [nPlayers=" + this.nPlayers + ", actualName=" + 
				this.actualName + ", place=" + this.place + "]";
	}
}
