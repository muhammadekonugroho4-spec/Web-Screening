package com.stockbit.usecase.search.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class e {

    public static final class a extends e {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f160120a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f160120a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f160120a, ((a) r4).f160120a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f160120a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f160120a + ")";
        }
    }

    public static final class b extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final b f160121a = null;

        static {
            f160121a = new b();
        }

        public b() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1036075136;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c extends e {

        /* renamed from: a, reason: collision with root package name */
        public final List f160122a;

        public c(List r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f160122a = r2;
        }

        public final List a() {
            return this.f160122a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f160122a, ((c) r4).f160122a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f160122a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f160122a + ")";
        }
    }

    public static final class d extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final d f160123a = null;

        static {
            f160123a = new d();
        }

        public d() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof d) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -865244602;
        }

        public String toString() {
            return "SuccessEmpty";
        }
    }

    public /* synthetic */ e(kotlin.jvm.internal.i r1) {
        this();
    }

    public e() {
    }
}
