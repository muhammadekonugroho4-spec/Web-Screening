package com.stockbit.component.runningtrade.persistent.model;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C0724a f75104a;

    /* renamed from: b, reason: collision with root package name */
    public final C0724a f75105b;

    /* renamed from: c, reason: collision with root package name */
    public final C0724a f75106c;

    /* renamed from: com.stockbit.component.runningtrade.persistent.model.a$a, reason: collision with other inner class name */
    public static final class C0724a {

        /* renamed from: a, reason: collision with root package name */
        public final float f75107a;

        static {
        }

        public C0724a(float r1) {
            this.f75107a = r1;
        }

        public final float a() {
            return this.f75107a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C0724a) == true) goto L9;
            return false;
        L9:
            if (Float.compare(this.f75107a, ((C0724a) r4).f75107a) == 0) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Float.hashCode(this.f75107a);
        }

        public String toString() {
            return "Config(heightFraction=" + this.f75107a + ')';
        }
    }

    static {
    }

    public a(C0724a r2, C0724a r3, C0724a r4) {
        p.l(r2, "slightlyExpanded");
        p.l(r3, "halfExpanded");
        p.l(r4, "fullyExpanded");
        this.f75104a = r2;
        this.f75105b = r3;
        this.f75106c = r4;
    }

    public final C0724a a() {
        return this.f75106c;
    }

    public final C0724a b() {
        return this.f75105b;
    }

    public final C0724a c() {
        return this.f75104a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f75104a, r52.f75104a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f75105b, r52.f75105b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f75106c, r52.f75106c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f75104a.hashCode() * 31) + this.f75105b.hashCode()) * 31) + this.f75106c.hashCode();
    }

    public String toString() {
        return "ModalItemConfig(slightlyExpanded=" + this.f75104a + ", halfExpanded=" + this.f75105b + ", fullyExpanded=" + this.f75106c + ')';
    }
}
