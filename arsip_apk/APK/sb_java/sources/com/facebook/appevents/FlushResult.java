package com.facebook.appevents;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/appevents/FlushResult;", "", "(Ljava/lang/String;I)V", "SUCCESS", "SERVER_ERROR", "NO_CONNECTIVITY", "UNKNOWN_ERROR", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum FlushResult extends Enum<FlushResult> {
    public static final FlushResult NO_CONNECTIVITY = null;
    public static final FlushResult SERVER_ERROR = null;
    public static final FlushResult SUCCESS = null;
    public static final FlushResult UNKNOWN_ERROR = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FlushResult[] f35725a = null;

    static {
        SUCCESS = new FlushResult("SUCCESS", 0);
        SERVER_ERROR = new FlushResult("SERVER_ERROR", 1);
        NO_CONNECTIVITY = new FlushResult("NO_CONNECTIVITY", 2);
        UNKNOWN_ERROR = new FlushResult("UNKNOWN_ERROR", 3);
        f35725a = a();
    }

    FlushResult(String r1, int r2) {
    }

    public static final /* synthetic */ FlushResult[] a() {
        return new FlushResult[]{SUCCESS, SERVER_ERROR, NO_CONNECTIVITY, UNKNOWN_ERROR};
    }

    public static FlushResult valueOf(String r1) {
        return (FlushResult) Enum.valueOf(FlushResult.class, r1);
    }

    public static FlushResult[] values() {
        return (FlushResult[]) f35725a.clone();
    }
}
