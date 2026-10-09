package com.google.zxing.client.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* loaded from: classes6.dex */
public final class InactivityTimer {
    private static final long INACTIVITY_DELAY_MS = 300000;
    private static final String TAG = "InactivityTimer";
    private Runnable callback;
    private final Context context;
    private Handler handler;
    private boolean onBattery;
    private final BroadcastReceiver powerStatusReceiver;
    private boolean registered;

    /* renamed from: com.google.zxing.client.android.InactivityTimer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public final class PowerStatusReceiver extends BroadcastReceiver {
        final /* synthetic */ InactivityTimer this$0;

        private PowerStatusReceiver(InactivityTimer r1) {
            this.this$0 = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context r2, Intent r3) {
            if ("android.intent.action.BATTERY_CHANGED".equals(r3.getAction()) == true) goto L5;
            return;
        L5:
            if (r3.getIntExtra("plugged", -1) > 0) goto L7;
            final boolean r22 = true;
        L8:
            InactivityTimer.access$200(this.this$0).post(new AnonymousClass1(this, r22));
            return;
        L7:
            r22 = false;
            goto L8
        }

        public /* synthetic */ PowerStatusReceiver(InactivityTimer r1, AnonymousClass1 r2) {
            this(r1);
        }
    }

    static {
    }

    public InactivityTimer(Context r2, Runnable r3) {
        this.registered = false;
        this.context = r2;
        this.callback = r3;
        this.powerStatusReceiver = new PowerStatusReceiver(this, null);
        this.handler = new Handler();
    }

    public static /* synthetic */ void access$100(InactivityTimer r02, boolean r1) {
        r02.onBattery(r1);
    }

    public static /* synthetic */ Handler access$200(InactivityTimer r02) {
        return r02.handler;
    }

    private void cancelCallback() {
        this.handler.removeCallbacksAndMessages(null);
    }

    private void onBattery(boolean r1) {
        this.onBattery = r1;
        if (this.registered == false) goto L6;
        activity();
        return;
    }

    private void registerReceiver() {
        if (this.registered == true) goto L6;
        this.context.registerReceiver(this.powerStatusReceiver, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.registered = true;
        return;
    }

    private void unregisterReceiver() {
        if (this.registered == false) goto L6;
        this.context.unregisterReceiver(this.powerStatusReceiver);
        this.registered = false;
        return;
    }

    public void activity() {
        cancelCallback();
        if (this.onBattery == false) goto L6;
        this.handler.postDelayed(this.callback, INACTIVITY_DELAY_MS);
        return;
    }

    public void cancel() {
        cancelCallback();
        unregisterReceiver();
    }

    public void start() {
        registerReceiver();
        activity();
    }
}
