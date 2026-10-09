package com.stockbit.lib.security.threatdetector;

import java.io.File;
import kotlin.Pair;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f120518a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f120519b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f120520c = null;
    public static final String[] d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f120521e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f120522f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final int f120523g = 0;

    static {
        f120518a = new c();
        f120519b = new String[]{"/dev/socket/genyd", "/dev/socket/baseband_genyd"};
        f120520c = new String[]{"/dev/socket/qemud", "/dev/qemu_pipe"};
        d = new String[]{"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"};
        f120521e = new String[]{"fstab.andy", "ueventd.andy.rc"};
        f120522f = new String[]{"fstab.nox", "init.nox.rc", "ueventd.nox.rc"};
        f120523g = 8;
    }

    public c() {
    }

    public final Pair a(String[] r5) {
        int r02 = r5.length;
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L10;
        String r2 = r5[r1];
        if (new File(r2).exists() == true) goto L7;
        r1 = r1 + 1;
        goto L3
    L7:
        return new Pair(Boolean.TRUE, r2);
    L10:
        return new Pair(Boolean.FALSE, null);
    }

    public final Pair b() {
        Pair r02 = a(f120519b);
        if (((Boolean) r02.e()).booleanValue() == false) goto L5;
        return r02;
    L5:
        Pair r03 = a(f120521e);
        if (((Boolean) r03.e()).booleanValue() == false) goto L8;
        return r03;
    L8:
        Pair r04 = a(f120522f);
        if (((Boolean) r04.e()).booleanValue() == false) goto L11;
        return r04;
    L11:
        Pair r05 = a(d);
        if (((Boolean) r05.e()).booleanValue() == false) goto L14;
        return r05;
    L14:
        Pair r06 = a(f120520c);
        if (((Boolean) r06.e()).booleanValue() == false) goto L18;
        return r06;
    L18:
        return new Pair(Boolean.FALSE, null);
    }
}
