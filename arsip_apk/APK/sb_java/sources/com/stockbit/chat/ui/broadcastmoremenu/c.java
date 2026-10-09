package com.stockbit.chat.ui.broadcastmoremenu;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f55808a = null;

        static {
            f55808a = new a();
        }

        public a() {
            super(null);
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f55809a;

        static {
        }

        public b(String r2) {
            p.l(r2, "roomId");
            super(null);
            this.f55809a = r2;
        }

        public final String a() {
            return this.f55809a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f55809a, ((b) r4).f55809a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f55809a.hashCode();
        }

        public String toString() {
            return "OnDeleteBroadcastClicked(roomId=" + this.f55809a + ')';
        }
    }

    /* renamed from: com.stockbit.chat.ui.broadcastmoremenu.c$c, reason: collision with other inner class name */
    public static final class C0570c extends c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f55810a;

        static {
        }

        public C0570c(boolean r2) {
            super(null);
            this.f55810a = r2;
        }

        public final boolean a() {
            return this.f55810a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C0570c) == true) goto L9;
            return false;
        L9:
            if (this.f55810a == ((C0570c) r4).f55810a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f55810a);
        }

        public String toString() {
            return "OnMuteUnmute(isMute=" + this.f55810a + ')';
        }
    }

    static {
    }

    public /* synthetic */ c(i r1) {
        this();
    }

    public c() {
    }
}
