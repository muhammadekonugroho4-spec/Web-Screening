package com.stockbit.usecase.estatement.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f157599a;

        public a(DomainSecuritiesException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f157599a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f157599a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157599a, ((a) r4).f157599a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157599a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f157599a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.estatement.resource.b$b, reason: collision with other inner class name */
    public static final class C1470b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f157600a;

        public C1470b(String r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f157600a = r2;
        }

        public final String a() {
            return this.f157600a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1470b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157600a, ((C1470b) r4).f157600a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157600a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f157600a + ")";
        }
    }

    public /* synthetic */ b(i r1) {
        this();
    }

    public b() {
    }
}
