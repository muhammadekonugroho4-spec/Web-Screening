package com.huawei.hms.common.internal;

import java.util.ArrayList;
import java.util.ListIterator;

/* loaded from: classes6.dex */
public class BindResolveClients {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f39095b = null;

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<ResolveClientBean> f39096a;

    public static /* synthetic */ class a {
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final BindResolveClients f39097a = null;

        static {
            f39097a = new BindResolveClients(null);
        }

        public static /* synthetic */ BindResolveClients a() {
            return f39097a;
        }
    }

    static {
        f39095b = new Object();
    }

    public /* synthetic */ BindResolveClients(a r1) {
        this();
    }

    public static BindResolveClients getInstance() {
        return b.a();
    }

    public boolean isClientRegistered(ResolveClientBean r3) {
        Object r02 = f39095b;
        monitor-enter(r02);
        boolean r32 = this.f39096a.contains(r3);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r32;
    L7:
        th = move-exception;
        throw th;
    }

    public void notifyClientReconnect() {
        Object r02 = f39095b;
        monitor-enter(r02);
        ListIterator<ResolveClientBean> r1 = this.f39096a.listIterator();     // Catch: Throwable -> L8
    L6:
        if (r1.hasNext() == false) goto L10;
        r1.next().clientReconnect();     // Catch: Throwable -> L8
        goto L6
    L10:
        this.f39096a.clear();     // Catch: Throwable -> L8
        monitor-exit(r02);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public void register(ResolveClientBean r3) {
        if (r3 != null) goto L4;
        return;
    L4:
        Object r02 = f39095b;
        monitor-enter(r02);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (this.f39096a.contains(r3) == true) goto L11;
        this.f39096a.add(r3);     // Catch: Throwable -> L9
    L11:
        monitor-exit(r02);     // Catch: Throwable -> L9
    }

    public void unRegister(ResolveClientBean r4) {
        if (r4 != null) goto L4;
        return;
    L4:
        Object r02 = f39095b;
        monitor-enter(r02);
    L14:
        th = move-exception;
        throw th;
    L7:
        if (this.f39096a.contains(r4) == false) goto L16;
        ListIterator<ResolveClientBean> r1 = this.f39096a.listIterator();     // Catch: Throwable -> L14
    L10:
        if (r1.hasNext() == false) goto L16;
        if (r4.equals(r1.next()) == false) goto L10;
        r1.remove();     // Catch: Throwable -> L14
    L16:
        monitor-exit(r02);     // Catch: Throwable -> L14
    }

    public void unRegisterAll() {
        Object r02 = f39095b;
        monitor-enter(r02);
        this.f39096a.clear();     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    private BindResolveClients() {
        this.f39096a = new ArrayList();
    }
}
