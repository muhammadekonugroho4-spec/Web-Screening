package com.google.android.gms.internal.fido;

import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* loaded from: classes5.dex */
public final class zzdu implements Closeable, AutoCloseable {
    private final InputStream zza;
    private zzdt zzb;
    private final byte[] zzc;
    private final zzdv zzd;

    public zzdu(InputStream r2) {
        this.zzc = new byte[8];
        this.zzd = zzdv.zza();
        this.zza = r2;
    }

    private final long zzh() throws IOException {
        if (this.zzb.zza() >= 24) goto L7;
        long r3 = this.zzb.zza();
        this.zzb = null;
        return r3;
    L7:
        if (this.zzb.zza() != 24) goto L15;
        int r1 = this.zza.read();
        if (r1 == (-1)) goto L13;
        this.zzb = null;
        return r1 & 255;
    L13:
        throw new EOFException();
    L15:
        if (this.zzb.zza() != 25) goto L19;
        zzk(this.zzc, 2);
        byte[] r12 = this.zzc;
        return ((r12[0] & 255) << 8) | (r12[1] & 255);
    L19:
        if (this.zzb.zza() != 26) goto L23;
        zzk(this.zzc, 4);
        byte[] r13 = this.zzc;
        long r122 = r13[0];
        long r6 = r13[1];
        long r14 = r13[2];
        return (r13[3] & 255) | ((((r6 & 255) << 16) | ((r122 & 255) << 24)) | ((r14 & 255) << 8));
    L23:
        if (this.zzb.zza() != 27) goto L27;
        zzk(this.zzc, 8);
        byte[] r15 = this.zzc;
        long r132 = r15[0];
        long r62 = r15[1];
        long r32 = r15[2];
        long r8 = r15[3];
        long r5 = r15[4];
        long r7 = r15[5];
        long r9 = r15[6];
        return (r15[7] & 255) | (((((((r32 & 255) << 40) | (((r132 & 255) << 56) | ((r62 & 255) << 48))) | ((r8 & 255) << 32)) | ((r5 & 255) << 24)) | ((r7 & 255) << 16)) | ((r9 & 255) << 8));
    L27:
        throw new IOException(String.format("invalid additional information %s for major type %s", new Object[]{Byte.valueOf(this.zzb.zza()), Integer.valueOf(this.zzb.zzc())}));
    }

    private final void zzi() throws IOException {
        zzd();
        if (this.zzb.zza() == 31) goto L6;
        return;
    L6:
        throw new IllegalStateException(String.format("expected definite length but found %s", new Object[]{Byte.valueOf(this.zzb.zza())}));
    }

    private final void zzj(byte r3) throws IOException {
        zzd();
        if (this.zzb.zzb() != r3) goto L6;
        return;
    L6:
        throw new IllegalStateException(String.format("expected major type %s but found %s", new Object[]{Integer.valueOf((r3 >> 5) & 7), Integer.valueOf(this.zzb.zzc())}));
    }

    private final void zzk(byte[] r4, int r5) throws IOException {
        int r02 = 0;
    L3:
        if (r02 == r5) goto L9;
        int r1 = this.zza.read(r4, r02, r5 - r02);
        if (r1 == (-1)) goto L8;
        r02 = r02 + r1;
        goto L3
    L8:
        throw new EOFException();
    L9:
        this.zzb = null;
    }

    private final byte[] zzl() throws IOException {
        zzi();
        long r02 = zzh();
        if (r02 < 0) goto L13;
        if (r02 > 2147483647L) goto L13;
        if (this.zza.available() < r02) goto L11;
        int r03 = (int) r02;
        byte[] r1 = new byte[r03];
        zzk(r1, r03);
        return r1;
    L11:
        throw new EOFException();
    L13:
        throw new UnsupportedOperationException(String.format("the maximum supported byte/text string length is %s bytes", new Object[]{Integer.MAX_VALUE}));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.close();
        this.zzd.zzb();
    }

    public final long zza() throws IOException {
        zzj(UnsignedBytes.MAX_POWER_OF_TWO);
        zzi();
        long r02 = zzh();
        if (r02 < 0) goto L8;
        if (r02 <= 0) goto L6;
        this.zzd.zzg(r02);
    L6:
        return r02;
    L8:
        throw new UnsupportedOperationException(String.format("the maximum supported array length is %s", new Object[]{Long.MAX_VALUE}));
    }

    public final long zzb() throws IOException {
        zzd();
        if (this.zzb.zzb() != 0) goto L6;
        boolean r02 = true;
    L8:
        long r1 = zzh();
        if (r1 < 0) goto L15;
        if (r02 == false) goto L13;
        return r1;
    L13:
        return ~r1;
    L15:
        throw new UnsupportedOperationException(String.format("the maximum supported unsigned/negative integer is %s", new Object[]{Long.MAX_VALUE}));
    L6:
        if (this.zzb.zzb() != 32) goto L17;
        r02 = false;
        goto L8
    L17:
        throw new IllegalStateException(String.format("expected major type 0 or 1 but found %s", new Object[]{Integer.valueOf(this.zzb.zzc())}));
    }

    public final long zzc() throws IOException {
        zzj((byte) -96);
        zzi();
        long r02 = zzh();
        if (r02 < 0) goto L10;
        if (r02 > 4611686018427387903L) goto L10;
        if (r02 <= 0) goto L8;
        this.zzd.zzg(r02 + r02);
    L8:
        return r02;
    L10:
        throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
    }

    public final zzdt zzd() throws IOException {
        if (this.zzb != null) goto L33;
        int r02 = this.zza.read();
        if (r02 != (-1)) goto L8;
        this.zzd.zzb();
        return null;
    L8:
        zzdt r1 = new zzdt(r02);
        this.zzb = r1;
        byte r03 = r1.zzb();
        if (r03 != Byte.MIN_VALUE) goto L11;
    L30:
        this.zzd.zzd();
    L31:
        this.zzd.zzf();
        goto L33
    L11:
        if (r03 == (-96)) goto L30;
        if (r03 == (-64)) goto L30;
        if (r03 == (-32)) goto L28;
        if (r03 == 0) goto L30;
        if (r03 == 32) goto L30;
        if (r03 != 64) goto L22;
        this.zzd.zze(-1);
        goto L31
    L22:
        if (r03 != 96) goto L25;
        this.zzd.zze(-2);
        goto L31
    L25:
        throw new IllegalStateException(String.format("invalid major type: %s", new Object[]{Integer.valueOf(this.zzb.zzc())}));
    L28:
        if (this.zzb.zza() != 31) goto L30;
        this.zzd.zzc();
    L33:
        return this.zzb;
    }

    public final String zze() throws IOException {
        zzj((byte) 96);
        return new String(zzl(), StandardCharsets.UTF_8);
    }

    public final boolean zzf() throws IOException {
        zzj((byte) -32);
        if (this.zzb.zza() > 24) goto L14;
        int r02 = (int) zzh();
        if (r02 != 20) goto L8;
        return false;
    L8:
        if (r02 != 21) goto L12;
        return true;
    L12:
        throw new IllegalStateException(String.format("expected FALSE or TRUE", new Object[0]));
    L14:
        throw new IllegalStateException("expected simple value");
    }

    public final byte[] zzg() throws IOException {
        zzj(SignedBytes.MAX_POWER_OF_TWO);
        return zzl();
    }
}
