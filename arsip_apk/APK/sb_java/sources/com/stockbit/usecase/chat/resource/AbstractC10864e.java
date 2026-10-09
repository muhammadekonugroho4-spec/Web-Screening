package com.stockbit.usecase.chat.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* renamed from: com.stockbit.usecase.chat.resource.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10864e {

    /* renamed from: com.stockbit.usecase.chat.resource.e$a */
    public static final class a extends AbstractC10864e {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f155780a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f155780a = r2;
        }

        public final DomainExodusException a() {
            return this.f155780a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155780a, ((a) r4).f155780a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155780a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f155780a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.chat.resource.e$b */
    public static final class b extends AbstractC10864e {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f155781a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f155782b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f155783c;
        public final boolean d;

        public b(boolean r2, boolean r3, boolean r4, boolean r5) {
            super(null);
            this.f155781a = r2;
            this.f155782b = r3;
            this.f155783c = r4;
            this.d = r5;
        }

        public final boolean a() {
            return this.f155781a;
        }

        public final boolean b() {
            return this.d;
        }

        public final boolean c() {
            return this.f155783c;
        }

        public final boolean d() {
            return this.f155782b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (this.f155781a == r52.f155781a) goto L12;
            return false;
        L12:
            if (this.f155782b == r52.f155782b) goto L15;
            return false;
        L15:
            if (this.f155783c == r52.f155783c) goto L18;
            return false;
        L18:
            if (this.d == r52.d) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.f155781a) * 31) + Boolean.hashCode(this.f155782b)) * 31) + Boolean.hashCode(this.f155783c)) * 31) + Boolean.hashCode(this.d);
        }

        public String toString() {
            return "Success(eligible=" + this.f155781a + ", isSecuritiesAccount=" + this.f155782b + ", isChatEnabled=" + this.f155783c + ", isBlocked=" + this.d + ")";
        }
    }

    public /* synthetic */ AbstractC10864e(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC10864e() {
    }
}
