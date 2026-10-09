package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.internal.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2161k1 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f4542a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4543b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f4544c;
    public final Set d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f4545e;

    /* renamed from: f, reason: collision with root package name */
    public final CameraDevice.StateCallback f4546f;

    /* renamed from: androidx.camera.camera2.internal.k1$a */
    public class a extends CameraDevice.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2161k1 f4547a;

        public a(C2161k1 r1) {
            this.f4547a = r1;
        }

        public static /* synthetic */ void a(LinkedHashSet r1, int r2) {
            Iterator r12 = r1.iterator();
        L4:
            if (r12.hasNext() == false) goto L6;
            ((R1) r12.next()).e(r2);
            goto L4
        }

        public static /* synthetic */ void b(LinkedHashSet r02) {
            C2161k1.b(r02);
        }

        public final void c() {
            Object r02 = this.f4547a.f4543b;
            monitor-enter(r02);
            List r1 = this.f4547a.f();     // Catch: Throwable -> L11
            this.f4547a.f4545e.clear();     // Catch: Throwable -> L11
            this.f4547a.f4544c.clear();     // Catch: Throwable -> L11
            this.f4547a.d.clear();     // Catch: Throwable -> L11
            monitor-exit(r02);     // Catch: Throwable -> L11
            Iterator r03 = r1.iterator();
        L8:
            if (r03.hasNext() == false) goto L10;
            ((R1) r03.next()).l();
            goto L8
        L10:
            return;
        L11:
            th = move-exception;
            throw th;
        }

        public final void d(final int r4) {
            final LinkedHashSet r02 = new LinkedHashSet();
            Object r1 = this.f4547a.f4543b;
            monitor-enter(r1);
            r02.addAll(this.f4547a.f4545e);     // Catch: Throwable -> L8
            r02.addAll(this.f4547a.f4544c);     // Catch: Throwable -> L8
            monitor-exit(r1);     // Catch: Throwable -> L8
            this.f4547a.f4542a.execute(new RunnableC2158j1(r02, r4));
            return;
        L8:
            th = move-exception;
            throw th;
        }

        public final void e() {
            final LinkedHashSet r02 = new LinkedHashSet();
            Object r1 = this.f4547a.f4543b;
            monitor-enter(r1);
            r02.addAll(this.f4547a.f4545e);     // Catch: Throwable -> L8
            r02.addAll(this.f4547a.f4544c);     // Catch: Throwable -> L8
            monitor-exit(r1);     // Catch: Throwable -> L8
            this.f4547a.f4542a.execute(new RunnableC2155i1(r02));
            return;
        L8:
            th = move-exception;
            throw th;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice r1) {
            e();
            c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice r1) {
            e();
            c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice r1, int r2) {
            e();
            d(r2);
            c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice r1) {
        }
    }

    public C2161k1(Executor r2) {
        this.f4543b = new Object();
        this.f4544c = new LinkedHashSet();
        this.d = new LinkedHashSet();
        this.f4545e = new LinkedHashSet();
        this.f4546f = new a(this);
        this.f4542a = r2;
    }

    public static void b(Set r2) {
        Iterator r22 = r2.iterator();
    L4:
        if (r22.hasNext() == false) goto L6;
        R1 r02 = (R1) r22.next();
        r02.b().s(r02);
        goto L4
    }

    public final void a(R1 r3) {
        Iterator r02 = f().iterator();
    L4:
        if (r02.hasNext() == false) goto L9;
        R1 r1 = (R1) r02.next();
        if (r1 == r3) goto L12;
        r1.l();
        goto L4
    L12:
        return;
    }

    public CameraDevice.StateCallback c() {
        return this.f4546f;
    }

    public List d() {
        Object r02 = this.f4543b;
        monitor-enter(r02);
        ArrayList r1 = new ArrayList(this.f4544c);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public List e() {
        Object r02 = this.f4543b;
        monitor-enter(r02);
        ArrayList r1 = new ArrayList(this.f4545e);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public List f() {
        Object r02 = this.f4543b;
        monitor-enter(r02);
        ArrayList r1 = new ArrayList();     // Catch: Throwable -> L7
        r1.addAll(d());     // Catch: Throwable -> L7
        r1.addAll(e());     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public void g(R1 r3) {
        Object r02 = this.f4543b;
        monitor-enter(r02);
        this.f4544c.remove(r3);     // Catch: Throwable -> L7
        this.d.remove(r3);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public void h(R1 r3) {
        Object r02 = this.f4543b;
        monitor-enter(r02);
        this.d.add(r3);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public void i(R1 r3) {
        a(r3);
        Object r02 = this.f4543b;
        monitor-enter(r02);
        this.f4545e.remove(r3);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public void j(R1 r3) {
        Object r02 = this.f4543b;
        monitor-enter(r02);
        this.f4544c.add(r3);     // Catch: Throwable -> L8
        this.f4545e.remove(r3);     // Catch: Throwable -> L8
        monitor-exit(r02);     // Catch: Throwable -> L8
        a(r3);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public void k(R1 r3) {
        Object r02 = this.f4543b;
        monitor-enter(r02);
        this.f4545e.add(r3);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
