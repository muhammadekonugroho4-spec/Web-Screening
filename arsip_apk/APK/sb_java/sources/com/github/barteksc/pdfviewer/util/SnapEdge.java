package com.github.barteksc.pdfviewer.util;

/* loaded from: classes4.dex */
public enum SnapEdge extends Enum<SnapEdge> {
    public static final SnapEdge CENTER = null;
    public static final SnapEdge END = null;
    public static final SnapEdge NONE = null;
    public static final SnapEdge START = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SnapEdge[] f37534a = null;

    static {
        START = new SnapEdge("START", 0);
        CENTER = new SnapEdge("CENTER", 1);
        END = new SnapEdge("END", 2);
        NONE = new SnapEdge("NONE", 3);
        f37534a = a();
    }

    SnapEdge(String r1, int r2) {
    }

    public static /* synthetic */ SnapEdge[] a() {
        return new SnapEdge[]{START, CENTER, END, NONE};
    }

    public static SnapEdge valueOf(String r1) {
        return (SnapEdge) Enum.valueOf(SnapEdge.class, r1);
    }

    public static SnapEdge[] values() {
        return (SnapEdge[]) f37534a.clone();
    }
}
