package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f22621a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f22622b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f22623c = null;
    public static final Method d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f22624e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f22625f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final Handler f22626g = null;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C0157d f22627a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f22628b;

        public a(C0157d r1, Object r2) {
            this.f22627a = r1;
            this.f22628b = r2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0157d r02 = this.f22627a;
            r02.f22633a = this.f22628b;
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Application f22629a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C0157d f22630b;

        public b(Application r1, C0157d r2) {
            this.f22629a = r1;
            this.f22630b = r2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22629a.unregisterActivityLifecycleCallbacks(this.f22630b);
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f22631a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f22632b;

        public c(Object r1, Object r2) {
            this.f22631a = r1;
            this.f22632b = r2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Method r02 = d.d;     // Catch: Throwable -> L6 RuntimeException -> L8
            if (r02 == null) goto L10;
            r02.invoke(this.f22631a, new Object[]{this.f22632b, Boolean.FALSE, "AppCompat recreation"});     // Catch: Throwable -> L6 RuntimeException -> L8
            return;
        L10:
            d.f22624e.invoke(this.f22631a, new Object[]{this.f22632b, Boolean.FALSE});     // Catch: Throwable -> L6 RuntimeException -> L8
            return;
        L8:
            e = move-exception;
            if (e.getClass() == RuntimeException.class) goto L16;
            return;
        L16:
            if (e.getMessage() != null) goto L18;
            return;
        L18:
            if (e.getMessage().startsWith("Unable to stop") == false) goto L25;
            throw e;
        L25:
            return;
        L6:
            th = move-exception;
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }

    /* renamed from: androidx.core.app.d$d, reason: collision with other inner class name */
    public static final class C0157d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        public Object f22633a;

        /* renamed from: b, reason: collision with root package name */
        public Activity f22634b;

        /* renamed from: c, reason: collision with root package name */
        public final int f22635c;
        public boolean d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f22636e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f22637f;

        public C0157d(Activity r2) {
            this.d = false;
            this.f22636e = false;
            this.f22637f = false;
            this.f22634b = r2;
            this.f22635c = r2.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity r1, Bundle r2) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity r2) {
            if (this.f22634b != r2) goto L6;
            this.f22634b = null;
            this.f22636e = true;
            return;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity r3) {
            if (this.f22636e == true) goto L5;
            return;
        L5:
            if (this.f22637f == false) goto L7;
            return;
        L7:
            if (this.d == false) goto L9;
            return;
        L9:
            if (d.h(this.f22633a, this.f22635c, r3) == false) goto L15;
            this.f22637f = true;
            this.f22633a = null;
            return;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity r1) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity r1, Bundle r2) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity r2) {
            if (this.f22634b != r2) goto L6;
            this.d = true;
            return;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity r1) {
        }
    }

    static {
        f22626g = new Handler(Looper.getMainLooper());
        Class r02 = a();
        f22621a = r02;
        f22622b = b();
        f22623c = f();
        d = d(r02);
        f22624e = c(r02);
        f22625f = e(r02);
    }

    public static Class a() {
        return Class.forName("android.app.ActivityThread");
    L4:
        return null;
    }

    public static Field b() {
        Field r02 = Activity.class.getDeclaredField("mMainThread");     // Catch: Throwable -> L4
        r02.setAccessible(true);     // Catch: Throwable -> L4
        return r02;
    L4:
        return null;
    }

    public static Method c(Class r4) {
        if (r4 != null) goto L8;
        return null;
    L8:
        Method r42 = r4.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});     // Catch: Throwable -> L7
        r42.setAccessible(true);     // Catch: Throwable -> L7
        return r42;
    L7:
        return null;
    }

    public static Method d(Class r5) {
        if (r5 != null) goto L8;
        return null;
    L8:
        Method r52 = r5.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});     // Catch: Throwable -> L7
        r52.setAccessible(true);     // Catch: Throwable -> L7
        return r52;
    L7:
        return null;
    }

    public static Method e(Class r11) {
        if (g() == false) goto L8;
        if (r11 == null) goto L8;
        Class r5 = Integer.TYPE;     // Catch: Throwable -> L9
        Class r6 = Boolean.TYPE;     // Catch: Throwable -> L9
        Method r112 = r11.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, r5, r6, Configuration.class, Configuration.class, r6, r6});     // Catch: Throwable -> L9
        r112.setAccessible(true);     // Catch: Throwable -> L9
        return r112;
    L8:
        return null;
    }

    public static Field f() {
        Field r02 = Activity.class.getDeclaredField("mToken");     // Catch: Throwable -> L4
        r02.setAccessible(true);     // Catch: Throwable -> L4
        return r02;
    L4:
        return null;
    }

    public static boolean g() {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 != 26) goto L5;
        return true;
    L5:
        if (r02 == 27) goto L11;
        return false;
    L11:
        return true;
    }

    public static boolean h(Object r2, int r3, Activity r4) {
        Object r1 = f22623c.get(r4);     // Catch: Throwable -> L11
        if (r1 == r2) goto L6;
    L13:
        return false;
    L6:
        if (r4.hashCode() != r3) goto L13;
        Object r22 = f22622b.get(r4);     // Catch: Throwable -> L11
        f22626g.postAtFrontOfQueue(new c(r22, r1));     // Catch: Throwable -> L11
        return true;
    L11:
        th = move-exception;
        Log.e("ActivityRecreator", "Exception while fetching field values", th);
        return false;
    }

    public static boolean i(Activity r15) {
        if (Build.VERSION.SDK_INT < 28) goto L7;
        r15.recreate();
        return true;
    L7:
        if (g() == false) goto L12;
        if (f22625f != null) goto L12;
        return false;
    L12:
        if (f22624e == null) goto L14;
    L35:
        Object r3 = f22623c.get(r15);     // Catch: Throwable -> L33
        if (r3 != null) goto L19;
        return false;
    L19:
        Object r02 = f22622b.get(r15);     // Catch: Throwable -> L33
        if (r02 != null) goto L22;
        return false;
    L22:
        Application r12 = r15.getApplication();     // Catch: Throwable -> L33
        C0157d r13 = new C0157d(r15);     // Catch: Throwable -> L33
        r12.registerActivityLifecycleCallbacks(r13);     // Catch: Throwable -> L33
        Handler r14 = f22626g;     // Catch: Throwable -> L33
        r14.post(new a(r13, r3));     // Catch: Throwable -> L33
    L26:
        th = move-exception;
        f22626g.post(new b(r12, r13));     // Catch: Throwable -> L33
        throw th;     // Catch: Throwable -> L33
    L24:
        if (g() == false) goto L28;
        Method r152 = f22625f;     // Catch: Throwable -> L26
        Boolean r7 = Boolean.FALSE;     // Catch: Throwable -> L26
        r152.invoke(r02, new Object[]{r3, null, null, 0, r7, null, null, r7, r7});     // Catch: Throwable -> L26
    L29:
        r14.post(new b(r12, r13));     // Catch: Throwable -> L33
        return true;
    L28:
        r15.recreate();     // Catch: Throwable -> L26
    L33:
        return false;
    L14:
        if (d != null) goto L35;
        return false;
    }
}
