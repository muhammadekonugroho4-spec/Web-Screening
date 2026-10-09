package com.stockbit.stream.ui.ui;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: com.stockbit.stream.ui.ui.a$a, reason: collision with other inner class name */
    public static final class C1319a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1319a f145190a = null;

        static {
            f145190a = new C1319a();
        }

        public C1319a() {
            super(null);
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final List f145191a;

        static {
        }

        public b(List r2) {
            p.l(r2, "bannerList");
            super(null);
            this.f145191a = r2;
        }

        public final List a() {
            return this.f145191a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f145191a, ((b) r4).f145191a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f145191a.hashCode();
        }

        public String toString() {
            return "LoadBanner(bannerList=" + this.f145191a + ')';
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f145192a;

        static {
        }

        public c(String r2) {
            p.l(r2, "actionUrl");
            super(null);
            this.f145192a = r2;
        }

        public final String a() {
            return this.f145192a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f145192a, ((c) r4).f145192a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f145192a.hashCode();
        }

        public String toString() {
            return "OpenActionUrl(actionUrl=" + this.f145192a + ')';
        }
    }

    static {
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
