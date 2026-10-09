package com.stockbit.trading.ui.openingaccount.bibit.pin;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4081o0;
import com.stockbit.domain.model.valueobject.securities.OcrResult;
import java.io.Serializable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final b f147945a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f147946a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f147947b;

        /* renamed from: c, reason: collision with root package name */
        public final OcrResult f147948c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final int f147949e;

        public a(boolean r1, boolean r2, OcrResult r3, String r4) {
            this.f147946a = r1;
            this.f147947b = r2;
            this.f147948c = r3;
            this.d = r4;
            this.f147949e = com.stockbit.trading.h.f146968j;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putBoolean("registerWithBibit", this.f147946a);
            r02.putBoolean("isFromSocial", this.f147947b);
            if (Parcelable.class.isAssignableFrom(OcrResult.class) == false) goto L6;
            r02.putParcelable("ocrResult", this.f147948c);
        L8:
            r02.putString("referralCode", this.d);
            return r02;
        L6:
            if (Serializable.class.isAssignableFrom(OcrResult.class) == false) goto L8;
            r02.putSerializable("ocrResult", (Serializable) this.f147948c);
            goto L8
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f147949e;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f147946a == r52.f147946a) goto L12;
            return false;
        L12:
            if (this.f147947b == r52.f147947b) goto L15;
            return false;
        L15:
            if (p.g(this.f147948c, r52.f147948c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            int r02 = ((Boolean.hashCode(this.f147946a) * 31) + Boolean.hashCode(this.f147947b)) * 31;
            OcrResult r1 = this.f147948c;
            int r2 = 0;
            if (r1 != null) goto L5;
            int r12 = 0;
        L6:
            int r03 = (r02 + r12) * 31;
            String r13 = this.d;
            if (r13 == null) goto L11;
            r2 = r13.hashCode();
        L11:
            return r03 + r2;
        L5:
            r12 = r1.hashCode();
            goto L6
        }

        public String toString() {
            return "ActionFragmentBibitPinWebViewToFragmentRegisterTrading(registerWithBibit=" + this.f147946a + ", isFromSocial=" + this.f147947b + ", ocrResult=" + this.f147948c + ", referralCode=" + this.d + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(i r1) {
            this();
        }

        public static /* synthetic */ InterfaceC4081o0 b(b r1, boolean r2, boolean r3, OcrResult r4, String r5, int r6, Object r7) {
            if ((r6 & 1) == 0) goto L6;
            r2 = false;
        L6:
            if ((r6 & 2) == 0) goto L9;
            r3 = false;
        L9:
            if ((r6 & 4) == 0) goto L12;
            r4 = null;
        L12:
            if ((r6 & 8) == 0) goto L15;
            r5 = null;
        L15:
            return r1.a(r2, r3, r4, r5);
        }

        public final InterfaceC4081o0 a(boolean r2, boolean r3, OcrResult r4, String r5) {
            return new a(r2, r3, r4, r5);
        }

        public b() {
        }
    }

    static {
        f147945a = new b(null);
    }
}
