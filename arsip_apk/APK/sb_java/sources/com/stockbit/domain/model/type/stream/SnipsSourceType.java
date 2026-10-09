package com.stockbit.domain.model.type.stream;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/domain/model/type/stream/SnipsSourceType;", "", "trackingValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTrackingValue", "()Ljava/lang/String;", "RESEARCH_TAB", "DEEPLINK", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum SnipsSourceType extends Enum<SnipsSourceType> {
    public static final SnipsSourceType DEEPLINK = null;
    public static final SnipsSourceType RESEARCH_TAB = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SnipsSourceType[] f86475a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86476b = null;
    private final String trackingValue;

    static {
        RESEARCH_TAB = new SnipsSourceType("RESEARCH_TAB", 0, "Research Tab (Icon)");
        DEEPLINK = new SnipsSourceType("DEEPLINK", 1, "Deeplink");
        SnipsSourceType[] r02 = a();
        f86475a = r02;
        f86476b = b.a(r02);
    }

    SnipsSourceType(String r1, int r2, String r3) {
        this.trackingValue = r3;
    }

    public static final /* synthetic */ SnipsSourceType[] a() {
        return new SnipsSourceType[]{RESEARCH_TAB, DEEPLINK};
    }

    public static kotlin.enums.a getEntries() {
        return f86476b;
    }

    public static SnipsSourceType valueOf(String r1) {
        return (SnipsSourceType) Enum.valueOf(SnipsSourceType.class, r1);
    }

    public static SnipsSourceType[] values() {
        return (SnipsSourceType[]) f86475a.clone();
    }

    public final String getTrackingValue() {
        return this.trackingValue;
    }
}
