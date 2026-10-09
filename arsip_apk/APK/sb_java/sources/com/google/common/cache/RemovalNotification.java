package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.AbstractMap;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes5.dex */
public final class RemovalNotification<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {
    private static final long serialVersionUID = 0;
    private final RemovalCause cause;

    private RemovalNotification(K r1, V r2, RemovalCause r3) {
        super(r1, r2);
        this.cause = (RemovalCause) Preconditions.checkNotNull(r3);
    }

    public static <K, V> RemovalNotification<K, V> create(K r1, V r2, RemovalCause r3) {
        return new RemovalNotification(r1, r2, r3);
    }

    public RemovalCause getCause() {
        return this.cause;
    }

    public boolean wasEvicted() {
        return this.cause.wasEvicted();
    }
}
