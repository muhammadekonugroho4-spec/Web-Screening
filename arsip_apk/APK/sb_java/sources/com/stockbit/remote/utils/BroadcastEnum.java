package com.stockbit.remote.utils;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stockbit/remote/utils/BroadcastEnum;", "", "errorCode", "", "message", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "getMessage", "EXODUS_503", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum BroadcastEnum extends Enum<BroadcastEnum> {
    public static final BroadcastEnum EXODUS_503 = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BroadcastEnum[] f129564a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f129565b = null;
    private final String errorCode;
    private final String message;

    static {
        EXODUS_503 = new BroadcastEnum("EXODUS_503", 0, "MAINTENANCE_MODE", "message");
        BroadcastEnum[] r02 = a();
        f129564a = r02;
        f129565b = kotlin.enums.b.a(r02);
    }

    BroadcastEnum(String r1, int r2, String r3, String r4) {
        this.errorCode = r3;
        this.message = r4;
    }

    public static final /* synthetic */ BroadcastEnum[] a() {
        return new BroadcastEnum[]{EXODUS_503};
    }

    public static kotlin.enums.a getEntries() {
        return f129565b;
    }

    public static BroadcastEnum valueOf(String r1) {
        return (BroadcastEnum) Enum.valueOf(BroadcastEnum.class, r1);
    }

    public static BroadcastEnum[] values() {
        return (BroadcastEnum[]) f129564a.clone();
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getMessage() {
        return this.message;
    }
}
