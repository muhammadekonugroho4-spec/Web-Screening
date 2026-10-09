package com.clevertap.android.sdk.inapp.images.memory;

import java.io.File;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f34319a;

    /* renamed from: b, reason: collision with root package name */
    public final long f34320b;

    /* renamed from: c, reason: collision with root package name */
    public final long f34321c;
    public final File d;

    public n(long r2, long r4, long r6, File r8) {
        kotlin.jvm.internal.p.l(r8, "diskDirectory");
        this.f34319a = r2;
        this.f34320b = r4;
        this.f34321c = r6;
        this.d = r8;
    }

    public final File a() {
        return this.d;
    }

    public final long b() {
        return this.f34321c;
    }

    public final long c() {
        return this.f34319a;
    }

    public final long d() {
        return this.f34320b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof n) == true) goto L8;
        return false;
    L8:
        n r82 = (n) r8;
        if (this.f34319a == r82.f34319a) goto L12;
        return false;
    L12:
        if (this.f34320b == r82.f34320b) goto L15;
        return false;
    L15:
        if (this.f34321c == r82.f34321c) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r82.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.f34319a) * 31) + Long.hashCode(this.f34320b)) * 31) + Long.hashCode(this.f34321c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "MemoryConfig(minInMemorySizeKB=" + this.f34319a + ", optimistic=" + this.f34320b + ", maxDiskSizeKB=" + this.f34321c + ", diskDirectory=" + this.d + ')';
    }
}
