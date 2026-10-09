package com.stockbit.usecase.trusteddevice.model;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f164193a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f164193a = r2;
        }

        public final DomainExodusException a() {
            return this.f164193a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164193a, ((a) r4).f164193a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164193a.hashCode();
        }

        public String toString() {
            return "ErrorElse(error=" + this.f164193a + ')';
        }
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final b f164194a = null;

        static {
            f164194a = new b();
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
            return 357395186;
        }

        public String toString() {
            return "Expired";
        }
    }

    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final c f164195a = null;

        static {
            f164195a = new c();
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
            return 1919110148;
        }

        public String toString() {
            return "NewPublicKeyCorrupt";
        }
    }

    /* renamed from: com.stockbit.usecase.trusteddevice.model.d$d, reason: collision with other inner class name */
    public static final class C1706d extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final C1706d f164196a = null;

        static {
            f164196a = new C1706d();
        }

        public C1706d() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1706d) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -482555311;
        }

        public String toString() {
            return "Rejected";
        }
    }

    public static final class e extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final e f164197a = null;

        static {
            f164197a = new e();
        }

        public e() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof e) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1083483896;
        }

        public String toString() {
            return "SignatureCorrupt";
        }
    }

    public static final class f extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final f f164198a = null;

        static {
            f164198a = new f();
        }

        public f() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof f) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -200539184;
        }

        public String toString() {
            return "Success";
        }
    }

    public /* synthetic */ d(kotlin.jvm.internal.i r1) {
        this();
    }

    public d() {
    }
}
