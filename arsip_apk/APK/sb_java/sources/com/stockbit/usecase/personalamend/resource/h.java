package com.stockbit.usecase.personalamend.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class h {

    public static final class a extends h {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f159241a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f159242b;

        public a(DomainExodusException r2, boolean r3) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f159241a = r2;
            this.f159242b = r3;
        }

        public final DomainExodusException a() {
            return this.f159241a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f159241a, r52.f159241a) == true) goto L12;
            return false;
        L12:
            if (this.f159242b == r52.f159242b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f159241a.hashCode() * 31) + Boolean.hashCode(this.f159242b);
        }

        public String toString() {
            return "Error(error=" + this.f159241a + ", showBottomSheet=" + this.f159242b + ")";
        }
    }

    public static final class b extends h {

        /* renamed from: a, reason: collision with root package name */
        public final String f159243a;

        /* renamed from: b, reason: collision with root package name */
        public final String f159244b;

        public b(String r2, String r3) {
            p.l(r2, "message");
            p.l(r3, "changeToken");
            super(null);
            this.f159243a = r2;
            this.f159244b = r3;
        }

        public final String a() {
            return this.f159244b;
        }

        public final String b() {
            return this.f159243a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f159243a, r52.f159243a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f159244b, r52.f159244b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f159243a.hashCode() * 31) + this.f159244b.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f159243a + ", changeToken=" + this.f159244b + ")";
        }
    }

    public /* synthetic */ h(kotlin.jvm.internal.i r1) {
        this();
    }

    public h() {
    }
}
