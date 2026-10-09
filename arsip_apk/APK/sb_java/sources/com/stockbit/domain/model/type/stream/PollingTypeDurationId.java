package com.stockbit.domain.model.type.stream;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stockbit/domain/model/type/stream/PollingTypeDurationId;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ONE_HOUR", "THREE_HOUR", "ONE_DAY", "ONE_WEEK", "NEVER", "SPECIFIC", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum PollingTypeDurationId extends Enum<PollingTypeDurationId> {
    public static final PollingTypeDurationId NEVER = null;
    public static final PollingTypeDurationId ONE_DAY = null;
    public static final PollingTypeDurationId ONE_HOUR = null;
    public static final PollingTypeDurationId ONE_WEEK = null;
    public static final PollingTypeDurationId SPECIFIC = null;
    public static final PollingTypeDurationId THREE_HOUR = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PollingTypeDurationId[] f86463a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86464b = null;
    private final String value;

    static {
        ONE_HOUR = new PollingTypeDurationId("ONE_HOUR", 0, "POLLING-DURATION-1-HOUR-ID");
        THREE_HOUR = new PollingTypeDurationId("THREE_HOUR", 1, "POLLING-DURATION-3-HOURS-ID");
        ONE_DAY = new PollingTypeDurationId("ONE_DAY", 2, "POLLING-DURATION-1-DAY-ID");
        ONE_WEEK = new PollingTypeDurationId("ONE_WEEK", 3, "POLLING-DURATION-1-WEEK-ID");
        NEVER = new PollingTypeDurationId("NEVER", 4, "POLLING-DURATION-NEVER-ID");
        SPECIFIC = new PollingTypeDurationId("SPECIFIC", 5, "POLLING-DURATION-SPECIFIC-ID");
        PollingTypeDurationId[] r02 = a();
        f86463a = r02;
        f86464b = b.a(r02);
    }

    PollingTypeDurationId(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ PollingTypeDurationId[] a() {
        return new PollingTypeDurationId[]{ONE_HOUR, THREE_HOUR, ONE_DAY, ONE_WEEK, NEVER, SPECIFIC};
    }

    public static kotlin.enums.a getEntries() {
        return f86464b;
    }

    public static PollingTypeDurationId valueOf(String r1) {
        return (PollingTypeDurationId) Enum.valueOf(PollingTypeDurationId.class, r1);
    }

    public static PollingTypeDurationId[] values() {
        return (PollingTypeDurationId[]) f86463a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
