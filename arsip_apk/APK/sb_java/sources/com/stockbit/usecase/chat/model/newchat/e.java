package com.stockbit.usecase.chat.model.newchat;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface e {

    public static final class a implements e {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.chat.model.newchat.a f155588a;

        public a(com.stockbit.usecase.chat.model.newchat.a r2) {
            p.l(r2, "contactStatus");
            this.f155588a = r2;
        }

        public final com.stockbit.usecase.chat.model.newchat.a a() {
            return this.f155588a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f155588a, ((a) r4).f155588a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155588a.hashCode();
        }

        public String toString() {
            return "Contact(contactStatus=" + this.f155588a + ")";
        }
    }

    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final b f155589a = null;

        static {
            f155589a = new b();
        }

        public b() {
        }
    }

    public static final class c implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final c f155590a = null;

        static {
            f155590a = new c();
        }

        public c() {
        }
    }
}
