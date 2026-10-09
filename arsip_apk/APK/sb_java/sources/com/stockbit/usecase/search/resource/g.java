package com.stockbit.usecase.search.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class g {

    public static final class a extends g {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f160128a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f160128a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f160128a, ((a) r4).f160128a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f160128a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f160128a + ")";
        }
    }

    public static final class b extends g {

        /* renamed from: a, reason: collision with root package name */
        public static final b f160129a = null;

        static {
            f160129a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends g {

        /* renamed from: a, reason: collision with root package name */
        public final List f160130a;

        public c(List r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f160130a = r2;
        }

        public final List a() {
            return this.f160130a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f160130a, ((c) r4).f160130a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f160130a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f160130a + ")";
        }
    }

    public static final class d extends g {

        /* renamed from: a, reason: collision with root package name */
        public static final d f160131a = null;

        static {
            f160131a = new d();
        }

        public d() {
            super(null);
        }
    }

    public /* synthetic */ g(kotlin.jvm.internal.i r1) {
        this();
    }

    public g() {
    }
}
