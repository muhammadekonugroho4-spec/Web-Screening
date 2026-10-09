package com.stockbit.multiplatformfacematch.ui;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes10.dex */
public final class j implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f122304b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f122305a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final j a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(j.class.getClassLoader());
            if (r3.containsKey("useCase") == false) goto L11;
            String r32 = r3.getString("useCase");
            if (r32 == null) goto L9;
            return new j(r32);
        L9:
            throw new IllegalArgumentException("Argument \"useCase\" is marked as non-null but was passed a null value.");
        L11:
            throw new IllegalArgumentException("Required argument \"useCase\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f122304b = new a(null);
    }

    public j(String r2) {
        kotlin.jvm.internal.p.l(r2, "useCase");
        this.f122305a = r2;
    }

    public static final j fromBundle(Bundle r1) {
        return f122304b.a(r1);
    }

    public final String a() {
        return this.f122305a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof j) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f122305a, ((j) r4).f122305a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f122305a.hashCode();
    }

    public String toString() {
        return "MultiPlatformFaceMatchSuccessFragmentArgs(useCase=" + this.f122305a + ')';
    }
}
