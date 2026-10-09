package com.stockbit.watchlist.widget.config;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes2.dex */
public interface u {

    public static final class a implements u {

        /* renamed from: a, reason: collision with root package name */
        public static final a f171480a = null;

        static {
            f171480a = new a();
        }

        public a() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 161064951;
        }

        public String toString() {
            return "Save";
        }
    }

    public static final class b implements u {

        /* renamed from: a, reason: collision with root package name */
        public final String f171481a;

        /* renamed from: b, reason: collision with root package name */
        public final String f171482b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f171483c;
        public final boolean d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f171484e;

        static {
        }

        public b(String r2, String r3, boolean r4, boolean r5, boolean r6) {
            kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
            kotlin.jvm.internal.p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
            this.f171481a = r2;
            this.f171482b = r3;
            this.f171483c = r4;
            this.d = r5;
            this.f171484e = r6;
        }

        public final String a() {
            return this.f171481a;
        }

        public final String b() {
            return this.f171482b;
        }

        public final boolean c() {
            return this.f171483c;
        }

        public final boolean d() {
            return this.d;
        }

        public final boolean e() {
            return this.f171484e;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.f171481a, r52.f171481a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f171482b, r52.f171482b) == true) goto L15;
            return false;
        L15:
            if (this.f171483c == r52.f171483c) goto L18;
            return false;
        L18:
            if (this.d == r52.d) goto L21;
            return false;
        L21:
            if (this.f171484e == r52.f171484e) goto L23;
            return false;
        L23:
            return true;
        }

        public int hashCode() {
            return (((((((this.f171481a.hashCode() * 31) + this.f171482b.hashCode()) * 31) + Boolean.hashCode(this.f171483c)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f171484e);
        }

        public String toString() {
            return "SelectWatchlist(id=" + this.f171481a + ", name=" + this.f171482b + ", isDefault=" + this.f171483c + ", isFavorite=" + this.d + ", isPortfolio=" + this.f171484e + ')';
        }
    }

    public static final class c implements u {

        /* renamed from: a, reason: collision with root package name */
        public static final c f171485a = null;

        static {
            f171485a = new c();
        }

        public c() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1032710035;
        }

        public String toString() {
            return "ToggleShowWatchlistName";
        }
    }
}
