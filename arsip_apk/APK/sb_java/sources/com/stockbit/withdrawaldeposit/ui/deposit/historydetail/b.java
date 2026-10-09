package com.stockbit.withdrawaldeposit.ui.deposit.historydetail;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import java.io.Serializable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f172634b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f172635c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f172636a;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final b a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(b.class.getClassLoader());
            if (r4.containsKey("depositData") == false) goto L18;
            if (Parcelable.class.isAssignableFrom(Parcelable.class) == false) goto L7;
        L11:
            Parcelable r42 = (Parcelable) r4.get("depositData");
            if (r42 == null) goto L16;
            return new b(r42);
        L16:
            throw new IllegalArgumentException("Argument \"depositData\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(Parcelable.class) == true) goto L11;
            throw new UnsupportedOperationException(Parcelable.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L18:
            throw new IllegalArgumentException("Required argument \"depositData\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f172634b = new a(null);
        f172635c = 8;
    }

    public b(Parcelable r2) {
        p.l(r2, "depositData");
        this.f172636a = r2;
    }

    public static final b fromBundle(Bundle r1) {
        return f172634b.a(r1);
    }

    public final Parcelable a() {
        return this.f172636a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof b) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f172636a, ((b) r4).f172636a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f172636a.hashCode();
    }

    public String toString() {
        return "DepositDetailFragmentArgs(depositData=" + this.f172636a + ')';
    }
}
