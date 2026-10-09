package com.google.crypto.tink.prf;

import com.google.crypto.tink.Key;
import com.google.crypto.tink.Parameters;

/* loaded from: classes6.dex */
public abstract class PrfKey extends Key {
    public PrfKey() {
    }

    @Override // com.google.crypto.tink.Key
    public /* bridge */ /* synthetic */ Parameters getParameters() {
        return getParameters();
    }

    @Override // com.google.crypto.tink.Key
    public abstract PrfParameters getParameters();
}
