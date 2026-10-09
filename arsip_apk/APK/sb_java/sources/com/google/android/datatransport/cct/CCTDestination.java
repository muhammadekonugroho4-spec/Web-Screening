package com.google.android.datatransport.cct;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedDestination;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class CCTDestination implements EncodedDestination {
    private static final String DEFAULT_API_KEY = null;
    static final String DEFAULT_END_POINT = null;
    static final String DESTINATION_NAME = "cct";
    private static final String EXTRAS_DELIMITER = "\\";
    private static final String EXTRAS_VERSION_MARKER = "1$";
    public static final CCTDestination INSTANCE = null;
    static final String LEGACY_END_POINT = null;
    public static final CCTDestination LEGACY_INSTANCE = null;
    private static final Set<Encoding> SUPPORTED_ENCODINGS = null;
    private final String apiKey;
    private final String endPoint;

    static {
        String r02 = StringMerger.mergeStrings("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        DEFAULT_END_POINT = r02;
        String r1 = StringMerger.mergeStrings("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        LEGACY_END_POINT = r1;
        String r2 = StringMerger.mergeStrings("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        DEFAULT_API_KEY = r2;
        SUPPORTED_ENCODINGS = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Encoding[]{Encoding.of("proto"), Encoding.of("json")})));
        INSTANCE = new CCTDestination(r02, null);
        LEGACY_INSTANCE = new CCTDestination(r1, r2);
    }

    public CCTDestination(String r1, String r2) {
        this.endPoint = r1;
        this.apiKey = r2;
    }

    public static String decodeExtras(byte[] r2) {
        return new String(r2, Charset.forName("UTF-8"));
    }

    public static byte[] encodeString(String r1) {
        return r1.getBytes(Charset.forName("UTF-8"));
    }

    public static CCTDestination fromByteArray(byte[] r3) {
        String r02 = new String(r3, Charset.forName("UTF-8"));
        if (r02.startsWith(EXTRAS_VERSION_MARKER) == false) goto L18;
        String[] r03 = r02.substring(2).split(Pattern.quote(EXTRAS_DELIMITER), 2);
        if (r03.length != 2) goto L16;
        String r32 = r03[0];
        if (r32.isEmpty() == true) goto L14;
        String r04 = r03[1];
        if (r04.isEmpty() == false) goto L12;
        r04 = null;
    L12:
        return new CCTDestination(r32, r04);
    L14:
        throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
    L16:
        throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
    L18:
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    public byte[] asByteArray() {
        String r02 = this.apiKey;
        if (r02 == null) goto L5;
    L8:
        String r1 = this.endPoint;
        if (r02 != null) goto L12;
        r02 = "";
    L12:
        return String.format("%s%s%s%s", new Object[]{EXTRAS_VERSION_MARKER, r1, EXTRAS_DELIMITER, r02}).getBytes(Charset.forName("UTF-8"));
    L5:
        if (this.endPoint != null) goto L8;
        return null;
    }

    public String getAPIKey() {
        return this.apiKey;
    }

    public String getEndPoint() {
        return this.endPoint;
    }

    @Override // com.google.android.datatransport.runtime.Destination
    public byte[] getExtras() {
        return asByteArray();
    }

    @Override // com.google.android.datatransport.runtime.Destination
    public String getName() {
        return DESTINATION_NAME;
    }

    @Override // com.google.android.datatransport.runtime.EncodedDestination
    public Set<Encoding> getSupportedEncodings() {
        return SUPPORTED_ENCODINGS;
    }
}
