package com.google.firebase.remoteconfig;

/* loaded from: classes6.dex */
public interface ConfigUpdateListener {
    void onError(FirebaseRemoteConfigException r1);

    void onUpdate(ConfigUpdate r1);
}
