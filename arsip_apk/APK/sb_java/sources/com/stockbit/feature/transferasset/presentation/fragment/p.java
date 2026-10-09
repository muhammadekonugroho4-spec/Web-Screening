package com.stockbit.feature.transferasset.presentation.fragment;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.feature.transferasset.contract.model.TransferAssetHistoryParam;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class p implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f117267b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f117268c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final TransferAssetHistoryParam f117269a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final p a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(p.class.getClassLoader());
            if (r4.containsKey("param") == false) goto L18;
            if (Parcelable.class.isAssignableFrom(TransferAssetHistoryParam.class) == false) goto L7;
        L11:
            TransferAssetHistoryParam r42 = (TransferAssetHistoryParam) r4.get("param");
            if (r42 == null) goto L16;
            return new p(r42);
        L16:
            throw new IllegalArgumentException("Argument \"param\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(TransferAssetHistoryParam.class) == true) goto L11;
            throw new UnsupportedOperationException(TransferAssetHistoryParam.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L18:
            throw new IllegalArgumentException("Required argument \"param\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f117267b = new a(null);
        f117268c = 8;
    }

    public p(TransferAssetHistoryParam r2) {
        kotlin.jvm.internal.p.l(r2, "param");
        this.f117269a = r2;
    }

    public static final p fromBundle(Bundle r1) {
        return f117267b.a(r1);
    }

    public final TransferAssetHistoryParam a() {
        return this.f117269a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        if (Parcelable.class.isAssignableFrom(TransferAssetHistoryParam.class) == false) goto L7;
        TransferAssetHistoryParam r1 = this.f117269a;
        kotlin.jvm.internal.p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
        r02.putParcelable("param", r1);
        return r02;
    L7:
        if (Serializable.class.isAssignableFrom(TransferAssetHistoryParam.class) == false) goto L11;
        Parcelable r12 = this.f117269a;
        kotlin.jvm.internal.p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
        r02.putSerializable("param", (Serializable) r12);
        return r02;
    L11:
        throw new UnsupportedOperationException(TransferAssetHistoryParam.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof p) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f117269a, ((p) r4).f117269a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f117269a.hashCode();
    }

    public String toString() {
        return "TransferCashHistoryComposeFragmentArgs(param=" + this.f117269a + ')';
    }
}
