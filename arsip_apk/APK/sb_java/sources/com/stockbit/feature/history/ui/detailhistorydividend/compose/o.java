package com.stockbit.feature.history.ui.detailhistorydividend.compose;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.feature.history.contract.DetailHistoryDividendUIParam;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class o implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f97441b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f97442c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final DetailHistoryDividendUIParam f97443a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final o a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(o.class.getClassLoader());
            if (r4.containsKey("argumentDividendUIParam") == false) goto L18;
            if (Parcelable.class.isAssignableFrom(DetailHistoryDividendUIParam.class) == false) goto L7;
        L11:
            DetailHistoryDividendUIParam r42 = (DetailHistoryDividendUIParam) r4.get("argumentDividendUIParam");
            if (r42 == null) goto L16;
            return new o(r42);
        L16:
            throw new IllegalArgumentException("Argument \"argumentDividendUIParam\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(DetailHistoryDividendUIParam.class) == true) goto L11;
            throw new UnsupportedOperationException(DetailHistoryDividendUIParam.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L18:
            throw new IllegalArgumentException("Required argument \"argumentDividendUIParam\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f97441b = new a(null);
        f97442c = 8;
    }

    public o(DetailHistoryDividendUIParam r2) {
        kotlin.jvm.internal.p.l(r2, "argumentDividendUIParam");
        this.f97443a = r2;
    }

    public static final o fromBundle(Bundle r1) {
        return f97441b.a(r1);
    }

    public final Bundle a() {
        Bundle r02 = new Bundle();
        if (Parcelable.class.isAssignableFrom(DetailHistoryDividendUIParam.class) == false) goto L7;
        DetailHistoryDividendUIParam r1 = this.f97443a;
        kotlin.jvm.internal.p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
        r02.putParcelable("argumentDividendUIParam", r1);
        return r02;
    L7:
        if (Serializable.class.isAssignableFrom(DetailHistoryDividendUIParam.class) == false) goto L11;
        Parcelable r12 = this.f97443a;
        kotlin.jvm.internal.p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
        r02.putSerializable("argumentDividendUIParam", (Serializable) r12);
        return r02;
    L11:
        throw new UnsupportedOperationException(DetailHistoryDividendUIParam.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof o) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f97443a, ((o) r4).f97443a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f97443a.hashCode();
    }

    public String toString() {
        return "DetailHistoryDividendComposeFragmentArgs(argumentDividendUIParam=" + this.f97443a + ')';
    }
}
