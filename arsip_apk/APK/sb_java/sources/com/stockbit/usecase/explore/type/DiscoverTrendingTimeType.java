package com.stockbit.usecase.explore.type;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stockbit/usecase/explore/type/DiscoverTrendingTimeType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ALL_TIME", "WEEKLY", "MONTHLY", "usecase-explore"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum DiscoverTrendingTimeType extends Enum<DiscoverTrendingTimeType> {
    public static final DiscoverTrendingTimeType ALL_TIME = null;
    public static final DiscoverTrendingTimeType MONTHLY = null;
    public static final DiscoverTrendingTimeType WEEKLY = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DiscoverTrendingTimeType[] f157709a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f157710b = null;
    private final String value;

    static {
        ALL_TIME = new DiscoverTrendingTimeType("ALL_TIME", 0, "TIME_FRAME_ALL");
        WEEKLY = new DiscoverTrendingTimeType("WEEKLY", 1, "TIME_FRAME_1W");
        MONTHLY = new DiscoverTrendingTimeType("MONTHLY", 2, "TIME_FRAME_1M");
        DiscoverTrendingTimeType[] r02 = a();
        f157709a = r02;
        f157710b = b.a(r02);
    }

    DiscoverTrendingTimeType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ DiscoverTrendingTimeType[] a() {
        return new DiscoverTrendingTimeType[]{ALL_TIME, WEEKLY, MONTHLY};
    }

    public static a getEntries() {
        return f157710b;
    }

    public static DiscoverTrendingTimeType valueOf(String r1) {
        return (DiscoverTrendingTimeType) Enum.valueOf(DiscoverTrendingTimeType.class, r1);
    }

    public static DiscoverTrendingTimeType[] values() {
        return (DiscoverTrendingTimeType[]) f157709a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
