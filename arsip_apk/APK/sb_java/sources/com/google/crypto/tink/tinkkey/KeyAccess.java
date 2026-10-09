package com.google.crypto.tink.tinkkey;

import com.google.errorprone.annotations.Immutable;

@Immutable
/* loaded from: classes6.dex */
public final class KeyAccess {
    private final boolean canAccessSecret;

    private KeyAccess(boolean r1) {
        this.canAccessSecret = r1;
    }

    public static KeyAccess publicAccess() {
        return new KeyAccess(false);
    }

    public static KeyAccess secretAccess() {
        return new KeyAccess(true);
    }

    public boolean canAccessSecret() {
        return this.canAccessSecret;
    }
}
