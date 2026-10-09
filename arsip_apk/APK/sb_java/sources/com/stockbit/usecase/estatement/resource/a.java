package com.stockbit.usecase.estatement.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainSecuritiesException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.estatement.resource.a$a, reason: collision with other inner class name */
    public static final class C1469a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final DomainSecuritiesException f157597a;

        public C1469a(DomainSecuritiesException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f157597a = r2;
        }

        public final DomainSecuritiesException a() {
            return this.f157597a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1469a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157597a, ((C1469a) r4).f157597a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157597a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f157597a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f157598a;

        public b(String r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f157598a = r2;
        }

        public final String a() {
            return this.f157598a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157598a, ((b) r4).f157598a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157598a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f157598a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
