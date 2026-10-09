package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzju extends zzkt {
    private final zzd zza;
    private final zze zzb;
    private final zza zzc;
    private final zzf zzd;

    public static final class zza extends zzc {
        public static final zza zza = null;
        public static final zza zzb = null;
        public static final zza zzc = null;

        static {
            zza = new zza("AES_128_GCM", 1);
            zzb = new zza("AES_256_GCM", 2);
            zzc = new zza("CHACHA20_POLY1305", 3);
        }

        private zza(String r2, int r3) {
            super(r2, r3, null);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzju.zzc
        public final /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    public static final class zzb {
        private zzd zza;
        private zze zzb;
        private zza zzc;
        private zzf zzd;

        public /* synthetic */ zzb(zzjv r1) {
            this();
        }

        public final zzb zza(zza r1) {
            this.zzc = r1;
            return this;
        }

        private zzb() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = zzf.zzc;
        }

        public final zzb zza(zze r1) {
            this.zzb = r1;
            return this;
        }

        public final zzb zza(zzd r1) {
            this.zza = r1;
            return this;
        }

        public final zzb zza(zzf r1) {
            this.zzd = r1;
            return this;
        }

        public final zzju zza() throws GeneralSecurityException {
            zzd r1 = this.zza;
            if (r1 == null) goto L19;
            zze r2 = this.zzb;
            if (r2 == null) goto L17;
            zza r3 = this.zzc;
            if (r3 == null) goto L15;
            zzf r4 = this.zzd;
            if (r4 == null) goto L13;
            return new zzju(r1, r2, r3, r4, null);
        L13:
            throw new GeneralSecurityException("HPKE variant is not set");
        L15:
            throw new GeneralSecurityException("HPKE AEAD parameter is not set");
        L17:
            throw new GeneralSecurityException("HPKE KDF parameter is not set");
        L19:
            throw new GeneralSecurityException("HPKE KEM parameter is not set");
        }
    }

    public static class zzc {
        private final String zza;
        private final int zzb;

        public /* synthetic */ zzc(String r1, int r2, zzjv r3) {
            this(r1, r2);
        }

        public String toString() {
            return String.format("%s(0x%04x)", new Object[]{this.zza, Integer.valueOf(this.zzb)});
        }

        private zzc(String r1, int r2) {
            this.zza = r1;
            this.zzb = r2;
        }
    }

    public static final class zzd extends zzc {
        public static final zzd zza = null;
        public static final zzd zzb = null;
        public static final zzd zzc = null;
        public static final zzd zzd = null;

        static {
            zza = new zzd("DHKEM_P256_HKDF_SHA256", 16);
            zzb = new zzd("DHKEM_P384_HKDF_SHA384", 17);
            zzc = new zzd("DHKEM_P521_HKDF_SHA512", 18);
            zzd = new zzd("DHKEM_X25519_HKDF_SHA256", 32);
        }

        private zzd(String r2, int r3) {
            super(r2, r3, null);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzju.zzc
        public final /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    public static final class zze extends zzc {
        public static final zze zza = null;
        public static final zze zzb = null;
        public static final zze zzc = null;

        static {
            zza = new zze("HKDF_SHA256", 1);
            zzb = new zze("HKDF_SHA384", 2);
            zzc = new zze("HKDF_SHA512", 3);
        }

        private zze(String r2, int r3) {
            super(r2, r3, null);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzju.zzc
        public final /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    public static final class zzf {
        public static final zzf zza = null;
        public static final zzf zzb = null;
        public static final zzf zzc = null;
        private final String zzd;

        static {
            zza = new zzf("TINK");
            zzb = new zzf("CRUNCHY");
            zzc = new zzf("NO_PREFIX");
        }

        private zzf(String r1) {
            this.zzd = r1;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    public /* synthetic */ zzju(zzd r1, zze r2, zza r3, zzf r4, zzjv r5) {
        this(r1, r2, r3, r4);
    }

    public static zzb zzc() {
        return new zzb(null);
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof zzju) == true) goto L5;
        return false;
    L5:
        zzju r42 = (zzju) r4;
        if (this.zza == r42.zza) goto L8;
    L15:
        return false;
    L8:
        if (this.zzb != r42.zzb) goto L15;
        if (this.zzc != r42.zzc) goto L15;
        if (this.zzd != r42.zzd) goto L15;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzju.class, this.zza, this.zzb, this.zzc, this.zzd});
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcg
    public final boolean zza() {
        if (this.zzd == zzf.zzc) goto L6;
        return true;
    L6:
        return false;
    }

    public final zza zzb() {
        return this.zzc;
    }

    public final zze zzd() {
        return this.zzb;
    }

    public final zzd zze() {
        return this.zza;
    }

    public final zzf zzf() {
        return this.zzd;
    }

    private zzju(zzd r1, zze r2, zza r3, zzf r4) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
        this.zzd = r4;
    }
}
