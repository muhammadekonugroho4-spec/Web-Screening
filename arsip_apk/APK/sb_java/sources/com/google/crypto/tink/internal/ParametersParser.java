package com.google.crypto.tink.internal;

import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.util.Bytes;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public abstract class ParametersParser<SerializationT extends Serialization> {
    private final Bytes objectIdentifier;
    private final Class<SerializationT> serializationClass;

    public interface ParametersParsingFunction<SerializationT extends Serialization> {
        Parameters parseParameters(SerializationT r1) throws GeneralSecurityException;
    }

    public /* synthetic */ ParametersParser(Bytes r1, Class r2, AnonymousClass1 r3) {
        this(r1, r2);
    }

    public static <SerializationT extends Serialization> ParametersParser<SerializationT> create(final ParametersParsingFunction<SerializationT> r1, final Bytes r2, final Class<SerializationT> r3) {
        return (ParametersParser<SerializationT>) new AnonymousClass1(r2, r3, r1);
    }

    public final Bytes getObjectIdentifier() {
        return this.objectIdentifier;
    }

    public final Class<SerializationT> getSerializationClass() {
        return this.serializationClass;
    }

    public abstract Parameters parseParameters(SerializationT r1) throws GeneralSecurityException;

    private ParametersParser(Bytes r1, Class<SerializationT> r2) {
        this.objectIdentifier = r1;
        this.serializationClass = r2;
    }
}
