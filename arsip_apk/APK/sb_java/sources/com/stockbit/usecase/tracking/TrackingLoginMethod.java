package com.stockbit.usecase.tracking;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stockbit/usecase/tracking/TrackingLoginMethod;", "", "<init>", "(Ljava/lang/String;I)V", "email", "username", "google", "facebook", "biometric", "usecase-tracking"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum TrackingLoginMethod extends Enum<TrackingLoginMethod> {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TrackingLoginMethod[] f163182a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f163183b = null;
    public static final TrackingLoginMethod biometric = null;
    public static final TrackingLoginMethod email = null;
    public static final TrackingLoginMethod facebook = null;
    public static final TrackingLoginMethod google = null;
    public static final TrackingLoginMethod username = null;

    static {
        email = new TrackingLoginMethod("email", 0);
        username = new TrackingLoginMethod("username", 1);
        google = new TrackingLoginMethod("google", 2);
        facebook = new TrackingLoginMethod("facebook", 3);
        biometric = new TrackingLoginMethod("biometric", 4);
        TrackingLoginMethod[] r02 = a();
        f163182a = r02;
        f163183b = kotlin.enums.b.a(r02);
    }

    TrackingLoginMethod(String r1, int r2) {
    }

    public static final /* synthetic */ TrackingLoginMethod[] a() {
        return new TrackingLoginMethod[]{email, username, google, facebook, biometric};
    }

    public static kotlin.enums.a getEntries() {
        return f163183b;
    }

    public static TrackingLoginMethod valueOf(String r1) {
        return (TrackingLoginMethod) Enum.valueOf(TrackingLoginMethod.class, r1);
    }

    public static TrackingLoginMethod[] values() {
        return (TrackingLoginMethod[]) f163182a.clone();
    }
}
