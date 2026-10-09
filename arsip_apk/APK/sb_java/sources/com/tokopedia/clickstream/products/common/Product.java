package com.tokopedia.clickstream.products.common;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum Product extends Enum<Product> implements Internal.EnumLite {
    public static final Product PRODUCT_GENERIC = null;
    public static final int PRODUCT_GENERIC_VALUE = 1;
    public static final Product PRODUCT_ONEKYC = null;
    public static final int PRODUCT_ONEKYC_VALUE = 2;
    public static final Product PRODUCT_UNSPECIFIED = null;
    public static final int PRODUCT_UNSPECIFIED_VALUE = 0;
    public static final Product UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f173823a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Product[] f173824b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f173825a = null;

        static {
            f173825a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (Product.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        Product r02 = new Product("PRODUCT_UNSPECIFIED", 0, 0);
        PRODUCT_UNSPECIFIED = r02;
        Product r1 = new Product("PRODUCT_GENERIC", 1, 1);
        PRODUCT_GENERIC = r1;
        Product r2 = new Product("PRODUCT_ONEKYC", 2, 2);
        PRODUCT_ONEKYC = r2;
        Product r3 = new Product("UNRECOGNIZED", 3, -1);
        UNRECOGNIZED = r3;
        f173824b = new Product[]{r02, r1, r2, r3};
        f173823a = new a();
    }

    Product(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static Product forNumber(int r1) {
        if (r1 == 0) goto L14;
        if (r1 == 1) goto L12;
        if (r1 == 2) goto L10;
        return null;
    L10:
        return PRODUCT_ONEKYC;
    L12:
        return PRODUCT_GENERIC;
    L14:
        return PRODUCT_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<Product> internalGetValueMap() {
        return f173823a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f173825a;
    }

    public static Product valueOf(String r1) {
        return (Product) Enum.valueOf(Product.class, r1);
    }

    public static Product[] values() {
        return (Product[]) f173824b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Product valueOf(int r02) {
        return forNumber(r02);
    }
}
