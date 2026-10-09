package com.stockbit.common.uikit.dialogs.error.di;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: com.stockbit.common.uikit.dialogs.error.di.a$a, reason: collision with other inner class name */
    public static final class C0635a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final int f61712a;

        /* renamed from: b, reason: collision with root package name */
        public final String f61713b;

        static {
        }

        public C0635a(int r2, String r3) {
            p.l(r3, "message");
            super(null);
            this.f61712a = r2;
            this.f61713b = r3;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0635a) == true) goto L8;
            return false;
        L8:
            C0635a r52 = (C0635a) r5;
            if (this.f61712a == r52.f61712a) goto L12;
            return false;
        L12:
            if (p.g(this.f61713b, r52.f61713b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f61712a) * 31) + this.f61713b.hashCode();
        }

        public String toString() {
            return "LogoutTrading(errorCode=" + this.f61712a + ", message=" + this.f61713b + ')';
        }
    }

    static {
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
