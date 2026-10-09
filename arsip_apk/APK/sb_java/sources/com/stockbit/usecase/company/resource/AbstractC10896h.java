package com.stockbit.usecase.company.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;

/* renamed from: com.stockbit.usecase.company.resource.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10896h {

    /* renamed from: com.stockbit.usecase.company.resource.h$a */
    public static final class a extends AbstractC10896h {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f156807a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f156807a = r2;
        }

        public final DomainExodusException a() {
            return this.f156807a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156807a, ((a) r4).f156807a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156807a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f156807a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.company.resource.h$b */
    public static final class b extends AbstractC10896h {

        /* renamed from: a, reason: collision with root package name */
        public static final b f156808a = null;

        static {
            f156808a = new b();
        }

        public b() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.usecase.company.resource.h$c */
    public static final class c extends AbstractC10896h {

        /* renamed from: a, reason: collision with root package name */
        public final List f156809a;

        public c(List r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f156809a = r2;
        }

        public final List a() {
            return this.f156809a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156809a, ((c) r4).f156809a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156809a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f156809a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.company.resource.h$d */
    public static final class d extends AbstractC10896h {

        /* renamed from: a, reason: collision with root package name */
        public static final d f156810a = null;

        static {
            f156810a = new d();
        }

        public d() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC10896h(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC10896h() {
    }
}
