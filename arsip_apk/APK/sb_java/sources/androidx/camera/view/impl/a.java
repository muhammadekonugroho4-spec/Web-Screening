package androidx.camera.view.impl;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: k, reason: collision with root package name */
    public static final C0057a f6275k = null;

    /* renamed from: a, reason: collision with root package name */
    public final Context f6276a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6277b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6278c;
    public final b d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6279e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6280f;

    /* renamed from: g, reason: collision with root package name */
    public float f6281g;

    /* renamed from: h, reason: collision with root package name */
    public float f6282h;

    /* renamed from: i, reason: collision with root package name */
    public int f6283i;

    /* renamed from: j, reason: collision with root package name */
    public GestureDetector f6284j;

    /* renamed from: androidx.camera.view.impl.a$a, reason: collision with other inner class name */
    public static final class C0057a {
        public /* synthetic */ C0057a(i r1) {
            this();
        }

        public C0057a() {
        }
    }

    public interface b {
    }

    public static final class c extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f6285a;

        public c(a r1) {
            this.f6285a = r1;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent r3) {
            p.l(r3, "e");
            a.b(this.f6285a, r3.getX());
            a.c(this.f6285a, r3.getY());
            a.a(this.f6285a, 1);
            return true;
        }
    }

    static {
        f6275k = new C0057a(null);
    }

    public a(Context r9, b r10) {
        p.l(r9, "context");
        p.l(r10, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        int r3 = 0;
        int r4 = 0;
        this(r9, r3, r4, r10, 6, null);
    }

    public static final /* synthetic */ void a(a r02, int r1) {
        r02.f6283i = r1;
    }

    public static final /* synthetic */ void b(a r02, float r1) {
        r02.f6281g = r1;
    }

    public static final /* synthetic */ void c(a r02, float r1) {
        r02.f6282h = r1;
    }

    public a(Context r2, int r3, int r4, b r5) {
        p.l(r2, "context");
        p.l(r5, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f6276a = r2;
        this.f6277b = r3;
        this.f6278c = r4;
        this.d = r5;
        this.f6279e = true;
        this.f6280f = true;
        this.f6284j = new GestureDetector(r2, new c(this));
    }

    public /* synthetic */ a(Context r1, int r2, int r3, b r4, int r5, i r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = ViewConfiguration.get(r1).getScaledTouchSlop() * 2;
    L6:
        if ((r5 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3, r4);
    }
}
