package androidx.navigation;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes4.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final A0 f25935a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f25936b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25937c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f25938e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public A0 f25939a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f25940b;

        /* renamed from: c, reason: collision with root package name */
        public Object f25941c;
        public boolean d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f25942e;

        public a() {
        }

        public final B a() {
            A0 r02 = this.f25939a;
            if (r02 != null) goto L6;
            r02 = A0.f25912c.c(this.f25941c);
            kotlin.jvm.internal.p.j(r02, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
        L6:
            return new B(r02, this.f25940b, this.f25941c, this.d, this.f25942e);
        }

        public final a b(Object r1) {
            this.f25941c = r1;
            this.d = true;
            return this;
        }

        public final a c(boolean r1) {
            this.f25940b = r1;
            return this;
        }

        public final a d(A0 r2) {
            kotlin.jvm.internal.p.l(r2, "type");
            this.f25939a = r2;
            return this;
        }

        public final a e(boolean r1) {
            this.f25942e = r1;
            return this;
        }
    }

    public B(A0 r2, boolean r3, Object r4, boolean r5, boolean r6) {
        kotlin.jvm.internal.p.l(r2, "type");
        if (r2.c() == true) goto L8;
        if (r3 == false) goto L8;
        throw new IllegalArgumentException((r2.b() + " does not allow nullable values").toString());
    L8:
        if (r3 == true) goto L14;
        if (r5 == false) goto L14;
        if (r4 != null) goto L14;
        throw new IllegalArgumentException(("Argument with type " + r2.b() + " has null value but is not nullable.").toString());
    L14:
        this.f25935a = r2;
        this.f25936b = r3;
        this.f25938e = r4;
        if (r5 == true) goto L19;
        if (r6 == true) goto L19;
        boolean r22 = false;
    L20:
        this.f25937c = r22;
        this.d = r6;
        return;
    L19:
        r22 = true;
        goto L20
    }

    public final A0 a() {
        return this.f25935a;
    }

    public final boolean b() {
        return this.f25937c;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.f25936b;
    }

    public final void e(String r3, Bundle r4) {
        kotlin.jvm.internal.p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r4, "bundle");
        if (this.f25937c == false) goto L8;
        Object r02 = this.f25938e;
        if (r02 == null) goto L9;
        this.f25935a.h(r4, r3, r02);
        return;
    L9:
        return;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L26:
        return false;
    L8:
        if (B.class != r5.getClass()) goto L26;
        B r52 = (B) r5;
        if (this.f25936b == r52.f25936b) goto L14;
        return false;
    L14:
        if (this.f25937c == r52.f25937c) goto L17;
        return false;
    L17:
        if (kotlin.jvm.internal.p.g(this.f25935a, r52.f25935a) == true) goto L19;
        return false;
    L19:
        Object r2 = this.f25938e;
        if (r2 == null) goto L24;
        return kotlin.jvm.internal.p.g(r2, r52.f25938e);
    L24:
        if (r52.f25938e != null) goto L26;
        return true;
    }

    public final boolean f(String r4, Bundle r5) {
        kotlin.jvm.internal.p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r5, "bundle");
        if (this.f25936b == true) goto L13;
        Bundle r02 = androidx.savedstate.c.a(r5);
        if (androidx.savedstate.c.b(r02, r4) == false) goto L13;
        if (androidx.savedstate.c.y(r02, r4) == false) goto L13;
        return false;
    L13:
        this.f25935a.a(r5, r4);     // Catch: IllegalStateException -> L12
        return true;
    L12:
        return false;
    }

    public int hashCode() {
        int r02 = ((((this.f25935a.hashCode() * 31) + (this.f25936b ? 1 : 0)) * 31) + (this.f25937c ? 1 : 0)) * 31;
        Object r1 = this.f25938e;
        if (r1 == null) goto L5;
        int r12 = r1.hashCode();
    L7:
        return r02 + r12;
    L5:
        r12 = 0;
        goto L7
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        r02.append(kotlin.jvm.internal.t.b(B.class).r());
        r02.append(" Type: " + this.f25935a);
        r02.append(" Nullable: " + this.f25936b);
        if (this.f25937c == false) goto L5;
        r02.append(" DefaultValue: " + this.f25938e);
    L5:
        String r03 = r02.toString();
        kotlin.jvm.internal.p.k(r03, "toString(...)");
        return r03;
    }
}
