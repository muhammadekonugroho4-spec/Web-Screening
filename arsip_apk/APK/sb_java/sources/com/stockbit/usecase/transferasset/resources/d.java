package com.stockbit.usecase.transferasset.resources;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public DomainSecuritiesException f164093a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f164094b;

        public a(DomainSecuritiesException r2, boolean r3) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f164093a = r2;
            this.f164094b = r3;
        }

        public final boolean a() {
            return this.f164094b;
        }

        public final DomainSecuritiesException b() {
            return this.f164093a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f164093a, r52.f164093a) == true) goto L12;
            return false;
        L12:
            if (this.f164094b == r52.f164094b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f164093a.hashCode() * 31) + Boolean.hashCode(this.f164094b);
        }

        public String toString() {
            return "Error(error=" + this.f164093a + ", authError=" + this.f164094b + ")";
        }
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final b f164095a = null;

        static {
            f164095a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final c f164096a = null;

        static {
            f164096a = new c();
        }

        public c() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.usecase.transferasset.resources.d$d, reason: collision with other inner class name */
    public static final class C1704d extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final C1704d f164097a = null;

        static {
            f164097a = new C1704d();
        }

        public C1704d() {
            super(null);
        }
    }

    public /* synthetic */ d(i r1) {
        this();
    }

    public d() {
    }
}
