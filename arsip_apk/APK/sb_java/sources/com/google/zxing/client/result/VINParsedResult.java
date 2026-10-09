package com.google.zxing.client.result;

/* loaded from: classes6.dex */
public final class VINParsedResult extends ParsedResult {
    private final String countryCode;
    private final int modelYear;
    private final char plantCode;
    private final String sequentialNumber;
    private final String vehicleAttributes;
    private final String vehicleDescriptorSection;
    private final String vehicleIdentifierSection;
    private final String vin;
    private final String worldManufacturerID;

    public VINParsedResult(String r2, String r3, String r4, String r5, String r6, String r7, int r8, char r9, String r10) {
        super(ParsedResultType.VIN);
        this.vin = r2;
        this.worldManufacturerID = r3;
        this.vehicleDescriptorSection = r4;
        this.vehicleIdentifierSection = r5;
        this.countryCode = r6;
        this.vehicleAttributes = r7;
        this.modelYear = r8;
        this.plantCode = r9;
        this.sequentialNumber = r10;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder r02 = new StringBuilder(50);
        r02.append(this.worldManufacturerID);
        r02.append(' ');
        r02.append(this.vehicleDescriptorSection);
        r02.append(' ');
        r02.append(this.vehicleIdentifierSection);
        r02.append('\n');
        String r3 = this.countryCode;
        if (r3 == null) goto L5;
        r02.append(r3);
        r02.append(' ');
    L5:
        r02.append(this.modelYear);
        r02.append(' ');
        r02.append(this.plantCode);
        r02.append(' ');
        r02.append(this.sequentialNumber);
        r02.append('\n');
        return r02.toString();
    }

    public int getModelYear() {
        return this.modelYear;
    }

    public char getPlantCode() {
        return this.plantCode;
    }

    public String getSequentialNumber() {
        return this.sequentialNumber;
    }

    public String getVIN() {
        return this.vin;
    }

    public String getVehicleAttributes() {
        return this.vehicleAttributes;
    }

    public String getVehicleDescriptorSection() {
        return this.vehicleDescriptorSection;
    }

    public String getVehicleIdentifierSection() {
        return this.vehicleIdentifierSection;
    }

    public String getWorldManufacturerID() {
        return this.worldManufacturerID;
    }
}
