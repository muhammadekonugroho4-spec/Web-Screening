package com.stockbit.usecase.company.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class x {

    public static final class a extends x {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f156882a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f156882a = r2;
        }

        public final DomainExodusException a() {
            return this.f156882a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156882a, ((a) r4).f156882a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156882a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f156882a + ")";
        }
    }

    public static final class b extends x {

        /* renamed from: a, reason: collision with root package name */
        public static final b f156883a = null;

        static {
            f156883a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends x {

        /* renamed from: a, reason: collision with root package name */
        public final List f156884a;

        public c(List r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f156884a = r2;
        }

        public final List a() {
            return this.f156884a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156884a, ((c) r4).f156884a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156884a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f156884a + ")";
        }
    }

    public static final class d extends x {

        /* renamed from: a, reason: collision with root package name */
        public static final d f156885a = null;

        static {
            f156885a = new d();
        }

        public d() {
            super(null);
        }
    }

    public /* synthetic */ x(kotlin.jvm.internal.i r1) {
        this();
    }

    public x() {
    }
}
