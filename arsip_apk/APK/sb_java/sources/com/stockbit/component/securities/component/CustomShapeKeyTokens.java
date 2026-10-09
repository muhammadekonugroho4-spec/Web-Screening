package com.stockbit.component.securities.component;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/stockbit/component/securities/component/CustomShapeKeyTokens;", "", "<init>", "(Ljava/lang/String;I)V", "CornerExtraLarge", "CornerExtraLargeTop", "CornerExtraSmall", "CornerExtraSmallTop", "CornerFull", "CornerLarge", "CornerLargeEnd", "CornerLargeTop", "CornerMedium", "CornerNone", "CornerSmall", "securities_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum CustomShapeKeyTokens extends Enum<CustomShapeKeyTokens> {
    public static final CustomShapeKeyTokens CornerExtraLarge = null;
    public static final CustomShapeKeyTokens CornerExtraLargeTop = null;
    public static final CustomShapeKeyTokens CornerExtraSmall = null;
    public static final CustomShapeKeyTokens CornerExtraSmallTop = null;
    public static final CustomShapeKeyTokens CornerFull = null;
    public static final CustomShapeKeyTokens CornerLarge = null;
    public static final CustomShapeKeyTokens CornerLargeEnd = null;
    public static final CustomShapeKeyTokens CornerLargeTop = null;
    public static final CustomShapeKeyTokens CornerMedium = null;
    public static final CustomShapeKeyTokens CornerNone = null;
    public static final CustomShapeKeyTokens CornerSmall = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CustomShapeKeyTokens[] f75820a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f75821b = null;

    static {
        CornerExtraLarge = new CustomShapeKeyTokens("CornerExtraLarge", 0);
        CornerExtraLargeTop = new CustomShapeKeyTokens("CornerExtraLargeTop", 1);
        CornerExtraSmall = new CustomShapeKeyTokens("CornerExtraSmall", 2);
        CornerExtraSmallTop = new CustomShapeKeyTokens("CornerExtraSmallTop", 3);
        CornerFull = new CustomShapeKeyTokens("CornerFull", 4);
        CornerLarge = new CustomShapeKeyTokens("CornerLarge", 5);
        CornerLargeEnd = new CustomShapeKeyTokens("CornerLargeEnd", 6);
        CornerLargeTop = new CustomShapeKeyTokens("CornerLargeTop", 7);
        CornerMedium = new CustomShapeKeyTokens("CornerMedium", 8);
        CornerNone = new CustomShapeKeyTokens("CornerNone", 9);
        CornerSmall = new CustomShapeKeyTokens("CornerSmall", 10);
        CustomShapeKeyTokens[] r02 = a();
        f75820a = r02;
        f75821b = kotlin.enums.b.a(r02);
    }

    CustomShapeKeyTokens(String r1, int r2) {
    }

    public static final /* synthetic */ CustomShapeKeyTokens[] a() {
        return new CustomShapeKeyTokens[]{CornerExtraLarge, CornerExtraLargeTop, CornerExtraSmall, CornerExtraSmallTop, CornerFull, CornerLarge, CornerLargeEnd, CornerLargeTop, CornerMedium, CornerNone, CornerSmall};
    }

    public static kotlin.enums.a getEntries() {
        return f75821b;
    }

    public static CustomShapeKeyTokens valueOf(String r1) {
        return (CustomShapeKeyTokens) Enum.valueOf(CustomShapeKeyTokens.class, r1);
    }

    public static CustomShapeKeyTokens[] values() {
        return (CustomShapeKeyTokens[]) f75820a.clone();
    }
}
