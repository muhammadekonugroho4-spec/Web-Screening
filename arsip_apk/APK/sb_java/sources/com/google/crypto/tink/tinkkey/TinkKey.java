package com.google.crypto.tink.tinkkey;

import com.google.crypto.tink.KeyTemplate;
import com.google.errorprone.annotations.Immutable;

@Immutable
/* loaded from: classes6.dex */
public interface TinkKey {
    KeyTemplate getKeyTemplate();

    boolean hasSecret();
}
