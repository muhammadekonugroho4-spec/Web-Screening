package com.stockbit.usecase.trading.community.resource;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class f {

    public static final class a extends f {

        /* renamed from: a, reason: collision with root package name */
        public static final a f163312a = null;

        static {
            f163312a = new a();
        }

        public a() {
            super(null);
        }
    }

    public static final class b extends f {

        /* renamed from: a, reason: collision with root package name */
        public static final b f163313a = null;

        static {
            f163313a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends f {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.trading.community.model.d f163314a;

        public c(com.stockbit.usecase.trading.community.model.d r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f163314a = r2;
        }

        public final com.stockbit.usecase.trading.community.model.d a() {
            return this.f163314a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163314a, ((c) r4).f163314a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f163314a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f163314a + ")";
        }
    }

    public /* synthetic */ f(i r1) {
        this();
    }

    public f() {
    }
}
