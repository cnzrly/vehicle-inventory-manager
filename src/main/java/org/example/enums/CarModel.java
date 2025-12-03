package org.example.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum CarModel {
    // --- Almanya ---
    // BMW (2+)
    SERIES_1("1 Serisi", CarBrand.BMW),
    SERIES_3("3 Serisi", CarBrand.BMW),
    SERIES_5("5 Serisi", CarBrand.BMW),
    X1("X1", CarBrand.BMW),
    X5("X5", CarBrand.BMW),

    // MERCEDES_BENZ (2+)
    A_CLASS("A-Serisi", CarBrand.MERCEDES_BENZ),
    C_CLASS("C-Serisi", CarBrand.MERCEDES_BENZ),
    E_CLASS("E-Serisi", CarBrand.MERCEDES_BENZ),
    GLC("GLC", CarBrand.MERCEDES_BENZ),
    G_CLASS("G Serisi", CarBrand.MERCEDES_BENZ),

    // VOLKSWAGEN (2+)
    GOLF("Golf", CarBrand.VOLKSWAGEN),
    PASSAT("Passat", CarBrand.VOLKSWAGEN),
    POLO("Polo", CarBrand.VOLKSWAGEN),
    TIGUAN("Tiguan", CarBrand.VOLKSWAGEN),

    // AUDI (2+)
    A3("A3", CarBrand.AUDI),
    A4("A4", CarBrand.AUDI),
    Q3("Q3", CarBrand.AUDI),
    Q7("Q7", CarBrand.AUDI),

    // PORSCHE (2+)
    CARRERA_911("911 Carrera", CarBrand.PORSCHE),
    CAYENNE("Cayenne", CarBrand.PORSCHE),
    PANAMERA("Panamera", CarBrand.PORSCHE),

    // OPEL (2+)
    ASTRA("Astra", CarBrand.OPEL),
    CORSA("Corsa", CarBrand.OPEL),
    INSIGNIA("Insignia", CarBrand.OPEL),

    // SMART (2+)
    FORTWO("ForTwo", CarBrand.SMART),
    FORFOUR("ForFour", CarBrand.SMART),

    // --- Japonya ---
    // TOYOTA (2+)
    COROLLA("Corolla", CarBrand.TOYOTA),
    YARIS("Yaris", CarBrand.TOYOTA),
    RAV4("RAV4", CarBrand.TOYOTA),
    HILUX("Hilux", CarBrand.TOYOTA),

    // HONDA (2+)
    CIVIC("Civic", CarBrand.HONDA),
    ACCORD("Accord", CarBrand.HONDA),
    CRV("CR-V", CarBrand.HONDA),

    // NISSAN (2+)
    QASHQAI("Qashqai", CarBrand.NISSAN),
    JUKE("Juke", CarBrand.NISSAN),
    NAVARA("Navara", CarBrand.NISSAN),

    // MAZDA (2+)
    MAZDA_3("Mazda 3", CarBrand.MAZDA),
    MAZDA_6("Mazda 6", CarBrand.MAZDA),
    CX_5("CX-5", CarBrand.MAZDA),

    // SUBARU (2+)
    IMPREZA("Impreza", CarBrand.SUBARU),
    OUTBACK("Outback", CarBrand.SUBARU),

    // SUZUKI (2+)
    VITARA("Vitara", CarBrand.SUZUKI),
    SWIFT("Swift", CarBrand.SUZUKI),

    // MITSUBISHI (2+)
    LANCER("Lancer", CarBrand.MITSUBISHI),
    ASX("ASX", CarBrand.MITSUBISHI),

    // LEXUS (2+)
    IS_SERIES("IS Serisi", CarBrand.LEXUS),
    RX_SERIES("RX Serisi", CarBrand.LEXUS),

    // INFINITI (2+)
    Q50("Q50", CarBrand.INFINITI),
    QX60("QX60", CarBrand.INFINITI),

    // --- Güney Kore ---
    // HYUNDAI (2+)
    I20("i20", CarBrand.HYUNDAI),
    I30("i30", CarBrand.HYUNDAI),
    TUCSON("Tucson", CarBrand.HYUNDAI),

    // KIA (2+)
    PICANTO("Picanto", CarBrand.KIA),
    CEED("Ceed", CarBrand.KIA),
    SPORTAGE("Sportage", CarBrand.KIA),

    // GENESIS (2+)
    G70("G70", CarBrand.GENESIS),
    GV80("GV80", CarBrand.GENESIS),

    // --- ABD ---
    // FORD (2+)
    FIESTA("Fiesta", CarBrand.FORD),
    FOCUS("Focus", CarBrand.FORD),
    MUSTANG("Mustang", CarBrand.FORD),
    F_150("F-150", CarBrand.FORD),

    // CHEVROLET (2+)
    CRUZE("Cruze", CarBrand.CHEVROLET),
    CAMARO("Camaro", CarBrand.CHEVROLET),

    // TESLA (2+)
    MODEL_3("Model 3", CarBrand.TESLA),
    MODEL_Y("Model Y", CarBrand.TESLA),

    // JEEP (2+)
    WRANGLER("Wrangler", CarBrand.JEEP),
    CHEROKEE("Cherokee", CarBrand.JEEP),

    // CADILLAC (2+)
    ESCALADE("Escalade", CarBrand.CADILLAC),
    CT5("CT5", CarBrand.CADILLAC),

    // DODGE (2+)
    CHARGER("Charger", CarBrand.DODGE),
    CHALLENGER("Challenger", CarBrand.DODGE),

    // CHRYSLER (2+)
    PACIFICA("Pacifica", CarBrand.CHRYSLER),
    CHRYSLER_300("300", CarBrand.CHRYSLER),

    // --- İtalya ---
    // FIAT (2+)
    EGEA("Egea", CarBrand.FIAT),
    PANDA("Panda", CarBrand.FIAT),

    // ALFA_ROMEO (2+)
    GIULIA("Giulia", CarBrand.ALFA_ROMEO),
    STELVIO("Stelvio", CarBrand.ALFA_ROMEO),

    // FERRARI (2+)
    SF90("SF90 Stradale", CarBrand.FERRARI),
    ROMA("Roma", CarBrand.FERRARI),

    // MASERATI (2+)
    GHIBLI("Ghibli", CarBrand.MASERATI),
    LEVANTE("Levante", CarBrand.MASERATI),

    // LAMBORGHINI (2+)
    HURACAN("Huracan", CarBrand.LAMBORGHINI),
    URUS("Urus", CarBrand.LAMBORGHINI),

    // --- Fransa ---
    // RENAULT (2+)
    CLIO("Clio", CarBrand.RENAULT),
    MEGANE("Megane", CarBrand.RENAULT),

    // PEUGEOT (2+)
    PEUGEOT_208("208", CarBrand.PEUGEOT),
    PEUGEOT_3008("3008", CarBrand.PEUGEOT),

    // CITROEN (2+)
    C3("C3", CarBrand.CITROEN),
    C5_AIRCROSS("C5 Aircross", CarBrand.CITROEN),

    // DS_AUTOMOBILES (2+)
    DS_3("DS 3", CarBrand.DS_AUTOMOBILES),
    DS_7("DS 7", CarBrand.DS_AUTOMOBILES),

    // --- Birleşik Krallık ---
    // LAND_ROVER (2+)
    DEFENDER("Defender", CarBrand.LAND_ROVER),
    RANGE_ROVER("Range Rover", CarBrand.LAND_ROVER),

    // JAGUAR (2+)
    F_TYPE("F-Type", CarBrand.JAGUAR),
    E_PACE("E-Pace", CarBrand.JAGUAR),

    // MINI (2+)
    COOPER("Cooper", CarBrand.MINI),
    COUNTRYMAN("Countryman", CarBrand.MINI),

    // ASTON_MARTIN (2+)
    DB11("DB11", CarBrand.ASTON_MARTIN),
    VANTAGE("Vantage", CarBrand.ASTON_MARTIN),

    // MCLAREN (2+)
    GT("GT", CarBrand.MCLAREN),
    ARTURA("Artura", CarBrand.MCLAREN),

    // ROLLS_ROYCE (2+)
    PHANTOM("Phantom", CarBrand.ROLLS_ROYCE),
    GHOST("Ghost", CarBrand.ROLLS_ROYCE),

    // --- İsveç ---
    // VOLVO (2+)
    S60("S60", CarBrand.VOLVO),
    XC90("XC90", CarBrand.VOLVO),

    // SAAB (2+)
    SAAB_9_3("9-3", CarBrand.SAAB),
    SAAB_9_5("9-5", CarBrand.SAAB),

    // --- Diğer Avrupa ---
    // SKODA (2+)
    OCTAVIA("Octavia", CarBrand.SKODA),
    SUPERB("Superb", CarBrand.SKODA),

    // SEAT (2+)
    IBIZA("Ibiza", CarBrand.SEAT),
    LEON("Leon", CarBrand.SEAT),

    // DACIA (2+)
    SANDERO("Sandero", CarBrand.DACIA),
    DUSTER("Duster", CarBrand.DACIA),

    // --- Çin ---
    // BYD (2+)
    HAN("Han", CarBrand.BYD),
    ATTO_3("Atto 3", CarBrand.BYD),

    // GEELY (2+)
    EMGRAND("Emgrand", CarBrand.GEELY),
    COOLRAY("Coolray", CarBrand.GEELY),

    // MG (2+)
    MG_ZS("ZS", CarBrand.MG),
    MG_HS("HS", CarBrand.MG),

    // HAVAL (2+)
    H6("H6", CarBrand.HAVAL),
    JOLION("Jolion", CarBrand.HAVAL),

    // --- Diğer ---
    // LADA (2+)
    VESTA("Vesta", CarBrand.LADA),
    NIVA("Niva", CarBrand.LADA),

    // BUICK (2+)
    ENCLAVE("Enclave", CarBrand.BUICK),
    REGAL("Regal", CarBrand.BUICK),

    // GMC (2+)
    SIERRA("Sierra", CarBrand.GMC),
    YUKON("Yukon", CarBrand.GMC);

    private final String displayName;
    private final CarBrand brand;

    // Constructor: Her model bir gösterim adı ve bir marka alır.
    CarModel(String displayName, CarBrand brand) {
        this.displayName = displayName;
        this.brand = brand;
    }

    public String getDisplayName() {
        return displayName;
    }

    public CarBrand getBrand() {
        return brand;
    }

    public static List<CarModel> getModelsByBrand(CarBrand brand) {
        return Arrays.stream(CarModel.values())
                .filter(model -> model.getBrand() == brand)
                .collect(Collectors.toList());
    }
}