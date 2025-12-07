package org.example.enums;

public enum FuelType {
    PETROL("Gasoline"),
    DIESEL("Diesel"),
    LPG("Liquefied Petroleum Gas (LPG)"),
    ELECTRIC("Electric"),
    HYBRID("Hybrid (Petrol/Electric)"),
    PHEV("Plug-in Hybrid Electric Vehicle (PHEV)"),
    HYDROGEN("Hydrogen (Fuel Cell)");

    private final String displayName;

    /**
     * Constructor: Takes the display name for better user interface representation.
     * @param displayName The user-friendly name of the fuel type.
     */
    FuelType(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Returns the user-friendly display name of the fuel type.
     */
    public String getDisplayName() {
        return displayName;
    }
}