package com.stockbit.feature.history.ui.detailhistorynego;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.feature.history.contract.DetailHistoryNegoUIParam;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class e implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f97605b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f97606c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final DetailHistoryNegoUIParam f97607a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final e a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(e.class.getClassLoader());
            if (r4.containsKey("args") == false) goto L18;
            if (Parcelable.class.isAssignableFrom(DetailHistoryNegoUIParam.class) == false) goto L7;
        L11:
            DetailHistoryNegoUIParam r42 = (DetailHistoryNegoUIParam) r4.get("args");
            if (r42 == null) goto L16;
            return new e(r42);
        L16:
            throw new IllegalArgumentException("Argument \"args\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(DetailHistoryNegoUIParam.class) == true) goto L11;
            throw new UnsupportedOperationException(DetailHistoryNegoUIParam.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L18:
            throw new IllegalArgumentException("Required argument \"args\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f97605b = new a(null);
        f97606c = 8;
    }

    public e(DetailHistoryNegoUIParam r2) {
        kotlin.jvm.internal.p.l(r2, "args");
        this.f97607a = r2;
    }

    public static final e fromBundle(Bundle r1) {
        return f97605b.a(r1);
    }

    public final DetailHistoryNegoUIParam a() {
        return this.f97607a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        if (Parcelable.class.isAssignableFrom(DetailHistoryNegoUIParam.class) == false) goto L7;
        DetailHistoryNegoUIParam r1 = this.f97607a;
        kotlin.jvm.internal.p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
        r02.putParcelable("args", r1);
        return r02;
    L7:
        if (Serializable.class.isAssignableFrom(DetailHistoryNegoUIParam.class) == false) goto L11;
        Parcelable r12 = this.f97607a;
        kotlin.jvm.internal.p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
        r02.putSerializable("args", (Serializable) r12);
        return r02;
    L11:
        throw new UnsupportedOperationException(DetailHistoryNegoUIParam.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof e) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f97607a, ((e) r4).f97607a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f97607a.hashCode();
    }

    public String toString() {
        return "DetailHistoryNegoComposeFragmentArgs(args=" + this.f97607a + ')';
    }
}
