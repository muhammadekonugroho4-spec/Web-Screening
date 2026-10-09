package io.sentry.android.core;

import android.net.TrafficStats;
import io.sentry.InterfaceC11586f0;

/* loaded from: classes3.dex */
public final class M implements InterfaceC11586f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final M f175185a = null;

    static {
        f175185a = new M();
    }

    public M() {
    }

    public static M c() {
        return f175185a;
    }

    @Override // io.sentry.InterfaceC11586f0
    public void a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Override // io.sentry.InterfaceC11586f0
    public void b() {
        TrafficStats.setThreadStatsTag(61441);
    }
}
