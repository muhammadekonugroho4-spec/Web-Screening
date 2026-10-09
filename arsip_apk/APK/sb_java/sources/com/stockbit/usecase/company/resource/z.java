package com.stockbit.usecase.company.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class z {

    public static final class a extends z {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f156890a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f156890a = r2;
        }

        public final DomainExodusException a() {
            return this.f156890a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156890a, ((a) r4).f156890a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156890a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f156890a + ")";
        }
    }

    public static final class b extends z {

        /* renamed from: a, reason: collision with root package name */
        public static final b f156891a = null;

        static {
            f156891a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends z {

        /* renamed from: a, reason: collision with root package name */
        public final List f156892a;

        public c(List r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f156892a = r2;
        }

        public final List a() {
            return this.f156892a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156892a, ((c) r4).f156892a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156892a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f156892a + ")";
        }
    }

    public static final class d extends z {

        /* renamed from: a, reason: collision with root package name */
        public static final d f156893a = null;

        static {
            f156893a = new d();
        }

        public d() {
            super(null);
        }
    }

    public /* synthetic */ z(kotlin.jvm.internal.i r1) {
        this();
    }

    public z() {
    }
}
