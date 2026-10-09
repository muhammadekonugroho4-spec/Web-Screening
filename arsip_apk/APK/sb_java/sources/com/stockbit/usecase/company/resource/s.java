package com.stockbit.usecase.company.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class s {

    public static final class a extends s {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f156862a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f156862a = r2;
        }

        public final DomainExodusException a() {
            return this.f156862a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156862a, ((a) r4).f156862a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156862a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f156862a + ")";
        }
    }

    public static final class b extends s {

        /* renamed from: a, reason: collision with root package name */
        public static final b f156863a = null;

        static {
            f156863a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends s {

        /* renamed from: a, reason: collision with root package name */
        public final List f156864a;

        public c(List r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f156864a = r2;
        }

        public final List a() {
            return this.f156864a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156864a, ((c) r4).f156864a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156864a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f156864a + ")";
        }
    }

    public static final class d extends s {

        /* renamed from: a, reason: collision with root package name */
        public static final d f156865a = null;

        static {
            f156865a = new d();
        }

        public d() {
            super(null);
        }
    }

    public /* synthetic */ s(kotlin.jvm.internal.i r1) {
        this();
    }

    public s() {
    }
}
