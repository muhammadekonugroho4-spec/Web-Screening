package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class zzij {
    private static final Logger zza = null;
    private static final AtomicBoolean zzb = null;

    public enum zza extends Enum<zza> {
        public static final zza zza = null;
        public static final zza zzb = null;
        private static final /* synthetic */ zza[] zzc = null;

        static {
            zzim r3 = null;
            zzil r02 = new zzil("ALGORITHM_NOT_FIPS", 0, r3);
            zza = r02;
            zzin r1 = new zzin("ALGORITHM_REQUIRES_BORINGCRYPTO", 1, r3);
            zzb = r1;
            zzc = new zza[]{r02, r1};
        }

        /* synthetic */ zza(String r1, int r2, zzim r3) {
            this(r1, r2);
        }

        public static zza[] values() {
            return (zza[]) zzc.clone();
        }

        public abstract boolean zza();

        zza(String r1, int r2) {
        }
    }

    static {
        zza = Logger.getLogger(zzij.class.getName());
        zzb = new AtomicBoolean(false);
    }

    private zzij() {
    }

    public static Boolean zza() {
        return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
    L4:
        zza.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
        return Boolean.FALSE;
    }

    public static boolean zzb() {
        if (zzb.get() == false) goto L6;
        return true;
    L6:
        return false;
    }
}
