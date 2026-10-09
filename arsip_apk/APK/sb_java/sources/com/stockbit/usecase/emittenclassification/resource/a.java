package com.stockbit.usecase.emittenclassification.resource;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.emittenclassification.resource.a$a, reason: collision with other inner class name */
    public static final class C1466a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.emittenclassification.failure.a f157579a;

        public C1466a(com.stockbit.usecase.emittenclassification.failure.a r2) {
            p.l(r2, "failure");
            super(null);
            this.f157579a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1466a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157579a, ((C1466a) r4).f157579a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157579a.hashCode();
        }

        public String toString() {
            return "Error(failure=" + this.f157579a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.emittenclassification.model.a f157580a;

        public b(com.stockbit.usecase.emittenclassification.model.a r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f157580a = r2;
        }

        public final com.stockbit.usecase.emittenclassification.model.a a() {
            return this.f157580a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157580a, ((b) r4).f157580a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157580a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f157580a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
