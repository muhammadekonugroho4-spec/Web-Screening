package com.stockbit.usecase.company.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;

/* renamed from: com.stockbit.usecase.company.resource.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10901m {

    /* renamed from: com.stockbit.usecase.company.resource.m$a */
    public static final class a extends AbstractC10901m {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f156841a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f156841a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156841a, ((a) r4).f156841a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156841a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f156841a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.company.resource.m$b */
    public static final class b extends AbstractC10901m {

        /* renamed from: a, reason: collision with root package name */
        public static final b f156842a = null;

        static {
            f156842a = new b();
        }

        public b() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.usecase.company.resource.m$c */
    public static final class c extends AbstractC10901m {

        /* renamed from: a, reason: collision with root package name */
        public final List f156843a;

        public c(List r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f156843a = r2;
        }

        public final List a() {
            return this.f156843a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156843a, ((c) r4).f156843a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156843a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f156843a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.company.resource.m$d */
    public static final class d extends AbstractC10901m {

        /* renamed from: a, reason: collision with root package name */
        public static final d f156844a = null;

        static {
            f156844a = new d();
        }

        public d() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC10901m(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC10901m() {
    }
}
