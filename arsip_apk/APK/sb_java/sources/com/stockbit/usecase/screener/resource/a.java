package com.stockbit.usecase.screener.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.screener.resource.a$a, reason: collision with other inner class name */
    public static final class C1600a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f159773a;

        public C1600a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f159773a = r2;
        }

        public final DomainExodusException a() {
            return this.f159773a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1600a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159773a, ((C1600a) r4).f159773a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159773a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f159773a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f159774a;

        public b(String r2) {
            p.l(r2, "message");
            super(null);
            this.f159774a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159774a, ((b) r4).f159774a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159774a.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f159774a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
