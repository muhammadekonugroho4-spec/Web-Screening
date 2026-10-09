package com.stockbit.usecase.chat.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;

/* renamed from: com.stockbit.usecase.chat.resource.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10873n {

    /* renamed from: com.stockbit.usecase.chat.resource.n$a */
    public static final class a extends AbstractC10873n {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f155804a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f155804a = r2;
        }

        public final DomainExodusException a() {
            return this.f155804a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155804a, ((a) r4).f155804a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155804a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f155804a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.chat.resource.n$b */
    public static final class b extends AbstractC10873n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f155805a = null;

        static {
            f155805a = new b();
        }

        public b() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.usecase.chat.resource.n$c */
    public static final class c extends AbstractC10873n {

        /* renamed from: a, reason: collision with root package name */
        public final List f155806a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f155807b;

        public c(List r2, boolean r3) {
            kotlin.jvm.internal.p.l(r2, "members");
            super(null);
            this.f155806a = r2;
            this.f155807b = r3;
        }

        public final boolean a() {
            return this.f155807b;
        }

        public final List b() {
            return this.f155806a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (kotlin.jvm.internal.p.g(this.f155806a, r52.f155806a) == true) goto L12;
            return false;
        L12:
            if (this.f155807b == r52.f155807b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f155806a.hashCode() * 31) + Boolean.hashCode(this.f155807b);
        }

        public String toString() {
            return "Success(members=" + this.f155806a + ", hasMoreMembers=" + this.f155807b + ")";
        }
    }

    public /* synthetic */ AbstractC10873n(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC10873n() {
    }
}
