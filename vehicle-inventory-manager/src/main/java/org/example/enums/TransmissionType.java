package org.example.enums;

public enum TransmissionType {
    MANUAL("Manual"),
    AUTOMATIC("Automatic (Torque Converter)"),
    SEMI_AUTOMATIC("Semi-Automatic"),
    CVT("Continuously Variable Transmission (CVT)"),
    DUAL_CLUTCH("Dual-Clutch Transmission (DCT)");

    private final String displayName;


    TransmissionType(String displayName) {
        this.displayName = displayName;
    }


    public String getDisplayName() {
        return displayName;
    }
}