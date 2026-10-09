package com.google.crypto.tink;

import com.google.crypto.tink.annotations.Alpha;
import com.google.errorprone.annotations.Immutable;

@Immutable
@Alpha
/* loaded from: classes6.dex */
public abstract class Key {
    public Key() {
    }

    public abstract boolean equalsKey(Key r1);

    public abstract Integer getIdRequirementOrNull();

    public abstract Parameters getParameters();
}
