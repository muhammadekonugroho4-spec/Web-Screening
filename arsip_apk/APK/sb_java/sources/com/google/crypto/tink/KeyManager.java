package com.google.crypto.tink;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public interface KeyManager<P> {
    boolean doesSupport(String r1);

    String getKeyType();

    P getPrimitive(ByteString r1) throws GeneralSecurityException;

    P getPrimitive(MessageLite r1) throws GeneralSecurityException;

    Class<P> getPrimitiveClass();

    int getVersion();

    MessageLite newKey(ByteString r1) throws GeneralSecurityException;

    MessageLite newKey(MessageLite r1) throws GeneralSecurityException;

    KeyData newKeyData(ByteString r1) throws GeneralSecurityException;
}
