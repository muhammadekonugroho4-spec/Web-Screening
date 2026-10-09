package com.google.crypto.tink.jwt;

import com.google.crypto.tink.Key;
import com.google.crypto.tink.Parameters;
import java.util.Optional;

/* loaded from: classes6.dex */
public abstract class JwtMacKey extends Key {
    public JwtMacKey() {
    }

    public abstract Optional<String> getKid();

    @Override // com.google.crypto.tink.Key
    public /* bridge */ /* synthetic */ Parameters getParameters() {
        return getParameters();
    }

    @Override // com.google.crypto.tink.Key
    public abstract JwtMacParameters getParameters();
}
