package io.sentry.android.replay.util;

/* loaded from: classes3.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final String f176015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f176016b;

    static {
    }

    public l(String r2, Runnable r3) {
        kotlin.jvm.internal.p.l(r2, "taskName");
        kotlin.jvm.internal.p.l(r3, "delegate");
        this.f176015a = r2;
        this.f176016b = r3;
    }

    public final String a() {
        return this.f176015a;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f176016b.run();
    }
}
