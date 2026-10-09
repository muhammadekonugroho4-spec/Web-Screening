package com.stockbit.usecase.liveness.resource;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f158240a;

        public a(String r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f158240a = r2;
        }

        public final String a() {
            return this.f158240a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158240a, ((a) r4).f158240a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158240a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f158240a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.liveness.resource.b$b, reason: collision with other inner class name */
    public static final class C1517b extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1517b f158241a = null;

        static {
            f158241a = new C1517b();
        }

        public C1517b() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1517b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 543093476;
        }

        public String toString() {
            return "FaceVerificationFailed";
        }
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f158242a = null;

        static {
            f158242a = new c();
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
            return 1423239284;
        }

        public String toString() {
            return "Success";
        }
    }

    public static final class d extends b {

        /* renamed from: a, reason: collision with root package name */
        public final long f158243a;

        public d(long r2) {
            super(null);
            this.f158243a = r2;
        }

        public final long a() {
            return this.f158243a;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof d) == true) goto L9;
            return false;
        L9:
            if (this.f158243a == ((d) r8).f158243a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Long.hashCode(this.f158243a);
        }

        public String toString() {
            return "Suspended(remainingTimeStamp=" + this.f158243a + ")";
        }
    }

    public /* synthetic */ b(i r1) {
        this();
    }

    public b() {
    }
}
