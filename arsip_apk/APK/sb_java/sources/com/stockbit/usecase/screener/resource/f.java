package com.stockbit.usecase.screener.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class f {

    public static final class a extends f {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f159787a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f159787a = r2;
        }

        public final DomainExodusException a() {
            return this.f159787a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159787a, ((a) r4).f159787a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159787a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f159787a + ")";
        }
    }

    public static final class b extends f {

        /* renamed from: a, reason: collision with root package name */
        public static final b f159788a = null;

        static {
            f159788a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends f {

        /* renamed from: a, reason: collision with root package name */
        public List f159789a;

        public c(List r2) {
            super(null);
            this.f159789a = r2;
        }

        public final List a() {
            return this.f159789a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159789a, ((c) r4).f159789a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            List r02 = this.f159789a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f159789a + ")";
        }
    }

    public /* synthetic */ f(i r1) {
        this();
    }

    public f() {
    }
}
