package com.clevertap.android.sdk.usereventlogs;

import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f34928a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34929b;

    /* renamed from: c, reason: collision with root package name */
    public final long f34930c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final int f34931e;

    /* renamed from: f, reason: collision with root package name */
    public final String f34932f;

    public a(String r2, String r3, long r4, long r6, int r8, String r9) {
        p.l(r2, "eventName");
        p.l(r3, "normalizedEventName");
        p.l(r9, "deviceID");
        this.f34928a = r2;
        this.f34929b = r3;
        this.f34930c = r4;
        this.d = r6;
        this.f34931e = r8;
        this.f34932f = r9;
    }

    public final long a() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f34928a, r82.f34928a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f34929b, r82.f34929b) == true) goto L15;
        return false;
    L15:
        if (this.f34930c == r82.f34930c) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L21;
        return false;
    L21:
        if (this.f34931e == r82.f34931e) goto L24;
        return false;
    L24:
        if (p.g(this.f34932f, r82.f34932f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        return (((((((((this.f34928a.hashCode() * 31) + this.f34929b.hashCode()) * 31) + Long.hashCode(this.f34930c)) * 31) + Long.hashCode(this.d)) * 31) + Integer.hashCode(this.f34931e)) * 31) + this.f34932f.hashCode();
    }

    public String toString() {
        return "UserEventLog(eventName=" + this.f34928a + ", normalizedEventName=" + this.f34929b + ", firstTs=" + this.f34930c + ", lastTs=" + this.d + ", countOfEvents=" + this.f34931e + ", deviceID=" + this.f34932f + ')';
    }
}
