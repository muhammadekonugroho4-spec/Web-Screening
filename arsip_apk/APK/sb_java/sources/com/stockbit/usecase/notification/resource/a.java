package com.stockbit.usecase.notification.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.notification.resource.a$a, reason: collision with other inner class name */
    public static final class C1535a extends a {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f158650a;

        public C1535a(DomainExodusException r2) {
            p.l(r2, "errorType");
            super(null);
            this.f158650a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1535a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158650a, ((C1535a) r4).f158650a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158650a.hashCode();
        }

        public String toString() {
            return "Error(errorType=" + this.f158650a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final List f158651a;

        public b(List r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f158651a = r2;
        }

        public final List a() {
            return this.f158651a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158651a, ((b) r4).f158651a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158651a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f158651a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
