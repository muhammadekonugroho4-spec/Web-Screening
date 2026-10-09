package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastParser;
import java.io.BufferedReader;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zab implements zai {
    public zab() {
    }

    @Override // com.google.android.gms.common.server.response.zai
    public final /* synthetic */ Object zaa(FastParser r1, BufferedReader r2) throws FastParser.ParseException, IOException {
        return Long.valueOf(FastParser.zad(r1, r2));
    }
}
