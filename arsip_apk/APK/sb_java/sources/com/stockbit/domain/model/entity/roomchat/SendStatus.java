package com.stockbit.domain.model.entity.roomchat;

import kotlin.Metadata;
import kotlin.e;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/domain/model/entity/roomchat/SendStatus;", "", "<init>", "(Ljava/lang/String;I)V", "UNSEND", "SENDING", "SENT", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@e
/* loaded from: classes8.dex */
public enum SendStatus extends Enum<SendStatus> {
    public static final SendStatus SENDING = null;
    public static final SendStatus SENT = null;
    public static final SendStatus UNSEND = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SendStatus[] f82843a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f82844b = null;

    static {
        UNSEND = new SendStatus("UNSEND", 0);
        SENDING = new SendStatus("SENDING", 1);
        SENT = new SendStatus("SENT", 2);
        SendStatus[] r02 = a();
        f82843a = r02;
        f82844b = b.a(r02);
    }

    SendStatus(String r1, int r2) {
    }

    public static final /* synthetic */ SendStatus[] a() {
        return new SendStatus[]{UNSEND, SENDING, SENT};
    }

    public static a getEntries() {
        return f82844b;
    }

    public static SendStatus valueOf(String r1) {
        return (SendStatus) Enum.valueOf(SendStatus.class, r1);
    }

    public static SendStatus[] values() {
        return (SendStatus[]) f82843a.clone();
    }
}
