package com.stockbit.usecase.company.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class B {

    public static final class a extends B {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f156723a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f156723a = r2;
        }

        public final DomainExodusException a() {
            return this.f156723a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156723a, ((a) r4).f156723a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156723a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f156723a + ")";
        }
    }

    public static final class b extends B {

        /* renamed from: a, reason: collision with root package name */
        public static final b f156724a = null;

        static {
            f156724a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends B {

        /* renamed from: a, reason: collision with root package name */
        public final List f156725a;

        public c(List r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f156725a = r2;
        }

        public final List a() {
            return this.f156725a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156725a, ((c) r4).f156725a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156725a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f156725a + ")";
        }
    }

    public static final class d extends B {

        /* renamed from: a, reason: collision with root package name */
        public static final d f156726a = null;

        static {
            f156726a = new d();
        }

        public d() {
            super(null);
        }
    }

    public /* synthetic */ B(kotlin.jvm.internal.i r1) {
        this();
    }

    public B() {
    }
}
