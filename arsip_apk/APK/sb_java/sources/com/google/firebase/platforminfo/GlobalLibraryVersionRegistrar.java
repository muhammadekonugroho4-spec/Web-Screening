package com.google.firebase.platforminfo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes6.dex */
public class GlobalLibraryVersionRegistrar {
    private static volatile GlobalLibraryVersionRegistrar INSTANCE;
    private final Set<LibraryVersion> infos;

    public GlobalLibraryVersionRegistrar() {
        this.infos = new HashSet();
    }

    public static GlobalLibraryVersionRegistrar getInstance() {
        GlobalLibraryVersionRegistrar r02 = INSTANCE;
        if (r02 == null) goto L5;
        return r02;
    L5:
        monitor-enter(GlobalLibraryVersionRegistrar.class);
        GlobalLibraryVersionRegistrar r03 = INSTANCE;     // Catch: Throwable -> L9
        if (r03 != null) goto L11;
        r03 = new GlobalLibraryVersionRegistrar();     // Catch: Throwable -> L9
        INSTANCE = r03;     // Catch: Throwable -> L9
    L11:
        monitor-exit(GlobalLibraryVersionRegistrar.class);     // Catch: Throwable -> L9
        return r03;
    L9:
        th = move-exception;
        throw th;
    }

    public Set<LibraryVersion> getRegisteredVersions() {
        Set<LibraryVersion> r02 = this.infos;
        monitor-enter(r02);
        Set<LibraryVersion> r1 = Collections.unmodifiableSet(this.infos);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public void registerVersion(String r3, String r4) {
        Set<LibraryVersion> r02 = this.infos;
        monitor-enter(r02);
        this.infos.add(LibraryVersion.create(r3, r4));     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
