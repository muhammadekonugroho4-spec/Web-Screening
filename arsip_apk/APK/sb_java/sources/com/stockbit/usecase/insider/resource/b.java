package com.stockbit.usecase.insider.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f158160a = null;

        static {
            f158160a = new a();
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
            return -880155835;
        }

        public String toString() {
            return "Empty";
        }
    }

    /* renamed from: com.stockbit.usecase.insider.resource.b$b, reason: collision with other inner class name */
    public static final class C1511b extends b {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f158161a;

        public C1511b(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f158161a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1511b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158161a, ((C1511b) r4).f158161a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158161a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f158161a + ")";
        }
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f158162a = null;

        static {
            f158162a = new c();
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
            return -2055691980;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class d extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final d f158163a = null;

        static {
            f158163a = new d();
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
            return 35454971;
        }

        public String toString() {
            return "Success";
        }
    }

    public /* synthetic */ b(i r1) {
        this();
    }

    public b() {
    }
}
