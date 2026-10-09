package com.stockbit.model.type.register;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\f"}, d2 = {"Lcom/stockbit/model/type/register/VerificationType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "VERIFIED", "NOT_VERIFIED", "isVerified", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum VerificationType extends Enum<VerificationType> {

    @SerializedName("not_verified")
    public static final VerificationType NOT_VERIFIED = null;

    @SerializedName("verified")
    public static final VerificationType VERIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ VerificationType[] f122235a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f122236b = null;
    private final String value;

    static {
        VERIFIED = new VerificationType("VERIFIED", 0, "verified");
        NOT_VERIFIED = new VerificationType("NOT_VERIFIED", 1, "not_verified");
        VerificationType[] r02 = a();
        f122235a = r02;
        f122236b = b.a(r02);
    }

    VerificationType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ VerificationType[] a() {
        return new VerificationType[]{VERIFIED, NOT_VERIFIED};
    }

    public static a getEntries() {
        return f122236b;
    }

    public static VerificationType valueOf(String r1) {
        return (VerificationType) Enum.valueOf(VerificationType.class, r1);
    }

    public static VerificationType[] values() {
        return (VerificationType[]) f122235a.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final boolean isVerified() {
        if (this != VERIFIED) goto L6;
        return true;
    L6:
        return false;
    }
}
