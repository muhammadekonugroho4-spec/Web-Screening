package com.bumptech.glide.manager;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* loaded from: classes4.dex */
public final class i implements k, ComponentCallbacks2 {
    public i() {
    }

    @Override // com.bumptech.glide.manager.k
    public void a(Activity r1) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration r1) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(20);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int r1) {
    }
}
