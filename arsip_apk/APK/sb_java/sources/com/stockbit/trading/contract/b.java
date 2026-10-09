package com.stockbit.trading.contract;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f146231a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f146232b;

        public a(String r2, boolean r3) {
            p.l(r2, "type");
            super(null);
            this.f146231a = r2;
            this.f146232b = r3;
        }

        public final boolean a() {
            return this.f146232b;
        }

        public final String b() {
            return this.f146231a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f146231a, r52.f146231a) == true) goto L12;
            return false;
        L12:
            if (this.f146232b == r52.f146232b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f146231a.hashCode() * 31) + Boolean.hashCode(this.f146232b);
        }

        public String toString() {
            return "OnUpdateOrderListType(type=" + this.f146231a + ", autoOpenFirstItem=" + this.f146232b + ')';
        }
    }

    public /* synthetic */ b(i r1) {
        this();
    }

    public b() {
    }
}
