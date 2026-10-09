package com.stockbit.usecase.company.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class K {

    public static final class a extends K {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f156751a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f156751a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156751a, ((a) r4).f156751a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156751a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f156751a + ")";
        }
    }

    public static final class b extends K {

        /* renamed from: a, reason: collision with root package name */
        public static final b f156752a = null;

        static {
            f156752a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends K {

        /* renamed from: a, reason: collision with root package name */
        public List f156753a;

        public c(List r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f156753a = r2;
        }

        public final List a() {
            return this.f156753a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156753a, ((c) r4).f156753a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156753a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f156753a + ")";
        }
    }

    public static final class d extends K {

        /* renamed from: a, reason: collision with root package name */
        public static final d f156754a = null;

        static {
            f156754a = new d();
        }

        public d() {
            super(null);
        }
    }

    public /* synthetic */ K(kotlin.jvm.internal.i r1) {
        this();
    }

    public K() {
    }
}
