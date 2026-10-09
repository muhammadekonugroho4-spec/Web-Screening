package androidx.camera.core.internal.utils;

import android.util.Size;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Size f5720a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final Size f5721b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final Size f5722c = null;
    public static final Size d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final Size f5723e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final Size f5724f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final Size f5725g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final Size f5726h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final Size f5727i = null;

    static {
        f5720a = new Size(0, 0);
        f5721b = new Size(320, 240);
        f5722c = new Size(640, 480);
        d = new Size(720, 480);
        f5723e = new Size(1280, 720);
        f5724f = new Size(1920, 1080);
        f5725g = new Size(1920, 1440);
        f5726h = new Size(2560, 1440);
        f5727i = new Size(3840, 2160);
    }

    public static int a(int r02, int r1) {
        return r02 * r1;
    }

    public static int b(Size r1) {
        return a(r1.getWidth(), r1.getHeight());
    }

    public static boolean c(Size r02, Size r1) {
        if (b(r02) >= b(r1)) goto L6;
        return true;
    L6:
        return false;
    }
}
