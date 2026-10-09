package com.stockbit.personalamend.ui.forgotpin.starter;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import java.io.Serializable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class b implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f126361c = null;
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f126362a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f126363b;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final b a(Bundle r5) {
            p.l(r5, "bundle");
            r5.setClassLoader(b.class.getClassLoader());
            if (r5.containsKey("destinationId") == false) goto L18;
            int r02 = r5.getInt("destinationId");
            if (r5.containsKey("destinationArguments") == false) goto L16;
            if (Parcelable.class.isAssignableFrom(Bundle.class) == true) goto L14;
            if (Serializable.class.isAssignableFrom(Bundle.class) == true) goto L14;
            throw new UnsupportedOperationException(Bundle.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L14:
            return new b(r02, (Bundle) r5.get("destinationArguments"));
        L16:
            throw new IllegalArgumentException("Required argument \"destinationArguments\" is missing and does not have an android:defaultValue");
        L18:
            throw new IllegalArgumentException("Required argument \"destinationId\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f126361c = new a(null);
        d = 8;
    }

    public b(int r1, Bundle r2) {
        this.f126362a = r1;
        this.f126363b = r2;
    }

    public static final b fromBundle(Bundle r1) {
        return f126361c.a(r1);
    }

    public final Bundle a() {
        return this.f126363b;
    }

    public final int b() {
        return this.f126362a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f126362a == r52.f126362a) goto L12;
        return false;
    L12:
        if (p.g(this.f126363b, r52.f126363b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.f126362a) * 31;
        Bundle r1 = this.f126363b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "StartBlankFragmentArgs(destinationId=" + this.f126362a + ", destinationArguments=" + this.f126363b + ')';
    }
}
