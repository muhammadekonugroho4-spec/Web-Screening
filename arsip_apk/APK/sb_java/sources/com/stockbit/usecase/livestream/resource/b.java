package com.stockbit.usecase.livestream.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f158281a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f158281a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158281a, ((a) r4).f158281a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158281a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f158281a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.livestream.resource.b$b, reason: collision with other inner class name */
    public static final class C1520b extends b {

        /* renamed from: a, reason: collision with root package name */
        public List f158282a;

        public C1520b(List r2) {
            super(null);
            this.f158282a = r2;
        }

        public final List a() {
            return this.f158282a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1520b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158282a, ((C1520b) r4).f158282a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            List r02 = this.f158282a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f158282a + ")";
        }
    }

    public /* synthetic */ b(i r1) {
        this();
    }

    public b() {
    }
}
