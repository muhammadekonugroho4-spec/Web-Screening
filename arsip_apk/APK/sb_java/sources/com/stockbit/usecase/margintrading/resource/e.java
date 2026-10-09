package com.stockbit.usecase.margintrading.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class e {

    public static final class a extends e {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f158467a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f158467a = r2;
        }

        public final DomainExodusException a() {
            return this.f158467a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158467a, ((a) r4).f158467a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158467a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f158467a + ")";
        }
    }

    public static final class b extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final b f158468a = null;

        static {
            f158468a = new b();
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
            return -2019330629;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c extends e {

        /* renamed from: a, reason: collision with root package name */
        public final String f158469a;

        public c(String r2) {
            p.l(r2, "reason");
            super(null);
            this.f158469a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158469a, ((c) r4).f158469a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158469a.hashCode();
        }

        public String toString() {
            return "Success(reason=" + this.f158469a + ")";
        }
    }

    public static final class d extends e {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f158470a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f158471b;

        /* renamed from: c, reason: collision with root package name */
        public final String f158472c;

        public d(boolean r2, boolean r3, String r4) {
            p.l(r4, "reason");
            super(null);
            this.f158470a = r2;
            this.f158471b = r3;
            this.f158472c = r4;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof d) == true) goto L8;
            return false;
        L8:
            d r52 = (d) r5;
            if (this.f158470a == r52.f158470a) goto L12;
            return false;
        L12:
            if (this.f158471b == r52.f158471b) goto L15;
            return false;
        L15:
            if (p.g(this.f158472c, r52.f158472c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.f158470a) * 31) + Boolean.hashCode(this.f158471b)) * 31) + this.f158472c.hashCode();
        }

        public String toString() {
            return "SuccessError(isAssetSufficient=" + this.f158470a + ", isCashSufficient=" + this.f158471b + ", reason=" + this.f158472c + ")";
        }
    }

    public /* synthetic */ e(i r1) {
        this();
    }

    public e() {
    }
}
