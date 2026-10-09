package com.google.android.material.color;

import android.system.Os;
import java.io.FileDescriptor;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class d {
    public static /* bridge */ /* synthetic */ FileDescriptor a(String r02, int r1) {
        return Os.memfd_create(r02, r1);
    }
}
