package com.stockbit.cryptodomain;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: com.stockbit.cryptodomain.a$a, reason: collision with other inner class name */
    public static final class C0756a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final CryptoException f79781a;

        public C0756a(CryptoException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f79781a = r2;
        }

        public final CryptoException a() {
            return this.f79781a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C0756a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f79781a, ((C0756a) r4).f79781a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f79781a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f79781a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f79782a;

        /* renamed from: b, reason: collision with root package name */
        public final String f79783b;

        public b(Object r2, String r3) {
            super(null);
            this.f79782a = r2;
            this.f79783b = r3;
        }

        public final Object a() {
            return this.f79782a;
        }

        public final String b() {
            return this.f79783b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f79782a, r52.f79782a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f79783b, r52.f79783b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            Object r02 = this.f79782a;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.f79783b;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "Success(data=" + this.f79782a + ", message=" + this.f79783b + ")";
        }

        public /* synthetic */ b(Object r1, String r2, int r3, i r4) {
            if ((r3 & 2) == 0) goto L5;
            r2 = null;
        L5:
            this(r1, r2);
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f79784a;

        public c(String r2) {
            p.l(r2, "message");
            super(null);
            this.f79784a = r2;
        }

        public final String a() {
            return this.f79784a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f79784a, ((c) r4).f79784a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f79784a.hashCode();
        }

        public String toString() {
            return "SuccessNoData(message=" + this.f79784a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
