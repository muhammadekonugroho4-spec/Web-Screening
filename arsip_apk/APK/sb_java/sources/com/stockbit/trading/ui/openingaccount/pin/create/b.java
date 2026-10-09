package com.stockbit.trading.ui.openingaccount.pin.create;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f148228a;

        static {
        }

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f148228a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f148228a, ((a) r4).f148228a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f148228a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f148228a + ')';
        }
    }

    /* renamed from: com.stockbit.trading.ui.openingaccount.pin.create.b$b, reason: collision with other inner class name */
    public static final class C1344b extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1344b f148229a = null;

        static {
            f148229a = new C1344b();
        }

        public C1344b() {
            super(null);
        }
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f148230a;

        static {
        }

        public c(String r2) {
            p.l(r2, "pin");
            super(null);
            this.f148230a = r2;
        }

        public final String a() {
            return this.f148230a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f148230a, ((c) r4).f148230a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f148230a.hashCode();
        }

        public String toString() {
            return "Success(pin=" + this.f148230a + ')';
        }
    }

    static {
    }

    public /* synthetic */ b(kotlin.jvm.internal.i r1) {
        this();
    }

    public b() {
    }
}
