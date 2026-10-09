package com.stockbit.usecase.login.model;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* loaded from: classes2.dex */
public interface q {

    public static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f158379a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f158379a = r2;
        }

        public final DomainExodusException a() {
            return this.f158379a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f158379a, ((a) r4).f158379a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158379a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f158379a + ')';
        }
    }

    public static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        public static final b f158380a = null;

        static {
            f158380a = new b();
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
            return 2097003304;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements q {

        /* renamed from: a, reason: collision with root package name */
        public static final c f158381a = null;

        static {
            f158381a = new c();
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
            return -106817041;
        }

        public String toString() {
            return "Success";
        }
    }
}
