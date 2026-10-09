package com.stockbit.usecase.tnc.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.tnc.resource.a$a, reason: collision with other inner class name */
    public static final class C1668a extends a {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f163096a;

        public C1668a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f163096a = r2;
        }

        public final DomainExodusException a() {
            return this.f163096a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1668a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163096a, ((C1668a) r4).f163096a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f163096a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f163096a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f163097a = null;

        static {
            f163097a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final List f163098a;

        public c(List r2) {
            p.l(r2, "list");
            super(null);
            this.f163098a = r2;
        }

        public final List a() {
            return this.f163098a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163098a, ((c) r4).f163098a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f163098a.hashCode();
        }

        public String toString() {
            return "Success(list=" + this.f163098a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
