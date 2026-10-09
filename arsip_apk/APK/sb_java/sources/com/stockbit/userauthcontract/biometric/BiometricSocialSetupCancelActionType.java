package com.stockbit.userauthcontract.biometric;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/userauthcontract/biometric/BiometricSocialSetupCancelActionType;", "", "<init>", "(Ljava/lang/String;I)V", "SKIP", "LOGOUT", "userauth-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum BiometricSocialSetupCancelActionType extends Enum<BiometricSocialSetupCancelActionType> {
    public static final BiometricSocialSetupCancelActionType LOGOUT = null;
    public static final BiometricSocialSetupCancelActionType SKIP = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BiometricSocialSetupCancelActionType[] f165591a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f165592b = null;

    static {
        SKIP = new BiometricSocialSetupCancelActionType("SKIP", 0);
        LOGOUT = new BiometricSocialSetupCancelActionType("LOGOUT", 1);
        BiometricSocialSetupCancelActionType[] r02 = a();
        f165591a = r02;
        f165592b = kotlin.enums.b.a(r02);
    }

    BiometricSocialSetupCancelActionType(String r1, int r2) {
    }

    public static final /* synthetic */ BiometricSocialSetupCancelActionType[] a() {
        return new BiometricSocialSetupCancelActionType[]{SKIP, LOGOUT};
    }

    public static kotlin.enums.a getEntries() {
        return f165592b;
    }

    public static BiometricSocialSetupCancelActionType valueOf(String r1) {
        return (BiometricSocialSetupCancelActionType) Enum.valueOf(BiometricSocialSetupCancelActionType.class, r1);
    }

    public static BiometricSocialSetupCancelActionType[] values() {
        return (BiometricSocialSetupCancelActionType[]) f165591a.clone();
    }
}
