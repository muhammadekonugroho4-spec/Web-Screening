package com.stockbit.verification.contract;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/verification/contract/VerificationEntryMode;", "", "<init>", "(Ljava/lang/String;I)V", "FROM_CHALLENGE", "FROM_NOTIFICATION", "verification-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum VerificationEntryMode extends Enum<VerificationEntryMode> {
    public static final VerificationEntryMode FROM_CHALLENGE = null;
    public static final VerificationEntryMode FROM_NOTIFICATION = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ VerificationEntryMode[] f165720a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f165721b = null;

    static {
        FROM_CHALLENGE = new VerificationEntryMode("FROM_CHALLENGE", 0);
        FROM_NOTIFICATION = new VerificationEntryMode("FROM_NOTIFICATION", 1);
        VerificationEntryMode[] r02 = a();
        f165720a = r02;
        f165721b = b.a(r02);
    }

    VerificationEntryMode(String r1, int r2) {
    }

    public static final /* synthetic */ VerificationEntryMode[] a() {
        return new VerificationEntryMode[]{FROM_CHALLENGE, FROM_NOTIFICATION};
    }

    public static kotlin.enums.a getEntries() {
        return f165721b;
    }

    public static VerificationEntryMode valueOf(String r1) {
        return (VerificationEntryMode) Enum.valueOf(VerificationEntryMode.class, r1);
    }

    public static VerificationEntryMode[] values() {
        return (VerificationEntryMode[]) f165720a.clone();
    }
}
