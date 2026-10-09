package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class C {

    /* renamed from: a, reason: collision with root package name */
    public final Map f4247a;

    /* renamed from: b, reason: collision with root package name */
    public final a f4248b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4249c;
    public V d;

    public interface a {
        CameraCharacteristics a();

        Object b(CameraCharacteristics.Key r1);
    }

    public C(CameraCharacteristics r3, String r4) {
        this.f4247a = new HashMap();
        this.d = null;
        if (Build.VERSION.SDK_INT < 28) goto L5;
        this.f4248b = new C2137x(r3);
    L6:
        this.f4249c = r4;
        return;
    L5:
        this.f4248b = new y(r3);
        goto L6
    }

    public static C k(CameraCharacteristics r1, String r2) {
        return new C(r1, r2);
    }

    public Object a(CameraCharacteristics.Key r3) {
        if (g(r3) == true) goto L5;
        monitor-enter(this);
        Object r02 = this.f4247a.get(r3);     // Catch: Throwable -> L11
        if (r02 == null) goto L13;
        monitor-exit(this);     // Catch: Throwable -> L11
        return r02;
    L13:
        Object r03 = this.f4248b.b(r3);     // Catch: Throwable -> L11
        if (r03 == null) goto L16;
        this.f4247a.put(r3, r03);     // Catch: Throwable -> L11
    L16:
        monitor-exit(this);     // Catch: Throwable -> L11
        return r03;
    L11:
        th = move-exception;
        throw th;
    L5:
        return this.f4248b.b(r3);
    }

    public String b() {
        return this.f4249c;
    }

    public int c() {
        if (f() == true) goto L5;
    L7:
        Integer r02 = null;
    L8:
        if (r02 != null) goto L12;
        return 1;
    L12:
        return r02.intValue();
    L5:
        if (Build.VERSION.SDK_INT < 35) goto L7;
        r02 = (Integer) a(z.a());
        goto L8
    }

    public int d() {
        if (f() == true) goto L5;
    L7:
        Integer r02 = null;
    L8:
        if (r02 != null) goto L12;
        return 1;
    L12:
        return r02.intValue();
    L5:
        if (Build.VERSION.SDK_INT < 35) goto L7;
        r02 = (Integer) a(B.a());
        goto L8
    }

    public V e() {
        if (this.d != null) goto L15;
        StreamConfigurationMap r02 = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);     // Catch: AssertionError -> L9 Throwable -> L11
        if (r02 == null) goto L8;
        this.d = V.h(r02, new androidx.camera.camera2.internal.compat.workaround.m(this.f4249c));
        goto L15
    L8:
        throw new IllegalArgumentException("StreamConfigurationMap is null!");
    L11:
        e = move-exception;
        throw new IllegalArgumentException(e.getMessage());
    L15:
        return this.d;
    }

    public final boolean f() {
        Boolean r02 = (Boolean) a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        if (r02 != null) goto L5;
        return false;
    L5:
        if (r02.booleanValue() == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final boolean g(CameraCharacteristics.Key r2) {
        return r2.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }

    public boolean h() {
        if (f() == true) goto L5;
        return false;
    L5:
        if (Build.VERSION.SDK_INT >= 35) goto L7;
        return false;
    L7:
        if (d() <= 1) goto L12;
        return true;
    L12:
        return false;
    }

    public boolean i() {
        if (Build.VERSION.SDK_INT < 34) goto L12;
        int[] r02 = (int[]) this.f4248b.b(A.a());
        if (r02 == null) goto L12;
        int r1 = r02.length;
        int r3 = 0;
    L7:
        if (r3 >= r1) goto L12;
        if (r02[r3] == 1) goto L10;
        r3 = r3 + 1;
        goto L7
    L10:
        return true;
    L12:
        return false;
    }

    public CameraCharacteristics j() {
        return this.f4248b.a();
    }
}
