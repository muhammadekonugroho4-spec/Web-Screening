package com.google.crypto.tink.subtle;

import com.google.android.gms.security.ProviderInstaller;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.subtle.EngineWrapper;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* loaded from: classes6.dex */
public final class EngineFactory<T_WRAPPER extends EngineWrapper<JcePrimitiveT>, JcePrimitiveT> {
    public static final EngineFactory<EngineWrapper.TCipher, Cipher> CIPHER = null;
    public static final EngineFactory<EngineWrapper.TKeyAgreement, KeyAgreement> KEY_AGREEMENT = null;
    public static final EngineFactory<EngineWrapper.TKeyFactory, KeyFactory> KEY_FACTORY = null;
    public static final EngineFactory<EngineWrapper.TKeyPairGenerator, KeyPairGenerator> KEY_PAIR_GENERATOR = null;
    public static final EngineFactory<EngineWrapper.TMac, Mac> MAC = null;
    public static final EngineFactory<EngineWrapper.TMessageDigest, MessageDigest> MESSAGE_DIGEST = null;
    public static final EngineFactory<EngineWrapper.TSignature, Signature> SIGNATURE = null;
    private final Policy<JcePrimitiveT> policy;

    /* renamed from: com.google.crypto.tink.subtle.EngineFactory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class AndroidPolicy<JcePrimitiveT> implements Policy<JcePrimitiveT> {
        private final EngineWrapper<JcePrimitiveT> jceFactory;

        public /* synthetic */ AndroidPolicy(EngineWrapper r1, AnonymousClass1 r2) {
            this(r1);
        }

        @Override // com.google.crypto.tink.subtle.EngineFactory.Policy
        public JcePrimitiveT getInstance(String r6) throws GeneralSecurityException {
            Iterator<Provider> r02 = EngineFactory.toProviderList(new String[]{ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL"}).iterator();
            Exception r2 = null;
        L4:
            if (r02.hasNext() == false) goto L12;
            return this.jceFactory.getInstance(r6, r02.next());
        L8:
            e = move-exception;
            if (r2 != null) goto L4;
            r2 = e;
            goto L4
        L12:
            return this.jceFactory.getInstance(r6, null);
        }

        private AndroidPolicy(EngineWrapper<JcePrimitiveT> r1) {
            this.jceFactory = r1;
        }

        @Override // com.google.crypto.tink.subtle.EngineFactory.Policy
        public JcePrimitiveT getInstance(String r1, List<Provider> r2) throws GeneralSecurityException {
            return getInstance(r1);
        }
    }

    public static class DefaultPolicy<JcePrimitiveT> implements Policy<JcePrimitiveT> {
        private final EngineWrapper<JcePrimitiveT> jceFactory;

        public /* synthetic */ DefaultPolicy(EngineWrapper r1, AnonymousClass1 r2) {
            this(r1);
        }

        @Override // com.google.crypto.tink.subtle.EngineFactory.Policy
        public JcePrimitiveT getInstance(String r3) throws GeneralSecurityException {
            return this.jceFactory.getInstance(r3, null);
        }

        private DefaultPolicy(EngineWrapper<JcePrimitiveT> r1) {
            this.jceFactory = r1;
        }

        @Override // com.google.crypto.tink.subtle.EngineFactory.Policy
        public JcePrimitiveT getInstance(String r3, List<Provider> r4) throws GeneralSecurityException {
            Iterator<Provider> r42 = r4.iterator();
        L4:
            if (r42.hasNext() == false) goto L9;
            Provider r02 = r42.next();
            return this.jceFactory.getInstance(r3, r02);
        L9:
            return getInstance(r3);
        }
    }

    public static class FipsPolicy<JcePrimitiveT> implements Policy<JcePrimitiveT> {
        private final EngineWrapper<JcePrimitiveT> jceFactory;

        public /* synthetic */ FipsPolicy(EngineWrapper r1, AnonymousClass1 r2) {
            this(r1);
        }

        @Override // com.google.crypto.tink.subtle.EngineFactory.Policy
        public JcePrimitiveT getInstance(String r5) throws GeneralSecurityException {
            Iterator<Provider> r02 = EngineFactory.toProviderList(new String[]{ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL", "Conscrypt"}).iterator();
            Exception r1 = null;
        L4:
            if (r02.hasNext() == false) goto L12;
            Provider r2 = r02.next();
            return this.jceFactory.getInstance(r5, r2);
        L8:
            e = move-exception;
            if (r1 != null) goto L4;
            r1 = e;
            goto L4
        L12:
            throw new GeneralSecurityException("No good Provider found.", r1);
        }

        private FipsPolicy(EngineWrapper<JcePrimitiveT> r1) {
            this.jceFactory = r1;
        }

        @Override // com.google.crypto.tink.subtle.EngineFactory.Policy
        public JcePrimitiveT getInstance(String r1, List<Provider> r2) throws GeneralSecurityException {
            return getInstance(r1);
        }
    }

    public interface Policy<JcePrimitiveT> {
        JcePrimitiveT getInstance(String r1) throws GeneralSecurityException;

        JcePrimitiveT getInstance(String r1, List<Provider> r2) throws GeneralSecurityException;
    }

    static {
        CIPHER = new EngineFactory(new EngineWrapper.TCipher());
        MAC = new EngineFactory(new EngineWrapper.TMac());
        SIGNATURE = new EngineFactory(new EngineWrapper.TSignature());
        MESSAGE_DIGEST = new EngineFactory(new EngineWrapper.TMessageDigest());
        KEY_AGREEMENT = new EngineFactory(new EngineWrapper.TKeyAgreement());
        KEY_PAIR_GENERATOR = new EngineFactory(new EngineWrapper.TKeyPairGenerator());
        KEY_FACTORY = new EngineFactory(new EngineWrapper.TKeyFactory());
    }

    public EngineFactory(T_WRAPPER r3) {
        AnonymousClass1 r1 = null;
        if (TinkFipsUtil.useOnlyFips() == false) goto L7;
        this.policy = new FipsPolicy(r3, r1);
        return;
    L7:
        if (SubtleUtil.isAndroid() == false) goto L10;
        this.policy = new AndroidPolicy(r3, r1);
        return;
    L10:
        this.policy = new DefaultPolicy(r3, r1);
    }

    public static List<Provider> toProviderList(String... r4) {
        ArrayList r02 = new ArrayList();
        int r1 = r4.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        Provider r3 = Security.getProvider(r4[r2]);
        if (r3 == null) goto L7;
        r02.add(r3);
    L7:
        r2 = r2 + 1;
        goto L3
    L8:
        return r02;
    }

    public JcePrimitiveT getInstance(String r2) throws GeneralSecurityException {
        return this.policy.getInstance(r2);
    }

    public JcePrimitiveT getInstance(String r2, List<Provider> r3) throws GeneralSecurityException {
        return this.policy.getInstance(r2, r3);
    }
}
