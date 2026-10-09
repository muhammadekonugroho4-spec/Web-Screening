package com.stockbit.unboxing.ui.detail;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final List f154147a;

        /* renamed from: b, reason: collision with root package name */
        public final String f154148b;

        /* renamed from: c, reason: collision with root package name */
        public final String f154149c;

        public a(List r2, String r3, String r4) {
            p.l(r2, "url");
            p.l(r3, Constants.KEY_TITLE);
            p.l(r4, "volumeId");
            super(null);
            this.f154147a = r2;
            this.f154148b = r3;
            this.f154149c = r4;
        }

        public final List a() {
            return this.f154147a;
        }

        public final String b() {
            return this.f154149c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f154147a, r52.f154147a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f154148b, r52.f154148b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f154149c, r52.f154149c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f154147a.hashCode() * 31) + this.f154148b.hashCode()) * 31) + this.f154149c.hashCode();
        }

        public String toString() {
            return "UnboxingDetailDownload(url=" + this.f154147a + ", title=" + this.f154148b + ", volumeId=" + this.f154149c + ')';
        }
    }

    /* renamed from: com.stockbit.unboxing.ui.detail.b$b, reason: collision with other inner class name */
    public static final class C1387b extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1387b f154150a = null;

        static {
            f154150a = new C1387b();
        }

        public C1387b() {
            super(null);
        }
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f154151a = null;

        static {
            f154151a = new c();
        }

        public c() {
            super(null);
        }
    }

    public static final class d extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final d f154152a = null;

        static {
            f154152a = new d();
        }

        public d() {
            super(null);
        }
    }

    public /* synthetic */ b(kotlin.jvm.internal.i r1) {
        this();
    }

    public b() {
    }
}
