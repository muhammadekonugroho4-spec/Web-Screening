package com.google.zxing.client.result;

/* loaded from: classes6.dex */
public final class ProductParsedResult extends ParsedResult {
    private final String normalizedProductID;
    private final String productID;

    public ProductParsedResult(String r1) {
        this(r1, r1);
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        return this.productID;
    }

    public String getNormalizedProductID() {
        return this.normalizedProductID;
    }

    public String getProductID() {
        return this.productID;
    }

    public ProductParsedResult(String r2, String r3) {
        super(ParsedResultType.PRODUCT);
        this.productID = r2;
        this.normalizedProductID = r3;
    }
}
