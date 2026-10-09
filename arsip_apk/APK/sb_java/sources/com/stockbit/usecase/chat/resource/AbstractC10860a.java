package com.stockbit.usecase.chat.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* renamed from: com.stockbit.usecase.chat.resource.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10860a {

    /* renamed from: com.stockbit.usecase.chat.resource.a$a, reason: collision with other inner class name */
    public static final class C1427a extends AbstractC10860a {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f155771a;

        public C1427a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f155771a = r2;
        }

        public final DomainExodusException a() {
            return this.f155771a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1427a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155771a, ((C1427a) r4).f155771a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155771a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f155771a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.chat.resource.a$b */
    public static final class b extends AbstractC10860a {

        /* renamed from: a, reason: collision with root package name */
        public final String f155772a;

        public b(String r2) {
            kotlin.jvm.internal.p.l(r2, "message");
            super(null);
            this.f155772a = r2;
        }

        public final String a() {
            return this.f155772a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155772a, ((b) r4).f155772a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155772a.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f155772a + ")";
        }
    }

    public /* synthetic */ AbstractC10860a(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC10860a() {
    }
}
