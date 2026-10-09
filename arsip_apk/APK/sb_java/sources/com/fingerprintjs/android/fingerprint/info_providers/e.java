package com.fingerprintjs.android.fingerprint.info_providers;

import java.util.List;
import kotlin.collections.AbstractC11777v;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final a f37312c = null;
    public static final e d = null;

    /* renamed from: a, reason: collision with root package name */
    public final List f37313a;

    /* renamed from: b, reason: collision with root package name */
    public final List f37314b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final e a() {
            return e.a();
        }

        public a() {
        }
    }

    static {
        f37312c = new a(null);
        d = new e(AbstractC11777v.o(), AbstractC11777v.o());
    }

    public e(List r2, List r3) {
        kotlin.jvm.internal.p.l(r2, "commonInfo");
        kotlin.jvm.internal.p.l(r3, "perProcessorInfo");
        this.f37313a = r2;
        this.f37314b = r3;
    }

    public static final /* synthetic */ e a() {
        return d;
    }

    public final e b(List r2, List r3) {
        kotlin.jvm.internal.p.l(r2, "commonInfo");
        kotlin.jvm.internal.p.l(r3, "perProcessorInfo");
        return new e(r2, r3);
    }

    public final List c() {
        return this.f37313a;
    }

    public final List d() {
        return this.f37314b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (kotlin.jvm.internal.p.g(this.f37313a, r52.f37313a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f37314b, r52.f37314b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f37313a.hashCode() * 31) + this.f37314b.hashCode();
    }

    public String toString() {
        return "CpuInfo(commonInfo=" + this.f37313a + ", perProcessorInfo=" + this.f37314b + ')';
    }
}
