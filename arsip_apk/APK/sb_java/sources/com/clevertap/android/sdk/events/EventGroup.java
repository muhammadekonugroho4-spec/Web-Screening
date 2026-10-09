package com.clevertap.android.sdk.events;

/* loaded from: classes4.dex */
public enum EventGroup extends Enum<EventGroup> {
    public static final EventGroup PUSH_NOTIFICATION_VIEWED = null;
    public static final EventGroup REGULAR = null;
    public static final EventGroup VARIABLES = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EventGroup[] f33843a = null;
    public final String additionalPath;
    public final String httpResource;

    static {
        REGULAR = new EventGroup("REGULAR", 0, "", "");
        PUSH_NOTIFICATION_VIEWED = new EventGroup("PUSH_NOTIFICATION_VIEWED", 1, "-spiky", "");
        VARIABLES = new EventGroup("VARIABLES", 2, "", "/defineVars");
        f33843a = a();
    }

    EventGroup(String r1, int r2, String r3, String r4) {
        this.httpResource = r3;
        this.additionalPath = r4;
    }

    public static /* synthetic */ EventGroup[] a() {
        return new EventGroup[]{REGULAR, PUSH_NOTIFICATION_VIEWED, VARIABLES};
    }

    public static EventGroup valueOf(String r1) {
        return (EventGroup) Enum.valueOf(EventGroup.class, r1);
    }

    public static EventGroup[] values() {
        return (EventGroup[]) f33843a.clone();
    }
}
