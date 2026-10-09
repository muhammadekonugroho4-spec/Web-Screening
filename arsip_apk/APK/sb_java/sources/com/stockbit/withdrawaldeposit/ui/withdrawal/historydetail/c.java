package com.stockbit.withdrawaldeposit.ui.withdrawal.historydetail;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import java.io.Serializable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f173247b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f173248c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f173249a;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final c a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(c.class.getClassLoader());
            if (r4.containsKey("withdrawalData") == false) goto L18;
            if (Parcelable.class.isAssignableFrom(Parcelable.class) == false) goto L7;
        L11:
            Parcelable r42 = (Parcelable) r4.get("withdrawalData");
            if (r42 == null) goto L16;
            return new c(r42);
        L16:
            throw new IllegalArgumentException("Argument \"withdrawalData\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(Parcelable.class) == true) goto L11;
            throw new UnsupportedOperationException(Parcelable.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L18:
            throw new IllegalArgumentException("Required argument \"withdrawalData\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f173247b = new a(null);
        f173248c = 8;
    }

    public c(Parcelable r2) {
        p.l(r2, "withdrawalData");
        this.f173249a = r2;
    }

    public static final c fromBundle(Bundle r1) {
        return f173247b.a(r1);
    }

    public final Parcelable a() {
        return this.f173249a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        if (Parcelable.class.isAssignableFrom(Parcelable.class) == false) goto L7;
        Parcelable r1 = this.f173249a;
        p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
        r02.putParcelable("withdrawalData", r1);
        return r02;
    L7:
        if (Serializable.class.isAssignableFrom(Parcelable.class) == false) goto L11;
        Parcelable r12 = this.f173249a;
        p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
        r02.putSerializable("withdrawalData", (Serializable) r12);
        return r02;
    L11:
        throw new UnsupportedOperationException(Parcelable.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof c) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f173249a, ((c) r4).f173249a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f173249a.hashCode();
    }

    public String toString() {
        return "WithdrawalDetailFragmentArgs(withdrawalData=" + this.f173249a + ')';
    }
}
