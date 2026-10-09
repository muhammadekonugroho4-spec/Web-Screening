package kotlin.text;

import clickstream.internal.analytics.healthproto.Health;
import java.math.BigDecimal;

/* loaded from: classes3.dex */
public abstract class w extends v {
    public static final boolean r(String r8) {
        if (r8.length() != 0) goto L6;
        return false;
    L6:
        if (r8.charAt(0) != '-') goto L8;
    L11:
        int r02 = 1;
    L12:
        int r5 = r02;
    L14:
        if (r5 >= r8.length()) goto L19;
        if (Character.isDigit(r8.charAt(r5)) == false) goto L19;
        r5 = r5 + 1;
    L19:
        if (r5 != r8.length()) goto L25;
        if ((r5 - r02) <= 0) goto L23;
        return true;
    L23:
        return false;
    L25:
        if (r8.charAt(r5) != '.') goto L38;
        r5 = r5 + 1;
        if (r5 != r8.length()) goto L33;
        if ((r5 - r02) <= 1) goto L31;
        return true;
    L31:
        return false;
    L33:
        if (r5 >= r8.length()) goto L38;
        if (Character.isDigit(r8.charAt(r5)) == false) goto L38;
        r5 = r5 + 1;
    L38:
        if (r5 != r8.length()) goto L41;
        return true;
    L41:
        if (r8.charAt(r5) != 'e') goto L43;
    L45:
        int r03 = r5 + 1;
        if (r03 != r8.length()) goto L49;
        return false;
    L49:
        if (r8.charAt(r03) != '+') goto L51;
    L52:
        r03 = r5 + 2;
    L54:
        if (r03 != r8.length()) goto L57;
        return false;
    L57:
        if (r03 >= r8.length()) goto L62;
        if (Character.isDigit(r8.charAt(r03)) == false) goto L62;
        r03 = r03 + 1;
    L62:
        if (r03 != r8.length()) goto L64;
        return true;
    L64:
        return false;
    L51:
        if (r8.charAt(r03) != '-') goto L54;
    L43:
        if (r8.charAt(r5) == 'E') goto L45;
        return false;
    L8:
        if (r8.charAt(0) == '+') goto L11;
        r02 = 0;
        goto L12
    }

    public static final boolean s(String r19) {
        boolean r2 = true;
        int r1 = r19.length() - 1;
        int r4 = 0;
    L3:
        char r5 = ' ';
        if (r4 > r1) goto L8;
        if (r19.charAt(r4) > ' ') goto L8;
        r4 = r4 + 1;
    L8:
        if (r4 <= r1) goto L10;
        return false;
    L10:
        if (r1 <= r4) goto L15;
        if (r19.charAt(r1) > ' ') goto L15;
        r1 = r1 - 1;
    L15:
        if (r19.charAt(r4) != '+') goto L17;
    L18:
        r4 = r4 + 1;
    L19:
        if (r4 <= r1) goto L22;
        return false;
    L22:
        if (r19.charAt(r4) != '0') goto L69;
        int r6 = r4 + 1;
        if (r6 <= r1) goto L27;
        return true;
    L27:
        if ((r19.charAt(r6) | ' ') != 120) goto L69;
        int r42 = r4 + 2;
        int r62 = r42;
    L30:
        if (r62 > r1) goto L37;
        boolean r17 = r2;
        if (((r19.charAt(r62) - '0') & 65535) < 10) goto L36;
        if ((((r15 | ' ') - 97) & 65535) < 6) goto L36;
    L38:
        if (r42 == r62) goto L40;
        boolean r22 = r17;
    L41:
        if (r62 <= r1) goto L45;
    L43:
        r4 = -1;
    L64:
        if (r4 == (-1)) goto L68;
        if (r4 > r1) goto L68;
        boolean r23 = r17;
    L70:
        if (r23 == true) goto L111;
        int r52 = r4;
    L72:
        if (r52 > r1) goto L76;
        if (((r19.charAt(r52) - '0') & 65535) >= 10) goto L76;
        r52 = r52 + 1;
    L76:
        if (r4 == r52) goto L78;
        boolean r43 = r17;
    L79:
        if (r52 <= r1) goto L82;
        r4 = r52;
    L107:
        if (r4 != (-1)) goto L109;
        return false;
    L109:
        if (r4 <= r1) goto L111;
        return r17;
    L82:
        if (r19.charAt(r52) != '.') goto L90;
        int r53 = r52 + 1;
        int r63 = r53;
    L84:
        if (r63 > r1) goto L88;
        if (((r19.charAt(r63) - '0') & 65535) >= 10) goto L88;
        r63 = r63 + 1;
    L88:
        if (r53 == r63) goto L91;
        boolean r54 = r17;
    L92:
        if (r43 == true) goto L106;
        if (r54 == true) goto L106;
        if (r1 != (r63 + 2)) goto L98;
        String r44 = "NaN";
    L101:
        if (r44 != null) goto L104;
    L102:
        r4 = -1;
        goto L107
    L104:
        if (B.r0(r19, r44, r63, false) != r63) goto L102;
        r4 = r1 + 1;
        goto L107
    L98:
        if (r1 != (r63 + 7)) goto L100;
        r44 = "Infinity";
        goto L101
    L100:
        r44 = null;
    L106:
        r4 = r63;
    L91:
        r54 = false;
        goto L92
    L90:
        r63 = r52;
        goto L91
    L78:
        r43 = false;
    L111:
        int r55 = r4 + 1;
        int r64 = r19.charAt(r4) | ' ';
        if (r23 == false) goto L114;
        int r9 = 112;
    L116:
        if (r64 == r9) goto L123;
        if (r23 == true) goto L122;
        if (r64 == 102) goto L120;
        if (r64 != 100) goto L122;
    L120:
        if (r55 <= r1) goto L122;
        return r17;
    L122:
        return false;
    L123:
        if (r55 <= r1) goto L126;
        return false;
    L126:
        if (r19.charAt(r55) != '+') goto L128;
    L129:
        r55 = r4 + 2;
        if (r55 <= r1) goto L132;
        return false;
    L132:
        if (r55 > r1) goto L136;
        if (((r19.charAt(r55) - '0') & 65535) >= 10) goto L136;
        r55 = r55 + 1;
    L136:
        if (r55 <= r1) goto L138;
        return r17;
    L138:
        if (r55 != r1) goto L145;
        int r02 = r19.charAt(r55) | ' ';
        if (r02 == 102) goto L144;
        if (r02 == 100) goto L144;
        return false;
    L144:
        return r17;
    L145:
        return false;
    L128:
        if (r19.charAt(r55) != '-') goto L132;
    L114:
        r9 = Health.EVENT_TIMESTAMP_FIELD_NUMBER;
    L68:
        return false;
    L45:
        if (r19.charAt(r62) != '.') goto L59;
        int r65 = r62 + 1;
        int r45 = r65;
    L47:
        if (r45 > r1) goto L55;
        char r18 = r5;
        if (((r19.charAt(r45) - '0') & 65535) < 10) goto L53;
        if ((((r15 | ' ') - 97) & 65535) >= 6) goto L55;
    L53:
        r45 = r45 + 1;
        r5 = r18;
    L55:
        if (r65 == r45) goto L57;
        boolean r56 = r17;
    L58:
        r62 = r45;
    L60:
        if (r22 == true) goto L63;
        if (r56 == false) goto L43;
    L63:
        r4 = r62;
        goto L64
    L57:
        r56 = false;
        goto L58
    L59:
        r56 = false;
        goto L60
    L40:
        r22 = false;
    L36:
        r62 = r62 + 1;
        r2 = r17;
        goto L30
    L37:
        r17 = r2;
    L69:
        r17 = true;
        r23 = false;
        goto L70
    L17:
        if (r19.charAt(r4) != '-') goto L19;
        goto L18
    }

    public static BigDecimal t(String r2) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        if (r(r2) == false) goto L7;
        return new BigDecimal(r2);
    L7:
        return null;
    }

    public static Double u(String r3) {
        kotlin.jvm.internal.p.l(r3, "<this>");
        if (s(r3) == false) goto L7;
        return Double.valueOf(Double.parseDouble(r3));
    L7:
        return null;
    }

    public static Float v(String r2) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        if (s(r2) == false) goto L7;
        return Float.valueOf(Float.parseFloat(r2));
    L7:
        return null;
    }
}
