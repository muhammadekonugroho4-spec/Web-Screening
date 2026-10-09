package com.huawei.agconnect.config.impl;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class m extends l {

    /* renamed from: c, reason: collision with root package name */
    public final Map f38849c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public i f38850e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f38851f;

    /* renamed from: g, reason: collision with root package name */
    public final String f38852g;

    public m(Context r4, String r5) {
        super(r4, r5);
        this.f38849c = new HashMap();
        this.d = new Object();
        this.f38851f = true;
        this.f38852g = r5;
        String r42 = b("/AD91D45E3E72DB6989DDCB13287E75061FABCB933D886E6C6ABEF0939B577138");     // Catch: Throwable -> L12
        String r52 = b("/B314B3BF013DF5AC4134E880AF3D2B7C9FFBE8F0305EAC1C898145E2BCF1F21C");     // Catch: Throwable -> L12
        String r02 = b("/C767BD8FDF53E53D059BE95B09E2A71056F5F180AECC62836B287ACA5793421B");     // Catch: Throwable -> L12
        String r1 = b("/DCB3E6D4C2CF80F30D89CDBC412C964DA8381BB84668769391FBCC3E329AD0FD");     // Catch: Throwable -> L12
        if (r42 == null) goto L10;
        if (r52 == null) goto L10;
        if (r02 == null) goto L10;
        if (r1 == null) goto L10;
        this.f38850e = new h(r42, r52, r02, r1);     // Catch: Throwable -> L12
        return;
    L10:
        this.f38851f = false;     // Catch: Throwable -> L12
        return;
    L12:
        Log.e("SecurityResourcesReader", "Exception when reading the 'K&I' for 'Config'.");
        this.f38850e = null;
    }

    @Override // com.huawei.agconnect.config.impl.l, com.huawei.agconnect.config.impl.f
    public String a(String r4, String r5) {
        if (this.f38851f == true) goto L9;
        String r42 = b(r4);
        if (r42 == null) goto L7;
        return r42;
    L7:
        return r5;
    L9:
        if (this.f38850e != null) goto L12;
        Log.e("SecurityResourcesReader", "KEY is null return def directly");
        return r5;
    L12:
        Object r02 = this.d;
        monitor-enter(r02);
        String r1 = (String) this.f38849c.get(r4);     // Catch: Throwable -> L18
        if (r1 == null) goto L20;
        monitor-exit(r02);     // Catch: Throwable -> L18
        return r1;
    L20:
        String r12 = b(r4);     // Catch: Throwable -> L18
        if (r12 != null) goto L24;
    L22:
        monitor-exit(r02);     // Catch: Throwable -> L18
        return r5;
    L24:
        r5 = this.f38850e.a(r12, r5);     // Catch: Throwable -> L18
        this.f38849c.put(r4, r5);     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        throw th;
    }

    public final String b(String r2) {
        return super.a(r2, null);
    }

    public String toString() {
        return "SecurityResourcesReader{mKey=, encrypt=" + this.f38851f + '}';
    }
}
