package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.perf.util.Constants;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes5.dex */
final class zzana {
    static final boolean zza = false;
    private static final Unsafe zzb = null;
    private static final Class<?> zzc = null;
    private static final boolean zzd = false;
    private static final boolean zze = false;
    private static final zzc zzf = null;
    private static final boolean zzg = false;
    private static final boolean zzh = false;
    private static final long zzi = 0;

    public static final class zza extends zzc {
        public zza(Unsafe r1) {
            super(r1);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzana.zzc
        public final double zza(Object r1, long r2) {
            return Double.longBitsToDouble(zze(r1, r2));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzana.zzc
        public final float zzb(Object r1, long r2) {
            return Float.intBitsToFloat(zzd(r1, r2));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzana.zzc
        public final boolean zzc(Object r2, long r3) {
            if (zzana.zza == false) goto L7;
            return zzana.zzf(r2, r3);
        L7:
            return zzana.zzg(r2, r3);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzana.zzc
        public final void zza(Object r2, long r3, boolean r5) {
            if (zzana.zza == false) goto L6;
            zzana.zza(r2, r3, r5);
            return;
        L6:
            zzana.zzb(r2, r3, r5);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzana.zzc
        public final void zza(Object r2, long r3, byte r5) {
            if (zzana.zza == false) goto L6;
            zzana.zza(r2, r3, r5);
            return;
        L6:
            zzana.zzb(r2, r3, r5);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzana.zzc
        public final void zza(Object r7, long r8, double r10) {
            zza(r7, r8, Double.doubleToLongBits(r10));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzana.zzc
        public final void zza(Object r1, long r2, float r4) {
            zza(r1, r2, Float.floatToIntBits(r4));
        }
    }

    public static final class zzb extends zzc {
        public zzb(Unsafe r1) {
            super(r1);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzana.zzc
        public final double zza(Object r1, long r2) {
            return Double.longBitsToDouble(zze(r1, r2));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzana.zzc
        public final float zzb(Object r1, long r2) {
            return Float.intBitsToFloat(zzd(r1, r2));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzana.zzc
        public final boolean zzc(Object r2, long r3) {
            if (zzana.zza == false) goto L7;
            return zzana.zzf(r2, r3);
        L7:
            return zzana.zzg(r2, r3);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzana.zzc
        public final void zza(Object r2, long r3, boolean r5) {
            if (zzana.zza == false) goto L6;
            zzana.zza(r2, r3, r5);
            return;
        L6:
            zzana.zzb(r2, r3, r5);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzana.zzc
        public final void zza(Object r2, long r3, byte r5) {
            if (zzana.zza == false) goto L6;
            zzana.zza(r2, r3, r5);
            return;
        L6:
            zzana.zzb(r2, r3, r5);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzana.zzc
        public final void zza(Object r7, long r8, double r10) {
            zza(r7, r8, Double.doubleToLongBits(r10));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzana.zzc
        public final void zza(Object r1, long r2, float r4) {
            zza(r1, r2, Float.floatToIntBits(r4));
        }
    }

    public static abstract class zzc {
        Unsafe zza;

        public zzc(Unsafe r1) {
            this.zza = r1;
        }

        public abstract double zza(Object r1, long r2);

        public abstract void zza(Object r1, long r2, byte r4);

        public abstract void zza(Object r1, long r2, double r4);

        public abstract void zza(Object r1, long r2, float r4);

        public final void zza(Object r2, long r3, int r5) {
            this.zza.putInt(r2, r3, r5);
        }

        public abstract void zza(Object r1, long r2, boolean r4);

        public abstract float zzb(Object r1, long r2);

        public final boolean zzb() {
            Unsafe r02 = this.zza;
            if (r02 != null) goto L13;
            return false;
        L13:
            Class<?> r03 = r02.getClass();     // Catch: Throwable -> L10
            r03.getMethod("objectFieldOffset", new Class[]{Field.class});     // Catch: Throwable -> L10
            r03.getMethod("getLong", new Class[]{Object.class, Long.TYPE});     // Catch: Throwable -> L10
            if (zzana.zza() != null) goto L8;
            return false;
        L8:
            return true;
        L10:
            th = move-exception;
            zzana.zza(th);
            return false;
        }

        public abstract boolean zzc(Object r1, long r2);

        public final int zzd(Object r2, long r3) {
            return this.zza.getInt(r2, r3);
        }

        public final long zze(Object r2, long r3) {
            return this.zza.getLong(r2, r3);
        }

        public final void zza(Object r7, long r8, long r10) {
            this.zza.putLong(r7, r8, r10);
        }

        public final boolean zza() {
            Unsafe r2 = this.zza;
            if (r2 != null) goto L11;
            return false;
        L11:
            Class<?> r22 = r2.getClass();     // Catch: Throwable -> L8
            r22.getMethod("objectFieldOffset", new Class[]{Field.class});     // Catch: Throwable -> L8
            r22.getMethod("arrayBaseOffset", new Class[]{Class.class});     // Catch: Throwable -> L8
            r22.getMethod("arrayIndexScale", new Class[]{Class.class});     // Catch: Throwable -> L8
            Class r4 = Long.TYPE;     // Catch: Throwable -> L8
            r22.getMethod("getInt", new Class[]{Object.class, r4});     // Catch: Throwable -> L8
            r22.getMethod("putInt", new Class[]{Object.class, r4, Integer.TYPE});     // Catch: Throwable -> L8
            r22.getMethod("getLong", new Class[]{Object.class, r4});     // Catch: Throwable -> L8
            r22.getMethod("putLong", new Class[]{Object.class, r4, r4});     // Catch: Throwable -> L8
            r22.getMethod("getObject", new Class[]{Object.class, r4});     // Catch: Throwable -> L8
            r22.getMethod("putObject", new Class[]{Object.class, r4, Object.class});     // Catch: Throwable -> L8
            return true;
        L8:
            th = move-exception;
            zzana.zza(th);
            return false;
        }
    }

    static {
        Unsafe r02 = zzb();
        zzb = r02;
        zzc = zzait.zza();
        boolean r1 = zzd(Long.TYPE);
        zzd = r1;
        boolean r2 = zzd(Integer.TYPE);
        zze = r2;
        if (r02 == null) goto L8;
        if (r1 == false) goto L6;
        zzc r12 = new zza(r02);
    L9:
        zzf = r12;
        boolean r03 = false;
        if (r12 != null) goto L12;
        boolean r22 = false;
    L13:
        zzg = r22;
        if (r12 != null) goto L16;
        boolean r23 = false;
    L17:
        zzh = r23;
        zzi = zzb(byte[].class);
        zzb(boolean[].class);
        zzc(boolean[].class);
        zzb(int[].class);
        zzc(int[].class);
        zzb(long[].class);
        zzc(long[].class);
        zzb(float[].class);
        zzc(float[].class);
        zzb(double[].class);
        zzc(double[].class);
        zzb(Object[].class);
        zzc(Object[].class);
        Field r24 = zze();
        if (r24 == null) goto L23;
        if (r12 == null) goto L23;
        r12.zza.objectFieldOffset(r24);
    L23:
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) goto L25;
        r03 = true;
    L25:
        zza = r03;
        return;
    L16:
        r23 = r12.zza();
        goto L17
    L12:
        r22 = r12.zzb();
        goto L13
    L6:
        if (r2 == false) goto L8;
        r12 = new zzb(r02);
    L8:
        r12 = null;
        goto L9
    }

    private zzana() {
    }

    public static /* synthetic */ Field zza() {
        return zze();
    }

    public static /* synthetic */ void zzb(Object r02, long r1, byte r3) {
        zzd(r02, r1, r3);
    }

    private static int zzc(Class<?> r1) {
        if (zzh == true) goto L5;
        return -1;
    L5:
        return zzf.zza.arrayIndexScale(r1);
    }

    public static long zzd(Object r1, long r2) {
        return zzf.zze(r1, r2);
    }

    public static Object zze(Object r1, long r2) {
        return zzf.zza.getObject(r1, r2);
    }

    public static /* synthetic */ boolean zzf(Object r2, long r3) {
        if (((byte) (zzc(r2, (-4) & r3) >>> ((int) (((~r3) & 3) << 3)))) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static /* synthetic */ boolean zzg(Object r2, long r3) {
        if (((byte) (zzc(r2, (-4) & r3) >>> ((int) ((r3 & 3) << 3)))) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static boolean zzh(Object r1, long r2) {
        return zzf.zzc(r1, r2);
    }

    public static /* synthetic */ void zza(Object r02, long r1, byte r3) {
        zzc(r02, r1, r3);
    }

    public static float zzb(Object r1, long r2) {
        return zzf.zzb(r1, r2);
    }

    private static void zzd(Object r4, long r5, byte r7) {
        long r02 = (-4) & r5;
        int r52 = (((int) r5) & 3) << 3;
        int r2 = zzc(r4, r02) & (~(Constants.MAX_HOST_LENGTH << r52));
        zza(r4, r02, ((255 & r7) << r52) | r2);
    }

    public static double zza(Object r1, long r2) {
        return zzf.zza(r1, r2);
    }

    private static int zzb(Class<?> r1) {
        if (zzh == true) goto L5;
        return -1;
    L5:
        return zzf.zza.arrayBaseOffset(r1);
    }

    public static int zzc(Object r1, long r2) {
        return zzf.zzd(r1, r2);
    }

    private static Field zze() {
        Field r02 = zza(Buffer.class, "effectiveDirectAddress");
        if (r02 == null) goto L5;
        return r02;
    L5:
        Field r03 = zza(Buffer.class, "address");
        if (r03 != null) goto L8;
        return null;
    L8:
        if (r03.getType() != Long.TYPE) goto L12;
        return r03;
    L12:
        return null;
    }

    public static <T> T zza(Class<T> r1) {
        return (T) zzb.allocateInstance(r1);
    L4:
        e = move-exception;
        throw new IllegalStateException(e);
    }

    public static void zzc(Object r1, long r2, boolean r4) {
        zzf.zza(r1, r2, r4);
    }

    private static boolean zzd(Class<?> r6) {
        Class<?> r1 = zzc;     // Catch: Throwable -> L6
        Class r3 = Boolean.TYPE;     // Catch: Throwable -> L6
        r1.getMethod("peekLong", new Class[]{r6, r3});     // Catch: Throwable -> L6
        r1.getMethod("pokeLong", new Class[]{r6, Long.TYPE, r3});     // Catch: Throwable -> L6
        Class r4 = Integer.TYPE;     // Catch: Throwable -> L6
        r1.getMethod("pokeInt", new Class[]{r6, r4, r3});     // Catch: Throwable -> L6
        r1.getMethod("peekInt", new Class[]{r6, r3});     // Catch: Throwable -> L6
        r1.getMethod("pokeByte", new Class[]{r6, Byte.TYPE});     // Catch: Throwable -> L6
        r1.getMethod("peekByte", new Class[]{r6});     // Catch: Throwable -> L6
        r1.getMethod("pokeByteArray", new Class[]{r6, byte[].class, r4, r4});     // Catch: Throwable -> L6
        r1.getMethod("peekByteArray", new Class[]{r6, byte[].class, r4, r4});     // Catch: Throwable -> L6
        return true;
    L6:
        return false;
    }

    public static Unsafe zzb() {
        return (Unsafe) AccessController.doPrivileged(new zzamz());
    L4:
        return null;
    }

    private static void zzc(Object r4, long r5, byte r7) {
        long r02 = (-4) & r5;
        int r2 = zzc(r4, r02);
        int r52 = ((~((int) r5)) & 3) << 3;
        int r22 = r2 & (~(Constants.MAX_HOST_LENGTH << r52));
        zza(r4, r02, ((255 & r7) << r52) | r22);
    }

    private static Field zza(Class<?> r02, String r1) {
        return r02.getDeclaredField(r1);
    L4:
        return null;
    }

    public static /* synthetic */ void zza(Throwable r4) {
        Logger.getLogger(zzana.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + String.valueOf(r4));
    }

    public static /* synthetic */ void zzb(Object r02, long r1, boolean r3) {
        zzd(r02, r1, r3 ? 1 : 0);
    }

    public static boolean zzc() {
        return zzh;
    }

    public static /* synthetic */ void zza(Object r02, long r1, boolean r3) {
        zzc(r02, r1, r3 ? 1 : 0);
    }

    public static void zza(byte[] r3, long r4, byte r6) {
        zzf.zza(r3, zzi + r4, r6);
    }

    public static void zza(Object r6, long r7, double r9) {
        zzf.zza(r6, r7, r9);
    }

    public static void zza(Object r1, long r2, float r4) {
        zzf.zza(r1, r2, r4);
    }

    public static void zza(Object r1, long r2, int r4) {
        zzf.zza(r1, r2, r4);
    }

    public static boolean zzd() {
        return zzg;
    }

    public static void zza(Object r6, long r7, long r9) {
        zzf.zza(r6, r7, r9);
    }

    public static void zza(Object r1, long r2, Object r4) {
        zzf.zza.putObject(r1, r2, r4);
    }
}
