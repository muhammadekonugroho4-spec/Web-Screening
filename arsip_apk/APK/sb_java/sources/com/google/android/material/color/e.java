package com.google.android.material.color;

import android.content.res.loader.AssetsProvider;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class e {
    public static /* bridge */ /* synthetic */ ResourcesProvider a(ParcelFileDescriptor r02, AssetsProvider r1) {
        return ResourcesProvider.loadFromTable(r02, r1);
    }
}
