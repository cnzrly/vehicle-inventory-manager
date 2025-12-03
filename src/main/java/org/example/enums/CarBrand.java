package org.example.enums;

public enum CarBrand {

    BMW("BMW"),
    MERCEDES_BENZ("Mercedes-Benz"),
    VOLKSWAGEN("Volkswagen"),
    AUDI("Audi"),
    PORSCHE("Porsche"),
    OPEL("Opel"),
    SMART("Smart"),

    TOYOTA("Toyota"),
    HONDA("Honda"),
    NISSAN("Nissan"),
    MAZDA("Mazda"),
    SUBARU("Subaru"),
    SUZUKI("Suzuki"),
    MITSUBISHI("Mitsubishi"),
    LEXUS("Lexus"),
    INFINITI("Infiniti"),

    HYUNDAI("Hyundai"),
    KIA("Kia"),
    GENESIS("Genesis"),

    FORD("Ford"),
    CHEVROLET("Chevrolet"),
    TESLA("Tesla"),
    JEEP("Jeep"),
    CADILLAC("Cadillac"),
    DODGE("Dodge"),
    CHRYSLER("Chrysler"),

    FIAT("Fiat"),
    ALFA_ROMEO("Alfa Romeo"),
    FERRARI("Ferrari"),
    MASERATI("Maserati"),
    LAMBORGHINI("Lamborghini"),

    RENAULT("Renault"),
    PEUGEOT("Peugeot"),
    CITROEN("Citroen"),
    DS_AUTOMOBILES("DS Automobiles"),

    LAND_ROVER("Land Rover"),
    JAGUAR("Jaguar"),
    MINI("Mini"),
    ASTON_MARTIN("Aston Martin"),
    MCLAREN("McLaren"),
    ROLLS_ROYCE("Rolls-Royce"),

    VOLVO("Volvo"),
    SAAB("Saab"),

    SKODA("Skoda"),
    SEAT("Seat"),
    DACIA("Dacia"),

    BYD("BYD"),
    GEELY("Geely"),
    MG("MG"),
    HAVAL("Haval"),

    LADA("Lada"),

    BUICK("Buick"),
    GMC("GMC");

    private final String displayName;

    CarBrand(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
