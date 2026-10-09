package io.sentry.metrics;

import io.sentry.AbstractC11588f2;
import io.sentry.F;
import io.sentry.Y1;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC11588f2 f176346a;

    /* renamed from: b, reason: collision with root package name */
    public Y1 f176347b;

    /* renamed from: c, reason: collision with root package name */
    public String f176348c;
    public F d;

    public j() {
        this.f176348c = "manual";
        this.d = null;
    }

    public static j a(Y1 r1) {
        return b(null, r1);
    }

    public static j b(AbstractC11588f2 r1, Y1 r2) {
        j r02 = new j();
        r02.h(r1);
        r02.g(r2);
        return r02;
    }

    public Y1 c() {
        return this.f176347b;
    }

    public F d() {
        return this.d;
    }

    public String e() {
        return this.f176348c;
    }

    public AbstractC11588f2 f() {
        return this.f176346a;
    }

    public void g(Y1 r1) {
        this.f176347b = r1;
    }

    public void h(AbstractC11588f2 r1) {
        this.f176346a = r1;
    }
}
