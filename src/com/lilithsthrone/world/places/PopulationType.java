package com.lilithsthrone.world.places;

/**
 * @since 0.2.12
 * @version 0.2.12
 * @author Innoxia
 */
public enum PopulationType {

	PEOPLE("people"),
	
	HARPIES("harpies"),
	
	CROWD("crowd"),
	
	CROWDS("crowds"),
	
	ENFORCERS("enforcers"),
	
	SHOPPERS("shoppers"),

	VIPS("VIPs"),
	
	GUARDS("guards");

	String name;
	
	private PopulationType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
