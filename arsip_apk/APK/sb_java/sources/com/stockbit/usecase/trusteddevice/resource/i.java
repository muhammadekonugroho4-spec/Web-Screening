package com.stockbit.usecase.trusteddevice.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface i {

    public static final class a implements i {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f164311a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f164311a = r2;
        }

        public final DomainExodusException a() {
            return this.f164311a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164311a, ((a) r4).f164311a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164311a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f164311a + ')';
        }
    }

    public static final class b implements i {

        /* renamed from: a, reason: collision with root package name */
        public static final b f164312a = null;

        static {
            f164312a = new b();
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
            return 1936226642;
        }

        public String toString() {
            return "NoTrustedDevice";
        }
    }

    public static final class c implements i {

        /* renamed from: a, reason: collision with root package name */
        public static final c f164313a = null;

        static {
            f164313a = new c();
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
            return 174303119;
        }

        public String toString() {
            return "SignatureCorrupt";
        }
    }

    public static final class d implements i {

        /* renamed from: a, reason: collision with root package name */
        public static final d f164314a = null;

        static {
            f164314a = new d();
        }

        public d() {
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
            return 1500705129;
        }

        public String toString() {
            return "Success";
        }
    }
}
