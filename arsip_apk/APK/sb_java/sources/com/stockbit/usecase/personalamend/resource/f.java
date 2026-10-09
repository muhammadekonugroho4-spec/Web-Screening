package com.stockbit.usecase.personalamend.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class f {

    public static final class a extends f {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f159215a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f159216b;

        public a(DomainExodusException r2, boolean r3) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f159215a = r2;
            this.f159216b = r3;
        }

        public final DomainExodusException a() {
            return this.f159215a;
        }

        public final boolean b() {
            return this.f159216b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f159215a, r52.f159215a) == true) goto L12;
            return false;
        L12:
            if (this.f159216b == r52.f159216b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f159215a.hashCode() * 31) + Boolean.hashCode(this.f159216b);
        }

        public String toString() {
            return "Error(error=" + this.f159215a + ", showBottomSheet=" + this.f159216b + ")";
        }
    }

    public static final class b extends f {

        /* renamed from: a, reason: collision with root package name */
        public final String f159217a;

        public b(String r2) {
            p.l(r2, "message");
            super(null);
            this.f159217a = r2;
        }

        public final String a() {
            return this.f159217a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159217a, ((b) r4).f159217a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159217a.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f159217a + ")";
        }
    }

    public /* synthetic */ f(kotlin.jvm.internal.i r1) {
        this();
    }

    public f() {
    }
}
