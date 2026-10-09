package A;

import b.AbstractC4230a;
import b.AbstractC4231b;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f75a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f76b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f77c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final long f78e;

    /* renamed from: f, reason: collision with root package name */
    public final long f79f;

    /* renamed from: g, reason: collision with root package name */
    public final String f80g;

    public d(boolean r2, boolean r3, boolean r4, int r5, long r6, long r8, String r10) {
        p.l(r10, "eventTypePrefix");
        this.f75a = r2;
        this.f76b = r3;
        this.f77c = r4;
        this.d = r5;
        this.f78e = r6;
        this.f79f = r8;
        this.f80g = r10;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof d) == true) goto L8;
        return false;
    L8:
        d r82 = (d) r8;
        if (this.f75a == r82.f75a) goto L12;
        return false;
    L12:
        if (this.f76b == r82.f76b) goto L15;
        return false;
    L15:
        if (this.f77c == r82.f77c) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L21;
        return false;
    L21:
        if (this.f78e == r82.f78e) goto L24;
        return false;
    L24:
        if (this.f79f == r82.f79f) goto L27;
        return false;
    L27:
        if (p.g(this.f80g, r82.f80g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    public final int hashCode() {
        boolean r02 = this.f75a;
        int r1 = 1;
        ?? r03 = r02;
        if (r02 == false) goto L5;
        r03 = 1;
    L5:
        int r04 = r03 * 31;
        ?? r3 = this.f76b;
        int r32 = r3;
        if (r3 == 0) goto L8;
        r32 = 1;
    L8:
        int r05 = (r04 + r32) * 31;
        boolean r33 = this.f77c;
        if (r33 == true) goto L13;
        r1 = r33 ? 1 : 0;
    L13:
        return this.f80g.hashCode() + AbstractC4231b.a(this.f79f, AbstractC4231b.a(this.f78e, AbstractC4230a.a(this.d, (r05 + r1) * 961, 31), 31), 31);
    }

    public final String toString() {
        return "OneKycCSEventSchedulerConfig(flushOnBackground=" + this.f75a + ", backgroundTaskEnabled=" + this.f76b + ", utf8ValidatorEnabled=" + this.f77c + ", enableForegroundFlushing=false, eventsPerBatch=" + this.d + ", batchPeriodInMs=" + this.f78e + ", connectionTerminationTimerWaitTimeInMs=" + this.f79f + ", eventTypePrefix=" + this.f80g + ")";
    }
}
