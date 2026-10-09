package io.sentry.android.replay;

import java.io.File;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final File f175922a;

    /* renamed from: b, reason: collision with root package name */
    public final long f175923b;

    /* renamed from: c, reason: collision with root package name */
    public final String f175924c;

    static {
    }

    public h(File r2, long r3, String r5) {
        kotlin.jvm.internal.p.l(r2, "screenshot");
        this.f175922a = r2;
        this.f175923b = r3;
        this.f175924c = r5;
    }

    public final String a() {
        return this.f175924c;
    }

    public final File b() {
        return this.f175922a;
    }

    public final long c() {
        return this.f175923b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof h) == true) goto L8;
        return false;
    L8:
        h r82 = (h) r8;
        if (kotlin.jvm.internal.p.g(this.f175922a, r82.f175922a) == true) goto L12;
        return false;
    L12:
        if (this.f175923b == r82.f175923b) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f175924c, r82.f175924c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.f175922a.hashCode() * 31) + Long.hashCode(this.f175923b)) * 31;
        String r1 = this.f175924c;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "ReplayFrame(screenshot=" + this.f175922a + ", timestamp=" + this.f175923b + ", screen=" + this.f175924c + ')';
    }
}
