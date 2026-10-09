package com.stockbit.feature.cryptohistory.ui.list.state;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface h {

    public static final class a implements h {

        /* renamed from: a, reason: collision with root package name */
        public final String f94073a;

        /* renamed from: b, reason: collision with root package name */
        public final String f94074b;

        /* renamed from: c, reason: collision with root package name */
        public final String f94075c;
        public final boolean d;

        /* renamed from: e, reason: collision with root package name */
        public final String f94076e;

        static {
        }

        public a(String r2, String r3, String r4, boolean r5, String r6) {
            p.l(r2, "txnId");
            p.l(r3, "asset");
            p.l(r4, "amountLabel");
            p.l(r6, Constants.KEY_DATE);
            this.f94073a = r2;
            this.f94074b = r3;
            this.f94075c = r4;
            this.d = r5;
            this.f94076e = r6;
        }

        public final String a() {
            return this.f94075c;
        }

        public final String b() {
            return this.f94074b;
        }

        public final String c() {
            return this.f94076e;
        }

        public final String d() {
            return this.f94073a;
        }

        public final boolean e() {
            return this.d;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f94073a, r52.f94073a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f94074b, r52.f94074b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f94075c, r52.f94075c) == true) goto L18;
            return false;
        L18:
            if (this.d == r52.d) goto L21;
            return false;
        L21:
            if (p.g(this.f94076e, r52.f94076e) == true) goto L23;
            return false;
        L23:
            return true;
        }

        public int hashCode() {
            return (((((((this.f94073a.hashCode() * 31) + this.f94074b.hashCode()) * 31) + this.f94075c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + this.f94076e.hashCode();
        }

        public String toString() {
            return "Item(txnId=" + this.f94073a + ", asset=" + this.f94074b + ", amountLabel=" + this.f94075c + ", isGain=" + this.d + ", date=" + this.f94076e + ')';
        }
    }

    public static final class b implements h {

        /* renamed from: a, reason: collision with root package name */
        public final String f94077a;

        /* renamed from: b, reason: collision with root package name */
        public final String f94078b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f94079c;

        static {
        }

        public b(String r2, String r3, boolean r4) {
            p.l(r2, Constants.ScionAnalytics.PARAM_LABEL);
            p.l(r3, "subtotalLabel");
            this.f94077a = r2;
            this.f94078b = r3;
            this.f94079c = r4;
        }

        public final String a() {
            return this.f94077a;
        }

        public final String b() {
            return this.f94078b;
        }

        public final boolean c() {
            return this.f94079c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f94077a, r52.f94077a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f94078b, r52.f94078b) == true) goto L15;
            return false;
        L15:
            if (this.f94079c == r52.f94079c) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f94077a.hashCode() * 31) + this.f94078b.hashCode()) * 31) + Boolean.hashCode(this.f94079c);
        }

        public String toString() {
            return "MonthHeader(label=" + this.f94077a + ", subtotalLabel=" + this.f94078b + ", isGain=" + this.f94079c + ')';
        }
    }
}
