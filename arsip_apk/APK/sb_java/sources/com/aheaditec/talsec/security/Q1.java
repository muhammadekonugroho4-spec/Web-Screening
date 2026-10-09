package com.aheaditec.talsec.security;

import android.R;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.security.keystore.UserNotAuthenticatedException;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes4.dex */
public abstract class Q1 implements P1 {

    /* renamed from: c, reason: collision with root package name */
    public static final String f30472c = null;

    /* renamed from: a, reason: collision with root package name */
    public final a f30473a;

    /* renamed from: b, reason: collision with root package name */
    public final KeyStore f30474b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f30475a;

        /* renamed from: b, reason: collision with root package name */
        public final String f30476b;

        public a(String r1, String r2) {
            this.f30475a = r1;
            this.f30476b = r2;
        }

        public String a() {
            return this.f30476b;
        }

        public String b() {
            return this.f30475a;
        }
    }

    static {
        byte[] r2 = {85, -119, -26, 46, -36, 112, 56, -8, 107, 72, 87, -4, -126, 59, 101};
        g(r2, new byte[]{-65, 0, 73, -19, -46, -25, 60, 86, 42, 19, 17, 121, 9, 77, 81});
        f30472c = new String(r2, StandardCharsets.UTF_8).intern();
    }

    public Q1(a r3, KeyStore r4) {
        this.f30473a = r3;
        if (h(r4) == false) goto L6;
        this.f30474b = r4;
        return;
    L6:
        byte[] r1 = {-5, 103, -11, 59, -95, -14, -53, -106, -112, 68, 107, 53, 42, -90, 104, -37, -8, 67, 59, 88, SignedBytes.MAX_POWER_OF_TWO, 60, Ascii.SO, -35, 39, 112, -115};
        g(r1, new byte[]{63, -24, 2, 72, -44, 54, -22, -84, 89, -88, -127, 119, -12, 104, -120, 91, -63, -38, Ascii.SUB, 67, 60, 56, 91, 99, 39, Ascii.ESC, -63});
        throw new IllegalArgumentException(new String(r1, StandardCharsets.UTF_8).intern());
    }

    public static void g(byte[] r19, byte[] r20) {
        int r2 = ~Q1.class.getName().length();
        int r22 = (((~(((Q1.class.getName().length() | 70245657) | r2) - (r2 | (Q1.class.getName().length() & (-70245658))))) & (-1979440632)) + ((Q1.class.getName().length() & 1074528264) | 1093142560)) ^ (-886298072);
        int r3 = -1;
        int r4 = AbstractC4326z1.a(Q1.class, -1);
        int r42 = (((r4 | (-1789924155)) - ((21884101 | r4) ^ (-1811767295))) + (((Q1.class.getName().length() | 1811808253) - 1811808253) | 537399298)) ^ (-1274367997);
        int r5 = ((((~Q1.class.getName().length()) | (-576567005)) & 276971586) + ((Q1.class.getName().length() & 36928) | 1073844225)) ^ 1350815811;
        int r6 = ((((~Q1.class.getName().length()) | (-1157759625)) & 1755853004) + ((Q1.class.getName().length() & 1073973402) | (-2146202606))) ^ (-390349602);
        int r7 = ((~Q1.class.getName().length()) | (-529537184)) & 457019905;
        int r8 = Q1.class.getName().length();
        int r72 = (-1686268015) ^ ((((454038545 & r8) ^ (-2143287920)) + (r8 & 1040)) + r7);
        int r82 = ((((~Q1.class.getName().length()) | (-1064961)) + 689325073) + ((Q1.class.getName().length() & (-2112862208)) | (-2109732696))) ^ (-1420407624);
        int r9 = ((~Q1.class.getName().length()) | 91711000) & (-1070824876);
        int r10 = Q1.class.getName().length();
        int r92 = (r9 + (9457696 | ((r10 | (-1064779676)) - (r10 ^ (-1064779676))))) ^ 1492981618;
        short[] r102 = null;
    L4:
        switch(r92) {
            case -2143294076: goto L32;
            case -2038999444: goto L29;
            case -1809249287: goto L28;
            case -1740520186: goto L27;
            case -1489518479: goto L26;
            case -473033593: goto L25;
            case 766056152: goto L21;
            case 974072829: goto L20;
            case 998066383: goto L19;
            case 1314339506: goto L18;
            case 1734050766: goto L13;
            case 1771480224: goto L12;
            case 2093236949: goto L8;
            default: goto L5;
        };
    L18:
        return;
    L27:
        r102 = new short[((((~Q1.class.getName().length()) | (-382746167)) & 102532165) + ((Q1.class.getName().length() & 105907748) | 4198960)) ^ 106731121];
        r22 = ((((~Q1.class.getName().length()) | (-6036961)) & 1233145505) + ((Q1.class.getName().length() & 809508000) | 809603328)) ^ 2042748833;
        int r93 = ((~Q1.class.getName().length()) | 1688058452) & 872484865;
        int r11 = Q1.class.getName().length() & 268460041;
        int r12 = (((((Q1.class.getName().length() & (~r11)) & 4218888) + 4218888) + r11) - ((r11 | Q1.class.getName().length()) & 4218888)) + r93;
        int r94 = 434661073;
    L17:
        r92 = r94 ^ r12;
        goto L4
    L28:
        byte r52 = r19[(((((~Q1.class.getName().length()) | 1233459797) & 125923146) + ((Q1.class.getName().length() & 774137098) | 674496513)) ^ 800419659) + r22];
        int r62 = ((((~Q1.class.getName().length()) | (-7107622)) & 402932290) + ((Q1.class.getName().length() & 546586672) | 546340912)) ^ 949273229;
        int r83 = ((Q1.class.getName().length() | r62) - (r52 | r62)) + (AbstractC4326z1.a(Q1.class, r52) + (Q1.class.getName().length() & r62));
        int r53 = ((((~Q1.class.getName().length()) | (-81143879)) & 438583424) + ((Q1.class.getName().length() & 786435) | 8921603)) ^ 447505026;
        byte r54 = r19[((r53 & r22) * 2) + (r53 ^ r22)];
        int r63 = ~Q1.class.getName().length();
        r5 = (short) (((r54 & ((-1954201202) ^ ((((Q1.class.getName().length() | (-2105278367)) - (r63 | (-1545180443))) + (AbstractC4326z1.a(Q1.class, 568748773 | r63) + (Q1.class.getName().length() & (-2105278367)))) + ((Q1.class.getName().length() & (-2097135360)) | 151077136)))) << (((((~Q1.class.getName().length()) | (-1592082969)) & 140665109) + ((Q1.class.getName().length() & 142103568) | 1612800)) ^ 142277917)) | r83);
        int r64 = ~Q1.class.getName().length();
        int r65 = (-1901610175) ^ ((((((~r64) & (-569955033)) + r64) | 2038255548) - 2038255548) + ((Q1.class.getName().length() & 144806464) | 136645376));
        int r73 = -r22;
        int r84 = r73 | r65;
        byte r66 = r19[(r84 - (r73 * 2)) + ((r65 ^ r73) ^ r84)];
        int r85 = (((-199685676) | r7) - 1591672428) - ((~Q1.class.getName().length()) | (-180811308));
        int r74 = (Q1.class.getName().length() & 23072776) | 272636008;
        int r67 = r66 & ((-1319036669) ^ (((r74 | r85) - ((Q1.class.getName().length() & (~r85)) & r74)) + (r74 & (r85 | Q1.class.getName().length()))));
        int r75 = ((~Q1.class.getName().length()) | (-1009031633)) & 545538049;
        int r86 = (Q1.class.getName().length() & 537143360) | 10560;
        int r76 = r19[(545548610 ^ ((r86 & r75) + (r75 | r86))) + r22] & (((((~Q1.class.getName().length()) | 75364313) & 1242301609) + ((Q1.class.getName().length() & 1249907040) | (-1602217664))) ^ (-359916266));
        int r87 = Q1.class.getName().length();
        r6 = (short) (r67 | (r76 << ((((1779401364 | (((~r87) - r87) + r87)) & 447961710) + ((Q1.class.getName().length() & (-1313580806)) | (-519831408))) ^ (-71869706))));
        int r77 = ~Q1.class.getName().length();
        r72 = 758110381 ^ (((((-1343875612) | r77) + 311432716) - (r77 | (-1074391060))) + ((Q1.class.getName().length() & 273678921) | (-1069545407)));
        int r88 = ~Q1.class.getName().length();
        int r89 = 1409942802 & (((((Q1.class.getName().length() & (~r88)) & 91135407) + 91135407) + r88) - ((r88 | Q1.class.getName().length()) & 91135407));
        int r95 = (Q1.class.getName().length() & (-804257776)) | (-2094006112);
        int r810 = -r89;
        r82 = (-684063310) ^ (((~r810) & r95) - (r810 & (~r95)));
        int r96 = (((~Q1.class.getName().length()) | (-537919489)) - (-806798471)) + ((Q1.class.getName().length() & 674768897) | 153626665);
        int r112 = 1174056570 - r96;
        int r122 = -1174056571;
    L10:
        r92 = ((r96 & r122) * 2) + r112;
        goto L4
    L29:
        int r97 = ~Q1.class.getName().length();
        int r32 = (((((((~r97) & Q1.class.getName().length()) & 797295576) + 797295576) + r97) - ((Q1.class.getName().length() | r97) & 797295576)) & 161497089) + ((Q1.class.getName().length() & (-2145386455)) | (-2147483476));
        int r33 = ((short) ((r5 << AbstractC4309u.a(r32 | (-1985986391), 2, -1985986391, r32)) + r102[((((~Q1.class.getName().length()) | (-1085986263)) & 1078327440) + ((Q1.class.getName().length() & 1612763792) | 674234944)) ^ 1752562386])) ^ (r5 + r72);
        int r98 = ~Q1.class.getName().length();
        int r99 = r5 >>> ((((~(((Q1.class.getName().length() | 626856794) | r98) - ((Q1.class.getName().length() & (-626856795)) | r98))) & 957405457) + ((Q1.class.getName().length() & 588787984) | 36185216)) ^ 993590676);
        short r15 = r102[((((~Q1.class.getName().length()) | 1248713193) & 826417528) + ((Q1.class.getName().length() & 822288912) | (-2138488320))) ^ (-1312070789)];
        int r910 = -r99;
        int r17 = r910 | r15;
        int r18 = (r17 - (r910 * 2)) + ((r910 ^ r15) ^ r17);
        int r34 = -(((r18 - r33) - ((r18 | (~r33)) * 2)) - 2);
        r6 = (short) C.a(r6, 3, -(r.a(r6, -4, 1, r34) | (r34 & 2)), 1);
        int r35 = ((~Q1.class.getName().length()) | (-549847554)) + 1624126210;
        int r911 = (Q1.class.getName().length() & 549848649) | 67175498;
        r5 = (short) (r5 - ((((short) ((r6 << (1691301711 ^ ((r911 & r35) + (r35 | r911)))) + r102[((((~Q1.class.getName().length()) | (-1005965450)) & 153223237) + ((Q1.class.getName().length() & 220201009) | 335544368)) ^ 488767605])) ^ (((r72 | r6) - ((Q1.class.getName().length() & (~r6)) & r72)) + ((Q1.class.getName().length() | r6) & r72))) ^ ((r6 >>> (((((~Q1.class.getName().length()) | (-30261291)) & (-1534000062)) + ((Q1.class.getName().length() & 8609814) | 2285588)) ^ (-1531714477))) + r102[((((~Q1.class.getName().length()) | (-23496740)) & 827084804) + ((Q1.class.getName().length() & (-2117787632)) | (-2139021104))) ^ (-1311936299)])));
        int r36 = ((~Q1.class.getName().length()) | (-412319609)) & (-1959782776);
        int r912 = (Q1.class.getName().length() & 403838542) | 268582982;
        int r37 = -r36;
        int r113 = (((~r37) & r912) * 2) - (r37 ^ r912);
        r72 = (short) (r72 - (((1691170566 & r113) * 2) + ((-1691170567) - r113)));
        r82 = r82 + 1;
        int r38 = (((~Q1.class.getName().length()) | (-961655275)) & 25184460) + ((Q1.class.getName().length() & 150995145) | 140771329);
        int r913 = 1965034008;
    L30:
        r92 = r913 ^ r38;
    L31:
        r3 = -1;
        goto L4
    L32:
        int r39 = ~Q1.class.getName().length();
        if (r22 >= r42) goto L35;
        int r310 = (r39 | (-1553600102)) - (((-1553600360) | r39) ^ 536887698);
        int r914 = (Q1.class.getName().length() & 268439810) | 285217280;
        int r311 = -r310;
        r92 = ((((~r311) & r914) * 2) - (r311 ^ r914)) ^ (-1524017045);
        goto L31
    L35:
        r38 = ((r39 | (-747233512)) & (-1862204400)) + ((Q1.class.getName().length() & 1073807362) | 1116733474);
        r913 = -375509041;
        goto L30
    L5:
        int r915 = ~Q1.class.getName().length();
        int r14 = (((-313266948) | r915) + 45165696) - (r915 | (-269226756));
        int r916 = C.a(r14, 3, -r.a(r14, -4, 1, (Q1.class.getName().length() & 44040224) | (-1811807712)), 1);
        int r114 = -361272203;
    L6:
        r92 = r916 ^ r114;
        goto L4
    L12:
        r19[(((((~Q1.class.getName().length()) | 1110430873) & 1241612298) + ((Q1.class.getName().length() & 150996226) | 84419840)) ^ 1326032138) + r22] = (byte) ((((((~Q1.class.getName().length()) | 1603962366) & 25199440) + (((Q1.class.getName().length() | (-1311235)) + 1311235) | (-2146172766))) ^ (-2120973555)) & r5);
        int r917 = (((((~Q1.class.getName().length()) | (-1388708984)) & 706816128) + ((Q1.class.getName().length() & 1124204552) | 1363312648)) ^ 2070128777) + r22;
        int r115 = ((~Q1.class.getName().length()) | 367288948) & 548745488;
        int r123 = Q1.class.getName().length();
        r19[r917] = (byte) ((r5 >> ((r115 + (((r123 + 558960896) - (r123 | 558960896)) | 21135364)) ^ 569880860)) & (((((~Q1.class.getName().length()) | 2113158628) & 1026558002) + ((Q1.class.getName().length() & 8392730) | 8525645)) ^ 1035083648));
        int r918 = (((~Q1.class.getName().length()) | 715175224) & 136512788) + ((Q1.class.getName().length() & 196644) | (-2146430752));
        int r124 = ((((-2009917962) - r918) - (((~r918) | (-2009917962)) * 2)) - 2) + r22;
        int r919 = ((~Q1.class.getName().length()) | (-1010633609)) & 678986012;
        int r116 = Q1.class.getName().length();
        int r117 = ~(((951583497 & r116) + 276825601) - (r116 & 276824577));
        int r920 = -r919;
        r19[r124] = (byte) ((((((~r920) - r117) * 2) + ((r117 + r920) + 1)) ^ 955811810) & r6);
        int r921 = (((((~Q1.class.getName().length()) | (-1084937228)) & 438503696) + ((Q1.class.getName().length() & 69369860) | (-2080078843))) ^ (-1641575146)) + r22;
        int r118 = ~Q1.class.getName().length();
        int r119 = r6 >> (2092810490 ^ ((((Q1.class.getName().length() | 674349280) - (r118 | 1869872636)) + (AbstractC4326z1.a(Q1.class, 1197735420 | r118) + (Q1.class.getName().length() & 674349280))) + ((Q1.class.getName().length() & 1754529808) | 1418461202)));
        int r125 = ((~Q1.class.getName().length()) | 1601418652) & 1439188132;
        int r13 = (Q1.class.getName().length() & 545800290) | (-1442676670);
        int r126 = -r125;
        r19[r921] = (byte) (r119 & ((-3488743) ^ (((~r126) & r13) - (r126 & (~r13)))));
        r22 = r22 + 4;
        r916 = (((~Q1.class.getName().length()) | (-171976913)) & 318775824) + ((Q1.class.getName().length() & 33562640) | 136194);
        r114 = -1824662634;
        goto L6
    L13:
        int r922 = ~Q1.class.getName().length();
        if (r22 > 0) goto L15;
        int r1110 = (Q1.class.getName().length() & R.^attr-private.__removed0) | 553664516;
        int r923 = -((r922 | 1510858717) & 403833600);
        r12 = ((~r923) & r1110) - (r923 & (~r1110));
        r94 = 2001041846;
        goto L17
    L15:
        int r1111 = Q1.class.getName().length();
        r916 = ((r922 | (-268772210)) & 282132586) + (168323072 | ((r1111 + 402735200) - (r1111 | 402735200)));
        r114 = -115901203;
        goto L6
    L19:
        r22 = (((AbstractC4326z1.a(Q1.class, r3) | 314136709) & 371231304) + (((Q1.class.getName().length() | (-67142233)) + 67142233) | (-1996488432))) ^ (-1625257128);
        r42 = r19.length - (r19.length % (((((~Q1.class.getName().length()) | 366661365) & 1344150018) + ((Q1.class.getName().length() & (-1006333853)) | (-2080341919))) ^ (-736191897)));
        r916 = (((~Q1.class.getName().length()) | (-1359635359)) & 49026131) + ((Q1.class.getName().length() & (-1860698094)) | (-1190123008));
        r114 = 1002689495;
        goto L6
    L20:
        int r23 = r19.length;
        int r924 = ((~Q1.class.getName().length()) | 1711185063) & 170281206;
        int r1112 = (Q1.class.getName().length() & 251684176) | 1694512896;
        int r925 = -r924;
        r22 = r23 % (1864794098 ^ (((~r925) & r1112) - (r925 & (~r1112))));
        r916 = (((~Q1.class.getName().length()) | 991120067) & (-2113137661)) + ((Q1.class.getName().length() & (-1878240248)) | 285229064);
        r114 = -195569723;
        goto L6
    L21:
        int r926 = ((~Q1.class.getName().length()) | (-889871025)) & 1233748555;
        int r1113 = Q1.class.getName().length();
        int r152 = (r1113 + 84675108) - (r1113 | 84675108);
        if (r22 >= (1842188139 ^ ((((~r152) & 608439588) + r152) + r926))) goto L24;
        int r927 = ((~Q1.class.getName().length()) | 1878725846) & 1912684595;
        int r1114 = (Q1.class.getName().length() & 268589089) | 661640;
        r916 = AbstractC4317w1.a(r927 | r1114, 2, (~r927) ^ r1114, 1);
        r114 = -717449014;
        goto L6
    L24:
        r916 = (((~Q1.class.getName().length()) | (-1477955618)) & (-1604246503)) + ((Q1.class.getName().length() & 1074350177) | 1342720098);
        r114 = -887872332;
        goto L6
    L25:
        int r1115 = -r22;
        int r928 = -r19.length;
        int r127 = r928 | r1115;
        int r153 = (r127 - (r928 * 2)) + ((r928 ^ r1115) ^ r127);
        byte r929 = r19[r19.length - r22];
        int r1116 = Q1.class.getName().length();
        r19[r153] = (byte) (r929 ^ r20[r22 % (((((-878819395) | ((r1116 - 1) - (r1116 * 2))) & 1490255976) + ((Q1.class.getName().length() & 274827331) | 556017667)) ^ 2046273635)]);
        r22 = r22 - 1;
        int r930 = (AbstractC4326z1.a(Q1.class, r3) | 114408723) & 1183666176;
        int r1117 = Q1.class.getName().length() & 1074544770;
        r916 = AbstractC4289n.a(r1117, ((-r1117) - 1) | (-268567684), 268567684, r930);
        r114 = 836032333;
        goto L6
    L26:
        int r931 = Q1.class.getName().length();
        int r932 = (((-2053077912) & ((516782023 - r931) + (((-((-1) - r931)) - 1) | (-516782024)))) + ((Q1.class.getName().length() & (-1054752728)) | 1073823745)) ^ (-979254165);
        int r933 = r20[(((~r22) & r932) * ((~r932) & r22)) + ((r932 & r22) * (r932 | r22))] & (((((~Q1.class.getName().length()) | (-1883938358)) & (-738125179)) + ((Q1.class.getName().length() & 1343232517) | 546308360)) ^ (-191816846));
        int r1118 = ~Q1.class.getName().length();
        int r1119 = 73539736 & (((~r1118) & (-1772650326)) + r1118);
        int r128 = (Q1.class.getName().length() & 35664144) | 33608448;
        int r1120 = -r1119;
        byte r1121 = r20[((107148186 ^ ((((~r1120) & r128) * 2) - (r1120 ^ r128))) * r22) + ((((AbstractC4326z1.a(Q1.class, r3) | (-532481)) - (-67641369)) + ((Q1.class.getName().length() & 532546) | 1602)) ^ 67642971)];
        int r129 = ~Q1.class.getName().length();
        int r1122 = (r1121 & (((663757504 & ((r129 + 1314070430) - (r129 & 1314070430))) + ((Q1.class.getName().length() & 834674756) | 272630796)) ^ 936388147)) << ((((AbstractC4326z1.a(Q1.class, r3) | (-33554434)) - (-1107366402)) + ((Q1.class.getName().length() & (-2113929151)) | (-2147475136))) ^ (-1040108727));
        r102[r22] = (short) ((r1122 ^ r933) + (r933 & r1122));
        r22 = r22 + 1;
        r916 = ((AbstractC4326z1.a(Q1.class, r3) | (-167014194)) & 1157999680) + ((Q1.class.getName().length() & 159661328) | (-2004872944));
        r114 = -533943416;
        goto L6
    L8:
        if (r82 >= (((((~Q1.class.getName().length()) | (-616910267)) & 1303391760) + ((Q1.class.getName().length() & 75500825) | 537198861)) ^ 1840590653)) goto L11;
        r96 = (((~Q1.class.getName().length()) | 1297715640) & 556926729) + ((Q1.class.getName().length() & 874653185) | 335552516);
        r112 = (-1287294623) - r96;
        r122 = 1287294622;
        goto L10
    L11:
        int r934 = ~Q1.class.getName().length();
        r916 = (1141965102 & (((-1207265904) + r934) + (((-r934) - 1) | 1207265904))) + ((Q1.class.getName().length() & 1292960864) | 150996032);
        r114 = 612868558;
        goto L6
    }

    public C4261d1 a(Exception r5) {
        byte[] r3 = {-65, 84, 46, 119, -1, -24, 118, -49, -116, 56, 10, 1, 118, Ascii.EM, 54, -70, -24, 17, -20, -74, 44, -20, -111, -2, 103, 39, -1, Ascii.SI, -9, -73, 0, -87, -112, 57, 59, 9, -105, 36, -94, -69, -126, 110, 74, -12, 125, Ascii.FS, 84, -56, -40, -20};
        g(r3, new byte[]{-57, -119, -86, 10, -27, 65, 117, -22, Ascii.SYN, -89, 6, Ascii.DEL, 123, SignedBytes.MAX_POWER_OF_TWO, 2, -18, -29, 33, -87, 86, -117, 62, -94, -111, 42, -52, -4, 76, -84, -120, -99, -36, 70, -96, 77, 99, Ascii.SO, -93, -38, 92, 70, 70, 110, -20, -122, 73, -84, -37, Ascii.US, 49});
        return new C4261d1(-7778, new String(r3, StandardCharsets.UTF_8).intern(), r5);
    }

    public abstract Key b(KeyStore.Entry r1);

    public abstract KeyStore.Entry c(Date r1);

    @Override // com.aheaditec.talsec.security.P1
    public boolean c() {
        return l();
    }

    @Override // com.aheaditec.talsec.security.P1
    public Key d() {
        if (l() == false) goto L7;
        Key r02 = b(o());
        e(r02);
        return r02;
    L7:
        throw a(null);
    }

    public final void e(Key r4) {
        k(r4);     // Catch: InvalidKeyException -> L5 NoSuchPaddingException -> L15 NoSuchAlgorithmException -> L17
        return;
    L5:
        e = move-exception;
        if ((e instanceof UserNotAuthenticatedException) == false) goto L10;
        return;
    L10:
        if ((e instanceof KeyPermanentlyInvalidatedException) == true) goto L12;
        byte[] r2 = {-80, Ascii.SO, -6, 126, -84, -39, -30, -24, 92, -58, -99, 122, Ascii.DC4, 124, -82, -99, 89, 83, -115, -92, 67, SignedBytes.MAX_POWER_OF_TWO, -108, 45, 74, 52, 112, -33, -26, 47, -65, -105, -38, 19, -58, Ascii.SUB, 97, 4, 124, -80, -69, -65, 32, -116, Ascii.SYN, -81, -8, -29, 104, Ascii.DEL};
        g(r2, new byte[]{74, Ascii.SUB, Ascii.SUB, -14, -22, -16, 100, 118, 44, -93, -123, -30, -93, -88, -33, -56, -103, -11, 1, -48, 74, 17, 19, -112, -35, 99, 90, SignedBytes.MAX_POWER_OF_TWO, 118, 124, 53, 94, 84, -48, -91, 107, 47, -66, 81, -38, -41, 93, -123, Ascii.DLE, 73, 9, -6, -103, -22, -6});
        throw new C4261d1(-7772, new String(r2, StandardCharsets.UTF_8).intern(), e);
    L12:
        throw n();
    L17:
        e = e;
    L19:
        throw i(e);
    L15:
        e = e;
        goto L19
    }

    public final void f(KeyStore.Entry r4, KeyStore.ProtectionParameter r5) {
        this.f30474b.setEntry(this.f30473a.b(), r4, r5);     // Catch: KeyStoreException -> L5
        return;
    L5:
        e = move-exception;
        byte[] r1 = {93, Ascii.GS, -59, -78, -116, 55, -111, 38, -108, -109, -65, Ascii.ETB, -120, Ascii.ETB, 124, -6, 36, UnsignedBytes.MAX_POWER_OF_TWO, 73, -38, -122, 51, 83, 0, -46, -96, -89, 0, 92, -117, 83, -71, 68, 122, -65, 39, Ascii.DC4, 54, 114, 116, -20, -52, -44, -74, -5};
        g(r1, new byte[]{Ascii.ETB, -98, -53, 42, -42, 17, -85, 67, -77, -37, 36, 57, 109, 0, 121, 85, -22, -17, -37, 108, UnsignedBytes.MAX_POWER_OF_TWO, 119, 74, -127, -71, 55, 10, -1, -30, -9, -49, 86, 3, 61, 4, -56, 109, 65, 53, Ascii.DC4, 55, 69, 42, 104, 62});
        throw new C4261d1(-7772, new String(r1, StandardCharsets.UTF_8).intern(), e);
    }

    public final boolean h(KeyStore r4) {
        byte[] r2 = {114, 5, -114, 74, 101, -51, 54, -56, -45, 97, -47, 95, -89, -100, -50};
        g(r2, new byte[]{-51, -85, -18, -56, Ascii.US, -23, 97, Ascii.VT, Ascii.DEL, 19, UnsignedBytes.MAX_POWER_OF_TWO, -87, -112, -27, -42});
        return new String(r2, StandardCharsets.UTF_8).intern().equals(r4.getProvider().getName());
    }

    public C4261d1 i(Exception r5) {
        byte[] r3 = {68, -106, -73, Ascii.CAN, 1, 117, 33, 96, 91, 33, 55, 100, 89, 117, 93, -95, -34, -66, -102, Ascii.NAK, -123, Ascii.ESC, -78, 42, 113, 0, 104, 106, -85, -57, -88, -103, -122, 85, -20, 125, -117, Ascii.CAN, 58, 92, -9, 37, 53, -86, 17, 82, -93, -96, -117, -58, -3, -1, -73, -9};
        g(r3, new byte[]{82, -110, -59, -96, -105, 103, -126, Ascii.SUB, 120, 54, -43, -2, 82, 5, 33, -105, 56, 19, -69, -94, -5, -46, 73, 55, 97, -78, -99, 69, 79, 45, -98, 2, -18, -49, 116, Ascii.SI, -41, 7, -36, 2, 59, 8, -57, 104, 105, -121, 4, -119, 63, 74, -16, -81, -50, -112});
        return new C4261d1(-7773, new String(r3, StandardCharsets.UTF_8).intern(), r5);
    }

    public abstract KeyStore.ProtectionParameter j(Date r1);

    public abstract void k(Key r1);

    public final boolean l() {
        return m();
    L5:
        e = move-exception;
        byte[] r3 = {-54, -62, -28, 40, -39, -44, -79, -40, 105, 55, 100, -127, Ascii.SYN, -87, 87, -77, -48, Ascii.DEL, -114, 73, -84, -7, 80, 74, 35, -82, 122, 83, 116, 32, 65, 70, -75, 99, -127, 110, -35, 8, 8, -105, 76, -90, 91, -83, 87, 69, 36, -58, Ascii.FF, 88};
        g(r3, new byte[]{39, 61, 126, -31, 71, 71, 78, 71, -36, -55, 35, -84, -8, 119, 123, 36, 96, 4, 38, 55, 2, 36, -121, -8, -86, 38, 10, -109, 108, -17, -59, Ascii.ESC, -113, Ascii.DLE, 75, -80, 80, Ascii.NAK, 81, 119, -108, -62, 124, 111, -3, 8, Ascii.SUB, -63, 57, 34});
        throw new C4261d1(-7772, new String(r3, StandardCharsets.UTF_8).intern(), e);
    }

    public boolean m() {
        boolean r02 = this.f30474b.containsAlias(this.f30473a.b());
        boolean r1 = this.f30474b.entryInstanceOf(this.f30473a.b(), KeyStore.SecretKeyEntry.class);
        if (r02 == false) goto L7;
        if (r1 == false) goto L9;
        return true;
    L9:
        return false;
    L7:
        return false;
    }

    public C4261d1 n() {
        return new C4261d1(-7779, null);
    }

    public KeyStore.Entry o() {
        return p();
    L7:
        e = move-exception;
        byte[] r3 = {-67, 33, 73, -64, -94, 19, -62, 43, -127, -9, -13, -93, -112, -115, 88, -106, -78, -52, 0, 89, -107, 101, 45, -28, -100, -31, -106, 55, 61, 78, 69, -40, Ascii.ESC, Ascii.FS, -21, 62, -5, -66, -74, -26, -35, -3, 87, -98, 41, -56, 106, -7, -84, UnsignedBytes.MAX_POWER_OF_TWO};
        g(r3, new byte[]{-38, -27, -34, Ascii.FF, 91, 49, -89, 90, -55, SignedBytes.MAX_POWER_OF_TWO, Ascii.DC4, 126, 108, -13, -86, Ascii.SUB, 68, -101, 58, -60, 63, Ascii.CAN, -32, -80, -53, -111, -120, -56, -56, -11, -15, Ascii.DC2, -86, 67, -72, -65, -38, 116, -122, -9, 109, -8, 65, -82, 80, Ascii.CAN, 90, 1, -71, 107});
        throw new C4261d1(-7772, new String(r3, StandardCharsets.UTF_8).intern(), e);
    }

    public KeyStore.Entry p() {
        KeyStore.Entry r02 = this.f30474b.getEntry(this.f30473a.b(), null);
        if (r02 == null) goto L6;
        return r02;
    L6:
        throw a(null);
    }

    @Override // com.aheaditec.talsec.security.P1
    public void remove() {
        this.f30474b.deleteEntry(this.f30473a.b());     // Catch: KeyStoreException -> L5
        return;
    L5:
        e = move-exception;
        byte[] r3 = {-37, 72, 19, 79, -10, 97, 32, -1, -118, -50, 42, 94, -77, 117, 48, -28, -112, 80, 1, -100, -1, 61, 118, 5, -110, 123, 96, -36, -60, -51, -97, -12, -73, -122, 8, -84, 46, 57, -17, -7, -70, -20, UnsignedBytes.MAX_POWER_OF_TWO, -116, 69, 32, 119, -71};
        g(r3, new byte[]{Ascii.EM, -3, 43, -109, -75, -87, 32, -73, 36, 57, 122, Ascii.FS, Ascii.SYN, 112, -16, -71, 72, -68, -28, 85, 123, 57, -60, -57, -61, -66, 112, 110, Ascii.EM, 6, -15, -73, 48, -99, 91, 63, Ascii.FF, 45, 74, Ascii.VT, 34, -22, -122, -1, Ascii.SYN, 45, -19, 3});
        throw new C4261d1(-7772, new String(r3, StandardCharsets.UTF_8).intern(), e);
    }

    @Override // com.aheaditec.talsec.security.P1
    public void a() {
        Date r02 = new Date();
        f(c(r02), j(r02));
    }
}
