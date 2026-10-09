package com.stockbit.usecase.company.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class v {

    public static final class a extends v {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f156874a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f156874a = r2;
        }

        public final DomainExodusException a() {
            return this.f156874a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156874a, ((a) r4).f156874a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156874a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f156874a + ")";
        }
    }

    public static final class b extends v {

        /* renamed from: a, reason: collision with root package name */
        public static final b f156875a = null;

        static {
            f156875a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends v {

        /* renamed from: a, reason: collision with root package name */
        public final List f156876a;

        public c(List r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f156876a = r2;
        }

        public final List a() {
            return this.f156876a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156876a, ((c) r4).f156876a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156876a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f156876a + ")";
        }
    }

    public static final class d extends v {

        /* renamed from: a, reason: collision with root package name */
        public static final d f156877a = null;

        static {
            f156877a = new d();
        }

        public d() {
            super(null);
        }
    }

    public /* synthetic */ v(kotlin.jvm.internal.i r1) {
        this();
    }

    public v() {
    }
}
