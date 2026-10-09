package com.clevertap.android.sdk.cryption;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/clevertap/android/sdk/cryption/EncryptionState;", "", "<init>", "(Ljava/lang/String;I)V", "ENCRYPTED_AES", "ENCRYPTED_AES_GCM", "PLAIN_TEXT", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum EncryptionState extends Enum<EncryptionState> {
    public static final EncryptionState ENCRYPTED_AES = null;
    public static final EncryptionState ENCRYPTED_AES_GCM = null;
    public static final EncryptionState PLAIN_TEXT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EncryptionState[] f33739a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f33740b = null;

    static {
        ENCRYPTED_AES = new EncryptionState("ENCRYPTED_AES", 0);
        ENCRYPTED_AES_GCM = new EncryptionState("ENCRYPTED_AES_GCM", 1);
        PLAIN_TEXT = new EncryptionState("PLAIN_TEXT", 2);
        EncryptionState[] r02 = a();
        f33739a = r02;
        f33740b = kotlin.enums.b.a(r02);
    }

    EncryptionState(String r1, int r2) {
    }

    public static final /* synthetic */ EncryptionState[] a() {
        return new EncryptionState[]{ENCRYPTED_AES, ENCRYPTED_AES_GCM, PLAIN_TEXT};
    }

    public static kotlin.enums.a getEntries() {
        return f33740b;
    }

    public static EncryptionState valueOf(String r1) {
        return (EncryptionState) Enum.valueOf(EncryptionState.class, r1);
    }

    public static EncryptionState[] values() {
        return (EncryptionState[]) f33739a.clone();
    }
}
