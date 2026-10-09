package com.google.android.datatransport;

/* loaded from: classes4.dex */
final class AutoValue_ProductData extends ProductData {
    private final Integer productId;

    public AutoValue_ProductData(Integer r1) {
        this.productId = r1;
    }

    public boolean equals(Object r4) {
        if (r4 != this) goto L6;
        return true;
    L6:
        if ((r4 instanceof ProductData) == false) goto L14;
        Integer r1 = this.productId;
        Integer r42 = ((ProductData) r4).getProductId();
        if (r1 != null) goto L13;
        if (r42 != null) goto L11;
        return true;
    L11:
        return false;
    L13:
        return r1.equals(r42);
    L14:
        return false;
    }

    @Override // com.google.android.datatransport.ProductData
    public Integer getProductId() {
        return this.productId;
    }

    public int hashCode() {
        Integer r02 = this.productId;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return r03 ^ 1000003;
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "ProductData{productId=" + this.productId + "}";
    }
}
