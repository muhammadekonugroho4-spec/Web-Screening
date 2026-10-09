package org.greenrobot.eventbus;

/* loaded from: classes3.dex */
public enum ThreadMode extends Enum<ThreadMode> {
    private static final /* synthetic */ ThreadMode[] $VALUES = null;
    public static final ThreadMode ASYNC = null;
    public static final ThreadMode BACKGROUND = null;
    public static final ThreadMode MAIN = null;
    public static final ThreadMode MAIN_ORDERED = null;
    public static final ThreadMode POSTING = null;

    static {
        ThreadMode r02 = new ThreadMode("POSTING", 0);
        POSTING = r02;
        ThreadMode r1 = new ThreadMode("MAIN", 1);
        MAIN = r1;
        ThreadMode r2 = new ThreadMode("MAIN_ORDERED", 2);
        MAIN_ORDERED = r2;
        ThreadMode r3 = new ThreadMode("BACKGROUND", 3);
        BACKGROUND = r3;
        ThreadMode r4 = new ThreadMode("ASYNC", 4);
        ASYNC = r4;
        $VALUES = new ThreadMode[]{r02, r1, r2, r3, r4};
    }

    ThreadMode(String r1, int r2) {
    }

    public static ThreadMode valueOf(String r1) {
        return (ThreadMode) Enum.valueOf(ThreadMode.class, r1);
    }

    public static ThreadMode[] values() {
        return (ThreadMode[]) $VALUES.clone();
    }
}
