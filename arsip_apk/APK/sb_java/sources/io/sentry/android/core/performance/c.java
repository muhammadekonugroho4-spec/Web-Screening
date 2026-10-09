package io.sentry.android.core.performance;

/* loaded from: classes3.dex */
public class c implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final k f175593a;

    /* renamed from: b, reason: collision with root package name */
    public final k f175594b;

    public c() {
        this.f175593a = new k();
        this.f175594b = new k();
    }

    public int a(c r5) {
        int r02 = Long.compare(this.f175593a.k(), r5.f175593a.k());
        if (r02 == 0) goto L5;
        return r02;
    L5:
        return Long.compare(this.f175594b.k(), r5.f175594b.k());
    }

    public final k b() {
        return this.f175593a;
    }

    public final k c() {
        return this.f175594b;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return a((c) r1);
    }
}
