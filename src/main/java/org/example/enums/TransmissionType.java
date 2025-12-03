package org.example.enums;

public enum TransmissionType {
    MANUAL("Manual"),
    AUTOMATIC("Automatic (Torque Converter)"),
    SEMI_AUTOMATIC("Semi-Automatic"),
    CVT("Continuously Variable Transmission (CVT)"),
    DUAL_CLUTCH("Dual-Clutch Transmission (DCT)");

    private final String displayName;

    /**
     * Constructor: Takes the display name for better user interface representation.
     * @param displayName The user-friendly name of the transmission type.
     */
    TransmissionType(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Returns the user-friendly display name of the transmission type.
     */
    public String getDisplayName() {
        return displayName;
    }
}