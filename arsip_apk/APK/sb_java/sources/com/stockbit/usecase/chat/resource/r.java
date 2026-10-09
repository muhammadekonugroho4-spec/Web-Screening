package com.stockbit.usecase.chat.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class r {

    public static final class a extends r {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f155819a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f155819a = r2;
        }

        public final DomainExodusException a() {
            return this.f155819a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155819a, ((a) r4).f155819a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155819a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f155819a + ")";
        }
    }

    public static final class b extends r {

        /* renamed from: a, reason: collision with root package name */
        public static final b f155820a = null;

        static {
            f155820a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends r {

        /* renamed from: a, reason: collision with root package name */
        public final List f155821a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f155822b;

        public c(List r2, boolean r3) {
            kotlin.jvm.internal.p.l(r2, "rooms");
            super(null);
            this.f155821a = r2;
            this.f155822b = r3;
        }

        public final List a() {
            return this.f155821a;
        }

        public final boolean b() {
            return this.f155822b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (kotlin.jvm.internal.p.g(this.f155821a, r52.f155821a) == true) goto L12;
            return false;
        L12:
            if (this.f155822b == r52.f155822b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f155821a.hashCode() * 31) + Boolean.hashCode(this.f155822b);
        }

        public String toString() {
            return "Success(rooms=" + this.f155821a + ", isHasMorePage=" + this.f155822b + ")";
        }
    }

    public /* synthetic */ r(kotlin.jvm.internal.i r1) {
        this();
    }

    public r() {
    }
}
