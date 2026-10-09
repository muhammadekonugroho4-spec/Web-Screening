package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class FrameMetricsAggregator {

    /* renamed from: a, reason: collision with root package name */
    public final b f22591a;

    public static class a extends b {

        /* renamed from: e, reason: collision with root package name */
        public static HandlerThread f22592e;

        /* renamed from: f, reason: collision with root package name */
        public static Handler f22593f;

        /* renamed from: a, reason: collision with root package name */
        public int f22594a;

        /* renamed from: b, reason: collision with root package name */
        public SparseIntArray[] f22595b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f22596c;
        public Window.OnFrameMetricsAvailableListener d;

        /* renamed from: androidx.core.app.FrameMetricsAggregator$a$a, reason: collision with other inner class name */
        public class WindowOnFrameMetricsAvailableListenerC0155a implements Window.OnFrameMetricsAvailableListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f22597a;

            public WindowOnFrameMetricsAvailableListenerC0155a(a r1) {
                this.f22597a = r1;
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window r9, FrameMetrics r10, int r11) {
                a r92 = this.f22597a;
                if ((r92.f22594a & 1) == 0) goto L5;
                r92.f(r92.f22595b[0], r10.getMetric(8));
            L5:
                a r93 = this.f22597a;
                if ((r93.f22594a & 2) == 0) goto L8;
                r93.f(r93.f22595b[1], r10.getMetric(1));
            L8:
                a r94 = this.f22597a;
                if ((r94.f22594a & 4) == 0) goto L11;
                r94.f(r94.f22595b[2], r10.getMetric(3));
            L11:
                a r95 = this.f22597a;
                if ((r95.f22594a & 8) == 0) goto L14;
                r95.f(r95.f22595b[3], r10.getMetric(4));
            L14:
                a r96 = this.f22597a;
                if ((r96.f22594a & 16) == 0) goto L17;
                r96.f(r96.f22595b[4], r10.getMetric(5));
            L17:
                a r97 = this.f22597a;
                if ((r97.f22594a & 64) == 0) goto L20;
                r97.f(r97.f22595b[6], r10.getMetric(7));
            L20:
                a r98 = this.f22597a;
                if ((r98.f22594a & 32) == 0) goto L23;
                r98.f(r98.f22595b[5], r10.getMetric(6));
            L23:
                a r99 = this.f22597a;
                if ((r99.f22594a & 128) == 0) goto L26;
                r99.f(r99.f22595b[7], r10.getMetric(0));
            L26:
                a r910 = this.f22597a;
                if ((r910.f22594a & 256) == 0) goto L30;
                r910.f(r910.f22595b[8], r10.getMetric(2));
                return;
            }
        }

        static {
        }

        public a(int r2) {
            this.f22595b = new SparseIntArray[9];
            this.f22596c = new ArrayList();
            this.d = new WindowOnFrameMetricsAvailableListenerC0155a(this);
            this.f22594a = r2;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public void a(Activity r5) {
            if (f22592e != null) goto L5;
            HandlerThread r02 = new HandlerThread("FrameMetricsAggregator");
            f22592e = r02;
            r02.start();
            f22593f = new Handler(f22592e.getLooper());
        L5:
            int r03 = 0;
        L7:
            if (r03 > 8) goto L14;
            SparseIntArray[] r1 = this.f22595b;
            if (r1[r03] != null) goto L13;
            if ((this.f22594a & (1 << r03)) == 0) goto L13;
            r1[r03] = new SparseIntArray();
        L13:
            r03 = r03 + 1;
            goto L7
        L14:
            r5.getWindow().addOnFrameMetricsAvailableListener(this.d, f22593f);
            this.f22596c.add(new WeakReference(r5));
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] b() {
            return this.f22595b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] c(Activity r4) {
            Iterator r02 = this.f22596c.iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            WeakReference r1 = (WeakReference) r02.next();
            if (r1.get() != r4) goto L4;
            this.f22596c.remove(r1);
        L8:
            r4.getWindow().removeOnFrameMetricsAvailableListener(this.d);
            return this.f22595b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] d() {
            SparseIntArray[] r02 = this.f22595b;
            this.f22595b = new SparseIntArray[9];
            return r02;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] e() {
            int r02 = this.f22596c.size() - 1;
        L3:
            if (r02 < 0) goto L9;
            WeakReference r1 = (WeakReference) this.f22596c.get(r02);
            Activity r2 = (Activity) r1.get();
            if (r1.get() == null) goto L7;
            r2.getWindow().removeOnFrameMetricsAvailableListener(this.d);
            this.f22596c.remove(r02);
        L7:
            r02 = r02 - 1;
            goto L3
        L9:
            return this.f22595b;
        }

        public void f(SparseIntArray r5, long r6) {
            if (r5 == null) goto L7;
            int r02 = (int) ((500000 + r6) / 1000000);
            if (r6 < 0) goto L8;
            r5.put(r02, r5.get(r02) + 1);
            return;
        L8:
            return;
        }
    }

    public static class b {
        public b() {
        }

        public abstract void a(Activity r1);

        public abstract SparseIntArray[] b();

        public abstract SparseIntArray[] c(Activity r1);

        public abstract SparseIntArray[] d();

        public abstract SparseIntArray[] e();
    }

    public FrameMetricsAggregator() {
        this(1);
    }

    public void a(Activity r2) {
        this.f22591a.a(r2);
    }

    public SparseIntArray[] b() {
        return this.f22591a.b();
    }

    public SparseIntArray[] c(Activity r2) {
        return this.f22591a.c(r2);
    }

    public SparseIntArray[] d() {
        return this.f22591a.d();
    }

    public SparseIntArray[] e() {
        return this.f22591a.e();
    }

    public FrameMetricsAggregator(int r2) {
        this.f22591a = new a(r2);
    }
}
