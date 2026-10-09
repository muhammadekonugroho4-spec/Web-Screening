package ai.advance.common.camera;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class GuardianCameraView extends TextureView implements Camera.PreviewCallback, View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public long f1664a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f1665b;

    /* renamed from: c, reason: collision with root package name */
    public h f1666c;
    public Camera d;

    /* renamed from: e, reason: collision with root package name */
    public Camera.Size f1667e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1668f;

    /* renamed from: g, reason: collision with root package name */
    public int f1669g;

    /* renamed from: h, reason: collision with root package name */
    public int f1670h;

    /* renamed from: i, reason: collision with root package name */
    public int f1671i;

    /* renamed from: j, reason: collision with root package name */
    public int f1672j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1673k;

    /* renamed from: l, reason: collision with root package name */
    public int f1674l;

    /* renamed from: m, reason: collision with root package name */
    public int f1675m;

    /* renamed from: n, reason: collision with root package name */
    public g f1676n;

    /* renamed from: o, reason: collision with root package name */
    public Camera.AutoFocusCallback f1677o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1678p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1679q;

    /* renamed from: r, reason: collision with root package name */
    public ExecutorService f1680r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1681s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1682t;

    /* renamed from: u, reason: collision with root package name */
    public float f1683u;

    /* renamed from: v, reason: collision with root package name */
    public float f1684v;

    /* renamed from: w, reason: collision with root package name */
    public TextureView.SurfaceTextureListener f1685w;

    /* renamed from: x, reason: collision with root package name */
    public Rect f1686x;

    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ GuardianCameraView f1687a;

        public a(GuardianCameraView r1) {
            this.f1687a = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View r1) {
            this.f1687a.k();
        }
    }

    public class b implements Camera.AutoFocusCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ GuardianCameraView f1688a;

        public b(GuardianCameraView r1) {
            this.f1688a = r1;
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean r1, Camera r2) {
            GuardianCameraView.j(this.f1688a).b();
        }
    }

    public class c implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f1689a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ GuardianCameraView f1690b;

        public c(GuardianCameraView r1, float r2) {
            this.f1690b = r1;
            this.f1689a = r2;
        }

        public int a(Camera.Size r2, Camera.Size r3) {
            float r22 = this.f1690b.u(r2);
            float r32 = this.f1690b.u(r3);
            return Float.compare(Math.abs(this.f1689a - r22), Math.abs(this.f1689a - r32));
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Object r1, Object r2) {
            return a((Camera.Size) r1, (Camera.Size) r2);
        }
    }

    public class d implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ GuardianCameraView f1691a;

        public d(GuardianCameraView r1) {
            this.f1691a = r1;
        }

        public int a(Camera.Size r4) {
            return Math.abs((this.f1691a.getViewWidth() - this.f1691a.t(r4)) + (this.f1691a.getViewHeight() - this.f1691a.s(r4)));
        }

        public int b(Camera.Size r1, Camera.Size r2) {
            return Float.compare(a(r1), a(r2));
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Object r1, Object r2) {
            return b((Camera.Size) r1, (Camera.Size) r2);
        }
    }

    public class e implements TextureView.SurfaceTextureListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ GuardianCameraView f1692a;

        public e(GuardianCameraView r1) {
            this.f1692a = r1;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture r1, int r2, int r3) {
            GuardianCameraView r12 = this.f1692a;
            Camera.Size r22 = r12.f1667e;
            if (r22 == null) goto L5;
            r12.A(r22);
        L5:
            GuardianCameraView r13 = this.f1692a;
            r13.f1681s = true;
            r13.E();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture r2) {
            GuardianCameraView r22 = this.f1692a;
            r22.f1681s = false;
            r22.G();
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture r1, int r2, int r3) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture r2) {
            h r02 = this.f1692a.f1666c;
            if (r02 == null) goto L6;
            r02.onSurfaceTextureUpdated(r2);
            return;
        }
    }

    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f1693a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ GuardianCameraView f1694b;

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bitmap f1695a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f1696b;

            public a(f r1, Bitmap r2) {
                this.f1696b = r1;
                this.f1695a = r2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Activity r02 = this.f1696b.f1694b.f1665b;
            }
        }

        public class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bitmap f1697a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f1698b;

            public b(f r1, Bitmap r2) {
                this.f1698b = r1;
                this.f1697a = r2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Activity r02 = this.f1698b.f1694b.f1665b;
            }
        }

        public f(GuardianCameraView r1, byte[] r2) {
            this.f1694b = r1;
            this.f1693a = r2;
        }

        @Override // java.lang.Runnable
        public void run() {
            byte[] r02 = this.f1693a;
            GuardianCameraView r1 = this.f1694b;
            Camera.Size r2 = r1.f1667e;
            Bitmap r6 = ai.advance.common.utils.a.e(r02, r2.width, r2.height, r1.f1672j, r1.w(), this.f1694b.v());
            GuardianCameraView r03 = this.f1694b;
            if (r03.f1686x != null) goto L6;
            r03.f1665b.runOnUiThread(new a(this, r6));
            return;
        L6:
            float r12 = (r1.top / r03.getViewHeight()) * this.f1694b.getCameraTransformHeightRatio();
            GuardianCameraView r04 = this.f1694b;
            float r22 = (r04.f1686x.left / r04.getViewWidth()) * this.f1694b.getCameraTransformWidthRatio();
            GuardianCameraView r05 = this.f1694b;
            float r3 = (r05.f1686x.right / r05.getViewWidth()) * this.f1694b.getCameraTransformWidthRatio();
            GuardianCameraView r06 = this.f1694b;
            float r4 = (r06.f1686x.bottom / r06.getViewHeight()) * this.f1694b.getCameraTransformHeightRatio();
            int r07 = (int) (r6.getWidth() * r22);
            int r8 = (int) (r6.getHeight() * r12);
            int r23 = (int) ((r3 - r22) * r6.getWidth());
            int r13 = (int) ((r4 - r12) * r6.getHeight());
            int r42 = r6.getWidth();     // Catch: Exception -> L18
            int r5 = r6.getHeight();     // Catch: Exception -> L18
            if (this.f1694b.v() == false) goto L10;
            r07 = (int) ((1.0f - r3) * r6.getWidth());     // Catch: Exception -> L18
        L10:
            int r7 = r07;
            if ((r7 + r23) <= r42) goto L13;
            r23 = r42 - r7;     // Catch: Exception -> L18
        L13:
            int r9 = r23;
            if ((r8 + r13) <= r5) goto L16;
            r13 = r5 - r8;     // Catch: Exception -> L18
        L16:
            Bitmap r08 = Bitmap.createBitmap(r6, r7, r8, r9, r13, null, false);     // Catch: Exception -> L18
            r6.recycle();     // Catch: Exception -> L18
            this.f1694b.f1665b.runOnUiThread(new b(this, r08));     // Catch: Exception -> L18
            return;
        }
    }

    public class g extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ GuardianCameraView f1699a;

        public g(GuardianCameraView r1, Looper r2) {
            this.f1699a = r1;
            super(r2);
        }

        public synchronized void a() {
            monitor-enter(this);
            sendEmptyMessage(9246);     // Catch: Throwable -> L7
            monitor-exit(this);
            return;
        L7:
            th = move-exception;
            throw th;
        }

        public synchronized void b() {
            monitor-enter(this);
            GuardianCameraView r02 = this.f1699a;     // Catch: Throwable -> L7
            if (r02.f1678p == false) goto L9;
            sendEmptyMessageDelayed(9245, r02.f1664a);     // Catch: Throwable -> L7
        L9:
            monitor-exit(this);
            return;
        L7:
            th = move-exception;
            throw th;
        }

        public synchronized void c() {
            monitor-enter(this);
            removeMessages(9245);     // Catch: Throwable -> L7
            removeMessages(9246);     // Catch: Throwable -> L7
            monitor-exit(this);
            return;
        L7:
            th = move-exception;
            throw th;
        }

        public void d() {
            GuardianCameraView r02 = this.f1699a;     // Catch: Exception -> L4
            r02.d.autoFocus(r02.getAutoFocusCallback());     // Catch: Exception -> L4
            return;
        }

        @Override // android.os.Handler
        public void handleMessage(Message r2) {
            super.handleMessage(r2);
            int r22 = r2.what;
            if (r22 == 9245) goto L8;
            if (r22 != 9246) goto L15;
        L11:
            d();
            return;
        L15:
            return;
        L8:
            if (this.f1699a.m() == true) goto L10;
            return;
        L10:
            if (this.f1699a.f1678p == true) goto L11;
        }
    }

    public interface h {
        void a(byte[] r1, Camera.Size r2);

        void e();

        void onSurfaceTextureUpdated(SurfaceTexture r1);
    }

    public GuardianCameraView(Context r2) {
        this(r2, null);
    }

    private synchronized g getMainHandler() {
        monitor-enter(this);
    L6:
        th = move-exception;
        throw th;
    L4:
        if (this.f1676n != null) goto L8;
        this.f1676n = new g(this, Looper.getMainLooper());     // Catch: Throwable -> L6
    L8:
        g r02 = this.f1676n;     // Catch: Throwable -> L6
        monitor-exit(this);
        return r02;
    }

    public static /* synthetic */ g j(GuardianCameraView r02) {
        return r02.getMainHandler();
    }

    public void A(Camera.Size r1) {
    }

    public void B(int r2) {
        o();
        z(r2, this.f1666c);
        E();
    }

    public synchronized void C() {
        monitor-enter(this);
    L7:
        th = move-exception;
        throw th;
    L4:
        if (m() == false) goto L9;
        getMainHandler().b();     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
    }

    public void D(GuardianCameraView r2) {
        Camera r02 = this.d;
        if (r02 == null) goto L9;
        r02.setPreviewTexture(r2.getSurfaceTexture());     // Catch: Exception -> L6
        this.d.startPreview();     // Catch: Exception -> L6
        return;
    L10:
        return;
    }

    public void E() {
        if (m() == true) goto L5;
        return;
    L5:
        if (this.f1681s == false) goto L9;
        D(this);
        this.d.setPreviewCallback(this);
        return;
    }

    public void F() {
        getMainHandler().c();
    }

    public void G() {
        if (m() == false) goto L9;
        this.d.stopPreview();     // Catch: Exception -> L6
        this.d.setPreviewCallback(null);     // Catch: Exception -> L6
        return;
    L9:
        return;
    }

    public void H() {
        if (this.f1667e == null) goto L10;
        float r02 = getViewWidth();
        float r1 = getViewHeight();
        float r2 = u(this.f1667e);
        RectF r3 = new RectF(0.0f, 0.0f, r1, r02);
        if (w() == false) goto L7;
        RectF r03 = new RectF(0.0f, 0.0f, r1, r2 * r1);
        this.f1683u = r03.width() / r3.width();
        this.f1684v = r03.height() / r3.height();
    L8:
        this.f1683u = r03.width() / r3.width();
        this.f1684v = r03.height() / r3.height();
        Matrix r12 = new Matrix();
        r12.setRectToRect(r03, r3, Matrix.ScaleToFit.FILL);
        setTransform(r12);
        return;
    L7:
        RectF r13 = new RectF(0.0f, 0.0f, r02 / r2, r02);
        this.f1683u = r13.height() / r3.height();
        this.f1684v = r13.width() / r3.width();
        r03 = r13;
        goto L8
    }

    public synchronized Camera.AutoFocusCallback getAutoFocusCallback() {
        monitor-enter(this);
    L6:
        th = move-exception;
        throw th;
    L4:
        if (this.f1677o != null) goto L8;
        this.f1677o = new b(this);     // Catch: Throwable -> L6
    L8:
        Camera.AutoFocusCallback r02 = this.f1677o;     // Catch: Throwable -> L6
        monitor-exit(this);
        return r02;
    }

    public Camera getCamera() {
        return this.d;
    }

    public float getCameraTransformHeightRatio() {
        return this.f1684v;
    }

    public float getCameraTransformWidthRatio() {
        return this.f1683u;
    }

    public ExecutorService getExecutor() {
        if (this.f1680r != null) goto L6;
        this.f1680r = Executors.newCachedThreadPool();
    L6:
        return this.f1680r;
    }

    public Camera.Size getPreviewSize() {
        return this.f1667e;
    }

    public float getScale() {
        return 1.0f;
    }

    public int getViewHeight() {
        return this.f1675m;
    }

    public int getViewWidth() {
        return this.f1674l;
    }

    public void k() {
        getMainHandler().a();
    }

    public Camera.Size l(Camera.Parameters r10) {
        List<Camera.Size> r102 = r10.getSupportedPreviewSizes();     // Catch: Exception -> L23
        Collections.sort(r102, new c(this, getViewWidth() / getViewHeight()));     // Catch: Exception -> L23
        ArrayList r02 = new ArrayList();     // Catch: Exception -> L23
        if (r102.size() <= 0) goto L5;
        float r1 = u(r102.get(0));     // Catch: Exception -> L23
    L6:
        Iterator<Camera.Size> r3 = r102.iterator();     // Catch: Exception -> L23
    L8:
        if (r3.hasNext() == false) goto L12;
        Camera.Size r4 = r3.next();     // Catch: Exception -> L23
        if (Math.abs(u(r4) - r1) >= 0.1d) goto L8;
        r02.add(r4);     // Catch: Exception -> L23
        goto L8
    L12:
        Collections.sort(r02, new d(this));     // Catch: Exception -> L23
        if (r02.size() <= 0) goto L18;
        Object r103 = r02.get(0);     // Catch: Exception -> L23
    L15:
        return (Camera.Size) r103;
    L18:
        if (r102.size() <= 0) goto L21;
        r103 = r102.get(0);     // Catch: Exception -> L23
        goto L15
    L21:
        return null;
    L5:
        r1 = 0.0f;
    L31:
        return null;
    }

    public boolean m() {
        if (this.d == null) goto L6;
        return true;
    L6:
        return false;
    }

    public void n(byte[] r2) {
        if (this.f1679q == false) goto L6;
        this.f1679q = false;
        f r02 = new f(this, r2);
        getExecutor().execute(r02);
        return;
    }

    public void o() {
        F();     // Catch: Exception -> L6
        Camera r02 = this.d;     // Catch: Exception -> L6
        if (r02 == null) goto L9;
        r02.stopPreview();     // Catch: Exception -> L6
        this.d.setPreviewCallback(null);     // Catch: Exception -> L6
        this.d.release();     // Catch: Exception -> L6
        this.d = null;     // Catch: Exception -> L6
        return;
    L9:
        return;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
        int r12 = getMeasuredWidth();
        int r22 = getMeasuredHeight();
        if (this.f1674l == r12) goto L5;
    L8:
        this.f1674l = getMeasuredWidth();
        this.f1675m = getMeasuredHeight();
        if (this.f1673k == false) goto L13;
        B(this.f1669g);
        return;
    L13:
        if (m() == false) goto L16;
        H();
        return;
    L16:
        return;
    L5:
        if (this.f1675m != r22) goto L8;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] r2, Camera r3) {
        if (r2 != null) goto L4;
        return;
    L4:
        h r32 = this.f1666c;
        if (r32 != null) goto L7;
    L11:
        n(r2);
        return;
    L7:
        if (this.d == null) goto L11;
        Camera.Size r02 = this.f1667e;
        if (r02 == null) goto L11;
        r32.a(r2, r02);
        goto L11
    }

    public void p() {
    }

    public void q() {
        this.f1670h = ai.advance.common.utils.b.a();
        this.f1671i = ai.advance.common.utils.b.d();
        if (this.f1670h != (-1)) goto L6;
        ai.advance.common.utils.g.g("No back facing camera detected on the device.");
    L6:
        if (this.f1671i != (-1)) goto L9;
        ai.advance.common.utils.g.g("No front facing camera detected on the device.");
        return;
    }

    public int r(int r2) {
        return ai.advance.common.utils.b.b(r2, this.f1665b);
    }

    public int s(Camera.Size r2) {
        if (w() == false) goto L7;
        return r2.width;
    L7:
        return r2.height;
    }

    public void setAutoFocusDisable() {
        this.f1678p = false;
        F();
    }

    public void setAutoFocusEnable() {
        this.f1678p = true;
    }

    public void setSoundPlayEnable(boolean r1) {
        this.f1682t = r1;
    }

    public int t(Camera.Size r2) {
        if (w() == false) goto L7;
        return r2.height;
    L7:
        return r2.width;
    }

    public float u(Camera.Size r2) {
        return t(r2) / s(r2);
    }

    public boolean v() {
        int r02 = this.f1671i;
        if (r02 != (-1)) goto L6;
        return false;
    L6:
        if (this.f1669g != r02) goto L9;
        return true;
    L9:
        return false;
    }

    public boolean w() {
        if (getResources().getConfiguration().orientation != 1) goto L5;
        return true;
    L5:
        return false;
    }

    public void x(int r4) {
        if (this.f1668f == false) goto L16;
        return;
    L16:
        this.f1668f = true;     // Catch: Exception -> L7
        Camera r02 = Camera.open(r4);     // Catch: Exception -> L7
        this.d = r02;     // Catch: Exception -> L7
        Camera.Parameters r03 = r02.getParameters();     // Catch: Exception -> L7
        Camera.Size r1 = l(this.d.getParameters());     // Catch: Exception -> L7
        this.f1667e = r1;     // Catch: Exception -> L7
        r03.setPreviewSize(r1.width, r1.height);     // Catch: Exception -> L7
        int r42 = r(r4);     // Catch: Exception -> L7
        this.f1672j = r42;     // Catch: Exception -> L7
        this.d.setDisplayOrientation(r42);     // Catch: Exception -> L7
        this.d.setParameters(r03);     // Catch: Exception -> L7
        H();     // Catch: Exception -> L7
        C();     // Catch: Exception -> L7
        ai.advance.common.utils.g.h("摄像头已打开：" + this.f1667e.width + "*" + this.f1667e.height);     // Catch: Exception -> L7
    L10:
        if (this.d != null) goto L14;
        h r43 = this.f1666c;
        if (r43 == null) goto L14;
        r43.e();
    L14:
        this.f1668f = false;
        return;
    L7:
        e = move-exception;
        ai.advance.common.utils.g.g("open camera exception:" + e.getMessage());
        goto L10
    }

    public void y(h r3) {
        int r02 = this.f1670h;
        if (r02 != (-1)) goto L7;
        if (r3 == null) goto L7;
        r3.e();
        return;
    L7:
        z(r02, r3);
    }

    public void z(int r2, h r3) {
        this.f1666c = r3;
        this.f1669g = r2;
        if (this.f1665b != null) goto L8;
        if (r3 == null) goto L13;
        r3.e();
        return;
    L13:
        return;
    L8:
        if (this.f1674l != 0) goto L11;
        this.f1673k = true;
        return;
    L11:
        this.f1673k = false;
        x(r2);
    }

    public GuardianCameraView(Context r3, AttributeSet r4) {
        super(r3, r4);
        this.f1664a = 1300;
        this.f1681s = false;
        this.f1682t = true;
        this.f1685w = new e(this);
        if ((r3 instanceof Activity) == false) goto L5;
        this.f1665b = (Activity) r3;
    L5:
        q();
        setSurfaceTextureListener(this.f1685w);
        addOnLayoutChangeListener(this);
        setOnClickListener(new a(this));
    }

    public void setAutoFocusEnable(long r2) {
        this.f1678p = true;
        this.f1664a = r2;
        if (m() == false) goto L6;
        C();
        return;
    }
}
