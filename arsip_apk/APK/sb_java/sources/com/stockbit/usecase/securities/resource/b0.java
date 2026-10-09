package com.stockbit.usecase.securities.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;

/* loaded from: classes2.dex */
public abstract class b0 {

    public static final class a extends b0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f162129a = null;

        static {
            f162129a = new a();
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
            return 1507871233;
        }

        public String toString() {
            return "Error";
        }
    }

    public static final class b extends b0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f162130a = null;

        static {
            f162130a = new b();
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
            return -819052811;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c extends b0 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f162131a = null;

        static {
            f162131a = new c();
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
            return 973620614;
        }

        public String toString() {
            return "Nothing";
        }
    }

    public static final class d extends b0 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f162132a = null;

        static {
            f162132a = new d();
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
            return 1272094140;
        }

        public String toString() {
            return "Success";
        }
    }

    public static final class e extends b0 {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f162133a;

        public e(DomainSecuritiesException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f162133a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f162133a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof e) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f162133a, ((e) r4).f162133a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162133a.hashCode();
        }

        public String toString() {
            return "Unauthorized(error=" + this.f162133a + ")";
        }
    }

    public /* synthetic */ b0(kotlin.jvm.internal.i r1) {
        this();
    }

    public b0() {
    }
}
