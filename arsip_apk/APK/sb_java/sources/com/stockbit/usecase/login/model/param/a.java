package com.stockbit.usecase.login.model.param;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f158376a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f158377b;

    /* renamed from: com.stockbit.usecase.login.model.param.a$a, reason: collision with other inner class name */
    public static final class C1526a extends a {

        /* renamed from: c, reason: collision with root package name */
        public final String f158378c;
        public final boolean d;

        public C1526a(String r2, boolean r3) {
            super(r2, r3, null);
            this.f158378c = r2;
            this.d = r3;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C1526a) == true) goto L8;
            return false;
        L8:
            C1526a r52 = (C1526a) r5;
            if (p.g(this.f158378c, r52.f158378c) == true) goto L12;
            return false;
        L12:
            if (this.d == r52.d) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            String r02 = this.f158378c;
            if (r02 != null) goto L5;
            int r03 = 0;
        L7:
            return (r03 * 31) + Boolean.hashCode(this.d);
        L5:
            r03 = r02.hashCode();
            goto L7
        }

        public String toString() {
            return "MultiFactorParam(_loginToken=" + this.f158378c + ", _isAutomation=" + this.d + ')';
        }
    }

    public /* synthetic */ a(String r1, boolean r2, i r3) {
        this(r1, r2);
    }

    public final String a() {
        return this.f158376a;
    }

    public final boolean b() {
        return this.f158377b;
    }

    public a(String r1, boolean r2) {
        this.f158376a = r1;
        this.f158377b = r2;
    }
}
