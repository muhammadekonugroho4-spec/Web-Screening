package com.stockbit.authenticator.tracker;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stockbit/authenticator/tracker/BiometricType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SOCIAL", "SECURITIES", "TRUSTED_DEVICE", "authenticator_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum BiometricType extends Enum<BiometricType> {
    public static final BiometricType SECURITIES = null;
    public static final BiometricType SOCIAL = null;
    public static final BiometricType TRUSTED_DEVICE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BiometricType[] f48074a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f48075b = null;
    private final String value;

    static {
        SOCIAL = new BiometricType("SOCIAL", 0, "biometric_social");
        SECURITIES = new BiometricType("SECURITIES", 1, "biometric_securities");
        TRUSTED_DEVICE = new BiometricType("TRUSTED_DEVICE", 2, "trusted_device");
        BiometricType[] r02 = a();
        f48074a = r02;
        f48075b = kotlin.enums.b.a(r02);
    }

    BiometricType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ BiometricType[] a() {
        return new BiometricType[]{SOCIAL, SECURITIES, TRUSTED_DEVICE};
    }

    public static kotlin.enums.a getEntries() {
        return f48075b;
    }

    public static BiometricType valueOf(String r1) {
        return (BiometricType) Enum.valueOf(BiometricType.class, r1);
    }

    public static BiometricType[] values() {
        return (BiometricType[]) f48074a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
