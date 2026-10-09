package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.Parameters;

/* loaded from: classes6.dex */
public abstract class StreamingAeadParameters extends Parameters {
    public StreamingAeadParameters() {
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return false;
    }
}
