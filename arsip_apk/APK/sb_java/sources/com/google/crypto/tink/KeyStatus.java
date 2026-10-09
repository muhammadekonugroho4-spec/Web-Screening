package com.google.crypto.tink;

import com.google.crypto.tink.annotations.Alpha;
import com.google.errorprone.annotations.Immutable;

@Immutable
@Alpha
/* loaded from: classes6.dex */
public final class KeyStatus {
    public static final KeyStatus DESTROYED = null;
    public static final KeyStatus DISABLED = null;
    public static final KeyStatus ENABLED = null;
    private final String name;

    static {
        ENABLED = new KeyStatus("ENABLED");
        DISABLED = new KeyStatus("DISABLED");
        DESTROYED = new KeyStatus("DESTROYED");
    }

    private KeyStatus(String r1) {
        this.name = r1;
    }

    public String toString() {
        return this.name;
    }
}
