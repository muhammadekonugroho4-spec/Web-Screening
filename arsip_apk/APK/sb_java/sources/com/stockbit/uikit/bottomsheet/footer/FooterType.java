package com.stockbit.uikit.bottomsheet.footer;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stockbit/uikit/bottomsheet/footer/FooterType;", "", "<init>", "(Ljava/lang/String;I)V", "SINGLE_CTA", "HORIZONTAL_CTA", "HORIZONTAL_SECONDARY_CTA", "VERTICAL_CTA", "NO_CTA", "uikit_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum FooterType extends Enum<FooterType> {
    public static final FooterType HORIZONTAL_CTA = null;
    public static final FooterType HORIZONTAL_SECONDARY_CTA = null;
    public static final FooterType NO_CTA = null;
    public static final FooterType SINGLE_CTA = null;
    public static final FooterType VERTICAL_CTA = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FooterType[] f151330a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f151331b = null;

    static {
        SINGLE_CTA = new FooterType("SINGLE_CTA", 0);
        HORIZONTAL_CTA = new FooterType("HORIZONTAL_CTA", 1);
        HORIZONTAL_SECONDARY_CTA = new FooterType("HORIZONTAL_SECONDARY_CTA", 2);
        VERTICAL_CTA = new FooterType("VERTICAL_CTA", 3);
        NO_CTA = new FooterType("NO_CTA", 4);
        FooterType[] r02 = a();
        f151330a = r02;
        f151331b = kotlin.enums.b.a(r02);
    }

    FooterType(String r1, int r2) {
    }

    public static final /* synthetic */ FooterType[] a() {
        return new FooterType[]{SINGLE_CTA, HORIZONTAL_CTA, HORIZONTAL_SECONDARY_CTA, VERTICAL_CTA, NO_CTA};
    }

    public static kotlin.enums.a getEntries() {
        return f151331b;
    }

    public static FooterType valueOf(String r1) {
        return (FooterType) Enum.valueOf(FooterType.class, r1);
    }

    public static FooterType[] values() {
        return (FooterType[]) f151330a.clone();
    }
}
