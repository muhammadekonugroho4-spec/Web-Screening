package com.stockbit.usecase.chat.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* renamed from: com.stockbit.usecase.chat.resource.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10867h {

    /* renamed from: com.stockbit.usecase.chat.resource.h$a */
    public static final class a extends AbstractC10867h {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f155789a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f155789a = r2;
        }

        public final DomainExodusException a() {
            return this.f155789a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155789a, ((a) r4).f155789a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155789a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f155789a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.chat.resource.h$b */
    public static final class b extends AbstractC10867h {

        /* renamed from: a, reason: collision with root package name */
        public final String f155790a;

        public b(String r2) {
            kotlin.jvm.internal.p.l(r2, "message");
            super(null);
            this.f155790a = r2;
        }

        public final String a() {
            return this.f155790a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155790a, ((b) r4).f155790a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155790a.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f155790a + ")";
        }
    }

    public /* synthetic */ AbstractC10867h(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC10867h() {
    }
}
