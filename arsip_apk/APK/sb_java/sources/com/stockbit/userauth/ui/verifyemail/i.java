package com.stockbit.userauth.ui.verifyemail;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final b f165567a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f165568a;

        /* renamed from: b, reason: collision with root package name */
        public final String f165569b;

        /* renamed from: c, reason: collision with root package name */
        public final int f165570c;

        public a(String r2, String r3) {
            p.l(r2, "EXTRALAUNCHLIVESUPPORT");
            p.l(r3, "EXTRALAUNCHLIVESUPPORTMESSAGE");
            this.f165568a = r2;
            this.f165569b = r3;
            this.f165570c = com.stockbit.userauth.d.f164882f;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("EXTRA_LAUNCH_LIVE_SUPPORT", this.f165568a);
            r02.putString("EXTRA_LAUNCH_LIVE_SUPPORT_MESSAGE", this.f165569b);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f165570c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f165568a, r52.f165568a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f165569b, r52.f165569b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f165568a.hashCode() * 31) + this.f165569b.hashCode();
        }

        public String toString() {
            return "ActionVerifyEmailFragmentToCrispActivity(EXTRALAUNCHLIVESUPPORT=" + this.f165568a + ", EXTRALAUNCHLIVESUPPORTMESSAGE=" + this.f165569b + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public static /* synthetic */ InterfaceC4081o0 b(b r1, String r2, String r3, int r4, Object r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = "''";
        L6:
            if ((r4 & 2) == 0) goto L9;
            r3 = "''";
        L9:
            return r1.a(r2, r3);
        }

        public final InterfaceC4081o0 a(String r2, String r3) {
            p.l(r2, "EXTRALAUNCHLIVESUPPORT");
            p.l(r3, "EXTRALAUNCHLIVESUPPORTMESSAGE");
            return new a(r2, r3);
        }

        public b() {
        }
    }

    static {
        f165567a = new b(null);
    }
}
