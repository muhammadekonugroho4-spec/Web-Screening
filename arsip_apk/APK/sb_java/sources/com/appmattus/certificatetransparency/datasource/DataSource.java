package com.appmattus.certificatetransparency.datasource;

import kotlin.coroutines.e;

/* loaded from: classes4.dex */
public interface DataSource {

    public static final class DefaultImpls {
        public static DataSource a(DataSource r1) {
            return new DataSource$reuseInflight$1(r1);
        }
    }

    Object a(e r1);

    Object b(Object r1, e r2);
}
