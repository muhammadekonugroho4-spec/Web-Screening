package com.stockbit.academy.ui.unboxingbanner;

import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public final List f44442a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f44443b;

        public a(List r2, boolean r3) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f44442a = r2;
            this.f44443b = r3;
        }

        public final List a() {
            return this.f44442a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f44442a, r52.f44442a) == true) goto L12;
            return false;
        L12:
            if (this.f44443b == r52.f44443b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f44442a.hashCode() * 31) + Boolean.hashCode(this.f44443b);
        }

        public String toString() {
            return "UnboxingBannerData(data=" + this.f44442a + ", fromCache=" + this.f44443b + ')';
        }
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final b f44444a = null;

        static {
            f44444a = new b();
        }

        public b() {
            super(null);
        }
    }

    public /* synthetic */ d(i r1) {
        this();
    }

    public d() {
    }
}
