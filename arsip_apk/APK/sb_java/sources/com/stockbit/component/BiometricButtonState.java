package com.stockbit.component;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/component/BiometricButtonState;", "", "<init>", "(Ljava/lang/String;I)V", "GONE", "ENABLED", "DISABLED", "pin_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum BiometricButtonState extends Enum<BiometricButtonState> {
    public static final BiometricButtonState DISABLED = null;
    public static final BiometricButtonState ENABLED = null;
    public static final BiometricButtonState GONE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BiometricButtonState[] f69026a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f69027b = null;

    static {
        GONE = new BiometricButtonState("GONE", 0);
        ENABLED = new BiometricButtonState("ENABLED", 1);
        DISABLED = new BiometricButtonState("DISABLED", 2);
        BiometricButtonState[] r02 = a();
        f69026a = r02;
        f69027b = kotlin.enums.b.a(r02);
    }

    BiometricButtonState(String r1, int r2) {
    }

    public static final /* synthetic */ BiometricButtonState[] a() {
        return new BiometricButtonState[]{GONE, ENABLED, DISABLED};
    }

    public static kotlin.enums.a getEntries() {
        return f69027b;
    }

    public static BiometricButtonState valueOf(String r1) {
        return (BiometricButtonState) Enum.valueOf(BiometricButtonState.class, r1);
    }

    public static BiometricButtonState[] values() {
        return (BiometricButtonState[]) f69026a.clone();
    }
}
