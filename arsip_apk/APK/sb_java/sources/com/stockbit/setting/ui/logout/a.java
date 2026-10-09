package com.stockbit.setting.ui.logout;

import kotlin.jvm.internal.i;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: com.stockbit.setting.ui.logout.a$a, reason: collision with other inner class name */
    public static final class C1227a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final int f136186a;

        static {
        }

        public C1227a(int r2) {
            super(null);
            this.f136186a = r2;
        }

        public final int a() {
            return this.f136186a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1227a) == true) goto L9;
            return false;
        L9:
            if (this.f136186a == ((C1227a) r4).f136186a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Integer.hashCode(this.f136186a);
        }

        public String toString() {
            return "Dismiss(logoutType=" + this.f136186a + ')';
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
