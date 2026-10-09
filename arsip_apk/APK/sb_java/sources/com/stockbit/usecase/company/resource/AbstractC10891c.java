package com.stockbit.usecase.company.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;

/* renamed from: com.stockbit.usecase.company.resource.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10891c {

    /* renamed from: com.stockbit.usecase.company.resource.c$a */
    public static final class a extends AbstractC10891c {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f156786a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f156786a = r2;
        }

        public final DomainExodusException a() {
            return this.f156786a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156786a, ((a) r4).f156786a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156786a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f156786a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.company.resource.c$b */
    public static final class b extends AbstractC10891c {

        /* renamed from: a, reason: collision with root package name */
        public List f156787a;

        public b(List r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f156787a = r2;
        }

        public final List a() {
            return this.f156787a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156787a, ((b) r4).f156787a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156787a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f156787a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.company.resource.c$c, reason: collision with other inner class name */
    public static final class C1438c extends AbstractC10891c {

        /* renamed from: a, reason: collision with root package name */
        public static final C1438c f156788a = null;

        static {
            f156788a = new C1438c();
        }

        public C1438c() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC10891c(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC10891c() {
    }
}
