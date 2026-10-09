package com.facebook.appevents;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/facebook/appevents/FlushReason;", "", "(Ljava/lang/String;I)V", "EXPLICIT", "TIMER", "SESSION_CHANGE", "PERSISTED_EVENTS", "EVENT_THRESHOLD", "EAGER_FLUSHING_EVENT", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum FlushReason extends Enum<FlushReason> {
    public static final FlushReason EAGER_FLUSHING_EVENT = null;
    public static final FlushReason EVENT_THRESHOLD = null;
    public static final FlushReason EXPLICIT = null;
    public static final FlushReason PERSISTED_EVENTS = null;
    public static final FlushReason SESSION_CHANGE = null;
    public static final FlushReason TIMER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FlushReason[] f35724a = null;

    static {
        EXPLICIT = new FlushReason("EXPLICIT", 0);
        TIMER = new FlushReason("TIMER", 1);
        SESSION_CHANGE = new FlushReason("SESSION_CHANGE", 2);
        PERSISTED_EVENTS = new FlushReason("PERSISTED_EVENTS", 3);
        EVENT_THRESHOLD = new FlushReason("EVENT_THRESHOLD", 4);
        EAGER_FLUSHING_EVENT = new FlushReason("EAGER_FLUSHING_EVENT", 5);
        f35724a = a();
    }

    FlushReason(String r1, int r2) {
    }

    public static final /* synthetic */ FlushReason[] a() {
        return new FlushReason[]{EXPLICIT, TIMER, SESSION_CHANGE, PERSISTED_EVENTS, EVENT_THRESHOLD, EAGER_FLUSHING_EVENT};
    }

    public static FlushReason valueOf(String r1) {
        return (FlushReason) Enum.valueOf(FlushReason.class, r1);
    }

    public static FlushReason[] values() {
        return (FlushReason[]) f35724a.clone();
    }
}
