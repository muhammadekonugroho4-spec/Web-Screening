package com.stockbit.trading.ui.openingaccount.bibit;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4081o0;
import com.stockbit.domain.model.valueobject.securities.OcrResult;
import java.io.Serializable;

/* loaded from: classes11.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final c f147916a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f147917a;

        /* renamed from: b, reason: collision with root package name */
        public final String f147918b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f147919c;
        public final int d;

        public a(String r2, String r3, boolean r4) {
            kotlin.jvm.internal.p.l(r2, "webiewUrl");
            this.f147917a = r2;
            this.f147918b = r3;
            this.f147919c = r4;
            this.d = com.stockbit.trading.h.f146974m;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("webiewUrl", this.f147917a);
            r02.putString("exitUrl", this.f147918b);
            r02.putBoolean("isFromSocial", this.f147919c);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.d;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f147917a, r52.f147917a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f147918b, r52.f147918b) == true) goto L15;
            return false;
        L15:
            if (this.f147919c == r52.f147919c) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            int r02 = this.f147917a.hashCode() * 31;
            String r1 = this.f147918b;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return ((r02 + r12) * 31) + Boolean.hashCode(this.f147919c);
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public String toString() {
            return "ActionRegistrationBibitFragmentToFragmentBibitPinWebView(webiewUrl=" + this.f147917a + ", exitUrl=" + this.f147918b + ", isFromSocial=" + this.f147919c + ')';
        }
    }

    public static final class b implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f147920a;

        /* renamed from: b, reason: collision with root package name */
        public final OcrResult f147921b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f147922c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final int f147923e;

        public b(boolean r1, OcrResult r2, boolean r3, String r4) {
            this.f147920a = r1;
            this.f147921b = r2;
            this.f147922c = r3;
            this.d = r4;
            this.f147923e = com.stockbit.trading.h.f146976n;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putBoolean("isFromSocial", this.f147920a);
            if (Parcelable.class.isAssignableFrom(OcrResult.class) == false) goto L6;
            r02.putParcelable("ocrResult", this.f147921b);
        L8:
            r02.putBoolean("registerWithBibit", this.f147922c);
            r02.putString("referralCode", this.d);
            return r02;
        L6:
            if (Serializable.class.isAssignableFrom(OcrResult.class) == false) goto L8;
            r02.putSerializable("ocrResult", (Serializable) this.f147921b);
            goto L8
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f147923e;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (this.f147920a == r52.f147920a) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f147921b, r52.f147921b) == true) goto L15;
            return false;
        L15:
            if (this.f147922c == r52.f147922c) goto L18;
            return false;
        L18:
            if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            int r02 = Boolean.hashCode(this.f147920a) * 31;
            OcrResult r1 = this.f147921b;
            int r2 = 0;
            if (r1 != null) goto L5;
            int r12 = 0;
        L6:
            int r03 = (((r02 + r12) * 31) + Boolean.hashCode(this.f147922c)) * 31;
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
            return "ActionRegistrationBibitFragmentToFragmentRegisterTrading(isFromSocial=" + this.f147920a + ", ocrResult=" + this.f147921b + ", registerWithBibit=" + this.f147922c + ", referralCode=" + this.d + ')';
        }
    }

    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.i r1) {
            this();
        }

        public static /* synthetic */ InterfaceC4081o0 c(c r2, boolean r3, OcrResult r4, boolean r5, String r6, int r7, Object r8) {
            if ((r7 & 1) == 0) goto L6;
            r3 = false;
        L6:
            if ((r7 & 2) == 0) goto L9;
            r4 = null;
        L9:
            if ((r7 & 4) == 0) goto L12;
            r5 = false;
        L12:
            if ((r7 & 8) == 0) goto L15;
            r6 = null;
        L15:
            return r2.b(r3, r4, r5, r6);
        }

        public final InterfaceC4081o0 a(String r2, String r3, boolean r4) {
            kotlin.jvm.internal.p.l(r2, "webiewUrl");
            return new a(r2, r3, r4);
        }

        public final InterfaceC4081o0 b(boolean r2, OcrResult r3, boolean r4, String r5) {
            return new b(r2, r3, r4, r5);
        }

        public c() {
        }
    }

    static {
        f147916a = new c(null);
    }
}
