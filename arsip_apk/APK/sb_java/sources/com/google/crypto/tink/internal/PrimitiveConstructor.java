package com.google.crypto.tink.internal;

import com.google.crypto.tink.Key;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public abstract class PrimitiveConstructor<KeyT extends Key, PrimitiveT> {
    private final Class<KeyT> keyClass;
    private final Class<PrimitiveT> primitiveClass;

    public interface PrimitiveConstructionFunction<KeyT extends Key, PrimitiveT> {
        PrimitiveT constructPrimitive(KeyT r1) throws GeneralSecurityException;
    }

    public /* synthetic */ PrimitiveConstructor(Class r1, Class r2, AnonymousClass1 r3) {
        this(r1, r2);
    }

    public static <KeyT extends Key, PrimitiveT> PrimitiveConstructor<KeyT, PrimitiveT> create(final PrimitiveConstructionFunction<KeyT, PrimitiveT> r1, final Class<KeyT> r2, final Class<PrimitiveT> r3) {
        return (PrimitiveConstructor<KeyT, PrimitiveT>) new AnonymousClass1(r2, r3, r1);
    }

    public abstract PrimitiveT constructPrimitive(KeyT r1) throws GeneralSecurityException;

    public Class<KeyT> getKeyClass() {
        return this.keyClass;
    }

    public Class<PrimitiveT> getPrimitiveClass() {
        return this.primitiveClass;
    }

    private PrimitiveConstructor(Class<KeyT> r1, Class<PrimitiveT> r2) {
        this.keyClass = r1;
        this.primitiveClass = r2;
    }
}
