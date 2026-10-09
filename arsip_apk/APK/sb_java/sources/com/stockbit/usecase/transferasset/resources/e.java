package com.stockbit.usecase.transferasset.resources;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class e {

    public static final class a extends e {

        /* renamed from: a, reason: collision with root package name */
        public DomainSecuritiesException f164098a;

        public a(DomainSecuritiesException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f164098a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f164098a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164098a, ((a) r4).f164098a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164098a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f164098a + ")";
        }
    }

    public static final class b extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final b f164099a = null;

        static {
            f164099a = new b();
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
            return -1403271948;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final c f164100a = null;

        static {
            f164100a = new c();
        }

        public c() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 660743808;
        }

        public String toString() {
            return "None";
        }
    }

    public static final class d extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final d f164101a = null;

        static {
            f164101a = new d();
        }

        public d() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof d) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 687875003;
        }

        public String toString() {
            return "Success";
        }
    }

    public /* synthetic */ e(i r1) {
        this();
    }

    public e() {
    }
}
