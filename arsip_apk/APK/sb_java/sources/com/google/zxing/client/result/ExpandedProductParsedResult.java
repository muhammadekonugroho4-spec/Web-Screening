package com.google.zxing.client.result;

import java.util.Map;

/* loaded from: classes6.dex */
public final class ExpandedProductParsedResult extends ParsedResult {
    public static final String KILOGRAM = "KG";
    public static final String POUND = "LB";
    private final String bestBeforeDate;
    private final String expirationDate;
    private final String lotNumber;
    private final String packagingDate;
    private final String price;
    private final String priceCurrency;
    private final String priceIncrement;
    private final String productID;
    private final String productionDate;
    private final String rawText;
    private final String sscc;
    private final Map<String, String> uncommonAIs;
    private final String weight;
    private final String weightIncrement;
    private final String weightType;

    public ExpandedProductParsedResult(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13, String r14, String r15, Map<String, String> r16) {
        super(ParsedResultType.PRODUCT);
        this.rawText = r2;
        this.productID = r3;
        this.sscc = r4;
        this.lotNumber = r5;
        this.productionDate = r6;
        this.packagingDate = r7;
        this.bestBeforeDate = r8;
        this.expirationDate = r9;
        this.weight = r10;
        this.weightType = r11;
        this.weightIncrement = r12;
        this.price = r13;
        this.priceIncrement = r14;
        this.priceCurrency = r15;
        this.uncommonAIs = r16;
    }

    private static boolean equalsOrNull(Object r02, Object r1) {
        if (r02 != null) goto L9;
        if (r1 != null) goto L6;
        return true;
    L6:
        return false;
    L9:
        return r02.equals(r1);
    }

    private static int hashNotNull(Object r02) {
        if (r02 != null) goto L6;
        return 0;
    L6:
        return r02.hashCode();
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof ExpandedProductParsedResult) == true) goto L5;
        return false;
    L5:
        ExpandedProductParsedResult r42 = (ExpandedProductParsedResult) r4;
        if (equalsOrNull(this.productID, r42.productID) == true) goto L8;
    L33:
        return false;
    L8:
        if (equalsOrNull(this.sscc, r42.sscc) == false) goto L33;
        if (equalsOrNull(this.lotNumber, r42.lotNumber) == false) goto L33;
        if (equalsOrNull(this.productionDate, r42.productionDate) == false) goto L33;
        if (equalsOrNull(this.bestBeforeDate, r42.bestBeforeDate) == false) goto L33;
        if (equalsOrNull(this.expirationDate, r42.expirationDate) == false) goto L33;
        if (equalsOrNull(this.weight, r42.weight) == false) goto L33;
        if (equalsOrNull(this.weightType, r42.weightType) == false) goto L33;
        if (equalsOrNull(this.weightIncrement, r42.weightIncrement) == false) goto L33;
        if (equalsOrNull(this.price, r42.price) == false) goto L33;
        if (equalsOrNull(this.priceIncrement, r42.priceIncrement) == false) goto L33;
        if (equalsOrNull(this.priceCurrency, r42.priceCurrency) == false) goto L33;
        if (equalsOrNull(this.uncommonAIs, r42.uncommonAIs) == false) goto L33;
        return true;
    }

    public String getBestBeforeDate() {
        return this.bestBeforeDate;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        return String.valueOf(this.rawText);
    }

    public String getExpirationDate() {
        return this.expirationDate;
    }

    public String getLotNumber() {
        return this.lotNumber;
    }

    public String getPackagingDate() {
        return this.packagingDate;
    }

    public String getPrice() {
        return this.price;
    }

    public String getPriceCurrency() {
        return this.priceCurrency;
    }

    public String getPriceIncrement() {
        return this.priceIncrement;
    }

    public String getProductID() {
        return this.productID;
    }

    public String getProductionDate() {
        return this.productionDate;
    }

    public String getRawText() {
        return this.rawText;
    }

    public String getSscc() {
        return this.sscc;
    }

    public Map<String, String> getUncommonAIs() {
        return this.uncommonAIs;
    }

    public String getWeight() {
        return this.weight;
    }

    public String getWeightIncrement() {
        return this.weightIncrement;
    }

    public String getWeightType() {
        return this.weightType;
    }

    public int hashCode() {
        return (((((((((((hashNotNull(this.productID) ^ hashNotNull(this.sscc)) ^ hashNotNull(this.lotNumber)) ^ hashNotNull(this.productionDate)) ^ hashNotNull(this.bestBeforeDate)) ^ hashNotNull(this.expirationDate)) ^ hashNotNull(this.weight)) ^ hashNotNull(this.weightType)) ^ hashNotNull(this.weightIncrement)) ^ hashNotNull(this.price)) ^ hashNotNull(this.priceIncrement)) ^ hashNotNull(this.priceCurrency)) ^ hashNotNull(this.uncommonAIs);
    }
}
