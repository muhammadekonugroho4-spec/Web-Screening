package io.reactivex.internal.schedulers;

import androidx.camera.view.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f174592a = false;

    /* renamed from: b, reason: collision with root package name */
    public static final int f174593b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference f174594c = null;
    public static final Map d = null;

    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator r02 = new ArrayList(e.d.keySet()).iterator();
        L4:
            if (r02.hasNext() == false) goto L9;
            ScheduledThreadPoolExecutor r1 = (ScheduledThreadPoolExecutor) r02.next();
            if (r1.isShutdown() == true) goto L7;
            r1.purge();
            goto L4
        L7:
            e.d.remove(r1);
            goto L4
        }
    }

    public static final class b implements io.reactivex.functions.d {
        public b() {
        }

        public String a(String r1) {
            return System.getProperty(r1);
        }

        @Override // io.reactivex.functions.d
        public /* bridge */ /* synthetic */ Object apply(Object r1) {
            return a((String) r1);
        }
    }

    static {
        f174594c = new AtomicReference();
        d = new ConcurrentHashMap();
        b r02 = new b();
        boolean r1 = b(true, "rx2.purge-enabled", true, true, r02);
        f174592a = r1;
        f174593b = c(r1, "rx2.purge-period-seconds", 1, 1, r02);
        d();
    }

    public static ScheduledExecutorService a(ThreadFactory r1) {
        ScheduledExecutorService r12 = Executors.newScheduledThreadPool(1, r1);
        e(f174592a, r12);
        return r12;
    }

    public static boolean b(boolean r02, String r1, boolean r2, boolean r3, io.reactivex.functions.d r4) {
        if (r02 == true) goto L11;
        return r3;
    L11:
        String r03 = (String) r4.apply(r1);     // Catch: Throwable -> L10
        if (r03 == null) goto L8;
        return "true".equals(r03);
    L8:
        return r2;
    }

    public static int c(boolean r02, String r1, int r2, int r3, io.reactivex.functions.d r4) {
        if (r02 == true) goto L11;
        return r3;
    L11:
        String r03 = (String) r4.apply(r1);     // Catch: Throwable -> L10
        if (r03 == null) goto L8;
        return Integer.parseInt(r03);
    L8:
        return r2;
    }

    public static void d() {
        f(f174592a);
    }

    public static void e(boolean r1, ScheduledExecutorService r2) {
        if (r1 == true) goto L4;
        return;
    L4:
        if ((r2 instanceof ScheduledThreadPoolExecutor) == false) goto L8;
        Map r02 = d;
        r02.put((ScheduledThreadPoolExecutor) r2, r2);
        return;
    }

    public static void f(boolean r10) {
        if (r10 == false) goto L11;
    L3:
        AtomicReference r102 = f174594c;
        ScheduledExecutorService r02 = (ScheduledExecutorService) r102.get();
        if (r02 != null) goto L14;
        ScheduledExecutorService r3 = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
        if (i.a(r102, r02, r3) == true) goto L8;
        r3.shutdownNow();
        goto L3
    L8:
        a r4 = new a();
        int r103 = f174593b;
        r3.scheduleAtFixedRate(r4, r103, r103, TimeUnit.SECONDS);
        return;
    L14:
        return;
    }
}
