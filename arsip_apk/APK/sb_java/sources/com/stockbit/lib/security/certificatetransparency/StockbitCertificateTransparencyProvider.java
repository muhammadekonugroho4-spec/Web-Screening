package com.stockbit.lib.security.certificatetransparency;

import java.security.Provider;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stockbit/lib/security/certificatetransparency/StockbitCertificateTransparencyProvider;", "Ljava/security/Provider;", "<init>", "()V", "security_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StockbitCertificateTransparencyProvider extends Provider {
    static {
    }

    public StockbitCertificateTransparencyProvider() {
        super("StockbitCertificateTransparencyProvider", 1.0d, "");
        put("TrustManagerFactory.PKIX", g.class.getName());
        put("Alg.Alias.TrustManagerFactory.X509", "PKIX");
    }

    public /* bridge */ Set a() {
        return super.entrySet();
    }

    public /* bridge */ Set b() {
        return super.keySet();
    }

    public /* bridge */ int e() {
        return super.size();
    }

    @Override // java.security.Provider, java.util.Hashtable, java.util.Map
    public final /* bridge */ Set entrySet() {
        return a();
    }

    public /* bridge */ Collection g() {
        return super.values();
    }

    @Override // java.security.Provider, java.util.Hashtable, java.util.Map
    public final /* bridge */ Set keySet() {
        return b();
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.security.Provider, java.util.Hashtable, java.util.Map
    public final /* bridge */ Collection values() {
        return g();
    }
}
