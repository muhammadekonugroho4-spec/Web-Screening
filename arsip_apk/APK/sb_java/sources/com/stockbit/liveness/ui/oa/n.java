package com.stockbit.liveness.ui.oa;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes10.dex */
public final class n implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f121259a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f121260b;

    /* renamed from: c, reason: collision with root package name */
    public final int f121261c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final n a(Bundle r6) {
            kotlin.jvm.internal.p.l(r6, "bundle");
            r6.setClassLoader(n.class.getClassLoader());
            int r2 = 0;
            if (r6.containsKey("isLastForm") == false) goto L5;
            boolean r02 = r6.getBoolean("isLastForm");
        L7:
            if (r6.containsKey("isLivenessRejected") == false) goto L9;
            boolean r1 = r6.getBoolean("isLivenessRejected");
        L11:
            if (r6.containsKey("oaStatusCode") == false) goto L14;
            r2 = r6.getInt("oaStatusCode");
        L14:
            return new n(r02, r1, r2);
        L9:
            r1 = false;
            goto L11
        L5:
            r02 = false;
            goto L7
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public n(boolean r1, boolean r2, int r3) {
        this.f121259a = r1;
        this.f121260b = r2;
        this.f121261c = r3;
    }

    public static final n fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final int a() {
        return this.f121261c;
    }

    public final boolean b() {
        return this.f121259a;
    }

    public final boolean c() {
        return this.f121260b;
    }

    public final Bundle d() {
        Bundle r02 = new Bundle();
        r02.putBoolean("isLastForm", this.f121259a);
        r02.putBoolean("isLivenessRejected", this.f121260b);
        r02.putInt("oaStatusCode", this.f121261c);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (this.f121259a == r52.f121259a) goto L12;
        return false;
    L12:
        if (this.f121260b == r52.f121260b) goto L15;
        return false;
    L15:
        if (this.f121261c == r52.f121261c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f121259a) * 31) + Boolean.hashCode(this.f121260b)) * 31) + Integer.hashCode(this.f121261c);
    }

    public String toString() {
        return "OALivenessPreparationFragmentArgs(isLastForm=" + this.f121259a + ", isLivenessRejected=" + this.f121260b + ", oaStatusCode=" + this.f121261c + ')';
    }
}
