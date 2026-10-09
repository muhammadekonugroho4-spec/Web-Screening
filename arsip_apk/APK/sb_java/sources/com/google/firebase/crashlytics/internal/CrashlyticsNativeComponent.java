package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* loaded from: classes6.dex */
public interface CrashlyticsNativeComponent {
    NativeSessionFileProvider getSessionFileProvider(String r1);

    boolean hasCrashDataForCurrentSession();

    boolean hasCrashDataForSession(String r1);

    void prepareNativeSession(String r1, String r2, long r3, StaticSessionData r5);
}
