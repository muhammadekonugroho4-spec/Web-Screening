package com.stockbit.userauth.ui.pin;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/stockbit/userauth/ui/pin/BiometricErrorType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "RESETUP_BIOMETRIC", "Companion", "userauth_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum BiometricErrorType extends Enum<BiometricErrorType> {
    public static final a Companion = null;
    public static final BiometricErrorType RESETUP_BIOMETRIC = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BiometricErrorType[] f165270a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f165271b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        RESETUP_BIOMETRIC = new BiometricErrorType("RESETUP_BIOMETRIC", 0, "RESETUP_BIOMETRIC");
        BiometricErrorType[] r02 = a();
        f165270a = r02;
        f165271b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    BiometricErrorType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ BiometricErrorType[] a() {
        return new BiometricErrorType[]{RESETUP_BIOMETRIC};
    }

    public static kotlin.enums.a getEntries() {
        return f165271b;
    }

    public static BiometricErrorType valueOf(String r1) {
        return (BiometricErrorType) Enum.valueOf(BiometricErrorType.class, r1);
    }

    public static BiometricErrorType[] values() {
        return (BiometricErrorType[]) f165270a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
