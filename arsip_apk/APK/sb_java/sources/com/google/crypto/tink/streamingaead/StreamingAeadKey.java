package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.Key;
import com.google.crypto.tink.Parameters;

/* loaded from: classes6.dex */
public abstract class StreamingAeadKey extends Key {
    public StreamingAeadKey() {
    }

    @Override // com.google.crypto.tink.Key
    public final Integer getIdRequirementOrNull() {
        return null;
    }

    @Override // com.google.crypto.tink.Key
    public /* bridge */ /* synthetic */ Parameters getParameters() {
        return getParameters();
    }

    @Override // com.google.crypto.tink.Key
    public abstract StreamingAeadParameters getParameters();
}
