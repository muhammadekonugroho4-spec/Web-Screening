package com.huawei.hms.adapter.sysobs;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class SystemManager {

    /* renamed from: a, reason: collision with root package name */
    private static SystemManager f38939a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f38940b = null;

    /* renamed from: c, reason: collision with root package name */
    private static SystemNotifier f38941c;

    public static class a implements SystemNotifier {

        /* renamed from: a, reason: collision with root package name */
        private final List<SystemObserver> f38942a;

        public a() {
            this.f38942a = new ArrayList();
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyNoticeObservers(int r4) {
            Object r02 = SystemManager.a();
            monitor-enter(r02);
            Iterator<SystemObserver> r1 = this.f38942a.iterator();     // Catch: Throwable -> L10
        L6:
            if (r1.hasNext() == false) goto L12;
            if (r1.next().onNoticeResult(r4) == false) goto L6;
            r1.remove();     // Catch: Throwable -> L10
            goto L6
        L12:
            monitor-exit(r02);     // Catch: Throwable -> L10
            return;
        L10:
            th = move-exception;
            throw th;
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(Intent r4, String r5) {
            Object r02 = SystemManager.a();
            monitor-enter(r02);
            Iterator<SystemObserver> r1 = this.f38942a.iterator();     // Catch: Throwable -> L10
        L6:
            if (r1.hasNext() == false) goto L12;
            if (r1.next().onSolutionResult(r4, r5) == false) goto L6;
            r1.remove();     // Catch: Throwable -> L10
            goto L6
        L12:
            monitor-exit(r02);     // Catch: Throwable -> L10
            return;
        L10:
            th = move-exception;
            throw th;
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void registerObserver(SystemObserver r3) {
            if (r3 != null) goto L5;
            return;
        L5:
            if (this.f38942a.contains(r3) == true) goto L14;
            Object r02 = SystemManager.a();
            monitor-enter(r02);
            this.f38942a.add(r3);     // Catch: Throwable -> L11
            monitor-exit(r02);     // Catch: Throwable -> L11
            return;
        L11:
            th = move-exception;
            throw th;
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void unRegisterObserver(SystemObserver r3) {
            Object r02 = SystemManager.a();
            monitor-enter(r02);
            this.f38942a.remove(r3);     // Catch: Throwable -> L7
            monitor-exit(r02);     // Catch: Throwable -> L7
            return;
        L7:
            th = move-exception;
            throw th;
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(int r4) {
            Object r02 = SystemManager.a();
            monitor-enter(r02);
            Iterator<SystemObserver> r1 = this.f38942a.iterator();     // Catch: Throwable -> L10
        L6:
            if (r1.hasNext() == false) goto L12;
            if (r1.next().onUpdateResult(r4) == false) goto L6;
            r1.remove();     // Catch: Throwable -> L10
            goto L6
        L12:
            monitor-exit(r02);     // Catch: Throwable -> L10
            return;
        L10:
            th = move-exception;
            throw th;
        }
    }

    static {
        f38939a = new SystemManager();
        f38940b = new Object();
        f38941c = new a();
    }

    private SystemManager() {
    }

    public static /* synthetic */ Object a() {
        return f38940b;
    }

    public static SystemManager getInstance() {
        return f38939a;
    }

    public static SystemNotifier getSystemNotifier() {
        return f38941c;
    }

    public void notifyNoticeResult(int r2) {
        f38941c.notifyNoticeObservers(r2);
    }

    public void notifyResolutionResult(Intent r2, String r3) {
        f38941c.notifyObservers(r2, r3);
    }

    public void notifyUpdateResult(int r2) {
        f38941c.notifyObservers(r2);
    }
}
