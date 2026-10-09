package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.AbstractC2209b0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class V {

    /* renamed from: a, reason: collision with root package name */
    public final a f4281a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.workaround.m f4282b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f4283c;
    public final Map d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f4284e;

    public interface a {
        StreamConfigurationMap a();

        long b(int r1, Size r2);

        Size[] c(int r1);

        int[] d();

        Size[] e();

        Range[] f(Size r1);

        Size[] g(int r1);
    }

    public V(StreamConfigurationMap r2, androidx.camera.camera2.internal.compat.workaround.m r3) {
        this.f4283c = new HashMap();
        this.d = new HashMap();
        this.f4284e = new HashMap();
        this.f4281a = new W(r2);
        this.f4282b = r3;
    }

    public static V h(StreamConfigurationMap r1, androidx.camera.camera2.internal.compat.workaround.m r2) {
        return new V(r1, r2);
    }

    public Size[] a(int r4) {
        if (this.d.containsKey(Integer.valueOf(r4)) == true) goto L5;
        Size[] r02 = this.f4281a.g(r4);
        if (r02 != null) goto L12;
    L14:
        this.d.put(Integer.valueOf(r4), r02);
        if (r02 != null) goto L17;
        return null;
    L17:
        return (Size[]) r02.clone();
    L12:
        if (r02.length <= 0) goto L14;
        r02 = this.f4282b.b(r02, r4);
        goto L14
    L5:
        if (((Size[]) this.d.get(Integer.valueOf(r4))) != null) goto L8;
        return null;
    L8:
        return (Size[]) ((Size[]) this.d.get(Integer.valueOf(r4))).clone();
    }

    public Range[] b(Size r2) {
        return this.f4281a.f(r2);
    }

    public Size[] c() {
        return this.f4281a.e();
    }

    public int[] d() {
        int[] r02 = this.f4281a.d();
        if (r02 != null) goto L7;
        return null;
    L7:
        return (int[]) r02.clone();
    }

    public long e(int r4, Size r5) {
        return this.f4281a.b(r4, r5);
    L4:
        e = move-exception;
        AbstractC2209b0.m("StreamConfigurationMapCompat", "Failed to get min frame duration for format = " + r4 + " and size = " + r5, e);
        return 0;
    }

    public Size[] f(int r6) {
        Size[] r2 = null;
        if (this.f4283c.containsKey(Integer.valueOf(r6)) == true) goto L5;
        r2 = this.f4281a.c(r6);     // Catch: Throwable -> L11
    L13:
        if (r2 != null) goto L15;
    L19:
        AbstractC2209b0.l("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + r6);
        return r2;
    L15:
        if (r2.length == 0) goto L19;
        Size[] r02 = this.f4282b.b(r2, r6);
        this.f4283c.put(Integer.valueOf(r6), r02);
        return (Size[]) r02.clone();
    L11:
        th = move-exception;
        AbstractC2209b0.m("StreamConfigurationMapCompat", "Failed to get output sizes for " + r6, th);
        goto L13
    L5:
        if (((Size[]) this.f4283c.get(Integer.valueOf(r6))) != null) goto L8;
        return null;
    L8:
        return (Size[]) ((Size[]) this.f4283c.get(Integer.valueOf(r6))).clone();
    }

    public StreamConfigurationMap g() {
        return this.f4281a.a();
    }
}
