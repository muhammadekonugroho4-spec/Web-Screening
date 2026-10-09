package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6146a;

    /* renamed from: b, reason: collision with root package name */
    public final LongSparseArray f6147b;

    /* renamed from: c, reason: collision with root package name */
    public Map f6148c;
    public final LongSparseArray d;

    /* renamed from: e, reason: collision with root package name */
    public a f6149e;

    public interface a {
    }

    public c() {
        this.f6146a = new Object();
        this.f6147b = new LongSparseArray();
        this.f6148c = new HashMap();
        this.d = new LongSparseArray();
    }

    public final void a(LongSparseArray r2, long r3, Object r5) {
        List r02 = (List) r2.get(r3);
        if (r02 != null) goto L5;
        r02 = new ArrayList();
        r2.put(r3, r02);
    L5:
        r02.add(r5);
    }

    public void b(TotalCaptureResult r2) {
        c(r2, 0);
    }

    public void c(TotalCaptureResult r6, int r7) {
        Object r02 = this.f6146a;
        monitor-enter(r02);
        long r1 = f(r6);     // Catch: Throwable -> L8
        if (r1 != (-1)) goto L10;
        monitor-exit(r02);     // Catch: Throwable -> L8
        return;
    L10:
        a(this.f6147b, r1, r6);     // Catch: Throwable -> L8
        this.f6148c.put(r6, Integer.valueOf(r7));     // Catch: Throwable -> L8
        monitor-exit(r02);     // Catch: Throwable -> L8
        h();
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public void d() {
        Object r02 = this.f6146a;
        monitor-enter(r02);
        this.f6147b.clear();     // Catch: Throwable -> L12
        int r1 = 0;
    L6:
        if (r1 >= this.d.size()) goto L14;
        long r2 = this.d.keyAt(r1);     // Catch: Throwable -> L12
        Iterator r22 = ((List) this.d.get(r2)).iterator();     // Catch: Throwable -> L12
        if (r22.hasNext() == true) goto L10;
        r1 = r1 + 1;     // Catch: Throwable -> L12
        goto L6
    L10:
        a.a.a.a.c.f.a(r22.next());     // Catch: Throwable -> L12
        throw null;     // Catch: Throwable -> L12
    L14:
        this.d.clear();     // Catch: Throwable -> L12
        this.f6148c.clear();     // Catch: Throwable -> L12
        monitor-exit(r02);     // Catch: Throwable -> L12
        return;
    L12:
        th = move-exception;
        throw th;
    }

    public void e() {
        Object r02 = this.f6146a;
        monitor-enter(r02);
        this.f6149e = null;     // Catch: Throwable -> L8
        monitor-exit(r02);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public final long f(TotalCaptureResult r3) {
        Long r32 = (Long) r3.get(CaptureResult.SENSOR_TIMESTAMP);
        if (r32 != null) goto L5;
        return -1;
    L5:
        return r32.longValue();
    }

    public void g(d r6) {
        Object r02 = this.f6146a;
        monitor-enter(r02);
        Image r1 = r6.get();     // Catch: Throwable -> L8
        a(this.d, r1.getTimestamp(), r6);     // Catch: Throwable -> L8
        monitor-exit(r02);     // Catch: Throwable -> L8
        h();
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public final void h() {
        Object r02 = this.f6146a;
        monitor-enter(r02);
        int r1 = this.f6147b.size() - 1;     // Catch: Throwable -> L19
    L5:
        if (r1 < 0) goto L22;
        List r3 = (List) this.f6147b.valueAt(r1);     // Catch: Throwable -> L19
        if (r3.isEmpty() == true) goto L21;
        TotalCaptureResult r5 = (TotalCaptureResult) r3.get(0);     // Catch: Throwable -> L19
        long r6 = f(r5);     // Catch: Throwable -> L19
        if (r6 != this.f6147b.keyAt(r1)) goto L11;
        boolean r8 = true;
    L12:
        androidx.core.util.h.i(r8);     // Catch: Throwable -> L19
        List r82 = (List) this.d.get(r6);     // Catch: Throwable -> L19
        if (r82 == null) goto L21;
        if (r82.isEmpty() == true) goto L21;
        a.a.a.a.c.f.a(r82.get(0));     // Catch: Throwable -> L19
        i(this.d, r6, null);     // Catch: Throwable -> L19
        r3.remove(r5);     // Catch: Throwable -> L19
        if (r3.isEmpty() == false) goto L22;
        this.f6147b.removeAt(r1);     // Catch: Throwable -> L19
        goto L22
    L11:
        r8 = false;
    L21:
        r1 = r1 - 1;
    L22:
        j();     // Catch: Throwable -> L19
        monitor-exit(r02);     // Catch: Throwable -> L19
        return;
    L19:
        th = move-exception;
        throw th;
    }

    public final void i(LongSparseArray r2, long r3, Object r5) {
        List r02 = (List) r2.get(r3);
        if (r02 == null) goto L8;
        r02.remove(r5);
        if (r02.isEmpty() == false) goto L9;
        r2.remove(r3);
        return;
    L9:
        return;
    }

    public final void j() {
        Object r02 = this.f6146a;
        monitor-enter(r02);
    L18:
        th = move-exception;
        throw th;
    L5:
        if (this.d.size() != 0) goto L7;
    L31:
        monitor-exit(r02);     // Catch: Throwable -> L18
        return;
    L7:
        if (this.f6147b.size() == 0) goto L31;
        long r3 = this.d.keyAt(0);     // Catch: Throwable -> L18
        Long r1 = Long.valueOf(r3);     // Catch: Throwable -> L18
        long r5 = this.f6147b.keyAt(0);     // Catch: Throwable -> L18
        androidx.core.util.h.a(!Long.valueOf(r5).equals(r1));     // Catch: Throwable -> L18
        if (r5 <= r3) goto L23;
        int r12 = this.d.size() - 1;
    L12:
        if (r12 < 0) goto L29;
        if (this.d.keyAt(r12) >= r5) goto L22;
        Iterator r2 = ((List) this.d.valueAt(r12)).iterator();     // Catch: Throwable -> L18
        if (r2.hasNext() == true) goto L20;
        this.d.removeAt(r12);     // Catch: Throwable -> L18
        goto L22
    L20:
        a.a.a.a.c.f.a(r2.next());     // Catch: Throwable -> L18
        throw null;     // Catch: Throwable -> L18
    L22:
        r12 = r12 - 1;
    L29:
        monitor-exit(r02);     // Catch: Throwable -> L18
        return;
    L23:
        int r13 = this.f6147b.size() - 1;
    L24:
        if (r13 < 0) goto L29;
        if (this.f6147b.keyAt(r13) >= r3) goto L28;
        this.f6147b.removeAt(r13);     // Catch: Throwable -> L18
    L28:
        r13 = r13 - 1;
        goto L24
    }

    public void k(a r2) {
        Object r02 = this.f6146a;
        monitor-enter(r02);
        this.f6149e = r2;     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
