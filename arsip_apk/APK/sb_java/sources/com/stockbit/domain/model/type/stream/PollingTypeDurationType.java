package com.stockbit.domain.model.type.stream;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stockbit/domain/model/type/stream/PollingTypeDurationType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ONE_HOUR", "THREE_HOUR", "ONE_DAY", "ONE_WEEK", "NEVER", "SPECIFIC", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum PollingTypeDurationType extends Enum<PollingTypeDurationType> {
    public static final PollingTypeDurationType NEVER = null;
    public static final PollingTypeDurationType ONE_DAY = null;
    public static final PollingTypeDurationType ONE_HOUR = null;
    public static final PollingTypeDurationType ONE_WEEK = null;
    public static final PollingTypeDurationType SPECIFIC = null;
    public static final PollingTypeDurationType THREE_HOUR = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PollingTypeDurationType[] f86467a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86468b = null;
    private final String value;

    static {
        ONE_HOUR = new PollingTypeDurationType("ONE_HOUR", 0, "POLLING-DURATION-1-HOUR-TYPE");
        THREE_HOUR = new PollingTypeDurationType("THREE_HOUR", 1, "POLLING-DURATION-3-HOURS-TYPE");
        ONE_DAY = new PollingTypeDurationType("ONE_DAY", 2, "POLLING-DURATION-1-DAY-TYPE");
        ONE_WEEK = new PollingTypeDurationType("ONE_WEEK", 3, "POLLING-DURATION-1-WEEK-TYPE");
        NEVER = new PollingTypeDurationType("NEVER", 4, "POLLING-DURATION-NEVER-TYPE");
        SPECIFIC = new PollingTypeDurationType("SPECIFIC", 5, "POLLING-DURATION-SPECIFIC-TYPE");
        PollingTypeDurationType[] r02 = a();
        f86467a = r02;
        f86468b = b.a(r02);
    }

    PollingTypeDurationType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ PollingTypeDurationType[] a() {
        return new PollingTypeDurationType[]{ONE_HOUR, THREE_HOUR, ONE_DAY, ONE_WEEK, NEVER, SPECIFIC};
    }

    public static kotlin.enums.a getEntries() {
        return f86468b;
    }

    public static PollingTypeDurationType valueOf(String r1) {
        return (PollingTypeDurationType) Enum.valueOf(PollingTypeDurationType.class, r1);
    }

    public static PollingTypeDurationType[] values() {
        return (PollingTypeDurationType[]) f86467a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
