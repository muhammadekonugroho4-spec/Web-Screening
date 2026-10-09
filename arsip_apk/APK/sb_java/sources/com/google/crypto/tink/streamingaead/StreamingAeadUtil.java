package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.proto.HashType;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes6.dex */
final class StreamingAeadUtil {

    /* renamed from: com.google.crypto.tink.streamingaead.StreamingAeadUtil$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType = null;

        static {
            int[] r02 = new int[HashType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$HashType = r02;
            r02[HashType.SHA1.ordinal()] = 1;     // Catch: NoSuchFieldError -> L9
        L14:
            $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA224.ordinal()] = 2;     // Catch: NoSuchFieldError -> L10
        L18:
            $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA256.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L22:
            $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA384.ordinal()] = 4;     // Catch: NoSuchFieldError -> L12
        L16:
            $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA512.ordinal()] = 5;     // Catch: NoSuchFieldError -> L13
            return;
        }
    }

    private StreamingAeadUtil() {
    }

    public static String toHmacAlgo(HashType r3) throws NoSuchAlgorithmException {
        int r02 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType[r3.ordinal()];
        if (r02 != 1) goto L5;
        return "HmacSha1";
    L5:
        if (r02 != 2) goto L7;
        return "HmacSha224";
    L7:
        if (r02 != 3) goto L9;
        return "HmacSha256";
    L9:
        if (r02 != 4) goto L11;
        return "HmacSha384";
    L11:
        if (r02 != 5) goto L15;
        return "HmacSha512";
    L15:
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: " + r3);
    }
}
