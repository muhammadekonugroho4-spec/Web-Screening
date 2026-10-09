package com.stockbit.usecase.company.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class t {

    public static final class a extends t {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f156866a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f156866a = r2;
        }

        public final DomainExodusException a() {
            return this.f156866a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156866a, ((a) r4).f156866a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156866a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f156866a + ")";
        }
    }

    public static final class b extends t {

        /* renamed from: a, reason: collision with root package name */
        public static final b f156867a = null;

        static {
            f156867a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends t {

        /* renamed from: a, reason: collision with root package name */
        public final List f156868a;

        public c(List r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f156868a = r2;
        }

        public final List a() {
            return this.f156868a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156868a, ((c) r4).f156868a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156868a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f156868a + ")";
        }
    }

    public static final class d extends t {

        /* renamed from: a, reason: collision with root package name */
        public static final d f156869a = null;

        static {
            f156869a = new d();
        }

        public d() {
            super(null);
        }
    }

    public /* synthetic */ t(kotlin.jvm.internal.i r1) {
        this();
    }

    public t() {
    }
}
