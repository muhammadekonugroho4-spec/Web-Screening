package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
class SnackbarManager {
    private static final int LONG_DURATION_MS = 2750;
    static final int MSG_TIMEOUT = 0;
    private static final int SHORT_DURATION_MS = 1500;
    private static SnackbarManager snackbarManager;
    private SnackbarRecord currentSnackbar;
    private final Handler handler;
    private final Object lock;
    private SnackbarRecord nextSnackbar;

    public interface Callback {
        void dismiss(int r1);

        void show();
    }

    public static class SnackbarRecord {
        final WeakReference<Callback> callback;
        int duration;
        boolean paused;

        public SnackbarRecord(int r2, Callback r3) {
            this.callback = new WeakReference(r3);
            this.duration = r2;
        }

        public boolean isSnackbar(Callback r2) {
            if (r2 != null) goto L4;
            return false;
        L4:
            if (this.callback.get() != r2) goto L9;
            return true;
        L9:
            return false;
        }
    }

    private SnackbarManager() {
        this.lock = new Object();
        this.handler = new Handler(Looper.getMainLooper(), new AnonymousClass1(this));
    }

    private boolean cancelSnackbarLocked(SnackbarRecord r3, int r4) {
        Callback r02 = r3.callback.get();
        if (r02 == null) goto L6;
        this.handler.removeCallbacksAndMessages(r3);
        r02.dismiss(r4);
        return true;
    L6:
        return false;
    }

    public static SnackbarManager getInstance() {
        if (snackbarManager != null) goto L6;
        snackbarManager = new SnackbarManager();
    L6:
        return snackbarManager;
    }

    private boolean isCurrentSnackbarLocked(Callback r2) {
        SnackbarRecord r02 = this.currentSnackbar;
        if (r02 != null) goto L5;
        return false;
    L5:
        if (r02.isSnackbar(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    private boolean isNextSnackbarLocked(Callback r2) {
        SnackbarRecord r02 = this.nextSnackbar;
        if (r02 != null) goto L5;
        return false;
    L5:
        if (r02.isSnackbar(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    private void scheduleTimeoutLocked(SnackbarRecord r5) {
        int r02 = r5.duration;
        if (r02 != (-2)) goto L5;
        return;
    L5:
        if (r02 <= 0) goto L8;
    L11:
        this.handler.removeCallbacksAndMessages(r5);
        Handler r1 = this.handler;
        r1.sendMessageDelayed(Message.obtain(r1, 0, r5), r02);
        return;
    L8:
        if (r02 != (-1)) goto L10;
        r02 = 1500;
        goto L11
    L10:
        r02 = LONG_DURATION_MS;
        goto L11
    }

    private void showNextSnackbarLocked() {
        SnackbarRecord r02 = this.nextSnackbar;
        if (r02 == null) goto L10;
        this.currentSnackbar = r02;
        this.nextSnackbar = null;
        Callback r03 = r02.callback.get();
        if (r03 == null) goto L8;
        r03.show();
        return;
    L8:
        this.currentSnackbar = null;
        return;
    }

    public void dismiss(Callback r3, int r4) {
        Object r02 = this.lock;
        monitor-enter(r02);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (isCurrentSnackbarLocked(r3) == false) goto L10;
        cancelSnackbarLocked(this.currentSnackbar, r4);     // Catch: Throwable -> L7
    L12:
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L10:
        if (isNextSnackbarLocked(r3) == false) goto L12;
        cancelSnackbarLocked(this.nextSnackbar, r4);     // Catch: Throwable -> L7
        goto L12
    }

    public void handleTimeout(SnackbarRecord r3) {
        Object r02 = this.lock;
        monitor-enter(r02);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (this.currentSnackbar != r3) goto L7;
    L11:
        cancelSnackbarLocked(r3, 2);     // Catch: Throwable -> L9
    L12:
        monitor-exit(r02);     // Catch: Throwable -> L9
        return;
    L7:
        if (this.nextSnackbar != r3) goto L12;
        goto L12
    }

    public boolean isCurrent(Callback r2) {
        Object r02 = this.lock;
        monitor-enter(r02);
        boolean r22 = isCurrentSnackbarLocked(r2);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r22;
    L7:
        th = move-exception;
        throw th;
    }

    public boolean isCurrentOrNext(Callback r3) {
        Object r02 = this.lock;
        monitor-enter(r02);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (isCurrentSnackbarLocked(r3) == false) goto L7;
    L12:
        boolean r32 = true;
    L13:
        monitor-exit(r02);     // Catch: Throwable -> L10
        return r32;
    L7:
        if (isNextSnackbarLocked(r3) == true) goto L12;
        r32 = false;
        goto L13
    }

    public void onDismissed(Callback r2) {
        Object r02 = this.lock;
        monitor-enter(r02);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (isCurrentSnackbarLocked(r2) == false) goto L11;
        this.currentSnackbar = null;     // Catch: Throwable -> L9
        if (this.nextSnackbar == null) goto L11;
        showNextSnackbarLocked();     // Catch: Throwable -> L9
    L11:
        monitor-exit(r02);     // Catch: Throwable -> L9
    }

    public void onShown(Callback r2) {
        Object r02 = this.lock;
        monitor-enter(r02);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (isCurrentSnackbarLocked(r2) == false) goto L9;
        scheduleTimeoutLocked(this.currentSnackbar);     // Catch: Throwable -> L7
    L9:
        monitor-exit(r02);     // Catch: Throwable -> L7
    }

    public void pauseTimeout(Callback r3) {
        Object r02 = this.lock;
        monitor-enter(r02);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (isCurrentSnackbarLocked(r3) == false) goto L11;
        SnackbarRecord r32 = this.currentSnackbar;     // Catch: Throwable -> L9
        if (r32.paused == true) goto L11;
        r32.paused = true;     // Catch: Throwable -> L9
        this.handler.removeCallbacksAndMessages(r32);     // Catch: Throwable -> L9
    L11:
        monitor-exit(r02);     // Catch: Throwable -> L9
    }

    public void restoreTimeoutIfPaused(Callback r3) {
        Object r02 = this.lock;
        monitor-enter(r02);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (isCurrentSnackbarLocked(r3) == false) goto L11;
        SnackbarRecord r32 = this.currentSnackbar;     // Catch: Throwable -> L9
        if (r32.paused == false) goto L11;
        r32.paused = false;     // Catch: Throwable -> L9
        scheduleTimeoutLocked(r32);     // Catch: Throwable -> L9
    L11:
        monitor-exit(r02);     // Catch: Throwable -> L9
    }

    public void show(int r3, Callback r4) {
        Object r02 = this.lock;
        monitor-enter(r02);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (isCurrentSnackbarLocked(r4) == false) goto L12;
        SnackbarRecord r42 = this.currentSnackbar;     // Catch: Throwable -> L9
        r42.duration = r3;     // Catch: Throwable -> L9
        this.handler.removeCallbacksAndMessages(r42);     // Catch: Throwable -> L9
        scheduleTimeoutLocked(this.currentSnackbar);     // Catch: Throwable -> L9
        monitor-exit(r02);     // Catch: Throwable -> L9
        return;
    L12:
        if (isNextSnackbarLocked(r4) == false) goto L14;
        this.nextSnackbar.duration = r3;     // Catch: Throwable -> L9
    L15:
        SnackbarRecord r32 = this.currentSnackbar;     // Catch: Throwable -> L9
        if (r32 != null) goto L18;
    L21:
        this.currentSnackbar = null;     // Catch: Throwable -> L9
        showNextSnackbarLocked();     // Catch: Throwable -> L9
        monitor-exit(r02);     // Catch: Throwable -> L9
        return;
    L18:
        if (cancelSnackbarLocked(r32, 4) == false) goto L21;
        monitor-exit(r02);     // Catch: Throwable -> L9
        return;
    L14:
        this.nextSnackbar = new SnackbarRecord(r3, r4);     // Catch: Throwable -> L9
        goto L15
    }
}
