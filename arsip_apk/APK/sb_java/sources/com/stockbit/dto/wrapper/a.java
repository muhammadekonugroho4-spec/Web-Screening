package com.stockbit.dto.wrapper;

import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: com.stockbit.dto.wrapper.a$a, reason: collision with other inner class name */
    public static final class C0848a extends a {

        /* renamed from: a, reason: collision with root package name */
        public int f88721a;

        /* renamed from: b, reason: collision with root package name */
        public final String f88722b;

        /* renamed from: c, reason: collision with root package name */
        public String f88723c;
        public List d;

        public C0848a(int r2, String r3, String r4, List r5) {
            super(null);
            this.f88721a = r2;
            this.f88722b = r3;
            this.f88723c = r4;
            this.d = r5;
        }

        public final int a() {
            return this.f88721a;
        }

        public final String b() {
            return this.f88723c;
        }

        public final List c() {
            return this.d;
        }

        public final String d() {
            return this.f88722b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0848a) == true) goto L8;
            return false;
        L8:
            C0848a r52 = (C0848a) r5;
            if (this.f88721a == r52.f88721a) goto L12;
            return false;
        L12:
            if (p.g(this.f88722b, r52.f88722b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f88723c, r52.f88723c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            int r02 = Integer.hashCode(this.f88721a) * 31;
            String r1 = this.f88722b;
            int r2 = 0;
            if (r1 != null) goto L5;
            int r12 = 0;
        L6:
            int r03 = (r02 + r12) * 31;
            String r13 = this.f88723c;
            if (r13 != null) goto L9;
            int r14 = 0;
        L10:
            int r04 = (r03 + r14) * 31;
            List r15 = this.d;
            if (r15 == null) goto L15;
            r2 = r15.hashCode();
        L15:
            return r04 + r2;
        L9:
            r14 = r13.hashCode();
            goto L10
        L5:
            r12 = r1.hashCode();
            goto L6
        }

        public String toString() {
            return "ErrorApi(code=" + this.f88721a + ", message=" + this.f88722b + ", errorType=" + this.f88723c + ", errors=" + this.d + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f88724a;

        public b(Throwable r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f88724a = r2;
        }

        public final Throwable a() {
            return this.f88724a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f88724a, ((b) r4).f88724a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f88724a.hashCode();
        }

        public String toString() {
            return "ErrorNetwork(error=" + this.f88724a + ")";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f88725a;

        public c(Throwable r2) {
            super(null);
            this.f88725a = r2;
        }

        public final Throwable a() {
            return this.f88725a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f88725a, ((c) r4).f88725a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            Throwable r02 = this.f88725a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "ErrorUnknown(error=" + this.f88725a + ")";
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f88726a;

        /* renamed from: b, reason: collision with root package name */
        public final String f88727b;

        public d(Object r2, String r3) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f88726a = r2;
            this.f88727b = r3;
        }

        public final Object a() {
            return this.f88726a;
        }

        public final String b() {
            return this.f88727b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof d) == true) goto L8;
            return false;
        L8:
            d r52 = (d) r5;
            if (p.g(this.f88726a, r52.f88726a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f88727b, r52.f88727b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            int r02 = this.f88726a.hashCode() * 31;
            String r1 = this.f88727b;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return r02 + r12;
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public String toString() {
            return "Success(data=" + this.f88726a + ", message=" + this.f88727b + ")";
        }

        public /* synthetic */ d(Object r1, String r2, int r3, i r4) {
            if ((r3 & 2) == 0) goto L5;
            r2 = null;
        L5:
            this(r1, r2);
        }
    }

    public static final class e extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f88728a;

        public e(String r2) {
            p.l(r2, "message");
            super(null);
            this.f88728a = r2;
        }

        public final String a() {
            return this.f88728a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof e) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f88728a, ((e) r4).f88728a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f88728a.hashCode();
        }

        public String toString() {
            return "SuccessNoData(message=" + this.f88728a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
