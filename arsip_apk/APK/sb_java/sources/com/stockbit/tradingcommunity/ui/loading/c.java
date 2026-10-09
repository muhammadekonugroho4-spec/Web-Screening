package com.stockbit.tradingcommunity.ui.loading;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f149781a;

        static {
        }

        public a(String r2) {
            p.l(r2, "message");
            super(null);
            this.f149781a = r2;
        }

        public final String a() {
            return this.f149781a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f149781a, ((a) r4).f149781a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f149781a.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.f149781a + ')';
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.trading.community.model.f f149782a;

        static {
        }

        public b(com.stockbit.usecase.trading.community.model.f r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f149782a = r2;
        }

        public final com.stockbit.usecase.trading.community.model.f a() {
            return this.f149782a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f149782a, ((b) r4).f149782a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f149782a.hashCode();
        }

        public String toString() {
            return "HasCommunity(data=" + this.f149782a + ')';
        }
    }

    /* renamed from: com.stockbit.tradingcommunity.ui.loading.c$c, reason: collision with other inner class name */
    public static final class C1360c extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final C1360c f149783a = null;

        static {
            f149783a = new C1360c();
        }

        public C1360c() {
            super(null);
        }
    }

    public static final class d extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final d f149784a = null;

        static {
            f149784a = new d();
        }

        public d() {
            super(null);
        }
    }

    public static final class e extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final e f149785a = null;

        static {
            f149785a = new e();
        }

        public e() {
            super(null);
        }
    }

    static {
    }

    public /* synthetic */ c(kotlin.jvm.internal.i r1) {
        this();
    }

    public c() {
    }
}
