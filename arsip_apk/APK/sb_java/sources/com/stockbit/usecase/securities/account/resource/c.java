package com.stockbit.usecase.securities.account.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f160202a = null;

        static {
            f160202a = new a();
        }

        public a() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -414174235;
        }

        public String toString() {
            return "Empty";
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f160203a;

        public b(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f160203a = r2;
        }

        public final DomainExodusException a() {
            return this.f160203a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f160203a, ((b) r4).f160203a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f160203a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f160203a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.securities.account.resource.c$c, reason: collision with other inner class name */
    public static final class C1611c extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final C1611c f160204a = null;

        static {
            f160204a = new C1611c();
        }

        public C1611c() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1611c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -923973164;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class d extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f160205a;

        public d(String r2) {
            p.l(r2, "nextPage");
            super(null);
            this.f160205a = r2;
        }

        public final String a() {
            return this.f160205a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f160205a, ((d) r4).f160205a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f160205a.hashCode();
        }

        public String toString() {
            return "Success(nextPage=" + this.f160205a + ")";
        }
    }

    public /* synthetic */ c(i r1) {
        this();
    }

    public c() {
    }
}
