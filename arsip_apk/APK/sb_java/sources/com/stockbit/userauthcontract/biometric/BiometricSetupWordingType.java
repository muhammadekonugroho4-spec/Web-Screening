package com.stockbit.userauthcontract.biometric;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/userauthcontract/biometric/BiometricSetupWordingType;", "", "<init>", "(Ljava/lang/String;I)V", "ENABLE", "RE_ENABLE", "userauth-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum BiometricSetupWordingType extends Enum<BiometricSetupWordingType> {
    public static final BiometricSetupWordingType ENABLE = null;
    public static final BiometricSetupWordingType RE_ENABLE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BiometricSetupWordingType[] f165589a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f165590b = null;

    static {
        ENABLE = new BiometricSetupWordingType("ENABLE", 0);
        RE_ENABLE = new BiometricSetupWordingType("RE_ENABLE", 1);
        BiometricSetupWordingType[] r02 = a();
        f165589a = r02;
        f165590b = kotlin.enums.b.a(r02);
    }

    BiometricSetupWordingType(String r1, int r2) {
    }

    public static final /* synthetic */ BiometricSetupWordingType[] a() {
        return new BiometricSetupWordingType[]{ENABLE, RE_ENABLE};
    }

    public static kotlin.enums.a getEntries() {
        return f165590b;
    }

    public static BiometricSetupWordingType valueOf(String r1) {
        return (BiometricSetupWordingType) Enum.valueOf(BiometricSetupWordingType.class, r1);
    }

    public static BiometricSetupWordingType[] values() {
        return (BiometricSetupWordingType[]) f165589a.clone();
    }
}
