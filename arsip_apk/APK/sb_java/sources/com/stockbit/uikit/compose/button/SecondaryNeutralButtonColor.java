package com.stockbit.uikit.compose.button;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/uikit/compose/button/SecondaryNeutralButtonColor;", "", "<init>", "(Ljava/lang/String;I)V", "GREEN", "RED", "NEUTRAL", "uikit_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum SecondaryNeutralButtonColor extends Enum<SecondaryNeutralButtonColor> {
    public static final SecondaryNeutralButtonColor GREEN = null;
    public static final SecondaryNeutralButtonColor NEUTRAL = null;
    public static final SecondaryNeutralButtonColor RED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SecondaryNeutralButtonColor[] f151548a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f151549b = null;

    static {
        GREEN = new SecondaryNeutralButtonColor("GREEN", 0);
        RED = new SecondaryNeutralButtonColor("RED", 1);
        NEUTRAL = new SecondaryNeutralButtonColor("NEUTRAL", 2);
        SecondaryNeutralButtonColor[] r02 = a();
        f151548a = r02;
        f151549b = kotlin.enums.b.a(r02);
    }

    SecondaryNeutralButtonColor(String r1, int r2) {
    }

    public static final /* synthetic */ SecondaryNeutralButtonColor[] a() {
        return new SecondaryNeutralButtonColor[]{GREEN, RED, NEUTRAL};
    }

    public static kotlin.enums.a getEntries() {
        return f151549b;
    }

    public static SecondaryNeutralButtonColor valueOf(String r1) {
        return (SecondaryNeutralButtonColor) Enum.valueOf(SecondaryNeutralButtonColor.class, r1);
    }

    public static SecondaryNeutralButtonColor[] values() {
        return (SecondaryNeutralButtonColor[]) f151548a.clone();
    }
}
