package com.stockbit.feature.order.ui.search.model;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public abstract class a {

    /* renamed from: com.stockbit.feature.order.ui.search.model.a$a, reason: collision with other inner class name */
    public static final class C0935a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f103373a;

        static {
        }

        public C0935a(String r2) {
            p.l(r2, "symbol");
            super(null);
            this.f103373a = r2;
        }

        public final String a() {
            return this.f103373a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C0935a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f103373a, ((C0935a) r4).f103373a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f103373a.hashCode();
        }

        public String toString() {
            return "Blocked(symbol=" + this.f103373a + ')';
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f103374a;

        /* renamed from: b, reason: collision with root package name */
        public final String f103375b;

        /* renamed from: c, reason: collision with root package name */
        public final String f103376c;

        static {
        }

        public b(String r2, String r3, String r4) {
            p.l(r2, "symbol");
            p.l(r3, "reason");
            p.l(r4, Constants.KEY_DATE);
            super(null);
            this.f103374a = r2;
            this.f103375b = r3;
            this.f103376c = r4;
        }

        public final String a() {
            return this.f103376c;
        }

        public final String b() {
            return this.f103375b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f103374a, r52.f103374a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f103375b, r52.f103375b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f103376c, r52.f103376c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f103374a.hashCode() * 31) + this.f103375b.hashCode()) * 31) + this.f103376c.hashCode();
        }

        public String toString() {
            return "Warn(symbol=" + this.f103374a + ", reason=" + this.f103375b + ", date=" + this.f103376c + ')';
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
