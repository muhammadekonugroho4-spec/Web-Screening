package com.google.crypto.tink.subtle;

import com.google.common.primitives.UnsignedBytes;
import com.google.crypto.tink.KeyWrap;
import com.google.firebase.perf.util.Constants;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

@Deprecated
/* loaded from: classes6.dex */
public class Kwp implements KeyWrap {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int MAX_WRAP_KEY_SIZE = 4096;
    static final int MIN_WRAP_KEY_SIZE = 16;
    static final byte[] PREFIX = null;
    static final int ROUNDS = 6;
    private final SecretKey aesKey;

    static {
        PREFIX = new byte[]{-90, 89, 89, -90};
    }

    public Kwp(byte[] r3) throws GeneralSecurityException {
        if (r3.length != 16) goto L5;
    L9:
        this.aesKey = new SecretKeySpec(r3, "AES");
        return;
    L5:
        if (r3.length == 32) goto L9;
        throw new GeneralSecurityException("Unsupported key length");
    }

    private byte[] computeW(byte[] r17, byte[] r18) throws GeneralSecurityException {
        if (r18.length <= 8) goto L22;
        if (r18.length > 2147483631) goto L22;
        if (r17.length != 8) goto L22;
        int r3 = wrappingSize(r18.length);
        byte[] r5 = new byte[r3];
        System.arraycopy(r17, 0, r5, 0, r17.length);
        System.arraycopy(r18, 0, r5, 8, r18.length);
        int r1 = 1;
        int r32 = (r3 / 8) - 1;
        Cipher r2 = EngineFactory.CIPHER.getInstance("AES/ECB/NoPadding");
        r2.init(1, this.aesKey);
        byte[] r8 = new byte[16];
        System.arraycopy(r5, 0, r8, 0, 8);
        int r9 = 0;
    L10:
        if (r9 >= 6) goto L19;
        int r10 = 0;
    L12:
        if (r10 >= r32) goto L18;
        int r11 = r10 + 1;
        int r12 = r11 * 8;
        System.arraycopy(r5, r12, r8, 8, 8);
        r2.doFinal(r8, 0, 16, r8);
        int r13 = ((r9 * r32) + r10) + r1;
        int r102 = 0;
    L15:
        if (r102 >= 4) goto L17;
        int r14 = 7 - r102;
        r8[r14] = (byte) (((byte) (r13 & Constants.MAX_HOST_LENGTH)) ^ r8[r14]);
        r13 = r13 >>> 8;
        r102 = r102 + 1;
        goto L15
    L17:
        System.arraycopy(r8, 8, r5, r12, 8);
        r10 = r11;
        r1 = 1;
        goto L12
    L18:
        r9 = r9 + 1;
        r1 = 1;
        goto L10
    L19:
        System.arraycopy(r8, 0, r5, 0, 8);
        return r5;
    L22:
        throw new GeneralSecurityException("computeW called with invalid parameters");
    }

    private byte[] invertW(byte[] r18) throws GeneralSecurityException {
        if (r18.length < 24) goto L19;
        if ((r18.length % 8) != 0) goto L19;
        byte[] r02 = Arrays.copyOf(r18, r18.length);
        int r1 = r02.length / 8;
        int r3 = r1 - 1;
        Cipher r4 = EngineFactory.CIPHER.getInstance("AES/ECB/NoPadding");
        r4.init(2, this.aesKey);
        byte[] r8 = new byte[16];
        System.arraycopy(r02, 0, r8, 0, 8);
        int r10 = 5;
    L7:
        if (r10 < 0) goto L16;
        int r11 = r1 - 2;
    L9:
        if (r11 < 0) goto L15;
        int r12 = (r11 + 1) * 8;
        System.arraycopy(r02, r12, r8, 8, 8);
        int r13 = ((r10 * r3) + r11) + 1;
        int r14 = 0;
    L12:
        if (r14 >= 4) goto L14;
        int r15 = 7 - r14;
        r8[r15] = (byte) (r8[r15] ^ ((byte) (r13 & Constants.MAX_HOST_LENGTH)));
        r13 = r13 >>> 8;
        r14 = r14 + 1;
        goto L12
    L14:
        r4.doFinal(r8, 0, 16, r8);
        System.arraycopy(r8, 8, r02, r12, 8);
        r11 = r11 - 1;
        goto L9
    L15:
        r10 = r10 - 1;
        goto L7
    L16:
        System.arraycopy(r8, 0, r02, 0, 8);
        return r02;
    L19:
        throw new GeneralSecurityException("Incorrect data size");
    }

    private int wrappingSize(int r2) {
        return (r2 + (7 - ((r2 + 7) % 8))) + 8;
    }

    @Override // com.google.crypto.tink.KeyWrap
    public byte[] unwrap(byte[] r7) throws GeneralSecurityException {
        if (r7.length < wrappingSize(16)) goto L39;
        if (r7.length > wrappingSize(4096)) goto L37;
        if ((r7.length % 8) != 0) goto L35;
        byte[] r72 = invertW(r7);
        boolean r02 = true;
        boolean r2 = false;
        int r3 = 0;
    L9:
        int r4 = 4;
        if (r3 >= 4) goto L15;
        if (PREFIX[r3] == r72[r3]) goto L14;
        r02 = false;
    L14:
        r3 = r3 + 1;
        goto L9
    L15:
        int r32 = 0;
    L16:
        if (r4 >= 8) goto L19;
        r32 = (r32 << 8) + (r72[r4] & UnsignedBytes.MAX_VALUE);
        r4 = r4 + 1;
        goto L16
    L19:
        if (wrappingSize(r32) != r72.length) goto L29;
        int r42 = r32 + 8;
    L23:
        if (r42 >= r72.length) goto L28;
        if (r72[r42] == 0) goto L27;
        r02 = false;
    L27:
        r42 = r42 + 1;
        goto L23
    L28:
        r2 = r02;
    L29:
        if (r2 == false) goto L33;
        return Arrays.copyOfRange(r72, 8, r32 + 8);
    L33:
        throw new BadPaddingException("Invalid padding");
    L35:
        throw new GeneralSecurityException("Wrapped key size must be a multiple of 8 bytes");
    L37:
        throw new GeneralSecurityException("Wrapped key size is too large");
    L39:
        throw new GeneralSecurityException("Wrapped key size is too small");
    }

    @Override // com.google.crypto.tink.KeyWrap
    public byte[] wrap(byte[] r7) throws GeneralSecurityException {
        if (r7.length < 16) goto L15;
        if (r7.length > 4096) goto L13;
        byte[] r1 = new byte[8];
        byte[] r2 = PREFIX;
        int r4 = 0;
        System.arraycopy(r2, 0, r1, 0, r2.length);
    L8:
        if (r4 >= 4) goto L11;
        r1[r4 + 4] = (byte) ((r7.length >> ((3 - r4) * 8)) & Constants.MAX_HOST_LENGTH);
        r4 = r4 + 1;
        goto L8
    L11:
        return computeW(r1, r7);
    L13:
        throw new GeneralSecurityException("Key size of key to wrap too large");
    L15:
        throw new GeneralSecurityException("Key size of key to wrap too small");
    }
}
