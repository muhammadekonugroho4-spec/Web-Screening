package com.google.zxing.pdf417.encoder;

/* loaded from: classes6.dex */
public enum Compaction extends Enum<Compaction> {
    private static final /* synthetic */ Compaction[] $VALUES = null;
    public static final Compaction AUTO = null;
    public static final Compaction BYTE = null;
    public static final Compaction NUMERIC = null;
    public static final Compaction TEXT = null;

    static {
        Compaction r02 = new Compaction("AUTO", 0);
        AUTO = r02;
        Compaction r1 = new Compaction("TEXT", 1);
        TEXT = r1;
        Compaction r2 = new Compaction("BYTE", 2);
        BYTE = r2;
        Compaction r3 = new Compaction("NUMERIC", 3);
        NUMERIC = r3;
        $VALUES = new Compaction[]{r02, r1, r2, r3};
    }

    Compaction(String r1, int r2) {
    }

    public static Compaction valueOf(String r1) {
        return (Compaction) Enum.valueOf(Compaction.class, r1);
    }

    public static Compaction[] values() {
        return (Compaction[]) $VALUES.clone();
    }
}
