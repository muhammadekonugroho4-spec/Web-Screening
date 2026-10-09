package com.stockbit.lib.trackerwrapper.data;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/lib/trackerwrapper/data/ProfileChangeEvent;", "", "<init>", "(Ljava/lang/String;I)V", "PROFILE_UPDATED", "LOGGED_IN", "LOGGED_OUT", "trackerwrapper_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum ProfileChangeEvent extends Enum<ProfileChangeEvent> {
    public static final ProfileChangeEvent LOGGED_IN = null;
    public static final ProfileChangeEvent LOGGED_OUT = null;
    public static final ProfileChangeEvent PROFILE_UPDATED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ProfileChangeEvent[] f120530a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f120531b = null;

    static {
        PROFILE_UPDATED = new ProfileChangeEvent("PROFILE_UPDATED", 0);
        LOGGED_IN = new ProfileChangeEvent("LOGGED_IN", 1);
        LOGGED_OUT = new ProfileChangeEvent("LOGGED_OUT", 2);
        ProfileChangeEvent[] r02 = a();
        f120530a = r02;
        f120531b = kotlin.enums.b.a(r02);
    }

    ProfileChangeEvent(String r1, int r2) {
    }

    public static final /* synthetic */ ProfileChangeEvent[] a() {
        return new ProfileChangeEvent[]{PROFILE_UPDATED, LOGGED_IN, LOGGED_OUT};
    }

    public static kotlin.enums.a getEntries() {
        return f120531b;
    }

    public static ProfileChangeEvent valueOf(String r1) {
        return (ProfileChangeEvent) Enum.valueOf(ProfileChangeEvent.class, r1);
    }

    public static ProfileChangeEvent[] values() {
        return (ProfileChangeEvent[]) f120530a.clone();
    }
}
