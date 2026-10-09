package com.facebook.appevents;

/* loaded from: classes4.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public int f35726a;

    /* renamed from: b, reason: collision with root package name */
    public FlushResult f35727b;

    public G() {
        this.f35727b = FlushResult.SUCCESS;
    }

    public final int a() {
        return this.f35726a;
    }

    public final FlushResult b() {
        return this.f35727b;
    }

    public final void c(int r1) {
        this.f35726a = r1;
    }

    public final void d(FlushResult r2) {
        kotlin.jvm.internal.p.l(r2, "<set-?>");
        this.f35727b = r2;
    }
}
