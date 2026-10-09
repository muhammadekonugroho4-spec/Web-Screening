package com.stockbit.feature.bonds.model;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class e {

    public static final class a extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final a f92350a = null;

        static {
            f92350a = new a();
        }

        public a() {
            super(null);
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
            return 506963916;
        }

        public String toString() {
            return "AccruedInterest";
        }
    }

    public static final class b extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final b f92351a = null;

        static {
            f92351a = new b();
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
            return -766229626;
        }

        public String toString() {
            return "SellerCoupon";
        }
    }

    public static final class c extends e {

        /* renamed from: a, reason: collision with root package name */
        public final h f92352a;

        static {
        }

        public c(h r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f92352a = r2;
        }

        public final h a() {
            return this.f92352a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f92352a, ((c) r4).f92352a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f92352a.hashCode();
        }

        public String toString() {
            return "Tax(data=" + this.f92352a + ')';
        }
    }

    public static final class d extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final d f92353a = null;

        static {
            f92353a = new d();
        }

        public d() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof d) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -260441747;
        }

        public String toString() {
            return "TaxBond";
        }
    }

    static {
    }

    public /* synthetic */ e(kotlin.jvm.internal.i r1) {
        this();
    }

    public e() {
    }
}
