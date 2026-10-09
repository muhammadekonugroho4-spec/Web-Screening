package com.stockbit.trading.ui.landing.rejected;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.trading.contract.model.openingaccount.OAStatus;
import java.io.Serializable;

/* loaded from: classes11.dex */
public final class d implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f147534b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f147535c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final OAStatus f147536a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final d a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(d.class.getClassLoader());
            if (r4.containsKey("OA_STATUS") == true) goto L5;
            OAStatus r42 = null;
        L14:
            return new d(r42);
        L5:
            if (Parcelable.class.isAssignableFrom(OAStatus.class) == false) goto L7;
        L11:
            r42 = (OAStatus) r4.get("OA_STATUS");
            goto L14
        L7:
            if (Serializable.class.isAssignableFrom(OAStatus.class) == true) goto L11;
            throw new UnsupportedOperationException(OAStatus.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        public a() {
        }
    }

    static {
        f147534b = new a(null);
        f147535c = 8;
    }

    public d(OAStatus r1) {
        this.f147536a = r1;
    }

    public static final d fromBundle(Bundle r1) {
        return f147534b.a(r1);
    }

    public final OAStatus a() {
        return this.f147536a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        if (Parcelable.class.isAssignableFrom(OAStatus.class) == false) goto L7;
        r02.putParcelable("OA_STATUS", this.f147536a);
        return r02;
    L7:
        if (Serializable.class.isAssignableFrom(OAStatus.class) == false) goto L9;
        r02.putSerializable("OA_STATUS", (Serializable) this.f147536a);
    L9:
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof d) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f147536a, ((d) r4).f147536a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        OAStatus r02 = this.f147536a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "SecuritiesLandingRejectedFragmentArgs(OASTATUS=" + this.f147536a + ')';
    }
}
