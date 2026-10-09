package c;

import b.AbstractC4230a;
import b.AbstractC4231b;
import kotlin.jvm.internal.p;

/* renamed from: c.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4246d {

    /* renamed from: a, reason: collision with root package name */
    public final int f29741a;

    /* renamed from: b, reason: collision with root package name */
    public final long f29742b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f29743c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f29744e;

    /* renamed from: f, reason: collision with root package name */
    public final long f29745f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f29746g;

    /* renamed from: h, reason: collision with root package name */
    public final String f29747h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f29748i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f29749j;

    /* renamed from: k, reason: collision with root package name */
    public final int f29750k;

    /* renamed from: l, reason: collision with root package name */
    public final long f29751l;

    public C4246d(int r1, long r2, boolean r4, long r5, boolean r7, long r8, boolean r10, String r11, boolean r12, boolean r13, int r14, long r15) {
        this.f29741a = r1;
        this.f29742b = r2;
        this.f29743c = r4;
        this.d = r5;
        this.f29744e = r7;
        this.f29745f = r8;
        this.f29746g = r10;
        this.f29747h = r11;
        this.f29748i = r12;
        this.f29749j = r13;
        this.f29750k = r14;
        this.f29751l = r15;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C4246d) == true) goto L8;
        return false;
    L8:
        C4246d r82 = (C4246d) r8;
        if (this.f29741a == r82.f29741a) goto L12;
        return false;
    L12:
        if (this.f29742b == r82.f29742b) goto L15;
        return false;
    L15:
        if (this.f29743c == r82.f29743c) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L21;
        return false;
    L21:
        if (this.f29744e == r82.f29744e) goto L24;
        return false;
    L24:
        if (this.f29745f == r82.f29745f) goto L27;
        return false;
    L27:
        if (this.f29746g == r82.f29746g) goto L30;
        return false;
    L30:
        if (p.g(this.f29747h, r82.f29747h) == true) goto L33;
        return false;
    L33:
        if (this.f29748i == r82.f29748i) goto L36;
        return false;
    L36:
        if (this.f29749j == r82.f29749j) goto L39;
        return false;
    L39:
        if (this.f29750k == r82.f29750k) goto L42;
        return false;
    L42:
        if (this.f29751l == r82.f29751l) goto L44;
        return false;
    L44:
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int r02 = AbstractC4231b.a(this.f29742b, Integer.hashCode(this.f29741a) * 31, 31);
        boolean r2 = this.f29743c;
        int r3 = 1;
        int r22 = r2;
        if (r2 == 0) goto L5;
        r22 = 1;
    L5:
        int r03 = AbstractC4231b.a(this.d, (r02 + r22) * 31, 31);
        boolean r23 = this.f29744e;
        int r24 = r23;
        if (r23 == 0) goto L8;
        r24 = 1;
    L8:
        int r04 = AbstractC4231b.a(this.f29745f, (r03 + r24) * 31, 31);
        boolean r25 = this.f29746g;
        int r26 = r25;
        if (r25 == 0) goto L11;
        r26 = 1;
    L11:
        int r05 = (r04 + r26) * 31;
        String r27 = this.f29747h;
        if (r27 != null) goto L14;
        int r28 = 0;
    L15:
        int r06 = (r05 + r28) * 31;
        boolean r29 = this.f29748i;
        int r210 = r29;
        if (r29 == 0) goto L18;
        r210 = 1;
    L18:
        int r07 = (r06 + r210) * 31;
        boolean r211 = this.f29749j;
        if (r211 == true) goto L23;
        r3 = r211 ? 1 : 0;
    L23:
        return Long.hashCode(this.f29751l) + AbstractC4230a.a(this.f29750k, (r07 + r3) * 31, 31);
    L14:
        r28 = r27.hashCode();
        goto L15
    }

    public final String toString() {
        return "CSEventSchedulerConfig(eventsPerBatch=" + this.f29741a + ", batchPeriod=" + this.f29742b + ", flushOnBackground=" + this.f29743c + ", connectionTerminationTimerWaitTimeInMillis=" + this.d + ", backgroundTaskEnabled=" + this.f29744e + ", workRequestDelayInHr=" + this.f29745f + ", utf8ValidatorEnabled=" + this.f29746g + ", eventTypePrefix=" + this.f29747h + ", enableForegroundFlushing=" + this.f29748i + ", socketRetryEnabled=" + this.f29749j + ", socketRetryCount=" + this.f29750k + ", socketRetryDuration=" + this.f29751l + ')';
    }
}
