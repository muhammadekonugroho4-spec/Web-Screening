package com.stockbit.domain.model.type.stream;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stockbit/domain/model/type/stream/PollingTypeDurationName;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ONE_HOUR", "THREE_HOUR", "ONE_DAY", "ONE_WEEK", "NEVER", "SPECIFIC", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum PollingTypeDurationName extends Enum<PollingTypeDurationName> {
    public static final PollingTypeDurationName NEVER = null;
    public static final PollingTypeDurationName ONE_DAY = null;
    public static final PollingTypeDurationName ONE_HOUR = null;
    public static final PollingTypeDurationName ONE_WEEK = null;
    public static final PollingTypeDurationName SPECIFIC = null;
    public static final PollingTypeDurationName THREE_HOUR = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PollingTypeDurationName[] f86465a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86466b = null;
    private final String value;

    static {
        ONE_HOUR = new PollingTypeDurationName("ONE_HOUR", 0, "POLLING-DURATION-1-HOUR-NAME");
        THREE_HOUR = new PollingTypeDurationName("THREE_HOUR", 1, "POLLING-DURATION-3-HOURS-NAME");
        ONE_DAY = new PollingTypeDurationName("ONE_DAY", 2, "POLLING-DURATION-1-DAY-NAME");
        ONE_WEEK = new PollingTypeDurationName("ONE_WEEK", 3, "POLLING-DURATION-1-WEEK-NAME");
        NEVER = new PollingTypeDurationName("NEVER", 4, "POLLING-DURATION-NEVER-NAME");
        SPECIFIC = new PollingTypeDurationName("SPECIFIC", 5, "POLLING-DURATION-SPECIFIC-NAME");
        PollingTypeDurationName[] r02 = a();
        f86465a = r02;
        f86466b = b.a(r02);
    }

    PollingTypeDurationName(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ PollingTypeDurationName[] a() {
        return new PollingTypeDurationName[]{ONE_HOUR, THREE_HOUR, ONE_DAY, ONE_WEEK, NEVER, SPECIFIC};
    }

    public static kotlin.enums.a getEntries() {
        return f86466b;
    }

    public static PollingTypeDurationName valueOf(String r1) {
        return (PollingTypeDurationName) Enum.valueOf(PollingTypeDurationName.class, r1);
    }

    public static PollingTypeDurationName[] values() {
        return (PollingTypeDurationName[]) f86465a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
