package com.stockbit.usecase.wsfindata.param;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.wsfindata.param.a$a, reason: collision with other inner class name */
    public static final class C1735a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final List f164781a;

        public C1735a(List r2) {
            p.l(r2, "channels");
            super(null);
            this.f164781a = r2;
        }

        public final List a() {
            return this.f164781a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1735a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164781a, ((C1735a) r4).f164781a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164781a.hashCode();
        }

        public String toString() {
            return "Subscribe(channels=" + this.f164781a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final List f164782a;

        public b(List r2) {
            p.l(r2, "channels");
            super(null);
            this.f164782a = r2;
        }

        public final List a() {
            return this.f164782a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164782a, ((b) r4).f164782a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164782a.hashCode();
        }

        public String toString() {
            return "Unsubscribe(channels=" + this.f164782a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
