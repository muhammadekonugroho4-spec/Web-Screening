package com.stockbit.usecase.discover.sector.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.discover.sector.resource.a$a, reason: collision with other inner class name */
    public static final class C1464a extends a {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f157540a;

        public C1464a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f157540a = r2;
        }

        public final DomainExodusException a() {
            return this.f157540a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1464a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157540a, ((C1464a) r4).f157540a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157540a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f157540a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f157541a = null;

        static {
            f157541a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final List f157542a;

        public c(List r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f157542a = r2;
        }

        public final List a() {
            return this.f157542a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157542a, ((c) r4).f157542a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157542a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f157542a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
