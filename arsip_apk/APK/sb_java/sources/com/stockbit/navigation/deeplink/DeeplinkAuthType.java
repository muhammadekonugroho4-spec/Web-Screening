package com.stockbit.navigation.deeplink;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/navigation/deeplink/DeeplinkAuthType;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_AUTH_ONLY", "TYPE_NON_AUTH_ONLY", "NO_RULES", "navigation_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum DeeplinkAuthType extends Enum<DeeplinkAuthType> {
    public static final DeeplinkAuthType NO_RULES = null;
    public static final DeeplinkAuthType TYPE_AUTH_ONLY = null;
    public static final DeeplinkAuthType TYPE_NON_AUTH_ONLY = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DeeplinkAuthType[] f122433a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f122434b = null;

    static {
        TYPE_AUTH_ONLY = new DeeplinkAuthType("TYPE_AUTH_ONLY", 0);
        TYPE_NON_AUTH_ONLY = new DeeplinkAuthType("TYPE_NON_AUTH_ONLY", 1);
        NO_RULES = new DeeplinkAuthType("NO_RULES", 2);
        DeeplinkAuthType[] r02 = a();
        f122433a = r02;
        f122434b = kotlin.enums.b.a(r02);
    }

    DeeplinkAuthType(String r1, int r2) {
    }

    public static final /* synthetic */ DeeplinkAuthType[] a() {
        return new DeeplinkAuthType[]{TYPE_AUTH_ONLY, TYPE_NON_AUTH_ONLY, NO_RULES};
    }

    public static kotlin.enums.a getEntries() {
        return f122434b;
    }

    public static DeeplinkAuthType valueOf(String r1) {
        return (DeeplinkAuthType) Enum.valueOf(DeeplinkAuthType.class, r1);
    }

    public static DeeplinkAuthType[] values() {
        return (DeeplinkAuthType[]) f122433a.clone();
    }
}
