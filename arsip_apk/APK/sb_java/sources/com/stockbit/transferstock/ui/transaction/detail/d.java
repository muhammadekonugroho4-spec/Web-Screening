package com.stockbit.transferstock.ui.transaction.detail;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.domain.model.valueobject.Securities;
import java.io.Serializable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class d implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f151155b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f151156c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Securities f151157a;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final d a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(d.class.getClassLoader());
            if (r4.containsKey("security") == false) goto L18;
            if (Parcelable.class.isAssignableFrom(Securities.class) == false) goto L7;
        L11:
            Securities r42 = (Securities) r4.get("security");
            if (r42 == null) goto L16;
            return new d(r42);
        L16:
            throw new IllegalArgumentException("Argument \"security\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(Securities.class) == true) goto L11;
            throw new UnsupportedOperationException(Securities.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L18:
            throw new IllegalArgumentException("Required argument \"security\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f151155b = new a(null);
        f151156c = 8;
    }

    public d(Securities r2) {
        p.l(r2, "security");
        this.f151157a = r2;
    }

    public static final d fromBundle(Bundle r1) {
        return f151155b.a(r1);
    }

    public final Securities a() {
        return this.f151157a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof d) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f151157a, ((d) r4).f151157a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f151157a.hashCode();
    }

    public String toString() {
        return "TransactionDetailFragmentArgs(security=" + this.f151157a + ')';
    }
}
