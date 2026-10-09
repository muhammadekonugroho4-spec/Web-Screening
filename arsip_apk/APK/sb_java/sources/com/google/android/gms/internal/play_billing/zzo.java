package com.google.android.gms.internal.play_billing;

import com.clevertap.android.sdk.Constants;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public class zzo implements zzcz {
    static final boolean zza = false;
    static final zzd zzb = null;
    public static final /* synthetic */ int zzf = 0;
    private static final Logger zzg = null;
    private static final Object zzh = null;
    volatile Object zzc;
    volatile zzh zzd;
    volatile zzm zze;

    static {
        zza = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        zzg = Logger.getLogger(zzo.class.getName());
        zzd r4 = new zzj(AtomicReferenceFieldUpdater.newUpdater(zzm.class, Thread.class, "zzb"), AtomicReferenceFieldUpdater.newUpdater(zzm.class, zzm.class, "zzc"), AtomicReferenceFieldUpdater.newUpdater(zzo.class, zzm.class, "zze"), AtomicReferenceFieldUpdater.newUpdater(zzo.class, zzh.class, "zzd"), AtomicReferenceFieldUpdater.newUpdater(zzo.class, Object.class, "zzc"));     // Catch: Throwable -> L6
        th = null;
    L5:
        Throwable r10 = th;
        zzb = r4;
        if (r10 == null) goto L11;
        zzg.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", r10);
    L11:
        zzh = new Object();
        return;
    L6:
        th = th;
        r4 = new zzl();
        goto L5
    }

    public zzo() {
    }

    public static void zzc(zzo r4) {
    L2:
        zzm r02 = r4.zze;
        zzd r1 = zzb;
        if (r1.zze(r4, r02, zzm.zza) == false) goto L2;
    L5:
        if (r02 == null) goto L6;
        Thread r3 = r02.zzb;
        if (r3 == null) goto L21;
        r02.zzb = null;
        LockSupport.unpark(r3);
    L21:
        r02 = r02.zzc;
    L6:
        zzh r03 = r4.zzd;
        if (r1.zzc(r4, r03, zzh.zza) == false) goto L6;
        zzh r42 = null;
    L9:
        if (r03 == null) goto L11;
        zzh r12 = r03.zzd;
        r03.zzd = r42;
        r42 = r03;
        r03 = r12;
    L11:
        if (r42 == null) goto L17;
        Runnable r04 = r42.zzb;
        zzh r13 = r42.zzd;
        if ((r04 instanceof zzk) == true) goto L15;
        zzf(r04, r42.zzc);
        r42 = r13;
        goto L11
    L15:
        zzo r43 = ((zzk) r04).zza;
        throw null;
    }

    private final void zze(StringBuilder r4) {
        boolean r1 = false;
    L27:
        V r2 = get();     // Catch: Throwable -> L16 InterruptedException -> L26
    L4:
        if (r1 == false) goto L10;
        Thread.currentThread().interrupt();     // Catch: RuntimeException -> L6 ExecutionException -> L8 CancellationException -> L22
    L10:
        r4.append("SUCCESS, result=[");     // Catch: RuntimeException -> L6 ExecutionException -> L8 CancellationException -> L22
        if (r2 != this) goto L13;
        String r12 = "this future";
    L14:
        r4.append(r12);     // Catch: RuntimeException -> L6 ExecutionException -> L8 CancellationException -> L22
        r4.append(Constants.AES_SUFFIX);     // Catch: RuntimeException -> L6 ExecutionException -> L8 CancellationException -> L22
        return;
    L13:
        r12 = String.valueOf(r2);     // Catch: RuntimeException -> L6 ExecutionException -> L8 CancellationException -> L22
    L26:
        r1 = true;
    L16:
        th = move-exception;
        if (r1 == false) goto L19;
        Thread.currentThread().interrupt();     // Catch: RuntimeException -> L6 ExecutionException -> L8 CancellationException -> L22
    L19:
        throw th;     // Catch: RuntimeException -> L6 ExecutionException -> L8 CancellationException -> L22
    L22:
        r4.append("CANCELLED");
        return;
    L6:
        e = move-exception;
        r4.append("UNKNOWN, cause=[");
        r4.append(e.getClass());
        r4.append(" thrown from get()]");
        return;
    L8:
        e = move-exception;
        r4.append("FAILURE, cause=[");
        r4.append(e.getCause());
        r4.append(Constants.AES_SUFFIX);
    }

    private static void zzf(Runnable r6, Executor r7) {
        r7.execute(r6);     // Catch: RuntimeException -> L4
        return;
    L4:
        e = move-exception;
        zzg.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(r6) + " with executor " + String.valueOf(r7), e);
    }

    private final void zzg(zzm r5) {
        r5.zzb = null;
    L3:
        zzm r52 = this.zze;
        if (r52 == zzm.zza) goto L18;
        zzm r1 = null;
    L6:
        if (r52 == null) goto L27;
        zzm r2 = r52.zzc;
        if (r52.zzb == null) goto L10;
        r1 = r52;
    L17:
        r52 = r2;
        goto L6
    L10:
        if (r1 == null) goto L15;
        r1.zzc = r2;
        if (r1.zzb != null) goto L17;
    L15:
        if (zzb.zze(this, r52, r2) == true) goto L17;
    L27:
        return;
    }

    private static final Object zzh(Object r2) throws ExecutionException {
        if ((r2 instanceof zze) == false) goto L5;
        Throwable r22 = ((zze) r2).zzc;
        CancellationException r02 = new CancellationException("Task was cancelled.");
        r02.initCause(r22);
        throw r02;
    L5:
        if ((r2 instanceof zzg) == true) goto L11;
        if (r2 != zzh) goto L14;
        return null;
    L14:
        return r2;
    L11:
        throw new ExecutionException(((zzg) r2).zza);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r7) {
        Object r02 = this.zzc;
        boolean r1 = r02 instanceof zzk;
        if (r02 != null) goto L5;
        boolean r4 = true;
    L7:
        if ((r1 | r4) == true) goto L9;
    L23:
        return false;
    L9:
        if (zza == false) goto L11;
        zze r12 = new zze(r7, new CancellationException("Future.cancel() was called."));
    L15:
        if (zzb.zzd(this, r02, r12) == true) goto L16;
        r02 = this.zzc;
        if ((r02 instanceof zzk) == true) goto L15;
    L16:
        zzc(this);
        if ((r02 instanceof zzk) == true) goto L19;
        return true;
    L19:
        zzcz r72 = ((zzk) r02).zzb;
        throw null;
    L11:
        if (r7 == false) goto L13;
        r12 = zze.zza;
        goto L15
    L13:
        r12 = zze.zzb;
        goto L15
    L5:
        r4 = false;
        goto L7
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException, ExecutionException {
        if (Thread.interrupted() == true) goto L34;
        Object r02 = this.zzc;
        if (r02 == null) goto L7;
        boolean r3 = true;
    L9:
        if ((r3 & (!(r02 instanceof zzk))) == true) goto L11;
        zzm r03 = this.zze;
        zzm r32 = zzm.zza;
        if (r03 == r32) goto L32;
        zzm r4 = new zzm();
    L15:
        zzd r5 = zzb;
        r5.zza(r4, r03);
        if (r5.zze(this, r03, r4) == true) goto L17;
        r03 = this.zze;
        if (r03 != r32) goto L15;
    L17:
        LockSupport.park(this);
        if (Thread.interrupted() == true) goto L27;
        Object r04 = this.zzc;
        if (r04 == null) goto L22;
        boolean r33 = true;
    L24:
        if ((r33 & (!(r04 instanceof zzk))) == false) goto L17;
        return zzh(r04);
    L22:
        r33 = false;
        goto L24
    L27:
        zzg(r4);
        throw new InterruptedException();
    L32:
        return zzh(this.zzc);
    L11:
        return zzh(r02);
    L7:
        r3 = false;
        goto L9
    L34:
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zzc instanceof zze;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object r02 = this.zzc;
        boolean r1 = r02 instanceof zzk;
        if (r02 == null) goto L5;
        boolean r03 = true;
    L7:
        return r03 & (!r1);
    L5:
        r03 = false;
        goto L7
    }

    public final String toString() {
        StringBuilder r02 = new StringBuilder();
        r02.append(super.toString());
        r02.append("[status=");
        if ((this.zzc instanceof zze) == false) goto L6;
        r02.append("CANCELLED");
    L20:
        r02.append(Constants.AES_SUFFIX);
        return r02.toString();
    L6:
        if (isDone() == false) goto L22;
        zze(r02);
        goto L20
    L22:
        String r1 = zza();     // Catch: RuntimeException -> L10
    L12:
        if (r1 == null) goto L17;
        if (r1.isEmpty() == true) goto L17;
        r02.append("PENDING, info=[");
        r02.append(r1);
        r02.append(Constants.AES_SUFFIX);
    L17:
        if (isDone() == false) goto L19;
        zze(r02);
        goto L20
    L19:
        r02.append("PENDING");
    L10:
        e = move-exception;
        r1 = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
        goto L12
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String zza() {
        Object r02 = this.zzc;
        if ((r02 instanceof zzk) == false) goto L7;
        zzcz r03 = ((zzk) r02).zzb;
        return "setFuture=[null]";
    L7:
        if ((this instanceof ScheduledFuture) == true) goto L9;
        return null;
    L9:
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // com.google.android.gms.internal.play_billing.zzcz
    public final void zzb(Runnable r5, Executor r6) {
        r6.getClass();
        zzh r02 = this.zzd;
        zzh r1 = zzh.zza;
        if (r02 == r1) goto L10;
        zzh r2 = new zzh(r5, r6);
    L5:
        r2.zzd = r02;
        if (zzb.zzc(this, r02, r2) == true) goto L7;
        r02 = this.zzd;
        if (r02 != r1) goto L5;
    L7:
        return;
    L10:
        zzf(r5, r6);
    }

    public boolean zzd(Object r3) {
        if (r3 != null) goto L5;
        r3 = zzh;
    L5:
        if (zzb.zzd(this, null, r3) == false) goto L8;
        zzc(this);
        return true;
    L8:
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long r20, TimeUnit r22) throws InterruptedException, TimeoutException, ExecutionException {
        long r4 = r22.toNanos(r20);
        if (Thread.interrupted() == true) goto L81;
        Object r6 = this.zzc;
        if (r6 == null) goto L7;
        boolean r9 = true;
    L9:
        if ((r9 & (!(r6 instanceof zzk))) == false) goto L13;
        return zzh(r6);
    L13:
        if (r4 <= 0) goto L15;
        long r11 = System.nanoTime() + r4;
    L17:
        if (r4 < 1000) goto L42;
        zzm r62 = this.zze;
        zzm r15 = zzm.zza;
        if (r62 == r15) goto L41;
        zzm r7 = new zzm();
        boolean r16 = true;
    L21:
        zzd r8 = zzb;
        r8.zza(r7, r62);
        if (r8.zze(this, r62, r7) == true) goto L23;
        r62 = this.zze;
        if (r62 != r15) goto L21;
    L23:
        LockSupport.parkNanos(this, r4);
        if (Thread.interrupted() == true) goto L36;
        Object r42 = this.zzc;
        if (r42 == null) goto L28;
        boolean r5 = true;
    L30:
        if ((r5 & (!(r42 instanceof zzk))) == true) goto L32;
        r4 = r11 - System.nanoTime();
        if (r4 >= 1000) goto L23;
        zzg(r7);
    L44:
        if (r4 <= 0) goto L58;
        Object r43 = this.zzc;
        if (r43 == null) goto L48;
        boolean r52 = r16;
    L50:
        if ((r52 & (!(r43 instanceof zzk))) == true) goto L52;
        if (Thread.interrupted() == true) goto L57;
        r4 = r11 - System.nanoTime();
        goto L44
    L57:
        throw new InterruptedException();
    L52:
        return zzh(r43);
    L48:
        r52 = false;
        goto L50
    L58:
        String r63 = toString();
        String r72 = r22.toString();
        Locale r82 = Locale.ROOT;
        String r73 = r72.toLowerCase(r82);
        String r2 = "Waited " + r20 + " " + r22.toString().toLowerCase(r82);
        if ((r4 + 1000) >= 0) goto L75;
        String r23 = r2.concat(" (plus ");
        long r44 = -r4;
        long r112 = r22.convert(r44, TimeUnit.NANOSECONDS);
        long r45 = r44 - r22.toNanos(r112);
        if (r112 != 0) goto L63;
    L66:
        if (r112 <= 0) goto L71;
        String r24 = r23 + r112 + " " + r73;
        if (r16 == false) goto L70;
        r24 = r24.concat(Constants.SEPARATOR_COMMA);
    L70:
        r23 = r24.concat(" ");
    L71:
        if (r16 == false) goto L73;
        r23 = r23 + r45 + " nanoseconds ";
    L73:
        r2 = r23.concat("delay)");
        goto L75
    L63:
        if (r45 > 1000) goto L66;
        r16 = false;
    L75:
        if (isDone() == false) goto L79;
        throw new TimeoutException(r2.concat(" but future completed as timeout expired"));
    L79:
        throw new TimeoutException(r2 + " for " + r63);
    L32:
        return zzh(r42);
    L28:
        r5 = false;
        goto L30
    L36:
        zzg(r7);
        throw new InterruptedException();
    L41:
        return zzh(this.zzc);
    L42:
        r16 = true;
        goto L44
    L15:
        r11 = 0;
        goto L17
    L7:
        r9 = false;
        goto L9
    L81:
        throw new InterruptedException();
    }
}
