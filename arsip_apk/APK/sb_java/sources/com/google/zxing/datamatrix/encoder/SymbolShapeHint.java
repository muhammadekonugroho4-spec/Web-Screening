package com.google.zxing.datamatrix.encoder;

/* loaded from: classes6.dex */
public enum SymbolShapeHint extends Enum<SymbolShapeHint> {
    private static final /* synthetic */ SymbolShapeHint[] $VALUES = null;
    public static final SymbolShapeHint FORCE_NONE = null;
    public static final SymbolShapeHint FORCE_RECTANGLE = null;
    public static final SymbolShapeHint FORCE_SQUARE = null;

    static {
        SymbolShapeHint r02 = new SymbolShapeHint("FORCE_NONE", 0);
        FORCE_NONE = r02;
        SymbolShapeHint r1 = new SymbolShapeHint("FORCE_SQUARE", 1);
        FORCE_SQUARE = r1;
        SymbolShapeHint r2 = new SymbolShapeHint("FORCE_RECTANGLE", 2);
        FORCE_RECTANGLE = r2;
        $VALUES = new SymbolShapeHint[]{r02, r1, r2};
    }

    SymbolShapeHint(String r1, int r2) {
    }

    public static SymbolShapeHint valueOf(String r1) {
        return (SymbolShapeHint) Enum.valueOf(SymbolShapeHint.class, r1);
    }

    public static SymbolShapeHint[] values() {
        return (SymbolShapeHint[]) $VALUES.clone();
    }
}
