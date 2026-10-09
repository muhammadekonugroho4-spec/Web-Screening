package com.aheaditec.talsec.security;

import android.content.pm.Signature;
import android.content.pm.SigningInfo;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class H1 {
    public static /* bridge */ /* synthetic */ Signature[] a(SigningInfo r02) {
        return r02.getApkContentsSigners();
    }
}
