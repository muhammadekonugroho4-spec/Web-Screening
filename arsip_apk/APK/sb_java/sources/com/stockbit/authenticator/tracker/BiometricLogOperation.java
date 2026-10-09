package com.stockbit.authenticator.tracker;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/stockbit/authenticator/tracker/BiometricLogOperation;", "", "tag", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTag", "()Ljava/lang/String;", "SECURE_KEY_GENERATION", "SECURE_KEY_LOAD", "SECURE_KEY_DELETE", "SIGNING", "IDENTITY_CHANGE_DETECTED", "LOCKED_OUT", "PROMPT_ERROR", "AUTHENTICATION_FAILED", "SECURE_KEY_FALLBACK", "authenticator_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum BiometricLogOperation extends Enum<BiometricLogOperation> {
    public static final BiometricLogOperation AUTHENTICATION_FAILED = null;
    public static final BiometricLogOperation IDENTITY_CHANGE_DETECTED = null;
    public static final BiometricLogOperation LOCKED_OUT = null;
    public static final BiometricLogOperation PROMPT_ERROR = null;
    public static final BiometricLogOperation SECURE_KEY_DELETE = null;
    public static final BiometricLogOperation SECURE_KEY_FALLBACK = null;
    public static final BiometricLogOperation SECURE_KEY_GENERATION = null;
    public static final BiometricLogOperation SECURE_KEY_LOAD = null;
    public static final BiometricLogOperation SIGNING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BiometricLogOperation[] f48072a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f48073b = null;
    private final String tag;

    static {
        SECURE_KEY_GENERATION = new BiometricLogOperation("SECURE_KEY_GENERATION", 0, "biometric.keystore.key_generation");
        SECURE_KEY_LOAD = new BiometricLogOperation("SECURE_KEY_LOAD", 1, "biometric.keystore.key_load");
        SECURE_KEY_DELETE = new BiometricLogOperation("SECURE_KEY_DELETE", 2, "biometric.keystore.key_delete");
        SIGNING = new BiometricLogOperation("SIGNING", 3, "biometric.signing");
        IDENTITY_CHANGE_DETECTED = new BiometricLogOperation("IDENTITY_CHANGE_DETECTED", 4, "biometric.identity_change_detected");
        LOCKED_OUT = new BiometricLogOperation("LOCKED_OUT", 5, "biometric.locked_out");
        PROMPT_ERROR = new BiometricLogOperation("PROMPT_ERROR", 6, "biometric.prompt.error");
        AUTHENTICATION_FAILED = new BiometricLogOperation("AUTHENTICATION_FAILED", 7, "biometric.authentication_failed");
        SECURE_KEY_FALLBACK = new BiometricLogOperation("SECURE_KEY_FALLBACK", 8, "biometric.secure_key.fallback");
        BiometricLogOperation[] r02 = a();
        f48072a = r02;
        f48073b = kotlin.enums.b.a(r02);
    }

    BiometricLogOperation(String r1, int r2, String r3) {
        this.tag = r3;
    }

    public static final /* synthetic */ BiometricLogOperation[] a() {
        return new BiometricLogOperation[]{SECURE_KEY_GENERATION, SECURE_KEY_LOAD, SECURE_KEY_DELETE, SIGNING, IDENTITY_CHANGE_DETECTED, LOCKED_OUT, PROMPT_ERROR, AUTHENTICATION_FAILED, SECURE_KEY_FALLBACK};
    }

    public static kotlin.enums.a getEntries() {
        return f48073b;
    }

    public static BiometricLogOperation valueOf(String r1) {
        return (BiometricLogOperation) Enum.valueOf(BiometricLogOperation.class, r1);
    }

    public static BiometricLogOperation[] values() {
        return (BiometricLogOperation[]) f48072a.clone();
    }

    public final String getTag() {
        return this.tag;
    }
}
