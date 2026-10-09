package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class ProfileInstallerInitializer implements androidx.startup.b {

    public static class a {
        public static Handler a(Looper r02) {
            return androidx.emoji2.text.c.a(r02);
        }
    }

    public static class b {
        public b() {
        }
    }

    public ProfileInstallerInitializer() {
    }

    public static /* synthetic */ void a(Context r02) {
        g.h(r02);
    }

    public static /* synthetic */ void b(Context r02) {
        f(r02);
    }

    public static /* synthetic */ void c(ProfileInstallerInitializer r02, Context r1, long r2) {
        r02.e(r1);
    }

    public static void f(final Context r7) {
        new ThreadPoolExecutor(0, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new j(r7));
    }

    @Override // androidx.startup.b
    public /* bridge */ /* synthetic */ Object create(Context r1) {
        return d(r1);
    }

    public b d(Context r3) {
        final Context r32 = r3.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new h(this, r32));
        return new b();
    }

    @Override // androidx.startup.b
    public List dependencies() {
        return Collections.EMPTY_LIST;
    }

    public void e(final Context r6) {
        if (Build.VERSION.SDK_INT < 28) goto L5;
        Handler r02 = a.a(Looper.getMainLooper());
    L6:
        int r1 = new Random().nextInt(Math.max(1000, 1));
        r02.postDelayed(new i(r6), r1 + 5000);
        return;
    L5:
        r02 = new Handler(Looper.getMainLooper());
        goto L6
    }
}
