package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes5.dex */
public enum FileWriteMode extends Enum<FileWriteMode> {
    private static final /* synthetic */ FileWriteMode[] $VALUES = null;
    public static final FileWriteMode APPEND = null;

    private static /* synthetic */ FileWriteMode[] $values() {
        return new FileWriteMode[]{APPEND};
    }

    static {
        APPEND = new FileWriteMode("APPEND", 0);
        $VALUES = $values();
    }

    FileWriteMode(String r1, int r2) {
    }

    public static FileWriteMode valueOf(String r1) {
        return (FileWriteMode) Enum.valueOf(FileWriteMode.class, r1);
    }

    public static FileWriteMode[] values() {
        return (FileWriteMode[]) $VALUES.clone();
    }
}
