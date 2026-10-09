package com.google.crypto.tink.tinkkey;

import com.google.errorprone.annotations.Immutable;

@Immutable
/* loaded from: classes6.dex */
public final class SecretKeyAccess {
    private SecretKeyAccess() {
    }

    public static KeyAccess insecureSecretAccess() {
        return KeyAccess.secretAccess();
    }
}
