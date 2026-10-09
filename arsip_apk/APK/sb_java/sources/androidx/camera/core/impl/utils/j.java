package androidx.camera.core.impl.utils;

import com.google.firebase.sessions.settings.RemoteSettings;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f5617a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5618b;

    public j(long r1, long r3) {
        this.f5617a = r1;
        this.f5618b = r3;
    }

    public long a() {
        return this.f5618b;
    }

    public long b() {
        return this.f5617a;
    }

    public String toString() {
        return this.f5617a + RemoteSettings.FORWARD_SLASH_STRING + this.f5618b;
    }

    public j(double r3) {
        this((long) (r3 * 10000.0d), 10000);
    }
}
