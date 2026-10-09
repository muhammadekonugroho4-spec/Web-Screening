package com.stockbit.usecase.linkeddevice.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f158212a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f158212a = r2;
        }

        public final DomainExodusException a() {
            return this.f158212a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158212a, ((a) r4).f158212a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158212a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f158212a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.linkeddevice.resource.b$b, reason: collision with other inner class name */
    public static final class C1515b implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1515b f158213a = null;

        static {
            f158213a = new C1515b();
        }

        public C1515b() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1515b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 713358771;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final String f158214a;

        /* renamed from: b, reason: collision with root package name */
        public final String f158215b;

        public c(String r2, String r3) {
            p.l(r2, "removalToken");
            p.l(r3, "verificationToken");
            this.f158214a = r2;
            this.f158215b = r3;
        }

        public final String a() {
            return this.f158214a;
        }

        public final String b() {
            return this.f158215b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (p.g(this.f158214a, r52.f158214a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f158215b, r52.f158215b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f158214a.hashCode() * 31) + this.f158215b.hashCode();
        }

        public String toString() {
            return "Success(removalToken=" + this.f158214a + ", verificationToken=" + this.f158215b + ")";
        }
    }
}
