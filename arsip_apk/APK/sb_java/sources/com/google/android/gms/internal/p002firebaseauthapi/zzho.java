package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzij;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* loaded from: classes5.dex */
abstract class zzho {
    private static final zzij.zza zza = null;
    private final zzhm zzb;
    private final zzhm zzc;

    static {
        zza = zzij.zza.zza;
    }

    public zzho(byte[] r2) throws GeneralSecurityException {
        if (zza.zza() == false) goto L7;
        this.zzb = zza(r2, 1);
        this.zzc = zza(r2, 0);
        return;
    L7:
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public abstract zzhm zza(byte[] r1, int r2) throws InvalidKeyException;

    public void zza(ByteBuffer r3, byte[] r4, byte[] r5, byte[] r6) throws GeneralSecurityException {
        if (r3.remaining() < (r5.length + 16)) goto L10;
        int r02 = r3.position();
        this.zzb.zza(r3, r4, r5);
        r3.position(r02);
        r3.limit(r3.limit() - 16);
        if (r6 != null) goto L7;
        r6 = new byte[0];
    L7:
        byte[] r42 = zzhu.zza(zza(r4), zza(r6, r3));
        r3.limit(r3.limit() + 16);
        r3.put(r42);
        return;
    L10:
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    public byte[] zza(ByteBuffer r5, byte[] r6, byte[] r7) throws GeneralSecurityException {
        if (r5.remaining() < 16) goto L17;
        int r02 = r5.position();
        byte[] r2 = new byte[16];
        r5.position(r5.limit() - 16);
        r5.get(r2);
        r5.position(r02);
        r5.limit(r5.limit() - 16);
        if (r7 != null) goto L18;
        r7 = new byte[0];
    L18:
    L13:
        e = move-exception;
        throw new AEADBadTagException(e.toString());
    L8:
        if (MessageDigest.isEqual(zzhu.zza(zza(r6), zza(r7, r5)), r2) == false) goto L12;
        r5.position(r02);
        return this.zzb.zza(r6, r5);
    L12:
        throw new GeneralSecurityException("invalid MAC");     // Catch: GeneralSecurityException -> L13
    L17:
        throw new GeneralSecurityException("ciphertext too short");
    }

    public byte[] zza(byte[] r1, byte[] r2, byte[] r3) throws GeneralSecurityException {
        return zza(ByteBuffer.wrap(r2), r1, r3);
    }

    private final byte[] zza(byte[] r3) throws GeneralSecurityException {
        ByteBuffer r32 = this.zzc.zza(r3, 0);
        byte[] r02 = new byte[32];
        r32.get(r02);
        return r02;
    }

    private static byte[] zza(byte[] r5, ByteBuffer r6) {
        if ((r5.length % 16) != 0) goto L5;
        int r02 = r5.length;
    L6:
        int r1 = r6.remaining();
        int r2 = r1 % 16;
        if (r2 != 0) goto L9;
        int r3 = r1;
    L10:
        int r32 = r3 + r02;
        ByteBuffer r22 = ByteBuffer.allocate(r32 + 16).order(ByteOrder.LITTLE_ENDIAN);
        r22.put(r5);
        r22.position(r02);
        r22.put(r6);
        r22.position(r32);
        r22.putLong(r5.length);
        r22.putLong(r1);
        return r22.array();
    L9:
        r3 = (r1 + 16) - r2;
        goto L10
    L5:
        r02 = (r5.length + 16) - (r5.length % 16);
        goto L6
    }
}
