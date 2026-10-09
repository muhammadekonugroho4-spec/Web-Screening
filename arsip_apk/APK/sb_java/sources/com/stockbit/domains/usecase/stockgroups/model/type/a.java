package com.stockbit.domains.usecase.stockgroups.model.type;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: com.stockbit.domains.usecase.stockgroups.model.type.a$a, reason: collision with other inner class name */
    public static final class C0839a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final int f88457a;

        /* renamed from: b, reason: collision with root package name */
        public final List f88458b;

        public C0839a(int r2, List r3) {
            p.l(r3, "loadedItems");
            super(null);
            this.f88457a = r2;
            this.f88458b = r3;
        }

        public final List a() {
            return this.f88458b;
        }

        public final int b() {
            return this.f88457a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0839a) == true) goto L8;
            return false;
        L8:
            C0839a r52 = (C0839a) r5;
            if (this.f88457a == r52.f88457a) goto L12;
            return false;
        L12:
            if (p.g(this.f88458b, r52.f88458b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f88457a) * 31) + this.f88458b.hashCode();
        }

        public String toString() {
            return "Subscribe(page=" + this.f88457a + ", loadedItems=" + this.f88458b + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f88459a = null;

        static {
            f88459a = new b();
        }

        public b() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1673823249;
        }

        public String toString() {
            return "Unsubscribe";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
