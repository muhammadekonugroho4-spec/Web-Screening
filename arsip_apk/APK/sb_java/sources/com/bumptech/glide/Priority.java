package com.bumptech.glide;

/* loaded from: classes4.dex */
public enum Priority extends Enum<Priority> {
    public static final Priority HIGH = null;
    public static final Priority IMMEDIATE = null;
    public static final Priority LOW = null;
    public static final Priority NORMAL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Priority[] f32376a = null;

    static {
        Priority r02 = new Priority("IMMEDIATE", 0);
        IMMEDIATE = r02;
        Priority r1 = new Priority("HIGH", 1);
        HIGH = r1;
        Priority r2 = new Priority("NORMAL", 2);
        NORMAL = r2;
        Priority r3 = new Priority("LOW", 3);
        LOW = r3;
        f32376a = new Priority[]{r02, r1, r2, r3};
    }

    Priority(String r1, int r2) {
    }

    public static Priority valueOf(String r1) {
        return (Priority) Enum.valueOf(Priority.class, r1);
    }

    public static Priority[] values() {
        return (Priority[]) f32376a.clone();
    }
}
