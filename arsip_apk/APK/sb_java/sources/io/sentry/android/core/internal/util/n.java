package io.sentry.android.core.internal.util;

import io.sentry.protocol.Device;

/* loaded from: classes3.dex */
public abstract class n {
    public static Device.DeviceOrientation a(int r1) {
        if (r1 == 1) goto L11;
        if (r1 == 2) goto L9;
        return null;
    L9:
        return Device.DeviceOrientation.LANDSCAPE;
    L11:
        return Device.DeviceOrientation.PORTRAIT;
    }
}
