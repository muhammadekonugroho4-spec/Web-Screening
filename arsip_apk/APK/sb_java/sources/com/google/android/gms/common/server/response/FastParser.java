package com.google.android.gms.common.server.response;

import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes5.dex */
public class FastParser<T extends FastJsonResponse> {
    private static final char[] zaa = null;
    private static final char[] zab = null;
    private static final char[] zac = null;
    private static final char[] zad = null;
    private static final char[] zae = null;
    private static final char[] zaf = null;
    private static final zai zag = null;
    private static final zai zah = null;
    private static final zai zai = null;
    private static final zai zaj = null;
    private static final zai zak = null;
    private static final zai zal = null;
    private static final zai zam = null;
    private static final zai zan = null;
    private final char[] zao;
    private final char[] zap;
    private final char[] zaq;
    private final StringBuilder zar;
    private final StringBuilder zas;
    private final Stack zat;

    @ShowFirstParty
    @KeepForSdk
    public static class ParseException extends Exception {
        public ParseException(String r1) {
            super(r1);
        }

        public ParseException(String r1, Throwable r2) {
            super("Error instantiating inner object", r2);
        }

        public ParseException(Throwable r1) {
            super(r1);
        }
    }

    static {
        zaa = new char[]{'u', Constants.INAPP_POSITION_LEFT, Constants.INAPP_POSITION_LEFT};
        zab = new char[]{Constants.INAPP_POSITION_RIGHT, 'u', 'e'};
        zac = new char[]{Constants.INAPP_POSITION_RIGHT, 'u', 'e', '\"'};
        zad = new char[]{'a', Constants.INAPP_POSITION_LEFT, 's', 'e'};
        zae = new char[]{'a', Constants.INAPP_POSITION_LEFT, 's', 'e', '\"'};
        zaf = new char[]{'\n'};
        zag = new zaa();
        zah = new zab();
        zai = new zac();
        zaj = new zad();
        zak = new zae();
        zal = new zaf();
        zam = new zag();
        zan = new zah();
    }

    public FastParser() {
        this.zao = new char[1];
        this.zap = new char[32];
        this.zaq = new char[1024];
        this.zar = new StringBuilder(32);
        this.zas = new StringBuilder(1024);
        this.zat = new Stack();
    }

    private static final String zaA(BufferedReader r8, char[] r9, StringBuilder r10, char[] r11) throws ParseException, IOException {
        r10.setLength(0);
        r8.mark(r9.length);
        boolean r1 = false;
        boolean r2 = false;
    L3:
        int r3 = r8.read(r9);
        if (r3 == (-1)) goto L31;
        int r4 = 0;
    L6:
        if (r4 >= r3) goto L29;
        char r5 = r9[r4];
        if (Character.isISOControl(r5) == false) goto L15;
        if (r11 == null) goto L14;
        if (r11[0] == r5) goto L15;
    L14:
        throw new ParseException("Unexpected control character while reading string");
    L15:
        int r6 = r4 + 1;
        if (r5 != '\"') goto L26;
        if (r1 == false) goto L18;
    L24:
        r1 = false;
    L28:
        r4 = r6;
        goto L6
    L18:
        r10.append(r9, 0, r4);
        r8.reset();
        r8.skip(r6);
        if (r2 == false) goto L23;
        return JsonUtils.unescapeString(r10.toString());
    L23:
        return r10.toString();
    L26:
        if (r5 != '\\') goto L24;
        r1 = !r1;
        r2 = true;
        goto L28
    L29:
        r10.append(r9, 0, r3);
        r8.mark(r9.length);
        goto L3
    L31:
        throw new ParseException("Unexpected EOF while parsing string");
    }

    public static /* bridge */ /* synthetic */ double zaa(FastParser r02, BufferedReader r1) {
        return r02.zaj(r1);
    }

    public static /* bridge */ /* synthetic */ float zab(FastParser r02, BufferedReader r1) {
        return r02.zak(r1);
    }

    public static /* bridge */ /* synthetic */ int zac(FastParser r02, BufferedReader r1) {
        return r02.zal(r1);
    }

    public static /* bridge */ /* synthetic */ long zad(FastParser r02, BufferedReader r1) {
        return r02.zan(r1);
    }

    public static /* bridge */ /* synthetic */ String zae(FastParser r02, BufferedReader r1) {
        return r02.zao(r1);
    }

    public static /* bridge */ /* synthetic */ BigDecimal zaf(FastParser r02, BufferedReader r1) {
        return r02.zas(r1);
    }

    public static /* bridge */ /* synthetic */ BigInteger zag(FastParser r02, BufferedReader r1) {
        return r02.zat(r1);
    }

    public static /* bridge */ /* synthetic */ boolean zah(FastParser r02, BufferedReader r1, boolean r2) {
        return r02.zay(r1, false);
    }

    private final char zai(BufferedReader r4) throws ParseException, IOException {
        if (r4.read(this.zao) != (-1)) goto L5;
    L11:
        return 0;
    L5:
        if (Character.isWhitespace(this.zao[0]) == false) goto L10;
        if (r4.read(this.zao) != (-1)) goto L5;
    L10:
        return this.zao[0];
    }

    private final double zaj(BufferedReader r4) throws ParseException, IOException {
        int r42 = zam(r4, this.zaq);
        if (r42 != 0) goto L7;
        return 0.0d;
    L7:
        return Double.parseDouble(new String(this.zaq, 0, r42));
    }

    private final float zak(BufferedReader r4) throws ParseException, IOException {
        int r42 = zam(r4, this.zaq);
        if (r42 != 0) goto L7;
        return 0.0f;
    L7:
        return Float.parseFloat(new String(this.zaq, 0, r42));
    }

    private final int zal(BufferedReader r12) throws ParseException, IOException {
        int r122 = zam(r12, this.zaq);
        if (r122 != 0) goto L5;
        return 0;
    L5:
        char[] r1 = this.zaq;
        if (r122 <= 0) goto L45;
        char r2 = r1[0];
        if (r2 != '-') goto L10;
        int r4 = Integer.MIN_VALUE;
    L12:
        if (r2 != '-') goto L14;
        int r22 = 1;
    L16:
        if (r22 >= r122) goto L22;
        int r02 = r22 + 1;
        int r7 = Character.digit(r1[r22], 10);
        if (r7 < 0) goto L21;
        int r72 = -r7;
    L23:
        if (r02 >= r122) goto L37;
        int r8 = r02 + 1;
        int r03 = Character.digit(r1[r02], 10);
        if (r03 < 0) goto L36;
        if (r72 < (-214748364)) goto L34;
        int r73 = r72 * 10;
        if (r73 < (r4 + r03)) goto L32;
        r72 = r73 - r03;
        r02 = r8;
        goto L23
    L32:
        throw new ParseException("Number too large");
    L34:
        throw new ParseException("Number too large");
    L36:
        throw new ParseException("Unexpected non-digit character");
    L37:
        if (r22 == 0) goto L43;
        if (r02 <= 1) goto L41;
        return r72;
    L41:
        throw new ParseException("No digits to parse");
    L43:
        return -r72;
    L21:
        throw new ParseException("Unexpected non-digit character");
    L22:
        r72 = 0;
        r02 = r22;
        goto L23
    L14:
        r22 = 0;
        goto L16
    L10:
        r4 = -2147483647;
        goto L12
    L45:
        throw new ParseException("No number to parse");
    }

    @ResultIgnorabilityUnspecified
    private final int zam(BufferedReader r11, char[] r12) throws ParseException, IOException {
        char r02 = zai(r11);
        if (r02 == 0) goto L53;
        if (r02 == ',') goto L51;
        if (r02 != 'n') goto L10;
        zax(r11, zaa);
        return 0;
    L10:
        r11.mark(1024);
        if (r02 != '\"') goto L30;
        int r03 = 0;
        boolean r2 = false;
    L13:
        if (r03 >= 1024) goto L45;
        if (r11.read(r12, r03, 1) == (-1)) goto L45;
        char r8 = r12[r03];
        if (Character.isISOControl(r8) == true) goto L29;
        int r9 = r03 + 1;
        if (r8 != '\"') goto L25;
        if (r2 == false) goto L22;
    L21:
        r2 = false;
    L27:
        r03 = r9;
        goto L13
    L22:
        r11.reset();
        r11.skip(r9);
        return r03;
    L25:
        if (r8 != '\\') goto L21;
        r2 = !r2;
        goto L27
    L29:
        throw new ParseException("Unexpected control character while reading string");
    L45:
        if (r03 != 1024) goto L49;
        throw new ParseException("Absurdly long value");
    L49:
        throw new ParseException("Unexpected EOF");
    L30:
        r12[0] = r02;
        r03 = 1;
    L31:
        if (r03 >= 1024) goto L45;
        if (r11.read(r12, r03, 1) == (-1)) goto L45;
        char r5 = r12[r03];
        if (r5 == '}') goto L43;
        if (r5 == ',') goto L43;
        if (Character.isWhitespace(r5) == true) goto L43;
        if (r12[r03] == ']') goto L43;
        r03 = r03 + 1;
    L43:
        r11.reset();
        r11.skip(r03 - 1);
        r12[r03] = 0;
        return r03;
    L51:
        throw new ParseException("Missing value");
    L53:
        throw new ParseException("Unexpected EOF");
    }

    private final long zan(BufferedReader r20) throws ParseException, IOException {
        int r1 = zam(r20, this.zaq);
        if (r1 != 0) goto L5;
        return 0;
    L5:
        char[] r4 = this.zaq;
        if (r1 <= 0) goto L44;
        int r5 = 0;
        char r6 = r4[0];
        if (r6 != '-') goto L10;
        long r8 = Long.MIN_VALUE;
    L12:
        if (r6 != '-') goto L14;
        r5 = 1;
    L14:
        int r7 = 10;
        if (r5 >= r1) goto L21;
        int r2 = r5 + 1;
        int r3 = Character.digit(r4[r5], 10);
        if (r3 < 0) goto L20;
        long r11 = -r3;
    L22:
        if (r2 >= r1) goto L36;
        int r32 = r2 + 1;
        int r22 = Character.digit(r4[r2], r7);
        if (r22 < 0) goto L35;
        if (r11 < (-922337203685477580L)) goto L33;
        long r112 = r11 * 10;
        long r15 = r8;
        long r72 = r22;
        if (r112 < (r15 + r72)) goto L31;
        r11 = r112 - r72;
        r2 = r32;
        r8 = r15;
        r7 = 10;
        goto L22
    L31:
        throw new ParseException("Number too large");
    L33:
        throw new ParseException("Number too large");
    L35:
        throw new ParseException("Unexpected non-digit character");
    L36:
        if (r5 == 0) goto L42;
        if (r2 <= 1) goto L40;
        return r11;
    L40:
        throw new ParseException("No digits to parse");
    L42:
        return -r11;
    L20:
        throw new ParseException("Unexpected non-digit character");
    L21:
        r11 = 0;
        r2 = r5;
        goto L22
    L10:
        r8 = -9223372036854775807L;
        goto L12
    L44:
        throw new ParseException("No number to parse");
    }

    private final String zao(BufferedReader r4) throws ParseException, IOException {
        return zap(r4, this.zap, this.zar, null);
    }

    private final String zap(BufferedReader r3, char[] r4, StringBuilder r5, char[] r6) throws ParseException, IOException {
        char r02 = zai(r3);
        if (r02 == '\"') goto L11;
        if (r02 != 'n') goto L9;
        zax(r3, zaa);
        return null;
    L9:
        throw new ParseException("Expected string");
    L11:
        return zaA(r3, r4, r5, r6);
    }

    @ResultIgnorabilityUnspecified
    private final String zaq(BufferedReader r5) throws ParseException, IOException {
        this.zat.push(2);
        char r02 = zai(r5);
        if (r02 != '\"') goto L5;
        this.zat.push(3);
        String r03 = zaA(r5, this.zap, this.zar, null);
        zaw(3);
        if (zai(r5) != ':') goto L18;
        return r03;
    L18:
        throw new ParseException("Expected key/value separator");
    L5:
        if (r02 != ']') goto L7;
        zaw(2);
        zaw(1);
        zaw(5);
        return null;
    L7:
        if (r02 != '}') goto L11;
        zaw(2);
        return null;
    L11:
        throw new ParseException("Unexpected token: " + r02);
    }

    private final String zar(BufferedReader r15) throws ParseException, IOException {
        r15.mark(1024);
        char r02 = zai(r15);
        int r7 = 1;
        if (r02 == '\"') goto L52;
        if (r02 == ',') goto L50;
        if (r02 != '[') goto L8;
        this.zat.push(5);
        r15.mark(32);
        if (zai(r15) != ']') goto L23;
        zaw(5);
    L57:
        char r03 = zai(r15);
        if (r03 == ',') goto L64;
        if (r03 != '}') goto L63;
        zaw(2);
        return null;
    L63:
        throw new ParseException("Unexpected token " + r03);
    L64:
        zaw(2);
        return zaq(r15);
    L23:
        r15.reset();
        boolean r04 = false;
        boolean r11 = false;
    L24:
        if (r7 <= 0) goto L48;
        char r12 = zai(r15);
        if (r12 == 0) goto L47;
        if (Character.isISOControl(r12) == true) goto L45;
        if (r12 != '\"') goto L33;
        if (r11 == true) goto L32;
        r04 = !r04;
    L32:
        r12 = '\"';
    L33:
        if (r12 != '[') goto L37;
        if (r04 == true) goto L36;
        r7 = r7 + 1;
    L36:
        r12 = '[';
    L37:
        if (r12 != ']') goto L40;
        if (r04 == true) goto L40;
        r7 = r7 - 1;
    L40:
        if (r12 != '\\') goto L43;
        if (r04 == false) goto L43;
        r11 = !r11;
    L43:
        r11 = false;
        goto L24
    L45:
        throw new ParseException("Unexpected control character while reading array");
    L47:
        throw new ParseException("Unexpected EOF while parsing array");
    L48:
        zaw(5);
        goto L57
    L8:
        if (r02 == '{') goto L10;
        r15.reset();
        zam(r15, this.zaq);
        goto L57
    L10:
        this.zat.push(1);
        r15.mark(32);
        char r05 = zai(r15);
        if (r05 != '}') goto L13;
        zaw(1);
        goto L57
    L13:
        if (r05 != '\"') goto L19;
        r15.reset();
        zaq(r15);
    L16:
        if (zar(r15) != null) goto L16;
        zaw(1);
        goto L57
    L19:
        throw new ParseException("Unexpected token " + r05);
    L50:
        throw new ParseException("Missing value");
    L52:
        if (r15.read(this.zao) == (-1)) goto L79;
        char r06 = this.zao[0];
        boolean r10 = false;
    L54:
        if (r06 != '\"') goto L66;
        if (r10 == false) goto L57;
        r06 = '\"';
        r10 = true;
    L66:
        if (r06 != '\\') goto L68;
        r10 = !r10;
    L70:
        if (r15.read(this.zao) == (-1)) goto L77;
        r06 = this.zao[0];
        if (Character.isISOControl(r06) == false) goto L54;
        throw new ParseException("Unexpected control character while reading string");
    L77:
        throw new ParseException("Unexpected EOF while parsing string");
    L68:
        r10 = false;
        goto L70
    L79:
        throw new ParseException("Unexpected EOF while parsing string");
    }

    private final BigDecimal zas(BufferedReader r5) throws ParseException, IOException {
        int r52 = zam(r5, this.zaq);
        if (r52 != 0) goto L7;
        return null;
    L7:
        return new BigDecimal(new String(this.zaq, 0, r52));
    }

    private final BigInteger zat(BufferedReader r5) throws ParseException, IOException {
        int r52 = zam(r5, this.zaq);
        if (r52 != 0) goto L7;
        return null;
    L7:
        return new BigInteger(new String(this.zaq, 0, r52));
    }

    private final ArrayList zau(BufferedReader r5, zai r6) throws ParseException, IOException {
        char r02 = zai(r5);
        if (r02 != 'n') goto L7;
        zax(r5, zaa);
        return null;
    L7:
        if (r02 != '[') goto L21;
        this.zat.push(5);
        ArrayList r03 = new ArrayList();
    L9:
        r5.mark(1024);
        char r2 = zai(r5);
        if (r2 == 0) goto L19;
        if (r2 == ',') goto L9;
        if (r2 == ']') goto L16;
        r5.reset();
        r03.add(r6.zaa(this, r5));
        goto L9
    L16:
        zaw(5);
        return r03;
    L19:
        throw new ParseException("Unexpected EOF");
    L21:
        throw new ParseException("Expected start of array");
    }

    private final ArrayList zav(BufferedReader r10, FastJsonResponse.Field r11) throws ParseException, IOException {
        ArrayList r1 = new ArrayList();
        char r2 = zai(r10);
        if (r2 != ']') goto L5;
        zaw(5);
        return r1;
    L5:
        if (r2 != 'n') goto L7;
        zax(r10, zaa);
        zaw(5);
        return null;
    L7:
        if (r2 != '{') goto L34;
        this.zat.push(1);
    L39:
        FastJsonResponse r22 = r11.zad();     // Catch: IllegalAccessException -> L24 InstantiationException -> L26
        if (zaz(r10, r22) == false) goto L28;
        r1.add(r22);     // Catch: IllegalAccessException -> L24 InstantiationException -> L26
        char r23 = zai(r10);
        if (r23 != ',') goto L14;
        if (zai(r10) != '{') goto L23;
        this.zat.push(1);
        goto L39
    L23:
        throw new ParseException("Expected start of next object in array");
    L14:
        if (r23 != ']') goto L18;
        zaw(5);
        return r1;
    L18:
        throw new ParseException("Unexpected token: " + r23);
    L28:
        return r1;
    L24:
        e = move-exception;
        throw new ParseException("Error instantiating inner object", e);
    L26:
        e = move-exception;
        throw new ParseException("Error instantiating inner object", e);
    L34:
        throw new ParseException("Unexpected token: " + r2);
    }

    private final void zaw(int r5) throws ParseException {
        if (this.zat.isEmpty() == true) goto L10;
        int r02 = ((Integer) this.zat.pop()).intValue();
        if (r02 != r5) goto L8;
        return;
    L8:
        throw new ParseException("Expected state " + r5 + " but had " + r02);
    L10:
        throw new ParseException("Expected state " + r5 + " but had empty stack");
    }

    private final void zax(BufferedReader r7, char[] r8) throws ParseException, IOException {
        int r1 = 0;
    L3:
        int r2 = r8.length;
        if (r1 >= r2) goto L17;
        int r22 = r7.read(this.zap, 0, r2 - r1);
        if (r22 == (-1)) goto L16;
        int r3 = 0;
    L8:
        if (r3 >= r22) goto L14;
        if (r8[r3 + r1] != this.zap[r3]) goto L13;
        r3 = r3 + 1;
        goto L8
    L13:
        throw new ParseException("Unexpected character");
    L14:
        r1 = r1 + r22;
        goto L3
    L16:
        throw new ParseException("Unexpected EOF");
    }

    private final boolean zay(BufferedReader r5, boolean r6) throws ParseException, IOException {
        char r02 = zai(r5);
        if (r02 != '\"') goto L5;
        if (r6 == true) goto L28;
        return zay(r5, true);
    L28:
        throw new ParseException("No boolean value found in string");
    L5:
        if (r02 != 'f') goto L7;
        if (r6 == false) goto L21;
        char[] r62 = zae;
    L22:
        zax(r5, r62);
        return false;
    L21:
        r62 = zad;
        goto L22
    L7:
        if (r02 != 'n') goto L9;
        zax(r5, zaa);
        return false;
    L9:
        if (r02 != 't') goto L16;
        if (r6 == false) goto L12;
        char[] r63 = zac;
    L13:
        zax(r5, r63);
        return true;
    L12:
        r63 = zab;
        goto L13
    L16:
        throw new ParseException("Unexpected token: " + r02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ResultIgnorabilityUnspecified
    private final boolean zaz(BufferedReader r18, FastJsonResponse r19) throws ParseException, IOException {
        Map<String, FastJsonResponse.Field<?, ?>> r4 = r19.getFieldMappings();
        String r5 = zaq(r18);
        if (r5 == null) goto L116;
    L4:
        if (r5 == null) goto L114;
        FastJsonResponse.Field<?, ?> r52 = r4.get(r5);
        if (r52 == null) goto L7;
        this.zat.push(4);
        int r9 = r52.zaa;
        switch(r9) {
            case 0: goto L104;
            case 1: goto L100;
            case 2: goto L96;
            case 3: goto L92;
            case 4: goto L88;
            case 5: goto L84;
            case 6: goto L80;
            case 7: goto L76;
            case 8: goto L74;
            case 9: goto L73;
            case 10: goto L40;
            case 11: goto L13;
            default: goto L11;
        };
    L40:
        char r92 = zai(r18);
        if (r92 != 'n') goto L43;
        zax(r18, zaa);
        HashMap r93 = null;
    L60:
        r19.zaB(r52, r93);
    L61:
        int r53 = 4;
    L107:
        zaw(r53);
        zaw(2);
        char r54 = zai(r18);
        if (r54 != ',') goto L109;
        r5 = zaq(r18);
        goto L4
    L109:
        if (r54 != '}') goto L112;
        r5 = null;
        goto L4
    L112:
        throw new ParseException("Expected end of object or field separator, but found: " + r54);
    L43:
        if (r92 != '{') goto L72;
        this.zat.push(1);
        r93 = new HashMap();
    L45:
        char r12 = zai(r18);
        if (r12 == 0) goto L70;
        if (r12 != '\"') goto L49;
        String r10 = zaA(r18, this.zap, this.zar, null);
        if (zai(r18) != ':') goto L68;
        if (zai(r18) != '\"') goto L66;
        r93.put(r10, zaA(r18, this.zap, this.zar, null));
        char r6 = zai(r18);
        if (r6 == ',') goto L45;
        if (r6 != '}') goto L63;
        zaw(1);
        goto L60
    L63:
        throw new ParseException("Unexpected character while parsing string map: " + r6);
    L66:
        throw new ParseException("Expected String value for key ".concat(String.valueOf(r10)));
    L68:
        throw new ParseException("No map value found for key ".concat(String.valueOf(r10)));
    L49:
        if (r12 != '}') goto L45;
        zaw(1);
        goto L60
    L70:
        throw new ParseException("Unexpected EOF");
    L72:
        throw new ParseException("Expected start of a map object");
    L73:
        r19.zal(r52, Base64Utils.decodeUrlSafe(zap(r18, this.zaq, this.zas, zaf)));
        goto L61
    L74:
        r19.zal(r52, Base64Utils.decode(zap(r18, this.zaq, this.zas, zaf)));
        goto L61
    L13:
        if (r52.zab == false) goto L23;
        char r94 = zai(r18);
        if (r94 != 'n') goto L18;
        zax(r18, zaa);
        r19.addConcreteTypeArrayInternal(r52, r52.zae, null);
    L17:
        r53 = 4;
        goto L107
    L18:
        this.zat.push(5);
        if (r94 != '[') goto L22;
        r19.addConcreteTypeArrayInternal(r52, r52.zae, zav(r18, r52));
        goto L17
    L22:
        throw new ParseException("Expected array start");
    L23:
        char r95 = zai(r18);
        if (r95 != 'n') goto L26;
        zax(r18, zaa);
        r19.addConcreteTypeInternal(r52, r52.zae, null);
        goto L17
    L26:
        this.zat.push(1);
        if (r95 != '{') goto L39;
        FastJsonResponse r96 = r52.zad();     // Catch: IllegalAccessException -> L30 InstantiationException -> L32
        zaz(r18, r96);     // Catch: IllegalAccessException -> L30 InstantiationException -> L32
        r19.addConcreteTypeInternal(r52, r52.zae, r96);     // Catch: IllegalAccessException -> L30 InstantiationException -> L32
    L30:
        e = move-exception;
        throw new ParseException("Error instantiating inner object", e);
    L32:
        e = move-exception;
        throw new ParseException("Error instantiating inner object", e);
    L39:
        throw new ParseException("Expected start of object");
    L76:
        if (r52.zab == false) goto L78;
        r19.zaC(r52, zau(r18, zal));
        goto L61
    L78:
        r19.zaA(r52, zao(r18));
        goto L61
    L80:
        if (r52.zab == false) goto L82;
        r19.zaj(r52, zau(r18, zak));
        goto L61
    L82:
        r19.zai(r52, zay(r18, false));
        goto L61
    L84:
        if (r52.zab == false) goto L86;
        r19.zac(r52, zau(r18, zan));
        goto L61
    L86:
        r19.zaa(r52, zas(r18));
        goto L61
    L88:
        if (r52.zab == false) goto L90;
        r19.zao(r52, zau(r18, zaj));
        goto L61
    L90:
        r19.zam(r52, zaj(r18));
        goto L61
    L92:
        if (r52.zab == false) goto L94;
        r19.zas(r52, zau(r18, zai));
        goto L61
    L94:
        r19.zaq(r52, zak(r18));
        goto L61
    L96:
        if (r52.zab == false) goto L98;
        r19.zay(r52, zau(r18, zah));
        goto L61
    L98:
        r19.zax(r52, zan(r18));
        goto L61
    L100:
        if (r52.zab == false) goto L102;
        r19.zag(r52, zau(r18, zam));
        goto L61
    L102:
        r19.zae(r52, zat(r18));
        goto L61
    L104:
        if (r52.zab == false) goto L106;
        r19.zav(r52, zau(r18, zag));
        goto L61
    L106:
        r19.zau(r52, zal(r18));
        goto L61
    L11:
        throw new ParseException("Invalid field type " + r9);
    L7:
        r5 = zar(r18);
        goto L4
    L114:
        zaw(1);
        return true;
    L116:
        zaw(1);
        return false;
    }

    @KeepForSdk
    public void parse(InputStream r7, T r8) throws ParseException {
        BufferedReader r2 = new BufferedReader(new InputStreamReader(r7), 1024);
        this.zat.push(0);     // Catch: Throwable -> L10 IOException -> L12
        char r72 = zai(r2);     // Catch: Throwable -> L10 IOException -> L12
        if (r72 == 0) goto L27;
        if (r72 != '[') goto L8;
        this.zat.push(5);     // Catch: Throwable -> L10 IOException -> L12
        Map<String, FastJsonResponse.Field<?, ?>> r73 = r8.getFieldMappings();     // Catch: Throwable -> L10 IOException -> L12
        if (r73.size() != 1) goto L25;
        FastJsonResponse.Field<?, ?> r74 = r73.entrySet().iterator().next().getValue();     // Catch: Throwable -> L10 IOException -> L12
        r8.addConcreteTypeArrayInternal(r74, r74.zae, zav(r2, r74));     // Catch: Throwable -> L10 IOException -> L12
    L19:
        zaw(0);     // Catch: Throwable -> L10 IOException -> L12
        r2.close();     // Catch: IOException -> L22
        return;
    L22:
        Log.w("FastParser", "Failed to close reader while parsing.");
        return;
    L25:
        throw new ParseException("Object array response class must have a single Field");     // Catch: Throwable -> L10 IOException -> L12
    L8:
        if (r72 != '{') goto L15;
        this.zat.push(1);     // Catch: Throwable -> L10 IOException -> L12
        zaz(r2, r8);     // Catch: Throwable -> L10 IOException -> L12
        goto L19
    L15:
        throw new ParseException("Unexpected token: " + r72);     // Catch: Throwable -> L10 IOException -> L12
    L27:
        throw new ParseException("No data to parse");     // Catch: Throwable -> L10 IOException -> L12
    L12:
        e = move-exception;
        throw new ParseException(e);     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        r2.close();     // Catch: IOException -> L32
    L33:
        throw th;
    L32:
        Log.w("FastParser", "Failed to close reader while parsing.");
        goto L33
    }
}
