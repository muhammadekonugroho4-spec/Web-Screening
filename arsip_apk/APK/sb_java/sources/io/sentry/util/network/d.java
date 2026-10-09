package io.sentry.util.network;

import java.util.Map;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Long f176874a;

    /* renamed from: b, reason: collision with root package name */
    public final NetworkBody f176875b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f176876c;

    public d(Long r1, NetworkBody r2, Map r3) {
        this.f176874a = r1;
        this.f176875b = r2;
        this.f176876c = r3;
    }

    public NetworkBody a() {
        return this.f176875b;
    }

    public Map b() {
        return this.f176876c;
    }

    public Long c() {
        return this.f176874a;
    }

    public String toString() {
        return "ReplayNetworkRequestOrResponse{size=" + this.f176874a + ", body=" + this.f176875b + ", headers=" + this.f176876c + '}';
    }
}
