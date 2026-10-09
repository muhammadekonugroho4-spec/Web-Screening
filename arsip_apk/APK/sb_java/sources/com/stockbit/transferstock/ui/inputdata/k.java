package com.stockbit.transferstock.ui.inputdata;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.domain.model.valueobject.Securities;
import java.io.Serializable;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class k implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final int f150861e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Securities f150862a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f150863b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f150864c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final k a(Bundle r5) {
            p.l(r5, "bundle");
            r5.setClassLoader(k.class.getClassLoader());
            if (r5.containsKey("security") == false) goto L26;
            if (Parcelable.class.isAssignableFrom(Securities.class) == false) goto L7;
        L11:
            Securities r02 = (Securities) r5.get("security");
            if (r02 == null) goto L24;
            if (r5.containsKey("fromOnboard") == false) goto L16;
            boolean r1 = r5.getBoolean("fromOnboard");
        L18:
            if (r5.containsKey("isFromDeeplink") == false) goto L20;
            boolean r52 = r5.getBoolean("isFromDeeplink");
        L22:
            return new k(r02, r1, r52);
        L20:
            r52 = false;
            goto L22
        L16:
            r1 = true;
            goto L18
        L24:
            throw new IllegalArgumentException("Argument \"security\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(Securities.class) == true) goto L11;
            throw new UnsupportedOperationException(Securities.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L26:
            throw new IllegalArgumentException("Required argument \"security\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        d = new a(null);
        f150861e = 8;
    }

    public k(Securities r2, boolean r3, boolean r4) {
        p.l(r2, "security");
        this.f150862a = r2;
        this.f150863b = r3;
        this.f150864c = r4;
    }

    public static final k fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final boolean a() {
        return this.f150863b;
    }

    public final Securities b() {
        return this.f150862a;
    }

    public final boolean c() {
        return this.f150864c;
    }

    public final Bundle d() {
        Bundle r02 = new Bundle();
        if (Parcelable.class.isAssignableFrom(Securities.class) == false) goto L6;
        Securities r1 = this.f150862a;
        p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
        r02.putParcelable("security", r1);
    L8:
        r02.putBoolean("fromOnboard", this.f150863b);
        r02.putBoolean("isFromDeeplink", this.f150864c);
        return r02;
    L6:
        if (Serializable.class.isAssignableFrom(Securities.class) == false) goto L11;
        Parcelable r12 = this.f150862a;
        p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
        r02.putSerializable("security", (Serializable) r12);
        goto L8
    L11:
        throw new UnsupportedOperationException(Securities.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (p.g(this.f150862a, r52.f150862a) == true) goto L12;
        return false;
    L12:
        if (this.f150863b == r52.f150863b) goto L15;
        return false;
    L15:
        if (this.f150864c == r52.f150864c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f150862a.hashCode() * 31) + Boolean.hashCode(this.f150863b)) * 31) + Boolean.hashCode(this.f150864c);
    }

    public String toString() {
        return "MainInputDataFragmentArgs(security=" + this.f150862a + ", fromOnboard=" + this.f150863b + ", isFromDeeplink=" + this.f150864c + ')';
    }
}
