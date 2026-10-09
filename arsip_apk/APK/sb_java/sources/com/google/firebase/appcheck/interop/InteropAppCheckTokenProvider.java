package com.google.firebase.appcheck.interop;

import com.google.android.gms.tasks.Task;
import com.google.firebase.appcheck.AppCheckTokenResult;

/* loaded from: classes6.dex */
public interface InteropAppCheckTokenProvider {
    void addAppCheckTokenListener(AppCheckTokenListener r1);

    Task<AppCheckTokenResult> getLimitedUseToken();

    Task<AppCheckTokenResult> getToken(boolean r1);

    void removeAppCheckTokenListener(AppCheckTokenListener r1);
}
