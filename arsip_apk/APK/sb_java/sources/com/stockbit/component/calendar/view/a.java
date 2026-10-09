package com.stockbit.component.calendar.view;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.stockbit.common.extension.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public static final C0700a f69642b = null;

    /* renamed from: a, reason: collision with root package name */
    public final GestureDetector f69643a;

    /* renamed from: com.stockbit.component.calendar.view.a$a, reason: collision with other inner class name */
    public static final class C0700a {
        public /* synthetic */ C0700a(i r1) {
            this();
        }

        public C0700a() {
        }
    }

    public final class b extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f69644a;

        public b(a r1) {
            this.f69644a = r1;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent r2) {
            p.l(r2, "e");
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent r6, MotionEvent r7, float r8, float r9) {
            p.l(r7, "e2");
            float r1 = r7.getY();     // Catch: Exception -> L6
            Float r2 = null;
            if (r6 == null) goto L8;
            Float r3 = Float.valueOf(r6.getY());     // Catch: Exception -> L6
        L9:
            float r12 = r1 - h.I(r3);     // Catch: Exception -> L6
            float r72 = r7.getX();     // Catch: Exception -> L6
            if (r6 == null) goto L12;
            r2 = Float.valueOf(r6.getX());     // Catch: Exception -> L6
        L12:
            float r73 = r72 - h.I(r2);     // Catch: Exception -> L6
            if (Math.abs(r73) <= Math.abs(r12)) goto L24;
            if (Math.abs(r73) > 100.0f) goto L17;
        L33:
            return false;
        L17:
            if (Math.abs(r8) <= 100.0f) goto L33;
            if (r73 <= 0.0f) goto L21;
            this.f69644a.c();     // Catch: Exception -> L6
        L22:
            return true;
        L21:
            this.f69644a.b();     // Catch: Exception -> L6
            goto L22
        L24:
            if (Math.abs(r12) <= 100.0f) goto L33;
            if (Math.abs(r9) <= 100.0f) goto L33;
            if (r12 <= 0.0f) goto L30;
            this.f69644a.a();     // Catch: Exception -> L6
        L31:
            return true;
        L30:
            this.f69644a.d();     // Catch: Exception -> L6
            goto L31
        L8:
            r3 = null;
        L6:
            e = move-exception;
            timber.log.a.f184289a.b("onFling exception : " + e, new Object[0]);
            goto L33
        }
    }

    static {
        f69642b = new C0700a(null);
    }

    public a(Context r3) {
        p.l(r3, "ctx");
        this.f69643a = new GestureDetector(r3, new b(this));
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public abstract void d();

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View r2, MotionEvent r3) {
        p.l(r2, "v");
        p.l(r3, NotificationCompat.CATEGORY_EVENT);
        return this.f69643a.onTouchEvent(r3);
    }
}
