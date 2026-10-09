package com.stockbit.sharetrade.ui.review;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import java.io.Serializable;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class e implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f137287b = null;

    /* renamed from: a, reason: collision with root package name */
    public final ReviewShareAmountNavParam f137288a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final e a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(e.class.getClassLoader());
            if (r4.containsKey("nav_param") == false) goto L18;
            if (Parcelable.class.isAssignableFrom(ReviewShareAmountNavParam.class) == false) goto L7;
        L11:
            ReviewShareAmountNavParam r42 = (ReviewShareAmountNavParam) r4.get("nav_param");
            if (r42 == null) goto L16;
            return new e(r42);
        L16:
            throw new IllegalArgumentException("Argument \"nav_param\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(ReviewShareAmountNavParam.class) == true) goto L11;
            throw new UnsupportedOperationException(ReviewShareAmountNavParam.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L18:
            throw new IllegalArgumentException("Required argument \"nav_param\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f137287b = new a(null);
    }

    public e(ReviewShareAmountNavParam r2) {
        p.l(r2, "navParam");
        this.f137288a = r2;
    }

    public static final e fromBundle(Bundle r1) {
        return f137287b.a(r1);
    }

    public final ReviewShareAmountNavParam a() {
        return this.f137288a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof e) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f137288a, ((e) r4).f137288a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f137288a.hashCode();
    }

    public String toString() {
        return "ReviewShareAmountDialogArgs(navParam=" + this.f137288a + ')';
    }
}
