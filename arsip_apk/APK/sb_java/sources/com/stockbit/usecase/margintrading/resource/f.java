package com.stockbit.usecase.margintrading.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class f {

    public static final class a extends f {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f158473a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f158473a = r2;
        }

        public final DomainExodusException a() {
            return this.f158473a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158473a, ((a) r4).f158473a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158473a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f158473a + ")";
        }
    }

    public static final class b extends f {

        /* renamed from: a, reason: collision with root package name */
        public static final b f158474a = null;

        static {
            f158474a = new b();
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
            return -528135796;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c extends f {

        /* renamed from: a, reason: collision with root package name */
        public static final c f158475a = null;

        static {
            f158475a = new c();
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
            return 1563011155;
        }

        public String toString() {
            return "Success";
        }
    }

    public /* synthetic */ f(i r1) {
        this();
    }

    public f() {
    }
}
