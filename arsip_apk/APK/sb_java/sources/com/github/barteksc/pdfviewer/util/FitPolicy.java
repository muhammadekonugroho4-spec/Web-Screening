package com.github.barteksc.pdfviewer.util;

/* loaded from: classes4.dex */
public enum FitPolicy extends Enum<FitPolicy> {
    public static final FitPolicy BOTH = null;
    public static final FitPolicy HEIGHT = null;
    public static final FitPolicy WIDTH = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FitPolicy[] f37533a = null;

    static {
        WIDTH = new FitPolicy("WIDTH", 0);
        HEIGHT = new FitPolicy("HEIGHT", 1);
        BOTH = new FitPolicy("BOTH", 2);
        f37533a = a();
    }

    FitPolicy(String r1, int r2) {
    }

    public static /* synthetic */ FitPolicy[] a() {
        return new FitPolicy[]{WIDTH, HEIGHT, BOTH};
    }

    public static FitPolicy valueOf(String r1) {
        return (FitPolicy) Enum.valueOf(FitPolicy.class, r1);
    }

    public static FitPolicy[] values() {
        return (FitPolicy[]) f37533a.clone();
    }
}
