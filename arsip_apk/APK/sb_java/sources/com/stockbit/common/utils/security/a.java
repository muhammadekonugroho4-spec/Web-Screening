package com.stockbit.common.utils.security;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.google.firebase.messaging.Constants;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.Certificate;
import kotlin.jvm.internal.p;
import kotlin.text.C11850c;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f62399a = null;

    static {
        f62399a = new a();
    }

    public a() {
    }

    public final void a() {
        KeyStore r1 = KeyStore.getInstance("AndroidKeyStore");
        r1.load(null);
        if (r1.containsAlias("trusted_device_key") == false) goto L5;
        return;
    L5:
        KeyPairGenerator r02 = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
        KeyGenParameterSpec.Builder r12 = new KeyGenParameterSpec.Builder("trusted_device_key", 12);
        r12.setDigests(new String[]{"SHA-256", "SHA-512"});
        KeyGenParameterSpec r13 = r12.build();
        p.k(r13, "run(...)");
        r02.initialize(r13);
        r02.generateKeyPair();
    }

    public final PrivateKey b() {
        KeyStore r02 = KeyStore.getInstance("AndroidKeyStore");
        r02.load(null);
        Key r03 = r02.getKey("trusted_device_key", null);
        if ((r03 instanceof PrivateKey) == true) goto L5;
        return null;
    L5:
        return (PrivateKey) r03;
    }

    public final String c() {
        KeyStore r02 = KeyStore.getInstance("AndroidKeyStore");
        r02.load(null);
        Certificate r03 = r02.getCertificate("trusted_device_key");
        if (r03 == null) goto L9;
        PublicKey r04 = r03.getPublicKey();
        if (r04 == null) goto L9;
        return Base64.encodeToString(r04.getEncoded(), 2);
    L9:
        return null;
    }

    public final boolean d() {
        KeyStore r02 = KeyStore.getInstance("AndroidKeyStore");     // Catch: Exception -> L4
        r02.load(null);     // Catch: Exception -> L4
        return r02.containsAlias("trusted_device_key");
    L4:
        return false;
    }

    public final void e() {
        KeyStore r02 = KeyStore.getInstance("AndroidKeyStore");     // Catch: Exception -> L4
        r02.load(null);     // Catch: Exception -> L4
        r02.deleteEntry("trusted_device_key");     // Catch: Exception -> L4
        return;
    L4:
        e = move-exception;
        com.stockbit.lib.trackerwrapper.a.f120528b.p(6, "Failed to remove private key from KeyStore : " + e.getMessage());
    }

    public final String f(String r6) {
        p.l(r6, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        PrivateKey r1 = b();     // Catch: Exception -> L8
        if (r1 != null) goto L6;
        return null;
    L6:
        Signature r2 = Signature.getInstance("SHA256withECDSA");     // Catch: Exception -> L8
        r2.initSign(r1);     // Catch: Exception -> L8
        byte[] r62 = r6.getBytes(C11850c.f180362b);     // Catch: Exception -> L8
        p.k(r62, "getBytes(...)");     // Catch: Exception -> L8
        r2.update(r62);     // Catch: Exception -> L8
        return Base64.encodeToString(r2.sign(), 2);
    L8:
        e = move-exception;
        com.stockbit.lib.trackerwrapper.a.f120528b.f(6, "[ECKeyStoreHelper] Error: " + e.getMessage(), e, true);
        return null;
    }
}
