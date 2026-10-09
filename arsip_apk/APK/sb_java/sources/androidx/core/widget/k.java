package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import kotlin.collections.F;
import kotlin.collections.r;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f23440a = null;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f23441a = null;

        static {
            f23441a = new a();
        }

        public a() {
        }

        public static final void a(RemoteViews r1, int r2, String r3, BlendMode r4) {
            p.l(r1, "rv");
            p.l(r3, FirebaseAnalytics.Param.METHOD);
            r1.setBlendMode(r2, r3, r4);
        }

        public static final void b(RemoteViews r1, int r2, String r3, int r4) {
            p.l(r1, "rv");
            p.l(r3, FirebaseAnalytics.Param.METHOD);
            r1.setCharSequence(r2, r3, r4);
        }

        public static final void c(RemoteViews r1, int r2, String r3, int r4) {
            p.l(r1, "rv");
            p.l(r3, FirebaseAnalytics.Param.METHOD);
            r1.setCharSequenceAttr(r2, r3, r4);
        }

        public static final void d(RemoteViews r1, int r2, String r3, int r4) {
            p.l(r1, "rv");
            p.l(r3, FirebaseAnalytics.Param.METHOD);
            r1.setColor(r2, r3, r4);
        }

        public static final void e(RemoteViews r1, int r2, String r3, int r4) {
            p.l(r1, "rv");
            p.l(r3, FirebaseAnalytics.Param.METHOD);
            r1.setColorAttr(r2, r3, r4);
        }

        public static final void f(RemoteViews r1, int r2, String r3, int r4, int r5) {
            p.l(r1, "rv");
            p.l(r3, FirebaseAnalytics.Param.METHOD);
            r1.setColorInt(r2, r3, r4, r5);
        }

        public static final void g(RemoteViews r1, int r2, String r3, int r4) {
            p.l(r1, "rv");
            p.l(r3, FirebaseAnalytics.Param.METHOD);
            r1.setColorStateList(r2, r3, r4);
        }

        public static final void h(RemoteViews r1, int r2, String r3, ColorStateList r4) {
            p.l(r1, "rv");
            p.l(r3, FirebaseAnalytics.Param.METHOD);
            r1.setColorStateList(r2, r3, r4);
        }

        public static final void i(RemoteViews r1, int r2, String r3, ColorStateList r4, ColorStateList r5) {
            p.l(r1, "rv");
            p.l(r3, FirebaseAnalytics.Param.METHOD);
            r1.setColorStateList(r2, r3, r4, r5);
        }

        public static final void j(RemoteViews r1, int r2, String r3, int r4) {
            p.l(r1, "rv");
            p.l(r3, FirebaseAnalytics.Param.METHOD);
            r1.setColorStateListAttr(r2, r3, r4);
        }

        public static final void k(RemoteViews r1, int r2, String r3, float r4, int r5) {
            p.l(r1, "rv");
            p.l(r3, FirebaseAnalytics.Param.METHOD);
            r1.setFloatDimen(r2, r3, r4, r5);
        }

        public static final void l(RemoteViews r1, int r2, String r3, int r4) {
            p.l(r1, "rv");
            p.l(r3, FirebaseAnalytics.Param.METHOD);
            r1.setFloatDimen(r2, r3, r4);
        }

        public static final void m(RemoteViews r1, int r2, String r3, int r4) {
            p.l(r1, "rv");
            p.l(r3, FirebaseAnalytics.Param.METHOD);
            r1.setFloatDimenAttr(r2, r3, r4);
        }

        public static final void n(RemoteViews r1, int r2, String r3, Icon r4, Icon r5) {
            p.l(r1, "rv");
            p.l(r3, FirebaseAnalytics.Param.METHOD);
            r1.setIcon(r2, r3, r4, r5);
        }

        public static final void o(RemoteViews r1, int r2, String r3, float r4, int r5) {
            p.l(r1, "rv");
            p.l(r3, FirebaseAnalytics.Param.METHOD);
            r1.setIntDimen(r2, r3, r4, r5);
        }

        public static final void p(RemoteViews r1, int r2, String r3, int r4) {
            p.l(r1, "rv");
            p.l(r3, FirebaseAnalytics.Param.METHOD);
            r1.setIntDimen(r2, r3, r4);
        }

        public static final void q(RemoteViews r1, int r2, String r3, int r4) {
            p.l(r1, "rv");
            p.l(r3, FirebaseAnalytics.Param.METHOD);
            r1.setIntDimenAttr(r2, r3, r4);
        }
    }

    public static final class b {

        /* renamed from: e, reason: collision with root package name */
        public static final a f23442e = null;

        /* renamed from: a, reason: collision with root package name */
        public final long[] f23443a;

        /* renamed from: b, reason: collision with root package name */
        public final RemoteViews[] f23444b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f23445c;
        public final int d;

        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.i r1) {
                this();
            }

            public a() {
            }
        }

        static {
            f23442e = new a(null);
        }

        public b(long[] r3, RemoteViews[] r4, boolean r5, int r6) {
            p.l(r3, "ids");
            p.l(r4, "views");
            this.f23443a = r3;
            this.f23444b = r4;
            this.f23445c = r5;
            this.d = r6;
            if (r3.length != r4.length) goto L17;
            if (r6 < 1) goto L15;
            ArrayList r32 = new ArrayList(r4.length);
            int r52 = r4.length;
            int r02 = 0;
        L7:
            if (r02 >= r52) goto L9;
            r32.add(Integer.valueOf(r4[r02].getLayoutId()));
            r02 = r02 + 1;
            goto L7
        L9:
            int r33 = F.j0(r32).size();
            if (r33 > r6) goto L13;
            return;
        L13:
            throw new IllegalArgumentException(("View type count is set to " + r6 + ", but the collection contains " + r33 + " different layout ids").toString());
        L15:
            throw new IllegalArgumentException("View type count must be >= 1");
        L17:
            throw new IllegalArgumentException("RemoteCollectionItems has different number of ids and views");
        }

        public final int a() {
            return this.f23443a.length;
        }

        public final long b(int r4) {
            return this.f23443a[r4];
        }

        public final RemoteViews c(int r2) {
            return this.f23444b[r2];
        }

        public final int d() {
            return this.d;
        }

        public final boolean e() {
            return this.f23445c;
        }

        public b(Parcel r4) {
            p.l(r4, "parcel");
            int r02 = r4.readInt();
            long[] r1 = new long[r02];
            this.f23443a = r1;
            r4.readLongArray(r1);
            Parcelable.Creator r12 = RemoteViews.CREATOR;
            p.k(r12, "CREATOR");
            RemoteViews[] r03 = new RemoteViews[r02];
            r4.readTypedArray(r03, r12);
            this.f23444b = (RemoteViews[]) r.o1(r03);
            boolean r13 = true;
            if (r4.readInt() == 1) goto L6;
            r13 = false;
        L6:
            this.f23445c = r13;
            this.d = r4.readInt();
        }
    }

    static {
        f23440a = new k();
    }

    public k() {
    }

    public static final void b(RemoteViews r1, int r2, boolean r3) {
        p.l(r1, "<this>");
        r1.setBoolean(r2, "setAdjustViewBounds", r3);
    }

    public static final void c(RemoteViews r1, int r2, int r3) {
        p.l(r1, "<this>");
        r1.setInt(r2, "setColorFilter", r3);
    }

    public static final void d(RemoteViews r1, int r2, int r3) {
        p.l(r1, "<this>");
        a.d(r1, r2, "setColorFilter", r3);
    }

    public static final void e(RemoteViews r1, int r2, int r3) {
        p.l(r1, "<this>");
        r1.setInt(r2, "setImageAlpha", r3);
    }

    public static final void f(RemoteViews r1, int r2, int r3) {
        p.l(r1, "<this>");
        r1.setInt(r2, "setGravity", r3);
    }

    public static final void g(RemoteViews r3, int r4, int r5) {
        p.l(r3, "<this>");
        f23440a.a(31, "setGravity");
        r3.setInt(r4, "setGravity", r5);
    }

    public static final void h(RemoteViews r1, int r2, int r3) {
        p.l(r1, "<this>");
        r1.setInt(r2, "setHeight", r3);
    }

    public static final void i(RemoteViews r1, int r2, int r3) {
        p.l(r1, "<this>");
        r1.setInt(r2, "setMaxLines", r3);
    }

    public static final void j(RemoteViews r1, int r2, int r3) {
        p.l(r1, "<this>");
        a.g(r1, r2, "setTextColor", r3);
    }

    public static final void k(RemoteViews r1, int r2, int r3) {
        p.l(r1, "<this>");
        r1.setInt(r2, "setWidth", r3);
    }

    public static final void l(RemoteViews r1, int r2, int r3) {
        p.l(r1, "<this>");
        r1.setInt(r2, "setBackgroundColor", r3);
    }

    public static final void m(RemoteViews r2, int r3, int r4) {
        p.l(r2, "<this>");
        if (Build.VERSION.SDK_INT < 31) goto L6;
        a.d(r2, r3, "setBackgroundColor", r4);
        return;
    L6:
        r2.setInt(r3, "setBackgroundResource", r4);
    }

    public static final void n(RemoteViews r1, int r2, int r3) {
        p.l(r1, "<this>");
        r1.setInt(r2, "setBackgroundResource", r3);
    }

    public static final void o(RemoteViews r3, int r4, boolean r5) {
        p.l(r3, "<this>");
        f23440a.a(31, "setClipToOutline");
        r3.setBoolean(r4, "setClipToOutline", r5);
    }

    public static final void p(RemoteViews r3, int r4, int r5) {
        p.l(r3, "<this>");
        f23440a.a(16, "setInflatedId");
        r3.setInt(r4, "setInflatedId", r5);
    }

    public static final void q(RemoteViews r3, int r4, int r5) {
        p.l(r3, "<this>");
        f23440a.a(16, "setLayoutResource");
        r3.setInt(r4, "setLayoutResource", r5);
    }

    public final void a(int r2, String r3) {
        if (Build.VERSION.SDK_INT < r2) goto L6;
        return;
    L6:
        throw new IllegalArgumentException((r3 + " is only available on SDK " + r2 + " and higher").toString());
    }
}
