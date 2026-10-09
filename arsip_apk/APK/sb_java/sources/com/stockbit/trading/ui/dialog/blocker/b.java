package com.stockbit.trading.ui.dialog.blocker;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;
import com.stockbit.trading.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f147368a = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public static /* synthetic */ InterfaceC4081o0 b(a r1, String r2, String r3, int r4, Object r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r4 & 2) == 0) goto L9;
            r3 = null;
        L9:
            return r1.a(r2, r3);
        }

        public final InterfaceC4081o0 a(String r2, String r3) {
            return new C1331b(r2, r3);
        }

        public a() {
        }
    }

    /* renamed from: com.stockbit.trading.ui.dialog.blocker.b$b, reason: collision with other inner class name */
    public static final class C1331b implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f147369a;

        /* renamed from: b, reason: collision with root package name */
        public final String f147370b;

        /* renamed from: c, reason: collision with root package name */
        public final int f147371c;

        public C1331b(String r1, String r2) {
            this.f147369a = r1;
            this.f147370b = r2;
            this.f147371c = h.S1;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("EXTRA_LAUNCH_LIVE_SUPPORT", this.f147369a);
            r02.putString("EXTRA_LAUNCH_LIVE_SUPPORT_MESSAGE", this.f147370b);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f147371c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C1331b) == true) goto L8;
            return false;
        L8:
            C1331b r52 = (C1331b) r5;
            if (p.g(this.f147369a, r52.f147369a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f147370b, r52.f147370b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            String r02 = this.f147369a;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.f147370b;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "OpenSupport(EXTRALAUNCHLIVESUPPORT=" + this.f147369a + ", EXTRALAUNCHLIVESUPPORTMESSAGE=" + this.f147370b + ')';
        }
    }

    static {
        f147368a = new a(null);
    }
}
