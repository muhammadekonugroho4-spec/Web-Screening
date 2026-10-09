package androidx.core.os;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class h {

    public static class a {
        public static Handler a(Looper r02) {
            return Handler.createAsync(r02);
        }

        public static boolean b(Handler r02, Runnable r1, Object r2, long r3) {
            return r02.postDelayed(r1, r2, r3);
        }
    }

    public static Handler a(Looper r4) {
        if (Build.VERSION.SDK_INT >= 28) goto L5;
        return (Handler) Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{r4, null, Boolean.TRUE});
    L12:
        e = e;
    L25:
        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
        return new Handler(r4);
    L10:
        e = e;
    L8:
        e = e;
    L14:
        e = move-exception;
        Throwable r42 = e.getCause();
        if ((r42 instanceof RuntimeException) == true) goto L24;
        if ((r42 instanceof Error) == false) goto L22;
        throw ((Error) r42);
    L22:
        throw new RuntimeException(r42);
    L24:
        throw ((RuntimeException) r42);
    L5:
        return a.a(r4);
    }

    public static boolean b(Handler r2, Runnable r3, Object r4, long r5) {
        if (Build.VERSION.SDK_INT >= 28) goto L5;
        Message r32 = Message.obtain(r2, r3);
        r32.obj = r4;
        return r2.sendMessageDelayed(r32, r5);
    L5:
        return a.b(r2, r3, r4, r5);
    }
}
