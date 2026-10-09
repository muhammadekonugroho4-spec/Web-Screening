package com.stockbit.domain.model.type.securities;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/domain/model/type/securities/SecuritiesSendStatus;", "", "<init>", "(Ljava/lang/String;I)V", "UNSEND", "SENDING", "SENT", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum SecuritiesSendStatus extends Enum<SecuritiesSendStatus> {
    public static final SecuritiesSendStatus SENDING = null;
    public static final SecuritiesSendStatus SENT = null;
    public static final SecuritiesSendStatus UNSEND = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SecuritiesSendStatus[] f86431a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f86432b = null;

    static {
        UNSEND = new SecuritiesSendStatus("UNSEND", 0);
        SENDING = new SecuritiesSendStatus("SENDING", 1);
        SENT = new SecuritiesSendStatus("SENT", 2);
        SecuritiesSendStatus[] r02 = a();
        f86431a = r02;
        f86432b = b.a(r02);
    }

    SecuritiesSendStatus(String r1, int r2) {
    }

    public static final /* synthetic */ SecuritiesSendStatus[] a() {
        return new SecuritiesSendStatus[]{UNSEND, SENDING, SENT};
    }

    public static a getEntries() {
        return f86432b;
    }

    public static SecuritiesSendStatus valueOf(String r1) {
        return (SecuritiesSendStatus) Enum.valueOf(SecuritiesSendStatus.class, r1);
    }

    public static SecuritiesSendStatus[] values() {
        return (SecuritiesSendStatus[]) f86431a.clone();
    }
}
