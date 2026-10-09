package com.stockbit.usecase.company.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* renamed from: com.stockbit.usecase.company.resource.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10895g {

    /* renamed from: com.stockbit.usecase.company.resource.g$a */
    public static final class a extends AbstractC10895g {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f156804a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f156804a = r2;
        }

        public final DomainExodusException a() {
            return this.f156804a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156804a, ((a) r4).f156804a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156804a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f156804a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.company.resource.g$b */
    public static final class b extends AbstractC10895g {

        /* renamed from: a, reason: collision with root package name */
        public static final b f156805a = null;

        static {
            f156805a = new b();
        }

        public b() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.usecase.company.resource.g$c */
    public static final class c extends AbstractC10895g {

        /* renamed from: a, reason: collision with root package name */
        public final String f156806a;

        public c(String r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f156806a = r2;
        }

        public final String a() {
            return this.f156806a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156806a, ((c) r4).f156806a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156806a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f156806a + ")";
        }
    }

    public /* synthetic */ AbstractC10895g(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC10895g() {
    }
}
