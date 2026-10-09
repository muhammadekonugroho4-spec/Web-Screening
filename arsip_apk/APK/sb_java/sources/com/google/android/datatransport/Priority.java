package com.google.android.datatransport;

/* loaded from: classes4.dex */
public enum Priority extends Enum<Priority> {
    private static final /* synthetic */ Priority[] $VALUES = null;
    public static final Priority DEFAULT = null;
    public static final Priority HIGHEST = null;
    public static final Priority VERY_LOW = null;

    static {
        Priority r02 = new Priority("DEFAULT", 0);
        DEFAULT = r02;
        Priority r1 = new Priority("VERY_LOW", 1);
        VERY_LOW = r1;
        Priority r2 = new Priority("HIGHEST", 2);
        HIGHEST = r2;
        $VALUES = new Priority[]{r02, r1, r2};
    }

    Priority(String r1, int r2) {
    }

    public static Priority valueOf(String r1) {
        return (Priority) Enum.valueOf(Priority.class, r1);
    }

    public static Priority[] values() {
        return (Priority[]) $VALUES.clone();
    }
}
