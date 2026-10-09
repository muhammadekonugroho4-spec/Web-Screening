package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzqs extends zzqy {
    private final int zza;
    private final int zzb;
    private final zzc zzc;
    private final zza zzd;

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
        private zza zzc;
        private zzc zzd;

        public /* synthetic */ zzb(zzqu r1) {
            this();
        }

        public final zzb zza(zza r1) {
            this.zzc = r1;
            return this;
        }

        public final zzb zzb(int r1) throws GeneralSecurityException {
            this.zzb = Integer.valueOf(r1);
            return this;
        }

        private zzb() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = zzc.zzd;
        }

        public final zzb zza(int r1) throws GeneralSecurityException {
            this.zza = Integer.valueOf(r1);
            return this;
        }

        public final zzb zza(zzc r1) {
            this.zzd = r1;
            return this;
        }

        public final zzqs zza() throws GeneralSecurityException {
            Integer r02 = this.zza;
            if (r02 == null) goto L63;
            if (this.zzb == null) goto L61;
            if (this.zzc == null) goto L59;
            if (this.zzd == null) goto L57;
            if (r02.intValue() < 16) goto L55;
            Integer r03 = this.zzb;
            int r1 = r03.intValue();
            zza r2 = this.zzc;
            if (r1 < 10) goto L53;
            if (r2 != zza.zza) goto L22;
            if (r1 <= 20) goto L47;
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[]{r03}));
        L47:
            return new zzqs(this.zza.intValue(), this.zzb.intValue(), this.zzd, this.zzc, null);
        L22:
            if (r2 != zza.zzb) goto L29;
            if (r1 <= 28) goto L47;
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[]{r03}));
        L29:
            if (r2 != zza.zzc) goto L36;
            if (r1 <= 32) goto L47;
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[]{r03}));
        L36:
            if (r2 != zza.zzd) goto L43;
            if (r1 <= 48) goto L47;
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[]{r03}));
        L43:
            if (r2 != zza.zze) goto L51;
            if (r1 <= 64) goto L47;
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[]{r03}));
        L51:
            throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
        L53:
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[]{r03}));
        L55:
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", new Object[]{this.zza}));
        L57:
            throw new GeneralSecurityException("variant is not set");
        L59:
            throw new GeneralSecurityException("hash type is not set");
        L61:
            throw new GeneralSecurityException("tag size is not set");
        L63:
            throw new GeneralSecurityException("key size is not set");
        }
    }

    public static final class zzc {
        public static final zzc zza = null;
        public static final zzc zzb = null;
        public static final zzc zzc = null;
        public static final zzc zzd = null;
        private final String zze;

        static {
            zza = new zzc("TINK");
            zzb = new zzc("CRUNCHY");
            zzc = new zzc("LEGACY");
            zzd = new zzc("NO_PREFIX");
        }

        private zzc(String r1) {
            this.zze = r1;
        }

        public final String toString() {
            return this.zze;
        }
    }

    public /* synthetic */ zzqs(int r1, int r2, zzc r3, zza r4, zzqu r5) {
        this(r1, r2, r3, r4);
    }

    public static zzb zzd() {
        return new zzb(null);
    }

    private final int zzg() {
        zzc r02 = this.zzc;
        if (r02 != zzc.zzd) goto L7;
        return this.zzb;
    L7:
        if (r02 != zzc.zza) goto L12;
        int r03 = this.zzb;
    L10:
        return r03 + 5;
    L12:
        if (r02 != zzc.zzb) goto L15;
        r03 = this.zzb;
        goto L10
    L15:
        if (r02 != zzc.zzc) goto L18;
        r03 = this.zzb;
        goto L10
    L18:
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof zzqs) == true) goto L5;
        return false;
    L5:
        zzqs r42 = (zzqs) r4;
        if (r42.zza == this.zza) goto L8;
    L15:
        return false;
    L8:
        if (r42.zzg() != zzg()) goto L15;
        if (r42.zzc != this.zzc) goto L15;
        if (r42.zzd != this.zzd) goto L15;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzqs.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        return "HMAC Parameters (variant: " + String.valueOf(this.zzc) + ", hashType: " + String.valueOf(this.zzd) + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcg
    public final boolean zza() {
        if (this.zzc == zzc.zzd) goto L6;
        return true;
    L6:
        return false;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zza zze() {
        return this.zzd;
    }

    public final zzc zzf() {
        return this.zzc;
    }

    private zzqs(int r1, int r2, zzc r3, zza r4) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
        this.zzd = r4;
    }
}
