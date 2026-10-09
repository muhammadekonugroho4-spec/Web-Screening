package com.clevertap.android.sdk.cryption;

import android.security.keystore.KeyGenParameterSpec;
import com.clevertap.android.sdk.Logger;
import com.google.android.gms.stats.CodePackage;
import java.security.Key;
import java.security.KeyStore;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final i f33747a;

    public c(i r2) {
        p.l(r2, "cryptRepository");
        this.f33747a = r2;
    }

    public final SecretKey a() {
        KeyStore r3 = KeyStore.getInstance("AndroidKeyStore");     // Catch: Exception -> L7
        r3.load(null);     // Catch: Exception -> L7
        if (r3.containsAlias("EncryptionKey") == false) goto L9;
        Key r02 = r3.getKey("EncryptionKey", null);     // Catch: Exception -> L7
        p.j(r02, "null cannot be cast to non-null type javax.crypto.SecretKey");     // Catch: Exception -> L7
        return (SecretKey) r02;
    L9:
        KeyGenerator r03 = KeyGenerator.getInstance("AES", "AndroidKeyStore");     // Catch: Exception -> L7
        KeyGenParameterSpec r1 = new KeyGenParameterSpec.Builder("EncryptionKey", 3).setBlockModes(new String[]{CodePackage.GCM}).setEncryptionPaddings(new String[]{"NoPadding"}).build();     // Catch: Exception -> L7
        p.k(r1, "build(...)");     // Catch: Exception -> L7
        r03.init(r1);     // Catch: Exception -> L7
        return r03.generateKey();
    L7:
        e = move-exception;
        Logger.v("Error generating or retrieving key", e);
        return null;
    }

    public final SecretKey b() {
        return a();
    }

    public final SecretKey c() {
        KeyGenerator r02 = KeyGenerator.getInstance("AES");
        r02.init(256);
        SecretKey r03 = r02.generateKey();
        p.i(r03);
        return r03;
    }
}
