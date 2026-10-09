package com.google.android.recaptcha.internal;

import com.google.firebase.perf.util.Constants;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes5.dex */
final class zzps {
    static final long zza = 0;
    static final boolean zzb = false;
    private static final Unsafe zzc = null;
    private static final Class zzd = null;
    private static final boolean zze = false;
    private static final zzpr zzf = null;
    private static final boolean zzg = false;
    private static final boolean zzh = false;

    static {
        Unsafe r1 = zzg();
        zzc = r1;
        int r2 = zzks.zza;
        zzd = Memory.class;
        Class r22 = Long.TYPE;
        boolean r3 = zzv(r22);
        zze = r3;
        Class r4 = Integer.TYPE;
        boolean r5 = zzv(r4);
        zzpr r6 = null;
        if (r1 == null) goto L9;
        if (r3 == false) goto L7;
        r6 = new zzpq(r1);
        goto L9
    L7:
        if (r5 == false) goto L9;
        r6 = new zzpp(r1);
    L9:
        zzf = r6;
        boolean r7 = true;
        if (r6 != null) goto L38;
    L11:
        boolean r62 = false;
    L19:
        zzg = r62;
        zzpr r63 = zzf;
        if (r63 != null) goto L40;
    L21:
        boolean r02 = false;
    L27:
        zzh = r02;
        zza = zzz(byte[].class);
        zzz(boolean[].class);
        zzA(boolean[].class);
        zzz(int[].class);
        zzA(int[].class);
        zzz(long[].class);
        zzA(long[].class);
        zzz(float[].class);
        zzA(float[].class);
        zzz(double[].class);
        zzA(double[].class);
        zzz(Object[].class);
        zzA(Object[].class);
        Field r03 = zzB();
        if (r03 == null) goto L33;
        zzpr r12 = zzf;
        if (r12 == null) goto L33;
        r12.zza.objectFieldOffset(r03);
    L33:
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) goto L36;
        r7 = false;
    L36:
        zzb = r7;
        return;
    L40:
        Class<?> r64 = r63.zza.getClass();     // Catch: Throwable -> L25
        r64.getMethod("objectFieldOffset", new Class[]{Field.class});     // Catch: Throwable -> L25
        r64.getMethod("arrayBaseOffset", new Class[]{Class.class});     // Catch: Throwable -> L25
        r64.getMethod("arrayIndexScale", new Class[]{Class.class});     // Catch: Throwable -> L25
        r64.getMethod("getInt", new Class[]{Object.class, r22});     // Catch: Throwable -> L25
        r64.getMethod("putInt", new Class[]{Object.class, r22, r4});     // Catch: Throwable -> L25
        r64.getMethod("getLong", new Class[]{Object.class, r22});     // Catch: Throwable -> L25
        r64.getMethod("putLong", new Class[]{Object.class, r22, r22});     // Catch: Throwable -> L25
        r64.getMethod("getObject", new Class[]{Object.class, r22});     // Catch: Throwable -> L25
        r64.getMethod("putObject", new Class[]{Object.class, r22, Object.class});     // Catch: Throwable -> L25
        r02 = true;
    L25:
        th = move-exception;
        zzh(th);
        goto L21
    L38:
        Class<?> r65 = r6.zza.getClass();     // Catch: Throwable -> L17
        r65.getMethod("objectFieldOffset", new Class[]{Field.class});     // Catch: Throwable -> L17
        r65.getMethod("getLong", new Class[]{Object.class, r22});     // Catch: Throwable -> L17
        if (zzB() == null) goto L11;
        r62 = true;
    L17:
        th = move-exception;
        zzh(th);
        goto L11
    }

    private zzps() {
    }

    private static int zzA(Class r1) {
        if (zzh == true) goto L5;
        return -1;
    L5:
        return zzf.zza.arrayIndexScale(r1);
    }

    private static Field zzB() {
        int r02 = zzks.zza;
        Field r03 = zzC(Buffer.class, "effectiveDirectAddress");
        if (r03 != null) goto L11;
        Field r04 = zzC(Buffer.class, "address");
        if (r04 != null) goto L7;
    L9:
        return null;
    L7:
        if (r04.getType() != Long.TYPE) goto L9;
        return r04;
    L11:
        return r03;
    }

    private static Field zzC(Class r02, String r1) {
        return r02.getDeclaredField(r1);
    L4:
        return null;
    }

    private static void zzD(Object r5, long r6, byte r8) {
        zzpr r02 = zzf;
        long r2 = (-4) & r6;
        int r1 = r02.zza.getInt(r5, r2);
        int r62 = ((~((int) r6)) & 3) << 3;
        int r12 = r1 & (~(Constants.MAX_HOST_LENGTH << r62));
        r02.zza.putInt(r5, r2, ((255 & r8) << r62) | r12);
    }

    private static void zzE(Object r5, long r6, byte r8) {
        zzpr r02 = zzf;
        long r2 = (-4) & r6;
        int r62 = (((int) r6) & 3) << 3;
        int r1 = r02.zza.getInt(r5, r2) & (~(Constants.MAX_HOST_LENGTH << r62));
        r02.zza.putInt(r5, r2, ((255 & r8) << r62) | r1);
    }

    public static double zza(Object r1, long r2) {
        return zzf.zza(r1, r2);
    }

    public static float zzb(Object r1, long r2) {
        return zzf.zzb(r1, r2);
    }

    public static int zzc(Object r1, long r2) {
        return zzf.zza.getInt(r1, r2);
    }

    public static long zzd(Object r1, long r2) {
        return zzf.zza.getLong(r1, r2);
    }

    public static Object zze(Class r1) {
        return zzc.allocateInstance(r1);
    L4:
        e = move-exception;
        throw new IllegalStateException(e);
    }

    public static Object zzf(Object r1, long r2) {
        return zzf.zza.getObject(r1, r2);
    }

    public static Unsafe zzg() {
        return (Unsafe) AccessController.doPrivileged(new zzpo());
    L4:
        return null;
    }

    public static /* bridge */ /* synthetic */ void zzh(Throwable r4) {
        Logger.getLogger(zzps.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r4.toString()));
    }

    public static /* synthetic */ void zzi(Object r02, long r1, boolean r3) {
        zzD(r02, r1, r3 ? 1 : 0);
    }

    public static /* synthetic */ void zzj(Object r02, long r1, boolean r3) {
        zzE(r02, r1, r3 ? 1 : 0);
    }

    public static /* bridge */ /* synthetic */ void zzk(Object r02, long r1, byte r3) {
        zzD(r02, r1, r3);
    }

    public static /* bridge */ /* synthetic */ void zzl(Object r02, long r1, byte r3) {
        zzE(r02, r1, r3);
    }

    public static void zzm(Object r1, long r2, boolean r4) {
        zzf.zzc(r1, r2, r4);
    }

    public static void zzn(byte[] r3, long r4, byte r6) {
        zzf.zzd(r3, zza + r4, r6);
    }

    public static void zzo(Object r6, long r7, double r9) {
        zzf.zze(r6, r7, r9);
    }

    public static void zzp(Object r1, long r2, float r4) {
        zzf.zzf(r1, r2, r4);
    }

    public static void zzq(Object r1, long r2, int r4) {
        zzf.zza.putInt(r1, r2, r4);
    }

    public static void zzr(Object r7, long r8, long r10) {
        zzf.zza.putLong(r7, r8, r10);
    }

    public static void zzs(Object r1, long r2, Object r4) {
        zzf.zza.putObject(r1, r2, r4);
    }

    public static /* bridge */ /* synthetic */ boolean zzt(Object r3, long r4) {
        if (((byte) ((zzf.zza.getInt(r3, (-4) & r4) >>> ((int) (((~r4) & 3) << 3))) & Constants.MAX_HOST_LENGTH)) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean zzu(Object r3, long r4) {
        if (((byte) ((zzf.zza.getInt(r3, (-4) & r4) >>> ((int) ((r4 & 3) << 3))) & Constants.MAX_HOST_LENGTH)) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static boolean zzv(Class r6) {
        int r1 = zzks.zza;
        Class r12 = zzd;     // Catch: Throwable -> L6
        Class r3 = Boolean.TYPE;     // Catch: Throwable -> L6
        r12.getMethod("peekLong", new Class[]{r6, r3});     // Catch: Throwable -> L6
        r12.getMethod("pokeLong", new Class[]{r6, Long.TYPE, r3});     // Catch: Throwable -> L6
        Class r4 = Integer.TYPE;     // Catch: Throwable -> L6
        r12.getMethod("pokeInt", new Class[]{r6, r4, r3});     // Catch: Throwable -> L6
        r12.getMethod("peekInt", new Class[]{r6, r3});     // Catch: Throwable -> L6
        r12.getMethod("pokeByte", new Class[]{r6, Byte.TYPE});     // Catch: Throwable -> L6
        r12.getMethod("peekByte", new Class[]{r6});     // Catch: Throwable -> L6
        r12.getMethod("pokeByteArray", new Class[]{r6, byte[].class, r4, r4});     // Catch: Throwable -> L6
        r12.getMethod("peekByteArray", new Class[]{r6, byte[].class, r4, r4});     // Catch: Throwable -> L6
        return true;
    L6:
        return false;
    }

    public static boolean zzw(Object r1, long r2) {
        return zzf.zzg(r1, r2);
    }

    public static boolean zzx() {
        return zzh;
    }

    public static boolean zzy() {
        return zzg;
    }

    private static int zzz(Class r1) {
        if (zzh == true) goto L5;
        return -1;
    L5:
        return zzf.zza.arrayBaseOffset(r1);
    }
}
