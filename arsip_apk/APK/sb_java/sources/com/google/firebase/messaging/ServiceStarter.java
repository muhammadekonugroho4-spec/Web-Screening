package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayDeque;
import java.util.Queue;

@KeepForSdk
/* loaded from: classes6.dex */
public class ServiceStarter {
    static final String ACTION_MESSAGING_EVENT = "com.google.firebase.MESSAGING_EVENT";
    static final int ERROR_ILLEGAL_STATE_EXCEPTION = 402;
    static final int ERROR_ILLEGAL_STATE_EXCEPTION_FALLBACK_TO_BIND = 403;
    static final int ERROR_NOT_FOUND = 404;
    static final int ERROR_SECURITY_EXCEPTION = 401;

    @KeepForSdk
    public static final int ERROR_UNKNOWN = 500;
    private static final String EXTRA_WRAPPED_INTENT = "wrapped_intent";
    private static final String PERMISSIONS_MISSING_HINT = "this should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    public static final int SUCCESS = -1;
    private static ServiceStarter instance;
    private String firebaseMessagingServiceClassName;
    private Boolean hasAccessNetworkStatePermission;
    private Boolean hasWakeLockPermission;
    private final Queue<Intent> messagingEvents;

    private ServiceStarter() {
        this.firebaseMessagingServiceClassName = null;
        this.hasWakeLockPermission = null;
        this.hasAccessNetworkStatePermission = null;
        this.messagingEvents = new ArrayDeque();
    }

    private int doStartService(Context r5, Intent r6) {
        String r02 = resolveServiceClassName(r5, r6);
        if (r02 != null) goto L5;
    L26:
    L11:
        e = move-exception;
        Log.e(Constants.TAG, "Failed to start service while in background: " + e);
        return ERROR_ILLEGAL_STATE_EXCEPTION;
    L13:
        e = move-exception;
        Log.e(Constants.TAG, "Error while delivering the message to the serviceIntent", e);
        return 401;
    L9:
        if (hasWakeLockPermission(r5) == false) goto L15;
        ComponentName r52 = WakeLockHolder.startWakefulService(r5, r6);     // Catch: IllegalStateException -> L11 SecurityException -> L13
    L16:
        if (r52 != null) goto L20;
        Log.e(Constants.TAG, "Error while delivering the message: ServiceIntent not found.");     // Catch: IllegalStateException -> L11 SecurityException -> L13
        return ERROR_NOT_FOUND;
    L20:
        return -1;
    L15:
        r52 = r5.startService(r6);     // Catch: IllegalStateException -> L11 SecurityException -> L13
        Log.d(Constants.TAG, "Missing wake lock permission, service start may be delayed");     // Catch: IllegalStateException -> L11 SecurityException -> L13
        goto L16
    L5:
        if (Log.isLoggable(Constants.TAG, 3) == false) goto L7;
        Log.d(Constants.TAG, "Restricting intent to a specific service: " + r02);
    L7:
        r6.setClassName(r5.getPackageName(), r02);
        goto L26
    }

    public static synchronized ServiceStarter getInstance() {
        monitor-enter(ServiceStarter.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (instance != null) goto L9;
        instance = new ServiceStarter();     // Catch: Throwable -> L7
    L9:
        ServiceStarter r1 = instance;     // Catch: Throwable -> L7
        monitor-exit(ServiceStarter.class);
        return r1;
    }

    private synchronized String resolveServiceClassName(Context r4, Intent r5) {
        monitor-enter(this);
        String r02 = this.firebaseMessagingServiceClassName;     // Catch: Throwable -> L20
        if (r02 == null) goto L7;
        monitor-exit(this);
        return r02;
    L7:
        ResolveInfo r52 = r4.getPackageManager().resolveService(r5, 0);     // Catch: Throwable -> L20
        if (r52 == null) goto L29;
        ServiceInfo r53 = r52.serviceInfo;     // Catch: Throwable -> L20
        if (r53 == null) goto L29;
        if (r4.getPackageName().equals(r53.packageName) == false) goto L26;
        String r1 = r53.name;     // Catch: Throwable -> L20
        if (r1 == null) goto L26;
        if (r1.startsWith(".") == false) goto L22;
        this.firebaseMessagingServiceClassName = r4.getPackageName() + r53.name;     // Catch: Throwable -> L20
    L23:
        String r42 = this.firebaseMessagingServiceClassName;     // Catch: Throwable -> L20
        monitor-exit(this);
        return r42;
    L22:
        this.firebaseMessagingServiceClassName = r53.name;     // Catch: Throwable -> L20
    L26:
        Log.e(Constants.TAG, "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + r53.packageName + RemoteSettings.FORWARD_SLASH_STRING + r53.name);     // Catch: Throwable -> L20
        monitor-exit(this);
        return null;
    L29:
        Log.e(Constants.TAG, "Failed to resolve target intent service, skipping classname enforcement");     // Catch: Throwable -> L20
        monitor-exit(this);
        return null;
    L20:
        th = move-exception;
        throw th;
    }

    public static void setForTesting(ServiceStarter r02) {
        instance = r02;
    }

    public Intent getMessagingEvent() {
        return this.messagingEvents.poll();
    }

    public boolean hasAccessNetworkStatePermission(Context r2) {
        if (this.hasAccessNetworkStatePermission != null) goto L10;
        if (r2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) goto L7;
        boolean r22 = true;
    L8:
        this.hasAccessNetworkStatePermission = Boolean.valueOf(r22);
        goto L10
    L7:
        r22 = false;
    L10:
        if (this.hasWakeLockPermission.booleanValue() == true) goto L15;
        if (Log.isLoggable(Constants.TAG, 3) == false) goto L15;
        Log.d(Constants.TAG, "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
    L15:
        return this.hasAccessNetworkStatePermission.booleanValue();
    }

    public boolean hasWakeLockPermission(Context r2) {
        if (this.hasWakeLockPermission != null) goto L10;
        if (r2.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") != 0) goto L7;
        boolean r22 = true;
    L8:
        this.hasWakeLockPermission = Boolean.valueOf(r22);
        goto L10
    L7:
        r22 = false;
    L10:
        if (this.hasWakeLockPermission.booleanValue() == true) goto L15;
        if (Log.isLoggable(Constants.TAG, 3) == false) goto L15;
        Log.d(Constants.TAG, "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
    L15:
        return this.hasWakeLockPermission.booleanValue();
    }

    public int startMessagingService(Context r3, Intent r4) {
        if (Log.isLoggable(Constants.TAG, 3) == false) goto L5;
        Log.d(Constants.TAG, "Starting service");
    L5:
        this.messagingEvents.offer(r4);
        Intent r42 = new Intent(ACTION_MESSAGING_EVENT);
        r42.setPackage(r3.getPackageName());
        return doStartService(r3, r42);
    }
}
