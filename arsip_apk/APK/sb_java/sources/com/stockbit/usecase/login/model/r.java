package com.stockbit.usecase.login.model;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* loaded from: classes2.dex */
public interface r {

    public static final class a implements r {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f158382a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f158382a = r2;
        }

        public final DomainExodusException a() {
            return this.f158382a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f158382a, ((a) r4).f158382a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158382a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f158382a + ')';
        }
    }

    public static final class b implements r {

        /* renamed from: a, reason: collision with root package name */
        public static final b f158383a = null;

        static {
            f158383a = new b();
        }

        public b() {
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
            return -309240443;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements r {

        /* renamed from: a, reason: collision with root package name */
        public static final c f158384a = null;

        static {
            f158384a = new c();
        }

        public c() {
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
            return 1781906508;
        }

        public String toString() {
            return "Success";
        }
    }
}
