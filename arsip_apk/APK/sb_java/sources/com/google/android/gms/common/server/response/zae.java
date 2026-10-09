package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastParser;
import java.io.BufferedReader;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zae implements zai {
    public zae() {
    }

    @Override // com.google.android.gms.common.server.response.zai
    public final /* bridge */ /* synthetic */ Object zaa(FastParser r2, BufferedReader r3) throws FastParser.ParseException, IOException {
        return Boolean.valueOf(FastParser.zah(r2, r3, false));
    }
}
