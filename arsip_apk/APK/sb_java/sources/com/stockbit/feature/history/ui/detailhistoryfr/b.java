package com.stockbit.feature.history.ui.detailhistoryfr;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.feature.history.contract.SbnFRUIParam;
import java.io.Serializable;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class b implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f97515b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f97516c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final SbnFRUIParam f97517a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final b a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(b.class.getClassLoader());
            if (r4.containsKey("argumentSbnFRUIParam") == false) goto L18;
            if (Parcelable.class.isAssignableFrom(SbnFRUIParam.class) == false) goto L7;
        L11:
            SbnFRUIParam r42 = (SbnFRUIParam) r4.get("argumentSbnFRUIParam");
            if (r42 == null) goto L16;
            return new b(r42);
        L16:
            throw new IllegalArgumentException("Argument \"argumentSbnFRUIParam\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(SbnFRUIParam.class) == true) goto L11;
            throw new UnsupportedOperationException(SbnFRUIParam.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L18:
            throw new IllegalArgumentException("Required argument \"argumentSbnFRUIParam\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f97515b = new a(null);
        f97516c = 8;
    }

    public b(SbnFRUIParam r2) {
        p.l(r2, "argumentSbnFRUIParam");
        this.f97517a = r2;
    }

    public static final b fromBundle(Bundle r1) {
        return f97515b.a(r1);
    }

    public final SbnFRUIParam a() {
        return this.f97517a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        if (Parcelable.class.isAssignableFrom(SbnFRUIParam.class) == false) goto L7;
        SbnFRUIParam r1 = this.f97517a;
        p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
        r02.putParcelable("argumentSbnFRUIParam", r1);
        return r02;
    L7:
        if (Serializable.class.isAssignableFrom(SbnFRUIParam.class) == false) goto L11;
        Parcelable r12 = this.f97517a;
        p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
        r02.putSerializable("argumentSbnFRUIParam", (Serializable) r12);
        return r02;
    L11:
        throw new UnsupportedOperationException(SbnFRUIParam.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof b) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f97517a, ((b) r4).f97517a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f97517a.hashCode();
    }

    public String toString() {
        return "DetailHistorySbnFRFragmentArgs(argumentSbnFRUIParam=" + this.f97517a + ')';
    }
}
