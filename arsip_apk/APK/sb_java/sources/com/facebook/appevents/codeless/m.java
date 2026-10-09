package com.facebook.appevents.codeless;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class m implements SensorEventListener {

    /* renamed from: b, reason: collision with root package name */
    public static final a f35892b = null;

    /* renamed from: a, reason: collision with root package name */
    public b f35893a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    public interface b {
        void a();
    }

    static {
        f35892b = new a(null);
    }

    public m() {
    }

    public final void a(b r2) {
        if (com.facebook.internal.instrument.crashshield.a.d(this) == false) goto L10;
        return;
    L10:
        this.f35893a = r2;     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        com.facebook.internal.instrument.crashshield.a.b(th, this);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor r1, int r2) {
        if (com.facebook.internal.instrument.crashshield.a.d(this) == false) goto L10;
        return;
    L10:
        p.l(r1, "sensor");     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        com.facebook.internal.instrument.crashshield.a.b(th, this);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent r9) {
        if (com.facebook.internal.instrument.crashshield.a.d(this) == true) goto L19;
        p.l(r9, NotificationCompat.CATEGORY_EVENT);     // Catch: Throwable -> L11
        b r02 = this.f35893a;     // Catch: Throwable -> L11
        if (r02 == null) goto L13;
        float[] r92 = r9.values;     // Catch: Throwable -> L11
        float r1 = r92[0];     // Catch: Throwable -> L11
        double r4 = r1 / 9.80665f;     // Catch: Throwable -> L11
        double r12 = r92[1] / 9.80665f;     // Catch: Throwable -> L11
        double r6 = r92[2] / 9.80665f;     // Catch: Throwable -> L11
        if (Math.sqrt(((r4 * r4) + (r12 * r12)) + (r6 * r6)) <= 2.3d) goto L18;
        r02.a();     // Catch: Throwable -> L11
        return;
    L18:
        return;
    L13:
        return;
    L11:
        th = move-exception;
        com.facebook.internal.instrument.crashshield.a.b(th, this);
        return;
    }
}
