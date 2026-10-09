package com.stockbit.common.models;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, d2 = {"Lcom/stockbit/common/models/BiometricErrorValue;", "", "errorCode", "", "message", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getErrorCode", "()I", "getMessage", "()Ljava/lang/String;", "AUTHENTICATION_FAILED", "AUTHENTICATION_FAILED_GENERAL_SOCIAL", "AUTHENTICATION_FAILED_SOCIAL", "TOO_MANY_ATTEMPTS", "CANCELLED_BY_USER", "NO_FINGERPRINT_ENROLLED", "CANCEL_BUTTON_PRESSED", "SYSTEM_CANCELLED", "DEVICE_FINGERPRINT_CHANGED", "Companion", "common_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum BiometricErrorValue extends Enum<BiometricErrorValue> {
    public static final BiometricErrorValue AUTHENTICATION_FAILED = null;
    public static final BiometricErrorValue AUTHENTICATION_FAILED_GENERAL_SOCIAL = null;
    public static final BiometricErrorValue AUTHENTICATION_FAILED_SOCIAL = null;
    public static final BiometricErrorValue CANCELLED_BY_USER = null;
    public static final BiometricErrorValue CANCEL_BUTTON_PRESSED = null;
    public static final a Companion = null;
    public static final BiometricErrorValue DEVICE_FINGERPRINT_CHANGED = null;
    public static final BiometricErrorValue NO_FINGERPRINT_ENROLLED = null;
    public static final BiometricErrorValue SYSTEM_CANCELLED = null;
    public static final BiometricErrorValue TOO_MANY_ATTEMPTS = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BiometricErrorValue[] f60885a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f60886b = null;
    private final int errorCode;
    private final String message;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final BiometricErrorValue a(int r6) {
            BiometricErrorValue[] r02 = BiometricErrorValue.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            BiometricErrorValue r3 = r02[r2];
            if (r3.getErrorCode() == r6) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return BiometricErrorValue.AUTHENTICATION_FAILED;
        L8:
            r3 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        AUTHENTICATION_FAILED = new BiometricErrorValue("AUTHENTICATION_FAILED", 0, 1, "Smart login kamu gagal. Silahkan gunakan metode lain");
        AUTHENTICATION_FAILED_GENERAL_SOCIAL = new BiometricErrorValue("AUTHENTICATION_FAILED_GENERAL_SOCIAL", 1, 99, "Smart login kamu gagal. Silahkan gunakan metode lain");
        AUTHENTICATION_FAILED_SOCIAL = new BiometricErrorValue("AUTHENTICATION_FAILED_SOCIAL", 2, 99, "Smart login kamu gagal. Silahkan gunakan metode lain");
        TOO_MANY_ATTEMPTS = new BiometricErrorValue("TOO_MANY_ATTEMPTS", 3, 7, "Smart login kamu gagal. Silahkan gunakan metode lain");
        CANCELLED_BY_USER = new BiometricErrorValue("CANCELLED_BY_USER", 4, 10, "Cancelled by user");
        NO_FINGERPRINT_ENROLLED = new BiometricErrorValue("NO_FINGERPRINT_ENROLLED", 5, 11, "No Fingerprints Enrolled");
        CANCEL_BUTTON_PRESSED = new BiometricErrorValue("CANCEL_BUTTON_PRESSED", 6, 13, "Cancel button pressed");
        SYSTEM_CANCELLED = new BiometricErrorValue("SYSTEM_CANCELLED", 7, 5, "Smart login kamu gagal. Silahkan gunakan metode lain");
        DEVICE_FINGERPRINT_CHANGED = new BiometricErrorValue("DEVICE_FINGERPRINT_CHANGED", 8, 15, "Smart Login tidak tersedia karena terdeteksi perubahan biometric pada device. Mohon login menggunakan PIN.");
        BiometricErrorValue[] r02 = a();
        f60885a = r02;
        f60886b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    BiometricErrorValue(String r1, int r2, int r3, String r4) {
        this.errorCode = r3;
        this.message = r4;
    }

    public static final /* synthetic */ BiometricErrorValue[] a() {
        return new BiometricErrorValue[]{AUTHENTICATION_FAILED, AUTHENTICATION_FAILED_GENERAL_SOCIAL, AUTHENTICATION_FAILED_SOCIAL, TOO_MANY_ATTEMPTS, CANCELLED_BY_USER, NO_FINGERPRINT_ENROLLED, CANCEL_BUTTON_PRESSED, SYSTEM_CANCELLED, DEVICE_FINGERPRINT_CHANGED};
    }

    public static kotlin.enums.a getEntries() {
        return f60886b;
    }

    public static BiometricErrorValue valueOf(String r1) {
        return (BiometricErrorValue) Enum.valueOf(BiometricErrorValue.class, r1);
    }

    public static BiometricErrorValue[] values() {
        return (BiometricErrorValue[]) f60885a.clone();
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getMessage() {
        return this.message;
    }
}
