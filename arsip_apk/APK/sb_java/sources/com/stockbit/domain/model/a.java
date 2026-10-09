package com.stockbit.domain.model;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: com.stockbit.domain.model.a$a, reason: collision with other inner class name */
    public static final class C0767a extends a {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f80528a;

        public C0767a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f80528a = r2;
        }

        public final DomainExodusException a() {
            return this.f80528a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C0767a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f80528a, ((C0767a) r4).f80528a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f80528a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f80528a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f80529a = null;

        static {
            f80529a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f80530a;

        /* renamed from: b, reason: collision with root package name */
        public final String f80531b;

        public c(Object r2, String r3) {
            super(null);
            this.f80530a = r2;
            this.f80531b = r3;
        }

        public final Object a() {
            return this.f80530a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (p.g(this.f80530a, r52.f80530a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f80531b, r52.f80531b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            Object r02 = this.f80530a;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.f80531b;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "Success(data=" + this.f80530a + ", message=" + this.f80531b + ")";
        }

        public /* synthetic */ c(Object r1, String r2, int r3, kotlin.jvm.internal.i r4) {
            if ((r3 & 2) == 0) goto L5;
            r2 = null;
        L5:
            this(r1, r2);
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f80532a = null;

        static {
            f80532a = new d();
        }

        public d() {
            super(null);
        }
    }

    public /* synthetic */ a(kotlin.jvm.internal.i r1) {
        this();
    }

    public a() {
    }
}
