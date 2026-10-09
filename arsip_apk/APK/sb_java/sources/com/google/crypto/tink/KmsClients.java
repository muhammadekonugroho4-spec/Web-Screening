package com.google.crypto.tink;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes6.dex */
public final class KmsClients {
    private static List<KmsClient> autoClients;
    private static final CopyOnWriteArrayList<KmsClient> clients = null;

    static {
        clients = new CopyOnWriteArrayList();
    }

    private KmsClients() {
    }

    public static void add(KmsClient r1) {
        clients.add(r1);
    }

    public static KmsClient get(String r3) throws GeneralSecurityException {
        Iterator<KmsClient> r02 = clients.iterator();
    L4:
        if (r02.hasNext() == false) goto L9;
        KmsClient r1 = r02.next();
        if (r1.doesSupport(r3) == false) goto L4;
        return r1;
    L9:
        throw new GeneralSecurityException("No KMS client does support: " + r3);
    }

    public static synchronized KmsClient getAutoLoaded(String r4) throws GeneralSecurityException {
        monitor-enter(KmsClients.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (autoClients != null) goto L9;
        autoClients = loadAutoKmsClients();     // Catch: Throwable -> L7
    L9:
        Iterator<KmsClient> r1 = autoClients.iterator();     // Catch: Throwable -> L7
    L11:
        if (r1.hasNext() == false) goto L17;
        KmsClient r2 = r1.next();     // Catch: Throwable -> L7
        if (r2.doesSupport(r4) == false) goto L11;
        monitor-exit(KmsClients.class);
        return r2;
    L17:
        throw new GeneralSecurityException("No KMS client does support: " + r4);     // Catch: Throwable -> L7
    }

    private static List<KmsClient> loadAutoKmsClients() {
        ArrayList r02 = new ArrayList();
        Iterator r1 = ServiceLoader.load(KmsClient.class).iterator();
    L4:
        if (r1.hasNext() == false) goto L7;
        r02.add((KmsClient) r1.next());
        goto L4
    L7:
        return Collections.unmodifiableList(r02);
    }

    public static void reset() {
        clients.clear();
    }
}
