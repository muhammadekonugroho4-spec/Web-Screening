package com.stockbit.setting.ui.biometric;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/setting/ui/biometric/BiometricSetupOutcome;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "REJECTED", "INCONCLUSIVE", "setting_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum BiometricSetupOutcome extends Enum<BiometricSetupOutcome> {
    public static final BiometricSetupOutcome INCONCLUSIVE = null;
    public static final BiometricSetupOutcome REJECTED = null;
    public static final BiometricSetupOutcome SUCCESS = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BiometricSetupOutcome[] f135709a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f135710b = null;

    static {
        SUCCESS = new BiometricSetupOutcome("SUCCESS", 0);
        REJECTED = new BiometricSetupOutcome("REJECTED", 1);
        INCONCLUSIVE = new BiometricSetupOutcome("INCONCLUSIVE", 2);
        BiometricSetupOutcome[] r02 = a();
        f135709a = r02;
        f135710b = kotlin.enums.b.a(r02);
    }

    BiometricSetupOutcome(String r1, int r2) {
    }

    public static final /* synthetic */ BiometricSetupOutcome[] a() {
        return new BiometricSetupOutcome[]{SUCCESS, REJECTED, INCONCLUSIVE};
    }

    public static kotlin.enums.a getEntries() {
        return f135710b;
    }

    public static BiometricSetupOutcome valueOf(String r1) {
        return (BiometricSetupOutcome) Enum.valueOf(BiometricSetupOutcome.class, r1);
    }

    public static BiometricSetupOutcome[] values() {
        return (BiometricSetupOutcome[]) f135709a.clone();
    }
}
