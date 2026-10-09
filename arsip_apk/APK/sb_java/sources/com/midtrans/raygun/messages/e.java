package com.midtrans.raygun.messages;

/* loaded from: classes6.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public e f42129a;

    /* renamed from: b, reason: collision with root package name */
    public String f42130b;

    /* renamed from: c, reason: collision with root package name */
    public String f42131c;
    public f[] d;

    public e(Throwable r5) {
        this.f42130b = r5.getClass().getSimpleName() + ": " + r5.getMessage();
        this.f42131c = r5.getClass().getCanonicalName();
        if (r5.getCause() == null) goto L5;
        this.f42129a = new e((Exception) r5.getCause());
    L5:
        StackTraceElement[] r52 = r5.getStackTrace();
        this.d = new f[r52.length];
        int r02 = 0;
    L7:
        if (r02 >= r52.length) goto L9;
        this.d[r02] = new f(r52[r02]);
        r02 = r02 + 1;
        goto L7
    }

    public e a() {
        return this.f42129a;
    }

    public String b() {
        return this.f42130b;
    }

    public f[] c() {
        return this.d;
    }
}
