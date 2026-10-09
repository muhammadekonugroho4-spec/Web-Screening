package com.google.firebase.crashlytics.internal.common;

import android.app.ApplicationExitInfo;
import java.io.InputStream;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class q {
    public static /* bridge */ /* synthetic */ InputStream a(ApplicationExitInfo r02) {
        return r02.getTraceInputStream();
    }
}
