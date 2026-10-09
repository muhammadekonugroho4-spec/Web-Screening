package com.getkeepsafe.relinker;

import android.os.Build;
import com.getkeepsafe.relinker.b;

/* loaded from: classes4.dex */
public final class d implements b.InterfaceC0389b {
    public d() {
    }

    @Override // com.getkeepsafe.relinker.b.InterfaceC0389b
    public String a(String r3) {
        return r3.substring(3, r3.length() - 3);
    }

    @Override // com.getkeepsafe.relinker.b.InterfaceC0389b
    public String[] b() {
        String[] r02 = Build.SUPPORTED_ABIS;
        if (r02.length <= 0) goto L5;
        return r02;
    L5:
        String r03 = Build.CPU_ABI2;
        if (e.a(r03) == true) goto L10;
        return new String[]{Build.CPU_ABI, r03};
    L10:
        return new String[]{Build.CPU_ABI};
    }

    @Override // com.getkeepsafe.relinker.b.InterfaceC0389b
    public void c(String r1) {
        System.load(r1);
    }

    @Override // com.getkeepsafe.relinker.b.InterfaceC0389b
    public void d(String r1) {
        System.loadLibrary(r1);
    }

    @Override // com.getkeepsafe.relinker.b.InterfaceC0389b
    public String e(String r2) {
        if (r2.startsWith("lib") == false) goto L8;
        if (r2.endsWith(".so") == false) goto L8;
        return r2;
    L8:
        return System.mapLibraryName(r2);
    }
}
