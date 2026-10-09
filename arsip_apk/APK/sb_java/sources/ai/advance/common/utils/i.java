package ai.advance.common.utils;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* loaded from: classes.dex */
public class i implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public SensorManager f1759a;

    /* renamed from: b, reason: collision with root package name */
    public Sensor f1760b;

    /* renamed from: c, reason: collision with root package name */
    public float f1761c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public float f1762e;

    public i(Context r1) {
        a(r1);
    }

    public final void a(Context r3) {
        SensorManager r32 = (SensorManager) r3.getSystemService("sensor");
        this.f1759a = r32;
        Sensor r33 = r32.getDefaultSensor(1);
        this.f1760b = r33;
        if (r33 == null) goto L6;
        this.f1759a.registerListener(this, r33, 3);
        this.d = System.currentTimeMillis();
        return;
    }

    public void b() {
        if (this.f1760b == null) goto L8;
        SensorManager r02 = this.f1759a;
        if (r02 == null) goto L9;
        r02.unregisterListener(this);
        return;
    L9:
        return;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor r1, int r2) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent r2) {
        float r22 = r2.values[1];
        this.f1761c = r22;
        if (r22 <= this.f1762e) goto L6;
        this.f1762e = r22;
        return;
    }
}
