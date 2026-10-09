package com.stockbit.component.dialog.otpchooser;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/component/dialog/otpchooser/OtpChooserMethod;", "", "remoteValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRemoteValue", "()Ljava/lang/String;", "WHATSAPP", "SMS", "dialog_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum OtpChooserMethod extends Enum<OtpChooserMethod> {
    public static final OtpChooserMethod SMS = null;
    public static final OtpChooserMethod WHATSAPP = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OtpChooserMethod[] f70374a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f70375b = null;
    private final String remoteValue;

    static {
        WHATSAPP = new OtpChooserMethod("WHATSAPP", 0, "CHANNEL_WHATSAPP");
        SMS = new OtpChooserMethod("SMS", 1, "CHANNEL_SMS");
        OtpChooserMethod[] r02 = a();
        f70374a = r02;
        f70375b = kotlin.enums.b.a(r02);
    }

    OtpChooserMethod(String r1, int r2, String r3) {
        this.remoteValue = r3;
    }

    public static final /* synthetic */ OtpChooserMethod[] a() {
        return new OtpChooserMethod[]{WHATSAPP, SMS};
    }

    public static kotlin.enums.a getEntries() {
        return f70375b;
    }

    public static OtpChooserMethod valueOf(String r1) {
        return (OtpChooserMethod) Enum.valueOf(OtpChooserMethod.class, r1);
    }

    public static OtpChooserMethod[] values() {
        return (OtpChooserMethod[]) f70374a.clone();
    }

    public final String getRemoteValue() {
        return this.remoteValue;
    }
}
