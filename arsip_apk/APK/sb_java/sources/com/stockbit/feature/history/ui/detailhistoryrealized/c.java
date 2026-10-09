package com.stockbit.feature.history.ui.detailhistoryrealized;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.feature.history.contract.DetailHistoryUIParam;
import java.io.Serializable;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class c implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f97702b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f97703c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final DetailHistoryUIParam f97704a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final c a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(c.class.getClassLoader());
            if (r4.containsKey("args") == false) goto L18;
            if (Parcelable.class.isAssignableFrom(DetailHistoryUIParam.class) == false) goto L7;
        L11:
            DetailHistoryUIParam r42 = (DetailHistoryUIParam) r4.get("args");
            if (r42 == null) goto L16;
            return new c(r42);
        L16:
            throw new IllegalArgumentException("Argument \"args\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(DetailHistoryUIParam.class) == true) goto L11;
            throw new UnsupportedOperationException(DetailHistoryUIParam.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L18:
            throw new IllegalArgumentException("Required argument \"args\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f97702b = new a(null);
        f97703c = 8;
    }

    public c(DetailHistoryUIParam r2) {
        p.l(r2, "args");
        this.f97704a = r2;
    }

    public static final c fromBundle(Bundle r1) {
        return f97702b.a(r1);
    }

    public final Bundle a() {
        Bundle r02 = new Bundle();
        if (Parcelable.class.isAssignableFrom(DetailHistoryUIParam.class) == false) goto L7;
        DetailHistoryUIParam r1 = this.f97704a;
        p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
        r02.putParcelable("args", r1);
        return r02;
    L7:
        if (Serializable.class.isAssignableFrom(DetailHistoryUIParam.class) == false) goto L11;
        Parcelable r12 = this.f97704a;
        p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
        r02.putSerializable("args", (Serializable) r12);
        return r02;
    L11:
        throw new UnsupportedOperationException(DetailHistoryUIParam.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof c) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f97704a, ((c) r4).f97704a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f97704a.hashCode();
    }

    public String toString() {
        return "DetailHistoryRealizedComposeFragmentArgs(args=" + this.f97704a + ')';
    }
}
