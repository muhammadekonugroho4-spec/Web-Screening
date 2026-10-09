package androidx.biometric;

import android.os.CancellationSignal;
import android.util.Log;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final c f3805a;

    /* renamed from: b, reason: collision with root package name */
    public CancellationSignal f3806b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.core.os.e f3807c;

    public class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f3808a;

        public a(h r1) {
            this.f3808a = r1;
        }

        @Override // androidx.biometric.h.c
        public androidx.core.os.e a() {
            return new androidx.core.os.e();
        }

        @Override // androidx.biometric.h.c
        public CancellationSignal b() {
            return b.b();
        }
    }

    public static class b {
        public static void a(CancellationSignal r02) {
            r02.cancel();
        }

        public static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    public interface c {
        androidx.core.os.e a();

        CancellationSignal b();
    }

    public h() {
        this.f3805a = new a(this);
    }

    public void a() {
        CancellationSignal r02 = this.f3806b;
        if (r02 != null) goto L19;
    L9:
        androidx.core.os.e r03 = this.f3807c;
        if (r03 == null) goto L21;
        r03.a();     // Catch: NullPointerException -> L13
    L15:
        this.f3807c = null;
        return;
    L13:
        e = move-exception;
        Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e);
        goto L15
    L21:
        return;
    L19:
        b.a(r02);     // Catch: NullPointerException -> L6
    L8:
        this.f3806b = null;
    L6:
        e = move-exception;
        Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
        goto L8
    }

    public CancellationSignal b() {
        if (this.f3806b != null) goto L6;
        this.f3806b = this.f3805a.b();
    L6:
        return this.f3806b;
    }

    public androidx.core.os.e c() {
        if (this.f3807c != null) goto L6;
        this.f3807c = this.f3805a.a();
    L6:
        return this.f3807c;
    }
}
