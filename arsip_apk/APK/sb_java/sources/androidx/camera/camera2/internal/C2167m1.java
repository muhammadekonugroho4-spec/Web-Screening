package androidx.camera.camera2.internal;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
import com.google.firebase.messaging.Constants;

/* renamed from: androidx.camera.camera2.internal.m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2167m1 {

    /* renamed from: e, reason: collision with root package name */
    public static final Size f4561e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final Size f4562f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final Size f4563g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final Object f4564h = null;

    /* renamed from: i, reason: collision with root package name */
    public static volatile C2167m1 f4565i;

    /* renamed from: a, reason: collision with root package name */
    public final DisplayManager f4566a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Size f4567b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.workaround.k f4568c;
    public final androidx.camera.camera2.internal.compat.workaround.d d;

    static {
        f4561e = new Size(1920, 1080);
        f4562f = new Size(320, 240);
        f4563g = new Size(640, 480);
        f4564h = new Object();
    }

    public C2167m1(Context r2) {
        this.f4567b = null;
        this.f4568c = new androidx.camera.camera2.internal.compat.workaround.k();
        this.d = new androidx.camera.camera2.internal.compat.workaround.d();
        this.f4566a = (DisplayManager) r2.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
    }

    public static C2167m1 c(Context r2) {
        if (f4565i != null) goto L16;
        Object r02 = f4564h;
        monitor-enter(r02);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (f4565i != null) goto L11;
        f4565i = new C2167m1(r2);     // Catch: Throwable -> L9
    L11:
        monitor-exit(r02);     // Catch: Throwable -> L9
    L16:
        return f4565i;
    }

    public final Size a() {
        Size r02 = b();
        int r1 = r02.getWidth() * r02.getHeight();
        Size r2 = f4561e;
        if (r1 <= (r2.getWidth() * r2.getHeight())) goto L6;
        r02 = r2;
    L6:
        return this.f4568c.a(r02);
    }

    public final Size b() {
        Point r02 = new Point();
        d(false).getRealSize(r02);
        Size r1 = new Size(r02.x, r02.y);
        if (androidx.camera.core.internal.utils.c.c(r1, f4562f) == false) goto L8;
        r1 = this.d.a();
        if (r1 != null) goto L8;
        r1 = f4563g;
    L8:
        if (r1.getHeight() > r1.getWidth()) goto L10;
        return r1;
    L10:
        return new Size(r1.getHeight(), r1.getWidth());
    }

    public Display d(boolean r5) {
        Display[] r02 = this.f4566a.getDisplays();
        if (r02.length == 1) goto L5;
        Display r1 = e(r02, r5);
        if (r1 != null) goto L10;
        if (r5 == false) goto L10;
        r1 = e(r02, false);
    L10:
        if (r1 == null) goto L13;
        return r1;
    L13:
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    L5:
        return r02[0];
    }

    public final Display e(Display[] r9, boolean r10) {
        int r02 = r9.length;
        Display r1 = null;
        int r2 = -1;
        int r3 = 0;
    L3:
        if (r3 >= r02) goto L13;
        Display r4 = r9[r3];
        if (r10 == true) goto L7;
    L9:
        Point r5 = new Point();
        r4.getRealSize(r5);
        int r6 = r5.x;
        int r52 = r5.y;
        if ((r6 * r52) <= r2) goto L12;
        r1 = r4;
        r2 = r6 * r52;
    L12:
        r3 = r3 + 1;
        goto L3
    L7:
        if (r4.getState() != 1) goto L9;
    L13:
        return r1;
    }

    public Size f() {
        if (this.f4567b != null) goto L5;
        this.f4567b = a();
        return this.f4567b;
    L5:
        return this.f4567b;
    }

    public void g() {
        this.f4567b = a();
    }
}
