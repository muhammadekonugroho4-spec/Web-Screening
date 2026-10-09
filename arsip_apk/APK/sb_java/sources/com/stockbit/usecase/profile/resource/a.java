package com.stockbit.usecase.profile.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.profile.resource.a$a, reason: collision with other inner class name */
    public static final class C1591a extends a {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f159479a;

        public C1591a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f159479a = r2;
        }

        public final DomainExodusException a() {
            return this.f159479a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1591a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159479a, ((C1591a) r4).f159479a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159479a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f159479a + ')';
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f159480a = null;

        static {
            f159480a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f159481a;

        public c(String r2) {
            p.l(r2, "message");
            super(null);
            this.f159481a = r2;
        }

        public final String a() {
            return this.f159481a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159481a, ((c) r4).f159481a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159481a.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f159481a + ')';
        }
    }

    public /* synthetic */ a(kotlin.jvm.internal.i r1) {
        this();
    }

    public a() {
    }
}
