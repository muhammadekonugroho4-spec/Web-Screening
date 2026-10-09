package androidx.work;

import android.app.Notification;

/* renamed from: androidx.work.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4182g {

    /* renamed from: a, reason: collision with root package name */
    public final int f29143a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29144b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f29145c;

    public C4182g(int r1, Notification r2, int r3) {
        this.f29143a = r1;
        this.f29145c = r2;
        this.f29144b = r3;
    }

    public int a() {
        return this.f29144b;
    }

    public Notification b() {
        return this.f29145c;
    }

    public int c() {
        return this.f29143a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if (r4 != null) goto L8;
    L18:
        return false;
    L8:
        if (C4182g.class != r4.getClass()) goto L18;
        C4182g r42 = (C4182g) r4;
        if (this.f29143a == r42.f29143a) goto L14;
        return false;
    L14:
        if (this.f29144b == r42.f29144b) goto L17;
        return false;
    L17:
        return this.f29145c.equals(r42.f29145c);
    }

    public int hashCode() {
        return (((this.f29143a * 31) + this.f29144b) * 31) + this.f29145c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f29143a + ", mForegroundServiceType=" + this.f29144b + ", mNotification=" + this.f29145c + '}';
    }
}
