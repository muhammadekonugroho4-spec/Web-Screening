package com.google.android.gms.internal.auth;

import com.google.firebase.perf.util.Constants;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes5.dex */
final class zzhi {
    static final boolean zza = false;
    private static final Unsafe zzb = null;
    private static final Class zzc = null;
    private static final boolean zzd = false;
    private static final zzhh zze = null;
    private static final boolean zzf = false;
    private static final boolean zzg = false;

    static {
        Unsafe r1 = zzg();
        zzb = r1;
        zzc = zzdr.zza();
        Class r2 = Long.TYPE;
        boolean r3 = zzs(r2);
        zzd = r3;
        Class r4 = Integer.TYPE;
        boolean r5 = zzs(r4);
        zzhh r6 = null;
        if (r1 == null) goto L9;
        if (r3 == false) goto L7;
        r6 = new zzhg(r1);
        goto L9
    L7:
        if (r5 == false) goto L9;
        r6 = new zzhf(r1);
    L9:
        zze = r6;
        boolean r7 = true;
        if (r6 != null) goto L38;
    L11:
        boolean r62 = false;
    L19:
        zzf = r62;
        zzhh r63 = zze;
        if (r63 != null) goto L40;
    L21:
        boolean r02 = false;
    L27:
        zzg = r02;
        zzw(byte[].class);
        zzw(boolean[].class);
        zzx(boolean[].class);
        zzw(int[].class);
        zzx(int[].class);
        zzw(long[].class);
        zzx(long[].class);
        zzw(float[].class);
        zzx(float[].class);
        zzw(double[].class);
        zzx(double[].class);
        zzw(Object[].class);
        zzx(Object[].class);
        Field r03 = zzy();
        if (r03 == null) goto L33;
        zzhh r12 = zze;
        if (r12 == null) goto L33;
        r12.zzk(r03);
    L33:
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) goto L36;
        r7 = false;
    L36:
        zza = r7;
        return;
    L40:
        Class<?> r64 = r63.zza.getClass();     // Catch: Throwable -> L25
        r64.getMethod("objectFieldOffset", new Class[]{Field.class});     // Catch: Throwable -> L25
        r64.getMethod("arrayBaseOffset", new Class[]{Class.class});     // Catch: Throwable -> L25
        r64.getMethod("arrayIndexScale", new Class[]{Class.class});     // Catch: Throwable -> L25
        r64.getMethod("getInt", new Class[]{Object.class, r2});     // Catch: Throwable -> L25
        r64.getMethod("putInt", new Class[]{Object.class, r2, r4});     // Catch: Throwable -> L25
        r64.getMethod("getLong", new Class[]{Object.class, r2});     // Catch: Throwable -> L25
        r64.getMethod("putLong", new Class[]{Object.class, r2, r2});     // Catch: Throwable -> L25
        r64.getMethod("getObject", new Class[]{Object.class, r2});     // Catch: Throwable -> L25
        r64.getMethod("putObject", new Class[]{Object.class, r2, Object.class});     // Catch: Throwable -> L25
        r02 = true;
    L25:
        th = move-exception;
        zzh(th);
        goto L21
    L38:
        Class<?> r65 = r6.zza.getClass();     // Catch: Throwable -> L17
        r65.getMethod("objectFieldOffset", new Class[]{Field.class});     // Catch: Throwable -> L17
        r65.getMethod("getLong", new Class[]{Object.class, r2});     // Catch: Throwable -> L17
        if (zzy() == null) goto L11;
        r62 = true;
    L17:
        th = move-exception;
        zzh(th);
        goto L11
    }

    private zzhi() {
    }

    public static double zza(Object r1, long r2) {
        return zze.zza(r1, r2);
    }

    public static float zzb(Object r1, long r2) {
        return zze.zzb(r1, r2);
    }

    public static int zzc(Object r1, long r2) {
        return zze.zzi(r1, r2);
    }

    public static long zzd(Object r1, long r2) {
        return zze.zzj(r1, r2);
    }

    public static Object zze(Class r1) {
        return zzb.allocateInstance(r1);
    L4:
        e = move-exception;
        throw new IllegalStateException(e);
    }

    public static Object zzf(Object r1, long r2) {
        return zze.zzl(r1, r2);
    }

    public static Unsafe zzg() {
        return (Unsafe) AccessController.doPrivileged(new zzhe());
    L4:
        return null;
    }

    public static /* bridge */ /* synthetic */ void zzh(Throwable r4) {
        Logger.getLogger(zzhi.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r4.toString()));
    }

    public static /* synthetic */ void zzi(Object r4, long r5, boolean r7) {
        long r02 = (-4) & r5;
        zzhh r2 = zze;
        int r3 = r2.zzi(r4, r02);
        int r52 = ((~((int) r5)) & 3) << 3;
        int r6 = (~(Constants.MAX_HOST_LENGTH << r52)) & r3;
        r2.zzm(r4, r02, ((r7 ? 1 : 0) << r52) | r6);
    }

    public static /* synthetic */ void zzj(Object r4, long r5, boolean r7) {
        long r02 = (-4) & r5;
        zzhh r2 = zze;
        int r3 = r2.zzi(r4, r02);
        int r52 = (((int) r5) & 3) << 3;
        int r6 = (~(Constants.MAX_HOST_LENGTH << r52)) & r3;
        r2.zzm(r4, r02, ((r7 ? 1 : 0) << r52) | r6);
    }

    public static void zzk(Object r1, long r2, boolean r4) {
        zze.zzc(r1, r2, r4);
    }

    public static void zzl(Object r6, long r7, double r9) {
        zze.zzd(r6, r7, r9);
    }

    public static void zzm(Object r1, long r2, float r4) {
        zze.zze(r1, r2, r4);
    }

    public static void zzn(Object r1, long r2, int r4) {
        zze.zzm(r1, r2, r4);
    }

    public static void zzo(Object r6, long r7, long r9) {
        zze.zzn(r6, r7, r9);
    }

    public static void zzp(Object r1, long r2, Object r4) {
        zze.zzo(r1, r2, r4);
    }

    public static /* bridge */ /* synthetic */ boolean zzq(Object r3, long r4) {
        if (((byte) ((zze.zzi(r3, (-4) & r4) >>> ((int) (((~r4) & 3) << 3))) & Constants.MAX_HOST_LENGTH)) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean zzr(Object r3, long r4) {
        if (((byte) ((zze.zzi(r3, (-4) & r4) >>> ((int) ((r4 & 3) << 3))) & Constants.MAX_HOST_LENGTH)) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static boolean zzs(Class r6) {
        int r1 = zzdr.zza;
        Class r12 = zzc;     // Catch: Throwable -> L6
        Class r2 = Boolean.TYPE;     // Catch: Throwable -> L6
        r12.getMethod("peekLong", new Class[]{r6, r2});     // Catch: Throwable -> L6
        r12.getMethod("pokeLong", new Class[]{r6, Long.TYPE, r2});     // Catch: Throwable -> L6
        Class r3 = Integer.TYPE;     // Catch: Throwable -> L6
        r12.getMethod("pokeInt", new Class[]{r6, r3, r2});     // Catch: Throwable -> L6
        r12.getMethod("peekInt", new Class[]{r6, r2});     // Catch: Throwable -> L6
        r12.getMethod("pokeByte", new Class[]{r6, Byte.TYPE});     // Catch: Throwable -> L6
        r12.getMethod("peekByte", new Class[]{r6});     // Catch: Throwable -> L6
        r12.getMethod("pokeByteArray", new Class[]{r6, byte[].class, r3, r3});     // Catch: Throwable -> L6
        r12.getMethod("peekByteArray", new Class[]{r6, byte[].class, r3, r3});     // Catch: Throwable -> L6
        return true;
    L6:
        return false;
    }

    public static boolean zzt(Object r1, long r2) {
        return zze.zzf(r1, r2);
    }

    public static boolean zzu() {
        return zzg;
    }

    public static boolean zzv() {
        return zzf;
    }

    private static int zzw(Class r1) {
        if (zzg == true) goto L5;
        return -1;
    L5:
        return zze.zzg(r1);
    }

    private static int zzx(Class r1) {
        if (zzg == true) goto L5;
        return -1;
    L5:
        return zze.zzh(r1);
    }

    private static Field zzy() {
        int r02 = zzdr.zza;
        Field r03 = zzz(Buffer.class, "effectiveDirectAddress");
        if (r03 != null) goto L11;
        Field r04 = zzz(Buffer.class, "address");
        if (r04 != null) goto L7;
    L9:
        return null;
    L7:
        if (r04.getType() != Long.TYPE) goto L9;
        return r04;
    L11:
        return r03;
    }

    private static Field zzz(Class r02, String r1) {
        return r02.getDeclaredField(r1);
    L4:
        return null;
    }
}
