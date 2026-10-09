package com.stockbit.liveness.livenessprep;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* renamed from: com.stockbit.liveness.livenessprep.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9156d implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f121145b = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f121146a;

    /* renamed from: com.stockbit.liveness.livenessprep.d$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final C9156d a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(C9156d.class.getClassLoader());
            if (r3.containsKey("backToHomePage") == false) goto L5;
            boolean r32 = r3.getBoolean("backToHomePage");
        L7:
            return new C9156d(r32);
        L5:
            r32 = false;
            goto L7
        }

        public a() {
        }
    }

    static {
        f121145b = new a(null);
    }

    public C9156d(boolean r1) {
        this.f121146a = r1;
    }

    public static final C9156d fromBundle(Bundle r1) {
        return f121145b.a(r1);
    }

    public final boolean a() {
        return this.f121146a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C9156d) == true) goto L9;
        return false;
    L9:
        if (this.f121146a == ((C9156d) r4).f121146a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f121146a);
    }

    public String toString() {
        return "LivenessLimitDialogArgs(backToHomePage=" + this.f121146a + ')';
    }

    public /* synthetic */ C9156d(boolean r1, int r2, kotlin.jvm.internal.i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = false;
    L5:
        this(r1);
    }
}
