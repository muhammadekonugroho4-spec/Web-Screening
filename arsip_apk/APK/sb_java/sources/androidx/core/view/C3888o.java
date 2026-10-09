package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: androidx.core.view.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3888o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23311a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3890p f23312b;

    /* renamed from: c, reason: collision with root package name */
    public final b f23313c;
    public final a d;

    /* renamed from: e, reason: collision with root package name */
    public VelocityTracker f23314e;

    /* renamed from: f, reason: collision with root package name */
    public float f23315f;

    /* renamed from: g, reason: collision with root package name */
    public int f23316g;

    /* renamed from: h, reason: collision with root package name */
    public int f23317h;

    /* renamed from: i, reason: collision with root package name */
    public int f23318i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f23319j;

    /* renamed from: androidx.core.view.o$a */
    public interface a {
        float a(VelocityTracker r1, MotionEvent r2, int r3);
    }

    /* renamed from: androidx.core.view.o$b */
    public interface b {
        void a(Context r1, int[] r2, MotionEvent r3, int r4);
    }

    public C3888o(Context r3, InterfaceC3890p r4) {
        this(r3, r4, new C3884m(), new C3886n());
    }

    public static /* synthetic */ void a(Context r02, int[] r1, MotionEvent r2, int r3) {
        c(r02, r1, r2, r3);
    }

    public static /* synthetic */ float b(VelocityTracker r02, MotionEvent r1, int r2) {
        return f(r02, r1, r2);
    }

    public static void c(Context r3, int[] r4, MotionEvent r5, int r6) {
        ViewConfiguration r02 = ViewConfiguration.get(r3);
        r4[0] = AbstractC3875h0.g(r3, r02, r5.getDeviceId(), r6, r5.getSource());
        r4[1] = AbstractC3875h0.f(r3, r02, r5.getDeviceId(), r6, r5.getSource());
    }

    public static float f(VelocityTracker r02, MotionEvent r1, int r2) {
        AbstractC3863b0.a(r02, r1);
        AbstractC3863b0.b(r02, 1000);
        return AbstractC3863b0.d(r02, r2);
    }

    public final boolean d(MotionEvent r6, int r7) {
        int r02 = r6.getSource();
        int r1 = r6.getDeviceId();
        if (this.f23317h == r02) goto L5;
    L11:
        this.f23313c.a(this.f23311a, this.f23319j, r6, r7);
        this.f23317h = r02;
        this.f23318i = r1;
        this.f23316g = r7;
        return true;
    L5:
        if (this.f23318i != r1) goto L11;
        if (this.f23316g != r7) goto L11;
        return false;
    }

    public final float e(MotionEvent r3, int r4) {
        if (this.f23314e != null) goto L6;
        this.f23314e = VelocityTracker.obtain();
    L6:
        return this.d.a(this.f23314e, r3, r4);
    }

    public void g(MotionEvent r5, int r6) {
        boolean r02 = d(r5, r6);
        if (this.f23319j[0] != Integer.MAX_VALUE) goto L8;
        VelocityTracker r52 = this.f23314e;
        if (r52 == null) goto L17;
        r52.recycle();
        this.f23314e = null;
        return;
    L17:
        return;
    L8:
        float r53 = e(r5, r6) * this.f23312b.a();
        float r62 = Math.signum(r53);
        float r1 = 0.0f;
        if (r02 == false) goto L11;
    L14:
        this.f23312b.c();
    L15:
        float r63 = Math.abs(r53);
        int[] r03 = this.f23319j;
        if (r63 < r03[0]) goto L23;
        float r54 = Math.max(-r6, Math.min(r53, r03[1]));
        if (this.f23312b.b(r54) == false) goto L21;
        r1 = r54;
    L21:
        this.f23315f = r1;
        return;
    L23:
        return;
    L11:
        if (r62 == Math.signum(this.f23315f)) goto L15;
        if (r62 == 0.0f) goto L15;
        goto L14
    }

    public C3888o(Context r3, InterfaceC3890p r4, b r5, a r6) {
        this.f23316g = -1;
        this.f23317h = -1;
        this.f23318i = -1;
        this.f23319j = new int[]{Integer.MAX_VALUE, 0};
        this.f23311a = r3;
        this.f23312b = r4;
        this.f23313c = r5;
        this.d = r6;
    }
}
