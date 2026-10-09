package com.stockbit.usecase.trusteddevice.resource.login;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* loaded from: classes2.dex */
public interface y {

    public static final class a implements y {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f164357a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f164357a = r2;
        }

        public final DomainExodusException a() {
            return this.f164357a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f164357a, ((a) r4).f164357a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164357a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f164357a + ')';
        }
    }

    public static final class b implements y {

        /* renamed from: a, reason: collision with root package name */
        public static final b f164358a = null;

        static {
            f164358a = new b();
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
            return 466916549;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements y {

        /* renamed from: a, reason: collision with root package name */
        public static final c f164359a = null;

        static {
            f164359a = new c();
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
            return -1736903796;
        }

        public String toString() {
            return "Success";
        }
    }
}
