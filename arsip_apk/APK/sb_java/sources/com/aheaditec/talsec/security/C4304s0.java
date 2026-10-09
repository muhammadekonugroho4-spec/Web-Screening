package com.aheaditec.talsec.security;

import android.R;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import org.json.JSONObject;

/* renamed from: com.aheaditec.talsec.security.s0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4304s0 implements B1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f30688a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30689b;

    public C4304s0(String r2, String r3) {
        this.f30688a = r2;
        if (r3 != null) goto L6;
        byte[] r32 = {-60, UnsignedBytes.MAX_POWER_OF_TWO, -94, Ascii.RS};
        b(r32, new byte[]{-42, 83, 107, 84, 2, -20, 9, -93});
        this.f30689b = new String(r32, StandardCharsets.UTF_8).intern();
        return;
    L6:
        this.f30689b = r3;
    }

    public static void b(byte[] r19, byte[] r20) {
        int r2 = ~C4304s0.class.getName().length();
        int r22 = (((~(((C4304s0.class.getName().length() | 70245657) | r2) - (r2 | (C4304s0.class.getName().length() & (-70245658))))) & (-1979440632)) + ((C4304s0.class.getName().length() & 1074528264) | 1093142560)) ^ (-886298072);
        int r3 = -1;
        int r4 = AbstractC4326z1.a(C4304s0.class, -1);
        int r42 = (((r4 | (-1789924155)) - ((21884101 | r4) ^ (-1811767295))) + (((C4304s0.class.getName().length() | 1811808253) - 1811808253) | 537399298)) ^ (-1274367997);
        int r5 = ((((~C4304s0.class.getName().length()) | (-576567005)) & 276971586) + ((C4304s0.class.getName().length() & 36928) | 1073844225)) ^ 1350815811;
        int r6 = ((((~C4304s0.class.getName().length()) | (-1157759625)) & 1755853004) + ((C4304s0.class.getName().length() & 1073973402) | (-2146202606))) ^ (-390349602);
        int r7 = ((~C4304s0.class.getName().length()) | (-529537184)) & 457019905;
        int r8 = C4304s0.class.getName().length();
        int r72 = (-1686268015) ^ ((((454038545 & r8) ^ (-2143287920)) + (r8 & 1040)) + r7);
        int r82 = ((((~C4304s0.class.getName().length()) | (-1064961)) + 689325073) + ((C4304s0.class.getName().length() & (-2112862208)) | (-2109732696))) ^ (-1420407624);
        int r9 = ((~C4304s0.class.getName().length()) | 91711000) & (-1070824876);
        int r10 = C4304s0.class.getName().length();
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
        r102 = new short[((((~C4304s0.class.getName().length()) | (-382746167)) & 102532165) + ((C4304s0.class.getName().length() & 105907748) | 4198960)) ^ 106731121];
        r22 = ((((~C4304s0.class.getName().length()) | (-6036961)) & 1233145505) + ((C4304s0.class.getName().length() & 809508000) | 809603328)) ^ 2042748833;
        int r93 = ((~C4304s0.class.getName().length()) | 1688058452) & 872484865;
        int r11 = C4304s0.class.getName().length() & 268460041;
        int r12 = (((((C4304s0.class.getName().length() & (~r11)) & 4218888) + 4218888) + r11) - ((r11 | C4304s0.class.getName().length()) & 4218888)) + r93;
        int r94 = 434661073;
    L17:
        r92 = r94 ^ r12;
        goto L4
    L28:
        byte r52 = r19[(((((~C4304s0.class.getName().length()) | 1233459797) & 125923146) + ((C4304s0.class.getName().length() & 774137098) | 674496513)) ^ 800419659) + r22];
        int r62 = ((((~C4304s0.class.getName().length()) | (-7107622)) & 402932290) + ((C4304s0.class.getName().length() & 546586672) | 546340912)) ^ 949273229;
        int r83 = ((C4304s0.class.getName().length() | r62) - (r52 | r62)) + (AbstractC4326z1.a(C4304s0.class, r52) + (C4304s0.class.getName().length() & r62));
        int r53 = ((((~C4304s0.class.getName().length()) | (-81143879)) & 438583424) + ((C4304s0.class.getName().length() & 786435) | 8921603)) ^ 447505026;
        byte r54 = r19[((r53 & r22) * 2) + (r53 ^ r22)];
        int r63 = ~C4304s0.class.getName().length();
        r5 = (short) (((r54 & ((-1954201202) ^ ((((C4304s0.class.getName().length() | (-2105278367)) - (r63 | (-1545180443))) + (AbstractC4326z1.a(C4304s0.class, 568748773 | r63) + (C4304s0.class.getName().length() & (-2105278367)))) + ((C4304s0.class.getName().length() & (-2097135360)) | 151077136)))) << (((((~C4304s0.class.getName().length()) | (-1592082969)) & 140665109) + ((C4304s0.class.getName().length() & 142103568) | 1612800)) ^ 142277917)) | r83);
        int r64 = ~C4304s0.class.getName().length();
        int r65 = (-1901610175) ^ ((((((~r64) & (-569955033)) + r64) | 2038255548) - 2038255548) + ((C4304s0.class.getName().length() & 144806464) | 136645376));
        int r73 = -r22;
        int r84 = r73 | r65;
        byte r66 = r19[(r84 - (r73 * 2)) + ((r65 ^ r73) ^ r84)];
        int r85 = (((-199685676) | r7) - 1591672428) - ((~C4304s0.class.getName().length()) | (-180811308));
        int r74 = (C4304s0.class.getName().length() & 23072776) | 272636008;
        int r67 = r66 & ((-1319036669) ^ (((r74 | r85) - ((C4304s0.class.getName().length() & (~r85)) & r74)) + (r74 & (r85 | C4304s0.class.getName().length()))));
        int r75 = ((~C4304s0.class.getName().length()) | (-1009031633)) & 545538049;
        int r86 = (C4304s0.class.getName().length() & 537143360) | 10560;
        int r76 = r19[(545548610 ^ ((r86 & r75) + (r75 | r86))) + r22] & (((((~C4304s0.class.getName().length()) | 75364313) & 1242301609) + ((C4304s0.class.getName().length() & 1249907040) | (-1602217664))) ^ (-359916266));
        int r87 = C4304s0.class.getName().length();
        r6 = (short) (r67 | (r76 << ((((1779401364 | (((~r87) - r87) + r87)) & 447961710) + ((C4304s0.class.getName().length() & (-1313580806)) | (-519831408))) ^ (-71869706))));
        int r77 = ~C4304s0.class.getName().length();
        r72 = 758110381 ^ (((((-1343875612) | r77) + 311432716) - (r77 | (-1074391060))) + ((C4304s0.class.getName().length() & 273678921) | (-1069545407)));
        int r88 = ~C4304s0.class.getName().length();
        int r89 = 1409942802 & (((((C4304s0.class.getName().length() & (~r88)) & 91135407) + 91135407) + r88) - ((r88 | C4304s0.class.getName().length()) & 91135407));
        int r95 = (C4304s0.class.getName().length() & (-804257776)) | (-2094006112);
        int r810 = -r89;
        r82 = (-684063310) ^ (((~r810) & r95) - (r810 & (~r95)));
        int r96 = (((~C4304s0.class.getName().length()) | (-537919489)) - (-806798471)) + ((C4304s0.class.getName().length() & 674768897) | 153626665);
        int r112 = 1174056570 - r96;
        int r122 = -1174056571;
    L10:
        r92 = ((r96 & r122) * 2) + r112;
        goto L4
    L29:
        int r97 = ~C4304s0.class.getName().length();
        int r32 = (((((((~r97) & C4304s0.class.getName().length()) & 797295576) + 797295576) + r97) - ((C4304s0.class.getName().length() | r97) & 797295576)) & 161497089) + ((C4304s0.class.getName().length() & (-2145386455)) | (-2147483476));
        int r33 = ((short) ((r5 << AbstractC4309u.a(r32 | (-1985986391), 2, -1985986391, r32)) + r102[((((~C4304s0.class.getName().length()) | (-1085986263)) & 1078327440) + ((C4304s0.class.getName().length() & 1612763792) | 674234944)) ^ 1752562386])) ^ (r5 + r72);
        int r98 = ~C4304s0.class.getName().length();
        int r99 = r5 >>> ((((~(((C4304s0.class.getName().length() | 626856794) | r98) - ((C4304s0.class.getName().length() & (-626856795)) | r98))) & 957405457) + ((C4304s0.class.getName().length() & 588787984) | 36185216)) ^ 993590676);
        short r15 = r102[((((~C4304s0.class.getName().length()) | 1248713193) & 826417528) + ((C4304s0.class.getName().length() & 822288912) | (-2138488320))) ^ (-1312070789)];
        int r910 = -r99;
        int r17 = r910 | r15;
        int r18 = (r17 - (r910 * 2)) + ((r910 ^ r15) ^ r17);
        int r34 = -(((r18 - r33) - ((r18 | (~r33)) * 2)) - 2);
        r6 = (short) C.a(r6, 3, -(r.a(r6, -4, 1, r34) | (r34 & 2)), 1);
        int r35 = ((~C4304s0.class.getName().length()) | (-549847554)) + 1624126210;
        int r911 = (C4304s0.class.getName().length() & 549848649) | 67175498;
        r5 = (short) (r5 - ((((short) ((r6 << (1691301711 ^ ((r911 & r35) + (r35 | r911)))) + r102[((((~C4304s0.class.getName().length()) | (-1005965450)) & 153223237) + ((C4304s0.class.getName().length() & 220201009) | 335544368)) ^ 488767605])) ^ (((r72 | r6) - ((C4304s0.class.getName().length() & (~r6)) & r72)) + ((C4304s0.class.getName().length() | r6) & r72))) ^ ((r6 >>> (((((~C4304s0.class.getName().length()) | (-30261291)) & (-1534000062)) + ((C4304s0.class.getName().length() & 8609814) | 2285588)) ^ (-1531714477))) + r102[((((~C4304s0.class.getName().length()) | (-23496740)) & 827084804) + ((C4304s0.class.getName().length() & (-2117787632)) | (-2139021104))) ^ (-1311936299)])));
        int r36 = ((~C4304s0.class.getName().length()) | (-412319609)) & (-1959782776);
        int r912 = (C4304s0.class.getName().length() & 403838542) | 268582982;
        int r37 = -r36;
        int r113 = (((~r37) & r912) * 2) - (r37 ^ r912);
        r72 = (short) (r72 - (((1691170566 & r113) * 2) + ((-1691170567) - r113)));
        r82 = r82 + 1;
        int r38 = (((~C4304s0.class.getName().length()) | (-961655275)) & 25184460) + ((C4304s0.class.getName().length() & 150995145) | 140771329);
        int r913 = 1965034008;
    L30:
        r92 = r913 ^ r38;
    L31:
        r3 = -1;
        goto L4
    L32:
        int r39 = ~C4304s0.class.getName().length();
        if (r22 >= r42) goto L35;
        int r310 = (r39 | (-1553600102)) - (((-1553600360) | r39) ^ 536887698);
        int r914 = (C4304s0.class.getName().length() & 268439810) | 285217280;
        int r311 = -r310;
        r92 = ((((~r311) & r914) * 2) - (r311 ^ r914)) ^ (-1524017045);
        goto L31
    L35:
        r38 = ((r39 | (-747233512)) & (-1862204400)) + ((C4304s0.class.getName().length() & 1073807362) | 1116733474);
        r913 = -375509041;
        goto L30
    L5:
        int r915 = ~C4304s0.class.getName().length();
        int r14 = (((-313266948) | r915) + 45165696) - (r915 | (-269226756));
        int r916 = C.a(r14, 3, -r.a(r14, -4, 1, (C4304s0.class.getName().length() & 44040224) | (-1811807712)), 1);
        int r114 = -361272203;
    L6:
        r92 = r916 ^ r114;
        goto L4
    L12:
        r19[(((((~C4304s0.class.getName().length()) | 1110430873) & 1241612298) + ((C4304s0.class.getName().length() & 150996226) | 84419840)) ^ 1326032138) + r22] = (byte) ((((((~C4304s0.class.getName().length()) | 1603962366) & 25199440) + (((C4304s0.class.getName().length() | (-1311235)) + 1311235) | (-2146172766))) ^ (-2120973555)) & r5);
        int r917 = (((((~C4304s0.class.getName().length()) | (-1388708984)) & 706816128) + ((C4304s0.class.getName().length() & 1124204552) | 1363312648)) ^ 2070128777) + r22;
        int r115 = ((~C4304s0.class.getName().length()) | 367288948) & 548745488;
        int r123 = C4304s0.class.getName().length();
        r19[r917] = (byte) ((r5 >> ((r115 + (((r123 + 558960896) - (r123 | 558960896)) | 21135364)) ^ 569880860)) & (((((~C4304s0.class.getName().length()) | 2113158628) & 1026558002) + ((C4304s0.class.getName().length() & 8392730) | 8525645)) ^ 1035083648));
        int r918 = (((~C4304s0.class.getName().length()) | 715175224) & 136512788) + ((C4304s0.class.getName().length() & 196644) | (-2146430752));
        int r124 = ((((-2009917962) - r918) - (((~r918) | (-2009917962)) * 2)) - 2) + r22;
        int r919 = ((~C4304s0.class.getName().length()) | (-1010633609)) & 678986012;
        int r116 = C4304s0.class.getName().length();
        int r117 = ~(((951583497 & r116) + 276825601) - (r116 & 276824577));
        int r920 = -r919;
        r19[r124] = (byte) ((((((~r920) - r117) * 2) + ((r117 + r920) + 1)) ^ 955811810) & r6);
        int r921 = (((((~C4304s0.class.getName().length()) | (-1084937228)) & 438503696) + ((C4304s0.class.getName().length() & 69369860) | (-2080078843))) ^ (-1641575146)) + r22;
        int r118 = ~C4304s0.class.getName().length();
        int r119 = r6 >> (2092810490 ^ ((((C4304s0.class.getName().length() | 674349280) - (r118 | 1869872636)) + (AbstractC4326z1.a(C4304s0.class, 1197735420 | r118) + (C4304s0.class.getName().length() & 674349280))) + ((C4304s0.class.getName().length() & 1754529808) | 1418461202)));
        int r125 = ((~C4304s0.class.getName().length()) | 1601418652) & 1439188132;
        int r13 = (C4304s0.class.getName().length() & 545800290) | (-1442676670);
        int r126 = -r125;
        r19[r921] = (byte) (r119 & ((-3488743) ^ (((~r126) & r13) - (r126 & (~r13)))));
        r22 = r22 + 4;
        r916 = (((~C4304s0.class.getName().length()) | (-171976913)) & 318775824) + ((C4304s0.class.getName().length() & 33562640) | 136194);
        r114 = -1824662634;
        goto L6
    L13:
        int r922 = ~C4304s0.class.getName().length();
        if (r22 > 0) goto L15;
        int r1110 = (C4304s0.class.getName().length() & R.^attr-private.__removed0) | 553664516;
        int r923 = -((r922 | 1510858717) & 403833600);
        r12 = ((~r923) & r1110) - (r923 & (~r1110));
        r94 = 2001041846;
        goto L17
    L15:
        int r1111 = C4304s0.class.getName().length();
        r916 = ((r922 | (-268772210)) & 282132586) + (168323072 | ((r1111 + 402735200) - (r1111 | 402735200)));
        r114 = -115901203;
        goto L6
    L19:
        r22 = (((AbstractC4326z1.a(C4304s0.class, r3) | 314136709) & 371231304) + (((C4304s0.class.getName().length() | (-67142233)) + 67142233) | (-1996488432))) ^ (-1625257128);
        r42 = r19.length - (r19.length % (((((~C4304s0.class.getName().length()) | 366661365) & 1344150018) + ((C4304s0.class.getName().length() & (-1006333853)) | (-2080341919))) ^ (-736191897)));
        r916 = (((~C4304s0.class.getName().length()) | (-1359635359)) & 49026131) + ((C4304s0.class.getName().length() & (-1860698094)) | (-1190123008));
        r114 = 1002689495;
        goto L6
    L20:
        int r23 = r19.length;
        int r924 = ((~C4304s0.class.getName().length()) | 1711185063) & 170281206;
        int r1112 = (C4304s0.class.getName().length() & 251684176) | 1694512896;
        int r925 = -r924;
        r22 = r23 % (1864794098 ^ (((~r925) & r1112) - (r925 & (~r1112))));
        r916 = (((~C4304s0.class.getName().length()) | 991120067) & (-2113137661)) + ((C4304s0.class.getName().length() & (-1878240248)) | 285229064);
        r114 = -195569723;
        goto L6
    L21:
        int r926 = ((~C4304s0.class.getName().length()) | (-889871025)) & 1233748555;
        int r1113 = C4304s0.class.getName().length();
        int r152 = (r1113 + 84675108) - (r1113 | 84675108);
        if (r22 >= (1842188139 ^ ((((~r152) & 608439588) + r152) + r926))) goto L24;
        int r927 = ((~C4304s0.class.getName().length()) | 1878725846) & 1912684595;
        int r1114 = (C4304s0.class.getName().length() & 268589089) | 661640;
        r916 = AbstractC4317w1.a(r927 | r1114, 2, (~r927) ^ r1114, 1);
        r114 = -717449014;
        goto L6
    L24:
        r916 = (((~C4304s0.class.getName().length()) | (-1477955618)) & (-1604246503)) + ((C4304s0.class.getName().length() & 1074350177) | 1342720098);
        r114 = -887872332;
        goto L6
    L25:
        int r1115 = -r22;
        int r928 = -r19.length;
        int r127 = r928 | r1115;
        int r153 = (r127 - (r928 * 2)) + ((r928 ^ r1115) ^ r127);
        byte r929 = r19[r19.length - r22];
        int r1116 = C4304s0.class.getName().length();
        r19[r153] = (byte) (r929 ^ r20[r22 % (((((-878819395) | ((r1116 - 1) - (r1116 * 2))) & 1490255976) + ((C4304s0.class.getName().length() & 274827331) | 556017667)) ^ 2046273635)]);
        r22 = r22 - 1;
        int r930 = (AbstractC4326z1.a(C4304s0.class, r3) | 114408723) & 1183666176;
        int r1117 = C4304s0.class.getName().length() & 1074544770;
        r916 = AbstractC4289n.a(r1117, ((-r1117) - 1) | (-268567684), 268567684, r930);
        r114 = 836032333;
        goto L6
    L26:
        int r931 = C4304s0.class.getName().length();
        int r932 = (((-2053077912) & ((516782023 - r931) + (((-((-1) - r931)) - 1) | (-516782024)))) + ((C4304s0.class.getName().length() & (-1054752728)) | 1073823745)) ^ (-979254165);
        int r933 = r20[(((~r22) & r932) * ((~r932) & r22)) + ((r932 & r22) * (r932 | r22))] & (((((~C4304s0.class.getName().length()) | (-1883938358)) & (-738125179)) + ((C4304s0.class.getName().length() & 1343232517) | 546308360)) ^ (-191816846));
        int r1118 = ~C4304s0.class.getName().length();
        int r1119 = 73539736 & (((~r1118) & (-1772650326)) + r1118);
        int r128 = (C4304s0.class.getName().length() & 35664144) | 33608448;
        int r1120 = -r1119;
        byte r1121 = r20[((107148186 ^ ((((~r1120) & r128) * 2) - (r1120 ^ r128))) * r22) + ((((AbstractC4326z1.a(C4304s0.class, r3) | (-532481)) - (-67641369)) + ((C4304s0.class.getName().length() & 532546) | 1602)) ^ 67642971)];
        int r129 = ~C4304s0.class.getName().length();
        int r1122 = (r1121 & (((663757504 & ((r129 + 1314070430) - (r129 & 1314070430))) + ((C4304s0.class.getName().length() & 834674756) | 272630796)) ^ 936388147)) << ((((AbstractC4326z1.a(C4304s0.class, r3) | (-33554434)) - (-1107366402)) + ((C4304s0.class.getName().length() & (-2113929151)) | (-2147475136))) ^ (-1040108727));
        r102[r22] = (short) ((r1122 ^ r933) + (r933 & r1122));
        r22 = r22 + 1;
        r916 = ((AbstractC4326z1.a(C4304s0.class, r3) | (-167014194)) & 1157999680) + ((C4304s0.class.getName().length() & 159661328) | (-2004872944));
        r114 = -533943416;
        goto L6
    L8:
        if (r82 >= (((((~C4304s0.class.getName().length()) | (-616910267)) & 1303391760) + ((C4304s0.class.getName().length() & 75500825) | 537198861)) ^ 1840590653)) goto L11;
        r96 = (((~C4304s0.class.getName().length()) | 1297715640) & 556926729) + ((C4304s0.class.getName().length() & 874653185) | 335552516);
        r112 = (-1287294623) - r96;
        r122 = 1287294622;
        goto L10
    L11:
        int r934 = ~C4304s0.class.getName().length();
        r916 = (1141965102 & (((-1207265904) + r934) + (((-r934) - 1) | 1207265904))) + ((C4304s0.class.getName().length() & 1292960864) | 150996032);
        r114 = 612868558;
        goto L6
    }

    @Override // com.aheaditec.talsec.security.B1
    public void a(JSONObject r3) {
        r3.put(this.f30688a, this.f30689b);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L15:
        return false;
    L8:
        if (getClass() != r5.getClass()) goto L15;
        C4304s0 r52 = (C4304s0) r5;
        if (Objects.equals(this.f30688a, r52.f30688a) == false) goto L15;
        if (Objects.equals(this.f30689b, r52.f30689b) == false) goto L15;
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f30688a, this.f30689b});
    }
}
