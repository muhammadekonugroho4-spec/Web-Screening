package com.stockbit.domain.model.type.livestream;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stockbit/domain/model/type/livestream/LivestreamSourceType;", "", "trackingValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTrackingValue", "()Ljava/lang/String;", "BANNER", "DEEPLINK", "RESEARCH_TAB_ICON", "RESEARCH_TAB", "STREAM", "LIVESTREAM", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum LivestreamSourceType extends Enum<LivestreamSourceType> {
    public static final LivestreamSourceType BANNER = null;
    public static final LivestreamSourceType DEEPLINK = null;
    public static final LivestreamSourceType LIVESTREAM = null;
    public static final LivestreamSourceType RESEARCH_TAB = null;
    public static final LivestreamSourceType RESEARCH_TAB_ICON = null;
    public static final LivestreamSourceType STREAM = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ LivestreamSourceType[] f86327a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f86328b = null;
    private final String trackingValue;

    static {
        BANNER = new LivestreamSourceType("BANNER", 0, "Banner");
        DEEPLINK = new LivestreamSourceType("DEEPLINK", 1, "Deeplink");
        RESEARCH_TAB_ICON = new LivestreamSourceType("RESEARCH_TAB_ICON", 2, "Research Tab (Icon)");
        RESEARCH_TAB = new LivestreamSourceType("RESEARCH_TAB", 3, "Research Tab");
        STREAM = new LivestreamSourceType("STREAM", 4, "Stream");
        LIVESTREAM = new LivestreamSourceType("LIVESTREAM", 5, "Live Stream");
        LivestreamSourceType[] r02 = a();
        f86327a = r02;
        f86328b = b.a(r02);
    }

    LivestreamSourceType(String r1, int r2, String r3) {
        this.trackingValue = r3;
    }

    public static final /* synthetic */ LivestreamSourceType[] a() {
        return new LivestreamSourceType[]{BANNER, DEEPLINK, RESEARCH_TAB_ICON, RESEARCH_TAB, STREAM, LIVESTREAM};
    }

    public static a getEntries() {
        return f86328b;
    }

    public static LivestreamSourceType valueOf(String r1) {
        return (LivestreamSourceType) Enum.valueOf(LivestreamSourceType.class, r1);
    }

    public static LivestreamSourceType[] values() {
        return (LivestreamSourceType[]) f86327a.clone();
    }

    public final String getTrackingValue() {
        return this.trackingValue;
    }
}
