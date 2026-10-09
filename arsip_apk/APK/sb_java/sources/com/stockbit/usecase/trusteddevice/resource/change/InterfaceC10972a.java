package com.stockbit.usecase.trusteddevice.resource.change;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* renamed from: com.stockbit.usecase.trusteddevice.resource.change.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC10972a {

    /* renamed from: com.stockbit.usecase.trusteddevice.resource.change.a$a, reason: collision with other inner class name */
    public static final class C1708a implements InterfaceC10972a {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f164270a;

        public C1708a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f164270a = r2;
        }

        public final DomainExodusException a() {
            return this.f164270a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1708a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f164270a, ((C1708a) r4).f164270a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164270a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f164270a + ')';
        }
    }

    /* renamed from: com.stockbit.usecase.trusteddevice.resource.change.a$b */
    public static final class b implements InterfaceC10972a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f164271a = null;

        static {
            f164271a = new b();
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
            return -1896623693;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* renamed from: com.stockbit.usecase.trusteddevice.resource.change.a$c */
    public static final class c implements InterfaceC10972a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f164272a = null;

        static {
            f164272a = new c();
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
            return 194523258;
        }

        public String toString() {
            return "Success";
        }
    }
}
