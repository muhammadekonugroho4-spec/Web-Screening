package com.stockbit.chat.ui.removegroupmember;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final a f56956a = null;

        static {
            f56956a = new a();
        }

        public a() {
            super(null);
        }
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public final String f56957a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f56958b;

        static {
        }

        public b(String r2, boolean r3) {
            p.l(r2, Constants.KEY_TEXT);
            super(null);
            this.f56957a = r2;
            this.f56958b = r3;
        }

        public final String a() {
            return this.f56957a;
        }

        public final boolean b() {
            return this.f56958b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f56957a, r52.f56957a) == true) goto L12;
            return false;
        L12:
            if (this.f56958b == r52.f56958b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f56957a.hashCode() * 31) + Boolean.hashCode(this.f56958b);
        }

        public String toString() {
            return "OnShowSnackbar(text=" + this.f56957a + ", isError=" + this.f56958b + ')';
        }
    }

    static {
    }

    public /* synthetic */ d(i r1) {
        this();
    }

    public d() {
    }
}
