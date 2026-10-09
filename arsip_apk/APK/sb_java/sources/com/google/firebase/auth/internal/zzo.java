package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class zzo {
    private static zzo zza;

    static {
        zza = new zzo();
    }

    private zzo() {
    }

    private static SharedPreferences zza(Context r1, String r2) {
        return r1.getSharedPreferences(String.format("com.google.firebase.auth.internal.browserSignInSessionStore.%s", new Object[]{r2}), 0);
    }

    public final synchronized String zzb(Context r4, String r5, String r6) {
        monitor-enter(this);
        Preconditions.checkNotEmpty(r5);     // Catch: Throwable -> L9
        Preconditions.checkNotEmpty(r6);     // Catch: Throwable -> L9
        SharedPreferences r42 = zza(r4, r5);     // Catch: Throwable -> L9
        String r52 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{r6});     // Catch: Throwable -> L9
        String r1 = r42.getString(r52, null);     // Catch: Throwable -> L9
        String r62 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{r6});     // Catch: Throwable -> L9
        String r2 = r42.getString(r62, null);     // Catch: Throwable -> L9
        SharedPreferences.Editor r43 = r42.edit();     // Catch: Throwable -> L9
        r43.remove(r52);     // Catch: Throwable -> L9
        r43.remove(r62);     // Catch: Throwable -> L9
        r43.apply();     // Catch: Throwable -> L9
        if (TextUtils.isEmpty(r1) == false) goto L7;
        monitor-exit(this);
        return null;
    L7:
        monitor-exit(this);
        return r2;
    L9:
        th = move-exception;
        throw th;
    }

    public final synchronized zzr zza(Context r10, String r11, String r12) {
        monitor-enter(this);
        Preconditions.checkNotEmpty(r11);     // Catch: Throwable -> L10
        Preconditions.checkNotEmpty(r12);     // Catch: Throwable -> L10
        SharedPreferences r102 = zza(r10, r11);     // Catch: Throwable -> L10
        String r112 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", new Object[]{r12});     // Catch: Throwable -> L10
        String r02 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{r12});     // Catch: Throwable -> L10
        String r1 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", new Object[]{r12});     // Catch: Throwable -> L10
        String r122 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{r12});     // Catch: Throwable -> L10
        String r4 = r102.getString(r112, null);     // Catch: Throwable -> L10
        String r5 = r102.getString(r02, null);     // Catch: Throwable -> L10
        String r6 = r102.getString(r1, null);     // Catch: Throwable -> L10
        String r7 = r102.getString("com.google.firebase.auth.api.gms.config.tenant.id", null);     // Catch: Throwable -> L10
        String r8 = r102.getString(r122, null);     // Catch: Throwable -> L10
        SharedPreferences.Editor r103 = r102.edit();     // Catch: Throwable -> L10
        r103.remove(r112);     // Catch: Throwable -> L10
        r103.remove(r02);     // Catch: Throwable -> L10
        r103.remove(r1);     // Catch: Throwable -> L10
        r103.remove(r122);     // Catch: Throwable -> L10
        r103.apply();     // Catch: Throwable -> L10
        if (r4 == null) goto L12;
        if (r5 == null) goto L12;
        if (r6 == null) goto L12;
        zzr r3 = new zzr(r4, r5, r6, r7, r8);     // Catch: Throwable -> L10
        monitor-exit(this);
        return r3;
    L12:
        monitor-exit(this);
        return null;
    L10:
        th = move-exception;
        throw th;
    }

    public static zzo zza() {
        return zza;
    }

    private static void zza(SharedPreferences r2) {
        SharedPreferences.Editor r02 = r2.edit();
        Iterator<String> r22 = r2.getAll().keySet().iterator();
    L4:
        if (r22.hasNext() == false) goto L6;
        r02.remove(r22.next());
        goto L4
    L6:
        r02.apply();
    }

    public final synchronized void zza(Context r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9) {
        monitor-enter(this);
        Preconditions.checkNotEmpty(r3);     // Catch: Throwable -> L6
        Preconditions.checkNotEmpty(r4);     // Catch: Throwable -> L6
        Preconditions.checkNotEmpty(r5);     // Catch: Throwable -> L6
        Preconditions.checkNotEmpty(r9);     // Catch: Throwable -> L6
        SharedPreferences r22 = zza(r2, r3);     // Catch: Throwable -> L6
        zza(r22);     // Catch: Throwable -> L6
        SharedPreferences.Editor r23 = r22.edit();     // Catch: Throwable -> L6
        r23.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", new Object[]{r4}), r5);     // Catch: Throwable -> L6
        r23.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{r4}), r6);     // Catch: Throwable -> L6
        r23.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", new Object[]{r4}), r7);     // Catch: Throwable -> L6
        r23.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{r4}), r9);     // Catch: Throwable -> L6
        r23.putString("com.google.firebase.auth.api.gms.config.tenant.id", r8);     // Catch: Throwable -> L6
        r23.apply();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public final synchronized void zza(Context r2, String r3, String r4, String r5, String r6) {
        monitor-enter(this);
        Preconditions.checkNotEmpty(r3);     // Catch: Throwable -> L6
        Preconditions.checkNotEmpty(r4);     // Catch: Throwable -> L6
        SharedPreferences r22 = zza(r2, r3);     // Catch: Throwable -> L6
        zza(r22);     // Catch: Throwable -> L6
        SharedPreferences.Editor r23 = r22.edit();     // Catch: Throwable -> L6
        r23.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{r4}), r5);     // Catch: Throwable -> L6
        r23.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{r4}), r6);     // Catch: Throwable -> L6
        r23.apply();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }
}
