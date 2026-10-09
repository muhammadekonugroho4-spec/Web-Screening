package com.stockbit.domain.model;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public DomainSecuritiesException f80947a;

        public a(DomainSecuritiesException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f80947a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f80947a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f80947a, ((a) r4).f80947a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f80947a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f80947a + ")";
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public final Object f80948a;

        /* renamed from: b, reason: collision with root package name */
        public final String f80949b;

        public b(Object r2, String r3) {
            super(null);
            this.f80948a = r2;
            this.f80949b = r3;
        }

        public final Object a() {
            return this.f80948a;
        }

        public final String b() {
            return this.f80949b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f80948a, r52.f80948a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f80949b, r52.f80949b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            Object r02 = this.f80948a;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.f80949b;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "Success(data=" + this.f80948a + ", message=" + this.f80949b + ")";
        }

        public /* synthetic */ b(Object r1, String r2, int r3, kotlin.jvm.internal.i r4) {
            if ((r3 & 2) == 0) goto L5;
            r2 = null;
        L5:
            this(r1, r2);
        }
    }

    /* renamed from: com.stockbit.domain.model.c$c, reason: collision with other inner class name */
    public static final class C0772c extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f80950a;

        public C0772c(String r2) {
            p.l(r2, "message");
            super(null);
            this.f80950a = r2;
        }

        public final String a() {
            return this.f80950a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C0772c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f80950a, ((C0772c) r4).f80950a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f80950a.hashCode();
        }

        public String toString() {
            return "SuccessNoData(message=" + this.f80950a + ")";
        }
    }

    public /* synthetic */ c(kotlin.jvm.internal.i r1) {
        this();
    }

    public c() {
    }
}
