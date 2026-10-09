package com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;

/* loaded from: classes9.dex */
public abstract class n {

    public static final class a extends n {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f116227a;

        static {
        }

        public a(DomainSecuritiesException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f116227a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f116227a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f116227a, ((a) r4).f116227a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f116227a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f116227a + ')';
        }
    }

    public static final class b extends n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f116228a = null;

        static {
            f116228a = new b();
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
            return -778796446;
        }

        public String toString() {
            return "Initial";
        }
    }

    public static final class c extends n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f116229a = null;

        static {
            f116229a = new c();
        }

        public c() {
            super(null);
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
            return 1904479322;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class d extends n {

        /* renamed from: a, reason: collision with root package name */
        public final String f116230a;

        /* renamed from: b, reason: collision with root package name */
        public final String f116231b;

        static {
        }

        public d(String r2, String r3) {
            super(null);
            this.f116230a = r2;
            this.f116231b = r3;
        }

        public final String a() {
            return this.f116230a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof d) == true) goto L8;
            return false;
        L8:
            d r52 = (d) r5;
            if (kotlin.jvm.internal.p.g(this.f116230a, r52.f116230a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f116231b, r52.f116231b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            String r02 = this.f116230a;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.f116231b;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "Success(orderId=" + this.f116230a + ", message=" + this.f116231b + ')';
        }

        public /* synthetic */ d(String r2, String r3, int r4, kotlin.jvm.internal.i r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r4 & 2) == 0) goto L8;
            r3 = null;
        L8:
            this(r2, r3);
        }
    }

    static {
    }

    public /* synthetic */ n(kotlin.jvm.internal.i r1) {
        this();
    }

    public n() {
    }
}
