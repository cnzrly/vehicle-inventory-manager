package org.example.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum CarModel {

    SERIES_1("1 Serisi", CarBrand.BMW),
    SERIES_3("3 Serisi", CarBrand.BMW),
    SERIES_5("5 Serisi", CarBrand.BMW),
    X1("X1", CarBrand.BMW),
    X5("X5", CarBrand.BMW),


    A_CLASS("A-Serisi", CarBrand.MERCEDES_BENZ),
    C_CLASS("C-Serisi", CarBrand.MERCEDES_BENZ),
    E_CLASS("E-Serisi", CarBrand.MERCEDES_BENZ),
    GLC("GLC", CarBrand.MERCEDES_BENZ),
    G_CLASS("G Serisi", CarBrand.MERCEDES_BENZ),


    GOLF("Golf", CarBrand.VOLKSWAGEN),
    PASSAT("Passat", CarBrand.VOLKSWAGEN),
    POLO("Polo", CarBrand.VOLKSWAGEN),
    TIGUAN("Tiguan", CarBrand.VOLKSWAGEN),


    A3("A3", CarBrand.AUDI),
    A4("A4", CarBrand.AUDI),
    Q3("Q3", CarBrand.AUDI),
    Q7("Q7", CarBrand.AUDI),


    CARRERA_911("911 Carrera", CarBrand.PORSCHE),
    CAYENNE("Cayenne", CarBrand.PORSCHE),
    PANAMERA("Panamera", CarBrand.PORSCHE),


    ASTRA("Astra", CarBrand.OPEL),
    CORSA("Corsa", CarBrand.OPEL),
    INSIGNIA("Insignia", CarBrand.OPEL),


    FORTWO("ForTwo", CarBrand.SMART),
    FORFOUR("ForFour", CarBrand.SMART),


    COROLLA("Corolla", CarBrand.TOYOTA),
    YARIS("Yaris", CarBrand.TOYOTA),
    RAV4("RAV4", CarBrand.TOYOTA),
    HILUX("Hilux", CarBrand.TOYOTA),


    CIVIC("Civic", CarBrand.HONDA),
    ACCORD("Accord", CarBrand.HONDA),
    CRV("CR-V", CarBrand.HONDA),


    QASHQAI("Qashqai", CarBrand.NISSAN),
    JUKE("Juke", CarBrand.NISSAN),
    NAVARA("Navara", CarBrand.NISSAN),


    MAZDA_3("Mazda 3", CarBrand.MAZDA),
    MAZDA_6("Mazda 6", CarBrand.MAZDA),
    CX_5("CX-5", CarBrand.MAZDA),


    IMPREZA("Impreza", CarBrand.SUBARU),
    OUTBACK("Outback", CarBrand.SUBARU),


    VITARA("Vitara", CarBrand.SUZUKI),
    SWIFT("Swift", CarBrand.SUZUKI),


    LANCER("Lancer", CarBrand.MITSUBISHI),
    ASX("ASX", CarBrand.MITSUBISHI),


    IS_SERIES("IS Serisi", CarBrand.LEXUS),
    RX_SERIES("RX Serisi", CarBrand.LEXUS),


    Q50("Q50", CarBrand.INFINITI),
    QX60("QX60", CarBrand.INFINITI),


    I20("i20", CarBrand.HYUNDAI),
    I30("i30", CarBrand.HYUNDAI),
    TUCSON("Tucson", CarBrand.HYUNDAI),


    PICANTO("Picanto", CarBrand.KIA),
    CEED("Ceed", CarBrand.KIA),
    SPORTAGE("Sportage", CarBrand.KIA),


    G70("G70", CarBrand.GENESIS),
    GV80("GV80", CarBrand.GENESIS),


    FIESTA("Fiesta", CarBrand.FORD),
    FOCUS("Focus", CarBrand.FORD),
    MUSTANG("Mustang", CarBrand.FORD),
    F_150("F-150", CarBrand.FORD),


    CRUZE("Cruze", CarBrand.CHEVROLET),
    CAMARO("Camaro", CarBrand.CHEVROLET),


    MODEL_3("Model 3", CarBrand.TESLA),
    MODEL_Y("Model Y", CarBrand.TESLA),


    WRANGLER("Wrangler", CarBrand.JEEP),
    CHEROKEE("Cherokee", CarBrand.JEEP),


    ESCALADE("Escalade", CarBrand.CADILLAC),
    CT5("CT5", CarBrand.CADILLAC),

    CHARGER("Charger", CarBrand.DODGE),
    CHALLENGER("Challenger", CarBrand.DODGE),


    PACIFICA("Pacifica", CarBrand.CHRYSLER),
    CHRYSLER_300("300", CarBrand.CHRYSLER),


    EGEA("Egea", CarBrand.FIAT),
    PANDA("Panda", CarBrand.FIAT),


    GIULIA("Giulia", CarBrand.ALFA_ROMEO),
    STELVIO("Stelvio", CarBrand.ALFA_ROMEO),


    SF90("SF90 Stradale", CarBrand.FERRARI),
    ROMA("Roma", CarBrand.FERRARI),


    GHIBLI("Ghibli", CarBrand.MASERATI),
    LEVANTE("Levante", CarBrand.MASERATI),


    HURACAN("Huracan", CarBrand.LAMBORGHINI),
    URUS("Urus", CarBrand.LAMBORGHINI),



    CLIO("Clio", CarBrand.RENAULT),
    MEGANE("Megane", CarBrand.RENAULT),


    PEUGEOT_208("208", CarBrand.PEUGEOT),
    PEUGEOT_3008("3008", CarBrand.PEUGEOT),


    C3("C3", CarBrand.CITROEN),
    C5_AIRCROSS("C5 Aircross", CarBrand.CITROEN),


    DS_3("DS 3", CarBrand.DS_AUTOMOBILES),
    DS_7("DS 7", CarBrand.DS_AUTOMOBILES),



    DEFENDER("Defender", CarBrand.LAND_ROVER),
    RANGE_ROVER("Range Rover", CarBrand.LAND_ROVER),


    F_TYPE("F-Type", CarBrand.JAGUAR),
    E_PACE("E-Pace", CarBrand.JAGUAR),


    COOPER("Cooper", CarBrand.MINI),
    COUNTRYMAN("Countryman", CarBrand.MINI),


    DB11("DB11", CarBrand.ASTON_MARTIN),
    VANTAGE("Vantage", CarBrand.ASTON_MARTIN),


    GT("GT", CarBrand.MCLAREN),
    ARTURA("Artura", CarBrand.MCLAREN),


    PHANTOM("Phantom", CarBrand.ROLLS_ROYCE),
    GHOST("Ghost", CarBrand.ROLLS_ROYCE),


    S60("S60", CarBrand.VOLVO),
    XC90("XC90", CarBrand.VOLVO),


    SAAB_9_3("9-3", CarBrand.SAAB),
    SAAB_9_5("9-5", CarBrand.SAAB),


    OCTAVIA("Octavia", CarBrand.SKODA),
    SUPERB("Superb", CarBrand.SKODA),


    IBIZA("Ibiza", CarBrand.SEAT),
    LEON("Leon", CarBrand.SEAT),


    SANDERO("Sandero", CarBrand.DACIA),
    DUSTER("Duster", CarBrand.DACIA),


    HAN("Han", CarBrand.BYD),
    ATTO_3("Atto 3", CarBrand.BYD),


    EMGRAND("Emgrand", CarBrand.GEELY),
    COOLRAY("Coolray", CarBrand.GEELY),


    MG_ZS("ZS", CarBrand.MG),
    MG_HS("HS", CarBrand.MG),


    H6("H6", CarBrand.HAVAL),
    JOLION("Jolion", CarBrand.HAVAL),


    VESTA("Vesta", CarBrand.LADA),
    NIVA("Niva", CarBrand.LADA),


    ENCLAVE("Enclave", CarBrand.BUICK),
    REGAL("Regal", CarBrand.BUICK),


    SIERRA("Sierra", CarBrand.GMC),
    YUKON("Yukon", CarBrand.GMC);

    private final String displayName;
    private final CarBrand brand;

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