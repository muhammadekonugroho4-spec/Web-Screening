package com.stockbit.usecase.chat.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class F {

    public static final class a extends F {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f155743a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f155743a = r2;
        }

        public final DomainExodusException a() {
            return this.f155743a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155743a, ((a) r4).f155743a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155743a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f155743a + ")";
        }
    }

    public static final class b extends F {

        /* renamed from: a, reason: collision with root package name */
        public static final b f155744a = null;

        static {
            f155744a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends F {

        /* renamed from: a, reason: collision with root package name */
        public final List f155745a;

        /* renamed from: b, reason: collision with root package name */
        public final String f155746b;

        public c(List r2, String r3) {
            kotlin.jvm.internal.p.l(r2, "members");
            kotlin.jvm.internal.p.l(r3, "cursor");
            super(null);
            this.f155745a = r2;
            this.f155746b = r3;
        }

        public final String a() {
            return this.f155746b;
        }

        public final List b() {
            return this.f155745a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (kotlin.jvm.internal.p.g(this.f155745a, r52.f155745a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f155746b, r52.f155746b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f155745a.hashCode() * 31) + this.f155746b.hashCode();
        }

        public String toString() {
            return "Success(members=" + this.f155745a + ", cursor=" + this.f155746b + ")";
        }
    }

    public /* synthetic */ F(kotlin.jvm.internal.i r1) {
        this();
    }

    public F() {
    }
}
