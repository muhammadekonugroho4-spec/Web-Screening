package com.stockbit.usecase.securities.auth.model;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.securities.auth.model.a$a, reason: collision with other inner class name */
    public static final class C1612a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1612a f160216a = null;

        static {
            f160216a = new C1612a();
        }

        public C1612a() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1612a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -306746675;
        }

        public String toString() {
            return "Login";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final OAStatusType f160217a;

        public b(OAStatusType r2) {
            p.l(r2, NotificationCompat.CATEGORY_STATUS);
            super(null);
            this.f160217a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f160217a == ((b) r4).f160217a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f160217a.hashCode();
        }

        public String toString() {
            return "Register(status=" + this.f160217a + ")";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f160218a = null;

        static {
            f160218a = new c();
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
            return 1081032787;
        }

        public String toString() {
            return "Stockbit";
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f160219a = null;

        static {
            f160219a = new d();
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
            return 1693012335;
        }

        public String toString() {
            return "Virtual";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
