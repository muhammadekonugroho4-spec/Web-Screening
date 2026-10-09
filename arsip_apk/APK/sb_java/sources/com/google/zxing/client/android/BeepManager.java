package com.google.zxing.client.android;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class BeepManager {
    private static final float BEEP_VOLUME = 0.1f;
    private static final String TAG = "BeepManager";
    private static final long VIBRATE_DURATION = 200;
    private boolean beepEnabled;
    private final Context context;
    private boolean vibrateEnabled;

    static {
    }

    public BeepManager(Activity r2) {
        this.beepEnabled = true;
        this.vibrateEnabled = false;
        r2.setVolumeControlStream(3);
        this.context = r2.getApplicationContext();
    }

    public static /* synthetic */ String access$000() {
        return TAG;
    }

    public boolean isBeepEnabled() {
        return this.beepEnabled;
    }

    public boolean isVibrateEnabled() {
        return this.vibrateEnabled;
    }

    public MediaPlayer playBeepSound() {
        MediaPlayer r1 = new MediaPlayer();
        r1.setAudioStreamType(3);
        r1.setOnCompletionListener(new AnonymousClass1(this));
        r1.setOnErrorListener(new AnonymousClass2(this));
        AssetFileDescriptor r7 = this.context.getResources().openRawResourceFd(R.raw.zxing_beep);     // Catch: IOException -> L7
        r1.setDataSource(r7.getFileDescriptor(), r7.getStartOffset(), r7.getLength());     // Catch: Throwable -> L9
        r7.close();     // Catch: IOException -> L7
        r1.setVolume(BEEP_VOLUME, BEEP_VOLUME);     // Catch: IOException -> L7
        r1.prepare();     // Catch: IOException -> L7
        r1.start();     // Catch: IOException -> L7
        return r1;
    L9:
        th = move-exception;
        r7.close();     // Catch: IOException -> L7
        throw th;     // Catch: IOException -> L7
    L7:
        e = move-exception;
        Log.w(TAG, e);
        r1.release();
        return null;
    }

    public synchronized void playBeepSoundAndVibrate() {
        monitor-enter(this);
    L6:
        th = move-exception;
        throw th;
    L4:
        if (this.beepEnabled == false) goto L9;
        playBeepSound();     // Catch: Throwable -> L6
    L9:
        if (this.vibrateEnabled == false) goto L11;
        ((Vibrator) this.context.getSystemService("vibrator")).vibrate(VIBRATE_DURATION);     // Catch: Throwable -> L6
    L11:
        monitor-exit(this);
    }

    public void setBeepEnabled(boolean r1) {
        this.beepEnabled = r1;
    }

    public void setVibrateEnabled(boolean r1) {
        this.vibrateEnabled = r1;
    }
}
