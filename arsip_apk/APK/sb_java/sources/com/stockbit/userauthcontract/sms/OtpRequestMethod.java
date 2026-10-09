package com.stockbit.userauthcontract.sms;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stockbit/userauthcontract/sms/OtpRequestMethod;", "", "remoteValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRemoteValue", "()Ljava/lang/String;", "SMS", "WHATSAPP", "UNSPECIFIED", "userauth-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum OtpRequestMethod extends Enum<OtpRequestMethod> {
    public static final OtpRequestMethod SMS = null;
    public static final OtpRequestMethod UNSPECIFIED = null;
    public static final OtpRequestMethod WHATSAPP = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OtpRequestMethod[] f165718a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f165719b = null;
    private final String remoteValue;

    static {
        SMS = new OtpRequestMethod("SMS", 0, "CHANNEL_SMS");
        WHATSAPP = new OtpRequestMethod("WHATSAPP", 1, "CHANNEL_WHATSAPP");
        UNSPECIFIED = new OtpRequestMethod("UNSPECIFIED", 2, "");
        OtpRequestMethod[] r02 = a();
        f165718a = r02;
        f165719b = kotlin.enums.b.a(r02);
    }

    OtpRequestMethod(String r1, int r2, String r3) {
        this.remoteValue = r3;
    }

    public static final /* synthetic */ OtpRequestMethod[] a() {
        return new OtpRequestMethod[]{SMS, WHATSAPP, UNSPECIFIED};
    }

    public static kotlin.enums.a getEntries() {
        return f165719b;
    }

    public static OtpRequestMethod valueOf(String r1) {
        return (OtpRequestMethod) Enum.valueOf(OtpRequestMethod.class, r1);
    }

    public static OtpRequestMethod[] values() {
        return (OtpRequestMethod[]) f165718a.clone();
    }

    public final String getRemoteValue() {
        return this.remoteValue;
    }
}
