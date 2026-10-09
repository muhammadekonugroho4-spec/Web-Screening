package com.stockbit.watchlist.ui.main.adapter;

import com.google.firebase.messaging.Constants;

/* loaded from: classes2.dex */
public abstract class Z {

    public static final class a extends Z {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.notification.model.a f169499a;

        static {
        }

        public a(com.stockbit.usecase.notification.model.a r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f169499a = r2;
        }

        @Override // com.stockbit.watchlist.ui.main.adapter.Z
        public com.stockbit.usecase.notification.model.a a() {
            return this.f169499a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f169499a, ((a) r4).f169499a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f169499a.hashCode();
        }

        public String toString() {
            return "BiometricReEnable(data=" + this.f169499a + ')';
        }
    }

    public static final class b extends Z {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.notification.model.a f169500a;

        static {
        }

        public b(com.stockbit.usecase.notification.model.a r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f169500a = r2;
        }

        @Override // com.stockbit.watchlist.ui.main.adapter.Z
        public com.stockbit.usecase.notification.model.a a() {
            return this.f169500a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f169500a, ((b) r4).f169500a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f169500a.hashCode();
        }

        public String toString() {
            return "FreezeAccount(data=" + this.f169500a + ')';
        }
    }

    public static final class c extends Z {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.notification.model.a f169501a;

        static {
        }

        public c(com.stockbit.usecase.notification.model.a r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f169501a = r2;
        }

        @Override // com.stockbit.watchlist.ui.main.adapter.Z
        public com.stockbit.usecase.notification.model.a a() {
            return this.f169501a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f169501a, ((c) r4).f169501a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f169501a.hashCode();
        }

        public String toString() {
            return "Support(data=" + this.f169501a + ')';
        }
    }

    static {
    }

    public /* synthetic */ Z(kotlin.jvm.internal.i r1) {
        this();
    }

    public abstract com.stockbit.usecase.notification.model.a a();

    public Z() {
    }
}
