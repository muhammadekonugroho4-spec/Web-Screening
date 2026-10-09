package com.google.crypto.tink.internal;

import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public abstract class PrimitiveFactory<PrimitiveT, KeyProtoT extends MessageLite> {
    private final Class<PrimitiveT> clazz;

    public PrimitiveFactory(Class<PrimitiveT> r1) {
        this.clazz = r1;
    }

    public abstract PrimitiveT getPrimitive(KeyProtoT r1) throws GeneralSecurityException;

    public final Class<PrimitiveT> getPrimitiveClass() {
        return this.clazz;
    }
}
