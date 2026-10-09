package com.stockbit.cryptodetail.ui.detail;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes8.dex */
public abstract class P {

    public static final class a extends P {

        /* renamed from: a, reason: collision with root package name */
        public final String f79354a;

        static {
        }

        public a(String r2) {
            kotlin.jvm.internal.p.l(r2, "symbol");
            super(null);
            this.f79354a = r2;
        }

        public final String a() {
            return this.f79354a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f79354a, ((a) r4).f79354a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f79354a.hashCode();
        }

        public String toString() {
            return "OpenChartbit(symbol=" + this.f79354a + ')';
        }
    }

    public static final class b extends P {

        /* renamed from: a, reason: collision with root package name */
        public final String f79355a;

        /* renamed from: b, reason: collision with root package name */
        public final String f79356b;

        static {
        }

        public b(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, "companyId");
            kotlin.jvm.internal.p.l(r3, "symbol");
            super(null);
            this.f79355a = r2;
            this.f79356b = r3;
        }

        public final String a() {
            return this.f79355a;
        }

        public final String b() {
            return this.f79356b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.f79355a, r52.f79355a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f79356b, r52.f79356b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f79355a.hashCode() * 31) + this.f79356b.hashCode();
        }

        public String toString() {
            return "OpenWatchlistDialog(companyId=" + this.f79355a + ", symbol=" + this.f79356b + ')';
        }
    }

    public static final class c extends P {

        /* renamed from: a, reason: collision with root package name */
        public final String f79357a;

        /* renamed from: b, reason: collision with root package name */
        public final String f79358b;

        static {
        }

        public c(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, "url");
            kotlin.jvm.internal.p.l(r3, Constants.KEY_TITLE);
            super(null);
            this.f79357a = r2;
            this.f79358b = r3;
        }

        public final String a() {
            return this.f79358b;
        }

        public final String b() {
            return this.f79357a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (kotlin.jvm.internal.p.g(this.f79357a, r52.f79357a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f79358b, r52.f79358b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f79357a.hashCode() * 31) + this.f79358b.hashCode();
        }

        public String toString() {
            return "ShareRequested(url=" + this.f79357a + ", title=" + this.f79358b + ')';
        }
    }

    static {
    }

    public /* synthetic */ P(kotlin.jvm.internal.i r1) {
        this();
    }

    public P() {
    }
}
