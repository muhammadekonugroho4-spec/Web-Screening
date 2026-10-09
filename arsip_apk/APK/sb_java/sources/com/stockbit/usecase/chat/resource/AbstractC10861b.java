package com.stockbit.usecase.chat.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* renamed from: com.stockbit.usecase.chat.resource.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10861b {

    /* renamed from: com.stockbit.usecase.chat.resource.b$a */
    public static final class a extends AbstractC10861b {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f155773a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f155773a = r2;
        }

        public final DomainExodusException a() {
            return this.f155773a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155773a, ((a) r4).f155773a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155773a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f155773a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.chat.resource.b$b, reason: collision with other inner class name */
    public static final class C1428b extends AbstractC10861b {

        /* renamed from: a, reason: collision with root package name */
        public final String f155774a;

        public C1428b(String r2) {
            kotlin.jvm.internal.p.l(r2, "message");
            super(null);
            this.f155774a = r2;
        }

        public final String a() {
            return this.f155774a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1428b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155774a, ((C1428b) r4).f155774a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155774a.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f155774a + ")";
        }
    }

    public /* synthetic */ AbstractC10861b(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC10861b() {
    }
}
