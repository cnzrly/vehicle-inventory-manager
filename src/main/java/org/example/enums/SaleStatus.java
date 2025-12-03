package org.example.enums;

public enum SaleStatus {
    IN_STOCK("In Stock - Available"), // Ready for sale
    RESERVED("Reserved"), // Deposit placed, waiting for final sale
    SOLD("Sold - Delivered"), // Sale finalized and vehicle delivered
    PENDING_SALE("Sale Pending"), // Paperwork started, awaiting financing/delivery
    OUT_OF_SERVICE("Out of Service"), // In repair or maintenance, not for sale
    AUCTION("Scheduled for Auction"); // To be removed from direct inventory

    private final String displayName;

    /**
     * Constructor: Takes the display name for better user interface representation.
     * @param displayName The user-friendly name of the sale status.
     */
    SaleStatus(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Returns the user-friendly display name of the sale status.
     */
    public String getDisplayName() {
        return displayName;
    }
}