package com.stockbit.tipping.ui.claim;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.domain.model.valueobject.TippingMyJarProfile;
import java.io.Serializable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class g implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f145947b = null;

    /* renamed from: a, reason: collision with root package name */
    public final TippingMyJarProfile f145948a;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final g a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(g.class.getClassLoader());
            if (r4.containsKey("tippingProfile") == true) goto L5;
            TippingMyJarProfile r42 = null;
        L14:
            return new g(r42);
        L5:
            if (Parcelable.class.isAssignableFrom(TippingMyJarProfile.class) == false) goto L7;
        L11:
            r42 = (TippingMyJarProfile) r4.get("tippingProfile");
            goto L14
        L7:
            if (Serializable.class.isAssignableFrom(TippingMyJarProfile.class) == true) goto L11;
            throw new UnsupportedOperationException(TippingMyJarProfile.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        public a() {
        }
    }

    static {
        f145947b = new a(null);
    }

    public g(TippingMyJarProfile r1) {
        this.f145948a = r1;
    }

    public static final g fromBundle(Bundle r1) {
        return f145947b.a(r1);
    }

    public final TippingMyJarProfile a() {
        return this.f145948a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof g) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f145948a, ((g) r4).f145948a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        TippingMyJarProfile r02 = this.f145948a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "TippingClaimTipFragmentArgs(tippingProfile=" + this.f145948a + ')';
    }
}
