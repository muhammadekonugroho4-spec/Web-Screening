package com.stockbit.googlebilling.android.model;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f120104a = null;

        static {
            f120104a = new a();
        }

        public a() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.googlebilling.android.model.b$b, reason: collision with other inner class name */
    public static final class C1036b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final List f120105a;

        public C1036b(List r2) {
            p.l(r2, "activeProducts");
            super(null);
            this.f120105a = r2;
        }

        public final List a() {
            return this.f120105a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1036b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f120105a, ((C1036b) r4).f120105a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f120105a.hashCode();
        }

        public String toString() {
            return "Success(activeProducts=" + this.f120105a + ')';
        }
    }

    public /* synthetic */ b(i r1) {
        this();
    }

    public b() {
    }
}
