package org.example.enums;

public enum City {
    BAKU("Baku", "AZ1000"),
    ABSHERON("Absheron", "AZ0100"),
    AGHJABADI("Aghjabadi", "AZ0400"),
    AGHDAM("Aghdam", "AZ0200"),
    AGHDASH("Aghdash", "AZ0300"),
    AGSTAFA("Agstafa", "AZ0500"),
    AGSU("Agsu", "AZ0600"),
    ASTARA("Astara", "AZ0700"),
    BALAKAN("Balakən", "AZ0800"),
    BARDA("Barda", "AZ0900"),
    BEYLAGAN("Beylagan", "AZ1200"),
    BILASUVAR("Bilasuvar", "AZ1300"),
    JALILABAD("Jalilabad", "AZ1500"),
    DASHKASAN("Dashkasan", "AZ1600"),
    SHABRAN("Shabran", "AZ1700"),
    SHIRVAN("Shirvan", "AZ1800"),
    FUZULI("Fuzuli", "AZ1900"),
    GANJA("Ganja", "AZ2000"),
    GADABAY("Gadabay", "AZ2100"),
    GORANBOY("Goranboy", "AZ2200"),
    GOYCHAY("Goychay", "AZ2300"),
    HAJIGABUL("Hajigabul", "AZ2400"),
    GOYGOL("Goygol", "AZ2500"),
    KHACHMAZ("Khachmaz", "AZ2700"),
    KHIZI("Khizi", "AZ2900"),
    IMISHLI("Imishli", "AZ3000"),
    ISMAYILLI("Ismayilli", "AZ3100"),
    KURDAMIR("Kurdamir", "AZ3300"),
    QAKH("Qakh", "AZ3400"),
    QAZAKH("Qazakh", "AZ3500"),
    QABALA("Qabala", "AZ3600"),
    QOBUSTAN("Qobustan", "AZ3700"),
    QUBA("Quba", "AZ4000"),
    QUBADLI("Qubadli", "AZ3900"),
    LANKARAN("Lankaran", "AZ4200"),
    LERIK("Lerik", "AZ4300"),
    MASALLI("Masalli", "AZ4400"),
    MINGACHEVIR("Mingachevir", "AZ4500"),
    NAFTALAN("Naftalan", "AZ4600"),
    NEFTCHALA("Neftchala", "AZ4700"),
    OGHUZ("Oghuz", "AZ4800"),
    SAATLI("Saatlı", "AZ4900"),
    SAMUKH("Samukh", "AZ5100"),
    SALYAN("Salyan", "AZ5200"),
    SIYAZAN("Siyəzən", "AZ5300"),
    SABIRABAD("Sabirabad", "AZ5400"),
    SHAKI("Shaki", "AZ5500"),
    SHAMAKHI("Shamakhi", "AZ5600"),
    SHAMKIR("Shamkir", "AZ5700"),
    SHUSHA("Shusha", "AZ5800"),
    TARTAR("Tartar", "AZ5900"),
    TOVUZ("Tovuz", "AZ6000"),
    UJAR("Ujar", "AZ6100"),
    ZAQATALA("Zaqatala", "AZ6200"),
    ZARDAB("Zardab", "AZ6300"),
    ZANGILAN("Zangilan", "AZ6400"),
    YARDIMLI("Yardimli", "AZ6500");

    private final String displayName;
    private final String postalCode;

    City(String displayName, String postalCode) {
        this.displayName = displayName;
        this.postalCode = postalCode;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getPostalCode() {
        return postalCode;
    }
}