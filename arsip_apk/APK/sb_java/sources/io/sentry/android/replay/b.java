package io.sentry.android.replay;

import java.io.File;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final File f175814a;

    /* renamed from: b, reason: collision with root package name */
    public final int f175815b;

    /* renamed from: c, reason: collision with root package name */
    public final long f175816c;

    static {
    }

    public b(File r2, int r3, long r4) {
        kotlin.jvm.internal.p.l(r2, "video");
        this.f175814a = r2;
        this.f175815b = r3;
        this.f175816c = r4;
    }

    public final File a() {
        return this.f175814a;
    }

    public final int b() {
        return this.f175815b;
    }

    public final long c() {
        return this.f175816c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (kotlin.jvm.internal.p.g(this.f175814a, r82.f175814a) == true) goto L12;
        return false;
    L12:
        if (this.f175815b == r82.f175815b) goto L15;
        return false;
    L15:
        if (this.f175816c == r82.f175816c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f175814a.hashCode() * 31) + Integer.hashCode(this.f175815b)) * 31) + Long.hashCode(this.f175816c);
    }

    public String toString() {
        return "GeneratedVideo(video=" + this.f175814a + ", frameCount=" + this.f175815b + ", duration=" + this.f175816c + ')';
    }
}
