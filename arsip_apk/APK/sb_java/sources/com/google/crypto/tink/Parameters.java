package com.google.crypto.tink;

import com.google.crypto.tink.annotations.Alpha;
import com.google.errorprone.annotations.Immutable;

@Immutable
@Alpha
/* loaded from: classes6.dex */
public abstract class Parameters {
    public Parameters() {
    }

    public abstract boolean hasIdRequirement();
}
