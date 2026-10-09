package com.stockbit.usecase.company.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class F {

    public static final class a extends F {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f156735a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f156735a = r2;
        }

        public final DomainExodusException a() {
            return this.f156735a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156735a, ((a) r4).f156735a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156735a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f156735a + ")";
        }
    }

    public static final class b extends F {

        /* renamed from: a, reason: collision with root package name */
        public List f156736a;

        public b(List r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f156736a = r2;
        }

        public final List a() {
            return this.f156736a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f156736a, ((b) r4).f156736a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f156736a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f156736a + ")";
        }
    }

    public static final class c extends F {

        /* renamed from: a, reason: collision with root package name */
        public static final c f156737a = null;

        static {
            f156737a = new c();
        }

        public c() {
            super(null);
        }
    }

    public /* synthetic */ F(kotlin.jvm.internal.i r1) {
        this();
    }

    public F() {
    }
}
