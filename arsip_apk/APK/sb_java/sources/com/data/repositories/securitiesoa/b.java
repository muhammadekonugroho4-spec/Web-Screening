package com.data.repositories.securitiesoa;

import com.stockbit.domain.model.openingaccount.c;
import java.io.File;
import java.util.Map;
import kotlin.coroutines.e;

/* loaded from: classes4.dex */
public interface b {
    Object a(String r1, e r2);

    Object c(String r1, e r2);

    Object d(String r1, String r2, Map r3, e r4);

    Object e(String r1, String r2, int r3, e r4);

    Object f(c.b r1, File r2, e r3);

    Object getBibitAccountAccess(e r1);

    Object getBibitRegistrationStatus(e r1);
}
