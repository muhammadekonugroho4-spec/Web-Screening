package com.stockbit.features.model;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/features/model/OTPChannel;", "", "serverName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerName", "()Ljava/lang/String;", "EMAIL", "WHATSAPP", "SMS", "Companion", "model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum OTPChannel extends Enum<OTPChannel> {
    public static final a Companion = null;
    public static final OTPChannel EMAIL = null;
    public static final OTPChannel SMS = null;
    public static final OTPChannel WHATSAPP = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OTPChannel[] f119105a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f119106b = null;
    private final String serverName;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final OTPChannel a(String r4) {
            p.l(r4, "serverName");
            Iterator<E> r02 = OTPChannel.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (p.g(((OTPChannel) r1).getServerName(), r4) == false) goto L4;
        L9:
            OTPChannel r12 = (OTPChannel) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return OTPChannel.EMAIL;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        EMAIL = new OTPChannel("EMAIL", 0, "CHANNEL_EMAIL");
        WHATSAPP = new OTPChannel("WHATSAPP", 1, "CHANNEL_WHATSAPP");
        SMS = new OTPChannel("SMS", 2, "CHANNEL_SMS");
        OTPChannel[] r02 = a();
        f119105a = r02;
        f119106b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    OTPChannel(String r1, int r2, String r3) {
        this.serverName = r3;
    }

    public static final /* synthetic */ OTPChannel[] a() {
        return new OTPChannel[]{EMAIL, WHATSAPP, SMS};
    }

    public static kotlin.enums.a getEntries() {
        return f119106b;
    }

    public static OTPChannel valueOf(String r1) {
        return (OTPChannel) Enum.valueOf(OTPChannel.class, r1);
    }

    public static OTPChannel[] values() {
        return (OTPChannel[]) f119105a.clone();
    }

    public final String getServerName() {
        return this.serverName;
    }
}
