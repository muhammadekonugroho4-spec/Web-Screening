package b;

import a.AbstractC2049c;
import kotlin.jvm.internal.p;

/* renamed from: b.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4232c {

    /* renamed from: a, reason: collision with root package name */
    public final String f29700a;

    /* renamed from: b, reason: collision with root package name */
    public final long f29701b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29702c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f29703e;

    public C4232c(String r2, long r3, int r5, String r6, String r7) {
        p.l(r2, "eventGuid");
        p.l(r6, "messageName");
        p.l(r7, "eventName");
        this.f29700a = r2;
        this.f29701b = r3;
        this.f29702c = r5;
        this.d = r6;
        this.f29703e = r7;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C4232c) == true) goto L8;
        return false;
    L8:
        C4232c r82 = (C4232c) r8;
        if (p.g(this.f29700a, r82.f29700a) == true) goto L12;
        return false;
    L12:
        if (this.f29701b == r82.f29701b) goto L15;
        return false;
    L15:
        if (this.f29702c == r82.f29702c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f29703e, r82.f29703e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public final int hashCode() {
        int r02 = this.f29700a.hashCode() * 31;
        int r03 = AbstractC4231b.a(this.f29701b, r02, 31);
        int r04 = AbstractC4230a.a(this.f29702c, r03, 31);
        int r05 = AbstractC2049c.a(this.d, r04, 31);
        return this.f29703e.hashCode() + r05;
    }

    public final String toString() {
        return "CSEventHealth(eventGuid=" + this.f29700a + ", eventTimeStamp=" + this.f29701b + ", messageSerializedSizeInBytes=" + this.f29702c + ", messageName=" + this.d + ", eventName=" + this.f29703e + ')';
    }
}
