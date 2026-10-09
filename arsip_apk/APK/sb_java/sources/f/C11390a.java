package f;

import com.google.protobuf.MessageLite;
import com.google.protobuf.Timestamp;
import kotlin.jvm.internal.p;

/* renamed from: f.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11390a {

    /* renamed from: a, reason: collision with root package name */
    public final String f174136a;

    /* renamed from: b, reason: collision with root package name */
    public final Timestamp f174137b;

    /* renamed from: c, reason: collision with root package name */
    public final String f174138c;
    public final Timestamp d;

    /* renamed from: e, reason: collision with root package name */
    public final MessageLite f174139e;

    public C11390a(String r2, Timestamp r3, MessageLite r4) {
        p.l(r2, "guid");
        p.l(r3, "timestamp");
        p.l(r4, "message");
        this.f174136a = r2;
        this.f174137b = r3;
        this.f174138c = r2;
        this.d = r3;
        this.f174139e = r4;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C11390a) == true) goto L8;
        return false;
    L8:
        C11390a r52 = (C11390a) r5;
        if (p.g(this.f174138c, r52.f174138c) == true) goto L12;
        return false;
    L12:
        if (p.g(this.d, r52.d) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f174139e, r52.f174139e) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r02 = this.f174138c.hashCode() * 31;
        int r1 = (this.d.hashCode() + r02) * 31;
        return this.f174139e.hashCode() + r1;
    }

    public final String toString() {
        return "CSEvent(guid=" + this.f174138c + ", timestamp=" + this.d + ", message=" + this.f174139e + ')';
    }
}
