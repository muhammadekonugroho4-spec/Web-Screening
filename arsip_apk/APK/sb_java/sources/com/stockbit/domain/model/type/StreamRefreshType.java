package com.stockbit.domain.model.type;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/domain/model/type/StreamRefreshType;", "", "<init>", "(Ljava/lang/String;I)V", "RENEW_VIEW_INDEX", "KEEP_VIEW_INDEX", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum StreamRefreshType extends Enum<StreamRefreshType> {
    public static final StreamRefreshType KEEP_VIEW_INDEX = null;
    public static final StreamRefreshType RENEW_VIEW_INDEX = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StreamRefreshType[] f86252a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86253b = null;

    static {
        RENEW_VIEW_INDEX = new StreamRefreshType("RENEW_VIEW_INDEX", 0);
        KEEP_VIEW_INDEX = new StreamRefreshType("KEEP_VIEW_INDEX", 1);
        StreamRefreshType[] r02 = a();
        f86252a = r02;
        f86253b = kotlin.enums.b.a(r02);
    }

    StreamRefreshType(String r1, int r2) {
    }

    public static final /* synthetic */ StreamRefreshType[] a() {
        return new StreamRefreshType[]{RENEW_VIEW_INDEX, KEEP_VIEW_INDEX};
    }

    public static kotlin.enums.a getEntries() {
        return f86253b;
    }

    public static StreamRefreshType valueOf(String r1) {
        return (StreamRefreshType) Enum.valueOf(StreamRefreshType.class, r1);
    }

    public static StreamRefreshType[] values() {
        return (StreamRefreshType[]) f86252a.clone();
    }
}
