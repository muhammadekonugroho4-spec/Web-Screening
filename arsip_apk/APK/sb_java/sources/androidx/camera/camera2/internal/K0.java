package androidx.camera.camera2.internal;

import androidx.camera.core.AbstractC2209b0;
import androidx.camera.core.impl.InterfaceC2251b0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class K0 implements InterfaceC2251b0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4085a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4086b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4087c;
    public final Map d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.camera.core.impl.G0 f4088e;

    public K0(String r3, androidx.camera.core.impl.G0 r4) {
        this.d = new HashMap();
        this.f4086b = r3;
        int r32 = Integer.parseInt(r3);     // Catch: NumberFormatException -> L5
        boolean r02 = true;
    L6:
        this.f4085a = r02;
        this.f4087c = r32;
        this.f4088e = r4;
        return;
    L5:
        AbstractC2209b0.l("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + r3 + ", unable to create Camera2EncoderProfilesProvider");
        r02 = false;
        r32 = -1;
        goto L6
    }
}
