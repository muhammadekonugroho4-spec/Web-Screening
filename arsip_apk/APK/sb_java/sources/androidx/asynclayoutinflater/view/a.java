package androidx.asynclayoutinflater.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.g;
import java.util.concurrent.ArrayBlockingQueue;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public LayoutInflater f3714a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f3715b;

    /* renamed from: c, reason: collision with root package name */
    public d f3716c;
    public Handler.Callback d;

    /* renamed from: androidx.asynclayoutinflater.view.a$a, reason: collision with other inner class name */
    public class C0032a implements Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f3717a;

        public C0032a(a r1) {
            this.f3717a = r1;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message r5) {
            c r52 = (c) r5.obj;
            if (r52.d != null) goto L5;
            r52.d = this.f3717a.f3714a.inflate(r52.f3721c, r52.f3720b, false);
        L5:
            r52.f3722e.a(r52.d, r52.f3721c, r52.f3720b);
            this.f3717a.f3716c.d(r52);
            return true;
        }
    }

    public static class b extends LayoutInflater {

        /* renamed from: a, reason: collision with root package name */
        public static final String[] f3718a = null;

        static {
            f3718a = new String[]{"android.widget.", "android.webkit.", "android.app."};
        }

        public b(Context r1) {
            super(r1);
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context r2) {
            return new b(r2);
        }

        @Override // android.view.LayoutInflater
        public View onCreateView(String r5, AttributeSet r6) {
            String[] r02 = f3718a;
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L10;
            View r3 = createView(r5, r02[r2], r6);     // Catch: ClassNotFoundException -> L11
            if (r3 == null) goto L8;
            return r3;
        L8:
            r2 = r2 + 1;
            goto L3
        L10:
            return super.onCreateView(r5, r6);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public a f3719a;

        /* renamed from: b, reason: collision with root package name */
        public ViewGroup f3720b;

        /* renamed from: c, reason: collision with root package name */
        public int f3721c;
        public View d;

        /* renamed from: e, reason: collision with root package name */
        public e f3722e;

        public c() {
        }
    }

    public static class d extends Thread {

        /* renamed from: c, reason: collision with root package name */
        public static final d f3723c = null;

        /* renamed from: a, reason: collision with root package name */
        public ArrayBlockingQueue f3724a;

        /* renamed from: b, reason: collision with root package name */
        public g f3725b;

        static {
            d r02 = new d();
            f3723c = r02;
            r02.start();
        }

        public d() {
            this.f3724a = new ArrayBlockingQueue(10);
            this.f3725b = new g(10);
        }

        public static d b() {
            return f3723c;
        }

        public void a(c r3) {
            this.f3724a.put(r3);     // Catch: InterruptedException -> L4
            return;
        L4:
            e = move-exception;
            throw new RuntimeException("Failed to enqueue async inflate request", e);
        }

        public c c() {
            c r02 = (c) this.f3725b.acquire();
            if (r02 == null) goto L5;
            return r02;
        L5:
            return new c();
        }

        public void d(c r3) {
            r3.f3722e = null;
            r3.f3719a = null;
            r3.f3720b = null;
            r3.f3721c = 0;
            r3.d = null;
            this.f3725b.a(r3);
        }

        public void e() {
            c r1 = (c) this.f3724a.take();     // Catch: InterruptedException -> L11
            r1.d = r1.f3719a.f3714a.inflate(r1.f3721c, r1.f3720b, false);     // Catch: RuntimeException -> L7
        L9:
            Message.obtain(r1.f3719a.f3715b, 0, r1).sendToTarget();
            return;
        L7:
            e = move-exception;
            Log.w("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", e);
        L11:
            e = move-exception;
            Log.w("AsyncLayoutInflater", e);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        L2:
            e();
            goto L2
        }
    }

    public interface e {
        void a(View r1, int r2, ViewGroup r3);
    }

    public a(Context r2) {
        this.d = new C0032a(this);
        this.f3714a = new b(r2);
        this.f3715b = new Handler(this.d);
        this.f3716c = d.b();
    }

    public void a(int r2, ViewGroup r3, e r4) {
        if (r4 == null) goto L6;
        c r02 = this.f3716c.c();
        r02.f3719a = this;
        r02.f3721c = r2;
        r02.f3720b = r3;
        r02.f3722e = r4;
        this.f3716c.a(r02);
        return;
    L6:
        throw new NullPointerException("callback argument may not be null!");
    }
}
