package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzdc extends zzcr {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzc zze;
    private final zza zzf;

    public static final class zza {
        public static final zza zza = null;
        public static final zza zzb = null;
        public static final zza zzc = null;
        public static final zza zzd = null;
        public static final zza zze = null;
        private final String zzf;

        static {
            zza = new zza("SHA1");
            zzb = new zza("SHA224");
            zzc = new zza("SHA256");
            zzd = new zza("SHA384");
            zze = new zza("SHA512");
        }

        private zza(String r1) {
            this.zzf = r1;
        }

        public final String toString() {
            return this.zzf;
        }
    }

    public static final class zzb {
        private Integer zza;
        private Integer zzb;
        private Integer zzc;
        private Integer zzd;
        private zza zze;
        private zzc zzf;

        public /* synthetic */ zzb(zzde r1) {
            this();
        }

        public final zzb zza(int r3) throws GeneralSecurityException {
            if (r3 != 16) goto L5;
        L11:
            this.zza = Integer.valueOf(r3);
            return this;
        L5:
            if (r3 == 24) goto L11;
            if (r3 == 32) goto L11;
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(r3)}));
        }

        public final zzb zzb(int r3) throws GeneralSecurityException {
            if (r3 < 16) goto L7;
            this.zzb = Integer.valueOf(r3);
            return this;
        L7:
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", new Object[]{Integer.valueOf(r3)}));
        }

        public final zzb zzc(int r3) throws GeneralSecurityException {
            if (r3 < 12) goto L9;
            if (r3 > 16) goto L9;
            this.zzc = Integer.valueOf(r3);
            return this;
        L9:
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", new Object[]{Integer.valueOf(r3)}));
        }

        public final zzb zzd(int r3) throws GeneralSecurityException {
            if (r3 < 10) goto L7;
            this.zzd = Integer.valueOf(r3);
            return this;
        L7:
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[]{Integer.valueOf(r3)}));
        }

        private zzb() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzf = zzc.zzc;
        }

        public final zzb zza(zza r1) {
            this.zze = r1;
            return this;
        }

        public final zzb zza(zzc r1) {
            this.zzf = r1;
            return this;
        }

        public final zzdc zza() throws GeneralSecurityException {
            if (this.zza == null) goto L63;
            if (this.zzb == null) goto L61;
            if (this.zzc == null) goto L59;
            Integer r02 = this.zzd;
            if (r02 == null) goto L57;
            if (this.zze == null) goto L55;
            if (this.zzf == null) goto L53;
            int r1 = r02.intValue();
            zza r2 = this.zze;
            if (r2 != zza.zza) goto L22;
            if (r1 <= 20) goto L47;
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[]{r02}));
        L47:
            return new zzdc(this.zza.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zzd.intValue(), this.zzf, this.zze, null);
        L22:
            if (r2 != zza.zzb) goto L29;
            if (r1 <= 28) goto L47;
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[]{r02}));
        L29:
            if (r2 != zza.zzc) goto L36;
            if (r1 <= 32) goto L47;
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[]{r02}));
        L36:
            if (r2 != zza.zzd) goto L43;
            if (r1 <= 48) goto L47;
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[]{r02}));
        L43:
            if (r2 != zza.zze) goto L51;
            if (r1 <= 64) goto L47;
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[]{r02}));
        L51:
            throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
        L53:
            throw new GeneralSecurityException("variant is not set");
        L55:
            throw new GeneralSecurityException("hash type is not set");
        L57:
            throw new GeneralSecurityException("tag size is not set");
        L59:
            throw new GeneralSecurityException("iv size is not set");
        L61:
            throw new GeneralSecurityException("HMAC key size is not set");
        L63:
            throw new GeneralSecurityException("AES key size is not set");
        }
    }

    public static final class zzc {
        public static final zzc zza = null;
        public static final zzc zzb = null;
        public static final zzc zzc = null;
        private final String zzd;

        static {
            zza = new zzc("TINK");
            zzb = new zzc("CRUNCHY");
            zzc = new zzc("NO_PREFIX");
        }

        private zzc(String r1) {
            this.zzd = r1;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    public /* synthetic */ zzdc(int r1, int r2, int r3, int r4, zzc r5, zza r6, zzde r7) {
        this(r1, r2, r3, r4, r5, r6);
    }

    public static zzb zzf() {
        return new zzb(null);
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof zzdc) == true) goto L5;
        return false;
    L5:
        zzdc r42 = (zzdc) r4;
        if (r42.zza == this.zza) goto L8;
    L19:
        return false;
    L8:
        if (r42.zzb != this.zzb) goto L19;
        if (r42.zzc != this.zzc) goto L19;
        if (r42.zzd != this.zzd) goto L19;
        if (r42.zze != this.zze) goto L19;
        if (r42.zzf != this.zzf) goto L19;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzdc.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf});
    }

    public final String toString() {
        return "AesCtrHmacAead Parameters (variant: " + String.valueOf(this.zze) + ", hashType: " + String.valueOf(this.zzf) + ", " + this.zzc + "-byte IV, and " + this.zzd + "-byte tags, and " + this.zza + "-byte AES key, and " + this.zzb + "-byte HMAC key)";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcg
    public final boolean zza() {
        if (this.zze == zzc.zzc) goto L6;
        return true;
    L6:
        return false;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final int zze() {
        return this.zzd;
    }

    public final zza zzg() {
        return this.zzf;
    }

    public final zzc zzh() {
        return this.zze;
    }

    private zzdc(int r1, int r2, int r3, int r4, zzc r5, zza r6) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
        this.zzd = r4;
        this.zze = r5;
        this.zzf = r6;
    }
}
