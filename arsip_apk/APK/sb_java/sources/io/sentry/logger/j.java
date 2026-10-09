package io.sentry.logger;

import io.sentry.AbstractC11588f2;
import io.sentry.Y1;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC11588f2 f176311a;

    /* renamed from: b, reason: collision with root package name */
    public Y1 f176312b;

    /* renamed from: c, reason: collision with root package name */
    public String f176313c;

    public j() {
        this.f176313c = "manual";
    }

    public static j a(Y1 r1) {
        return b(null, r1);
    }

    public static j b(AbstractC11588f2 r1, Y1 r2) {
        j r02 = new j();
        r02.g(r1);
        r02.f(r2);
        return r02;
    }

    public Y1 c() {
        return this.f176312b;
    }

    public String d() {
        return this.f176313c;
    }

    public AbstractC11588f2 e() {
        return this.f176311a;
    }

    public void f(Y1 r1) {
        this.f176312b = r1;
    }

    public void g(AbstractC11588f2 r1) {
        this.f176311a = r1;
    }
}
