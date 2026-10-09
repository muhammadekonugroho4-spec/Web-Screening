package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.zzaa;
import com.google.android.gms.internal.common.zzr;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@KeepForSdk
/* loaded from: classes5.dex */
public class HttpUtils {
    private static final Pattern zza = null;
    private static final Pattern zzb = null;
    private static final Pattern zzc = null;

    static {
        zza = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
        zzb = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
        zzc = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");
    }

    private HttpUtils() {
    }

    @KeepForSdk
    public static Map<String, String> parse(URI r6, String r7) {
        Map<String, String> r02 = Collections.EMPTY_MAP;
        String r62 = r6.getRawQuery();
        if (r62 != null) goto L5;
    L20:
        return r02;
    L5:
        if (r62.length() <= 0) goto L20;
        r02 = new HashMap();
        zzaa r1 = zzaa.zzc(zzr.zzb('='));
        Iterator r63 = zzaa.zzc(zzr.zzb('&')).zzb().zzd(r62).iterator();
    L8:
        if (r63.hasNext() == false) goto L20;
        List r2 = r1.zzf((String) r63.next());
        if (r2.isEmpty() == true) goto L19;
        if (r2.size() > 2) goto L19;
        String r3 = zza((String) r2.get(0), r7);
        if (r2.size() != 2) goto L16;
        String r22 = zza((String) r2.get(1), r7);
    L17:
        r02.put(r3, r22);
        goto L8
    L16:
        r22 = null;
    L19:
        throw new IllegalArgumentException("bad parameter");
    }

    private static String zza(String r02, String r1) {
        if (r1 != null) goto L9;
        r1 = "ISO-8859-1";
    L9:
        return URLDecoder.decode(r02, r1);
    L6:
        e = move-exception;
        throw new IllegalArgumentException(e);
    }
}
