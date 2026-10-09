package com.stockbit.feature.verification.ui.starter;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import java.io.Serializable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class b implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f119095c = null;
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f119096a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f119097b;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final b a(Bundle r5) {
            p.l(r5, "bundle");
            r5.setClassLoader(b.class.getClassLoader());
            if (r5.containsKey("destinationId") == false) goto L18;
            int r02 = r5.getInt("destinationId");
            if (r5.containsKey("destinationArguments") == false) goto L16;
            if (Parcelable.class.isAssignableFrom(Bundle.class) == true) goto L14;
            if (Serializable.class.isAssignableFrom(Bundle.class) == true) goto L14;
            throw new UnsupportedOperationException(Bundle.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L14:
            return new b(r02, (Bundle) r5.get("destinationArguments"));
        L16:
            throw new IllegalArgumentException("Required argument \"destinationArguments\" is missing and does not have an android:defaultValue");
        L18:
            throw new IllegalArgumentException("Required argument \"destinationId\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f119095c = new a(null);
        d = 8;
    }

    public b(int r1, Bundle r2) {
        this.f119096a = r1;
        this.f119097b = r2;
    }

    public static final b fromBundle(Bundle r1) {
        return f119095c.a(r1);
    }

    public final Bundle a() {
        return this.f119097b;
    }

    public final int b() {
        return this.f119096a;
    }

    public final Bundle c() {
        Bundle r02 = new Bundle();
        r02.putInt("destinationId", this.f119096a);
        if (Parcelable.class.isAssignableFrom(Bundle.class) == false) goto L7;
        r02.putParcelable("destinationArguments", this.f119097b);
        return r02;
    L7:
        if (Serializable.class.isAssignableFrom(Bundle.class) == false) goto L11;
        r02.putSerializable("destinationArguments", (Serializable) this.f119097b);
        return r02;
    L11:
        throw new UnsupportedOperationException(Bundle.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f119096a == r52.f119096a) goto L12;
        return false;
    L12:
        if (p.g(this.f119097b, r52.f119097b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.f119096a) * 31;
        Bundle r1 = this.f119097b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "StartBlankFragmentArgs(destinationId=" + this.f119096a + ", destinationArguments=" + this.f119097b + ')';
    }
}
