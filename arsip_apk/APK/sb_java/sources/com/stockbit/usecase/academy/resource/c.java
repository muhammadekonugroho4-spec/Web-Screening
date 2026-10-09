package com.stockbit.usecase.academy.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f154317a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f154317a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f154317a, ((a) r4).f154317a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f154317a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f154317a + ")";
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f154318a = null;

        static {
            f154318a = new b();
        }

        public b() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.usecase.academy.resource.c$c, reason: collision with other inner class name */
    public static final class C1396c extends c {

        /* renamed from: a, reason: collision with root package name */
        public final List f154319a;

        public C1396c(List r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f154319a = r2;
        }

        public final C1396c a(List r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            return new C1396c(r2);
        }

        public final List b() {
            return this.f154319a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1396c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f154319a, ((C1396c) r4).f154319a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f154319a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f154319a + ")";
        }
    }

    public static final class d extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final d f154320a = null;

        static {
            f154320a = new d();
        }

        public d() {
            super(null);
        }
    }

    public /* synthetic */ c(i r1) {
        this();
    }

    public c() {
    }
}
