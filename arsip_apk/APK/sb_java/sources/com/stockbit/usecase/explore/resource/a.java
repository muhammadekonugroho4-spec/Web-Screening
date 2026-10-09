package com.stockbit.usecase.explore.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.explore.resource.a$a, reason: collision with other inner class name */
    public static final class C1473a extends a {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f157707a;

        public C1473a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f157707a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1473a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157707a, ((C1473a) r4).f157707a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157707a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f157707a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final List f157708a;

        public b(List r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f157708a = r2;
        }

        public final List a() {
            return this.f157708a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157708a, ((b) r4).f157708a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157708a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f157708a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
