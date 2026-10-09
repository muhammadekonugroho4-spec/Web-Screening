package com.stockbit.stream.ui.mediaselect;

import com.stockbit.domain.model.entity.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f144191a = null;

        static {
            f144191a = new a();
        }

        public a() {
            super(null);
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public final h f144192a;

        static {
        }

        public b(h r2) {
            p.l(r2, "giphy");
            super(null);
            this.f144192a = r2;
        }

        public final h a() {
            return this.f144192a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f144192a, ((b) r4).f144192a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f144192a.hashCode();
        }

        public String toString() {
            return "Gif(giphy=" + this.f144192a + ')';
        }
    }

    /* renamed from: com.stockbit.stream.ui.mediaselect.c$c, reason: collision with other inner class name */
    public static final class C1301c extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final C1301c f144193a = null;

        static {
            f144193a = new C1301c();
        }

        public C1301c() {
            super(null);
        }
    }

    static {
    }

    public /* synthetic */ c(i r1) {
        this();
    }

    public c() {
    }
}
