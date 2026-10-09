package androidx.camera.featurecombinationquery;

import android.content.Context;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6167a;

    /* renamed from: b, reason: collision with root package name */
    public g f6168b;

    /* renamed from: c, reason: collision with root package name */
    public g f6169c;

    public f(Context r3) {
        this.f6167a = r3;
        if (Build.VERSION.SDK_INT < 35) goto L5;
        this.f6169c = new d(r3);
    L5:
        this.f6168b = b();
    }

    public e a(String r3) {
        ArrayList r02 = new ArrayList();
        g r1 = this.f6168b;
        if (r1 == null) goto L5;
        r02.add(r1.a(r3));
    L5:
        g r12 = this.f6169c;
        if (r12 == null) goto L9;
        r02.add(r12.a(r3));     // Catch: UnsupportedOperationException -> L10
    L9:
        return new a(r02);
    }

    public final g b() {
        ServiceInfo[] r1 = this.f6167a.getPackageManager().getPackageInfo(this.f6167a.getPackageName(), 132).services;
        if (r1 != null) goto L7;
        return null;
    L7:
        int r2 = r1.length;
        int r3 = 0;
        String r4 = null;
    L8:
        if (r3 >= r2) goto L19;
        Bundle r5 = r1[r3].metaData;
        if (r5 == null) goto L18;
        String r52 = r5.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY");
        if (r52 == null) goto L18;
        if (r4 != null) goto L17;
        r4 = r52;
        goto L18
    L17:
        throw new IllegalStateException("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
    L18:
        r3 = r3 + 1;
        goto L8
    L19:
        if (r4 != null) goto L22;
        return null;
    L22:
        return c(r4);
    L31:
        return null;
    }

    public final g c(String r3) {
        return (g) Class.forName(r3).getConstructor(new Class[]{Context.class}).newInstance(new Object[]{this.f6167a});
    L4:
        e = move-exception;
        throw new IllegalStateException("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e);
    }
}
