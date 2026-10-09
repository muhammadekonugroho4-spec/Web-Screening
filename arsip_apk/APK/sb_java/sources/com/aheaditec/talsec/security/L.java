package com.aheaditec.talsec.security;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes4.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static final String f30366a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final String f30367b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final String f30368c = null;
    public static final String d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final String f30369e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final String f30370f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f30371g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f30372h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f30373i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f30374j = null;

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f30375k = null;

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f30376l = null;

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f30377m = null;

    static {
        byte[] r1 = {51, 74, 78, 32, -127, -15};
        a(r1, new byte[]{34, 5, -105, -21, -14, -102, -14, -119});
        Charset r3 = StandardCharsets.UTF_8;
        f30370f = new String(r1, r3).intern();
        byte[] r4 = {-89, 114, -14, -82, 8, -9, 32, -36, -45};
        a(r4, new byte[]{-80, 17, Ascii.DLE, 105, Ascii.RS, -108, -59, Ascii.ESC, -95});
        f30369e = new String(r4, r3).intern();
        byte[] r42 = {-18, 92, 58, -68, -57, -82, -98};
        a(r42, new byte[]{-7, 63, -40, 123, -75, -35, -21, 107});
        d = new String(r42, r3).intern();
        byte[] r9 = {-61, Ascii.FF, 53, 51, Ascii.DC2, 57, -114, 88, -31, 80, 49, 116, -117, 87, 48, 19, -85, Ascii.DEL, 19, 65, -6, 108, -5, -9, 78, 61};
        a(r9, new byte[]{Ascii.DLE, 94, -45, -10, -63, 89, 89, -99, -8, 48, -22, -94, -106, 74, -47, -59, -82, 46, -60, -107, -30, Ascii.CR, 91, 43, 39, 77});
        f30368c = new String(r9, r3).intern();
        byte[] r92 = {-119, 65, -91, -103, 107, -4, 76};
        a(r92, new byte[]{-113, 34, SignedBytes.MAX_POWER_OF_TWO, 66, 9, -109, 52, 79});
        f30367b = new String(r92, r3).intern();
        byte[] r11 = {123, 0, -43, -40, 118, 89, -50};
        a(r11, new byte[]{108, 98, 52, 10, 6, 60, -86, -79});
        f30366a = new String(r11, r3).intern();
        byte[] r112 = {-15, 103};
        a(r112, new byte[]{-126, Ascii.DC2, 69, -23, 53, 108, -86, -96});
        String r02 = new String(r112, r3).intern();
        byte[] r12 = {-64, Ascii.SO, -59, -42};
        a(r12, new byte[]{-41, 109, 19, 7, -37, -59, 92, -75});
        String r113 = new String(r12, r3).intern();
        byte[] r13 = {-37, 65, 111, -92, 75, -94};
        a(r13, new byte[]{-54, Ascii.SO, -74, 111, 56, -55, 59, -94});
        f30371g = new String[]{r02, r113, new String(r13, r3).intern()};
        byte[] r114 = {-46, -121, -30, 77, 0, -90, -15, -37, 1, -102, -109, 41, 19, -122, 106, -25, 74, 9};
        a(r114, new byte[]{1, -25, 9, -104, Ascii.CAN, -11, 46, 74, Ascii.GS, -54, 72, -7, -64, -30, -80, 44, 41, 97});
        String r03 = new String(r114, r3).intern();
        byte[] r15 = {121, 66, 17, -103, 100, -80, Ascii.SYN, -113, -10, -24, -14, 96, 63, 117, 32, 50, -104};
        a(r15, new byte[]{-86, 34, -6, 76, 124, -29, -55, Ascii.RS, -16, -65, Ascii.DC2, -15, 36, 35, -5, -9, -16});
        String r93 = new String(r15, r3).intern();
        byte[] r7 = {-24, Ascii.VT, 42, 82, -93};
        a(r7, new byte[]{-13, 93, -15, -105, -53, -120, 72, Ascii.NAK});
        f30372h = new String[]{r03, r93, new String(r7, r3).intern()};
        byte[] r72 = {-64, 65, Ascii.GS, -51, 112, 40, 95, 49, 50, 3, 67, 51, -4, -118, -60, 47, -33, -87, 105, -42, 116, Ascii.VT, -5, -62, 45};
        a(r72, new byte[]{19, 33, -10, Ascii.CAN, 104, 123, UnsignedBytes.MAX_POWER_OF_TWO, -96, 55, 93, -95, -94, Ascii.VT, -24, 38, -24, -55, -54, -116, 17, 98, Ascii.ETB, 40, Ascii.DLE, 70});
        String r17 = new String(r72, r3).intern();
        byte[] r73 = {83, -91, -126, Ascii.DEL, 74, -54, -24, 10, 93, 110, -44, Ascii.RS, 70, 32, 47, 79, -109, 91, 115, -69, Ascii.FF, 78, -124, 51, -95, Ascii.DC2, 96, -112, -126, Ascii.SUB, 17, -50, -36, 36};
        a(r73, new byte[]{UnsignedBytes.MAX_POWER_OF_TWO, -59, 105, -86, 82, -103, 55, -101, 84, Ascii.FF, 1, -113, 75, 124, -12, -103, 65, 10, -46, 32, -47, Ascii.SO, 99, -31, -88, 114, -91, 39, 106, 84, -58, 1, -77, 74});
        String r18 = new String(r73, r3).intern();
        byte[] r74 = {-29, 42, 55, -10, -25, -8, 106, -27, 38, 9, Ascii.DC4, -88, -55, Ascii.DEL, -112, -64, 121, 124, -24, -111, Ascii.VT, 46, 50, -39, -65, 77, Ascii.ESC, -113, -94, -45, 116, -56, -80, -105, 44, 65, 5, -33, 17};
        a(r74, new byte[]{48, 123, -32, 46, 52, -88, -117, 42, -12, 81, -11, Ascii.DEL, -34, 41, 75, Ascii.CR, 113, Ascii.US, Ascii.SO, 71, Ascii.SO, 50, -41, Ascii.SO, -85, Ascii.RS, -1, 88, -75, UnsignedBytes.MAX_POWER_OF_TWO, -112, 88, -72, -40, -5, -114, 106, -79, 62});
        String r19 = new String(r74, r3).intern();
        byte[] r115 = {61, Ascii.SYN, -56, 99, -115, 90, -61, 40, 52, 89, 54, -30, -45, -61, -49, 115, 2, 9, 109, Ascii.FS, -4};
        a(r115, new byte[]{-18, 118, 35, -74, -107, 9, Ascii.FS, -71, 40, 9, -19, 50, 0, -110, Ascii.FS, -76, 19, 84, -115, -55, -119});
        String r20 = new String(r115, r3).intern();
        byte[] r116 = {Ascii.RS, -13, -20, Ascii.SUB, -80, 82, 107, 0, -25, -84, -95, 123, -98, 123, 42, 126, 83, 69, 56, -120, -90, -101, 58, -127, -92, 47, -114, 89, 9, Ascii.DEL, 56, 72, -110, -100};
        a(r116, new byte[]{-51, -109, 7, -49, -88, 1, -76, -111, -2, -51, 69, -22, -123, 40, -75, -82, 90, Ascii.SYN, -18, 7, -80, -58, -37, 87, 119, 79, 105, -42, Ascii.SI, 48, -19, -123, -25, -20});
        String r21 = new String(r116, r3).intern();
        byte[] r117 = {-44, 34, -94, Ascii.DEL, 77, 115, 7, 54, -21, -100, 58, -58, -90, -80, -71};
        a(r117, new byte[]{7, 66, 73, -86, 85, 32, -40, -89, -9, -52, -31, Ascii.SYN, -119, -35, -52});
        f30373i = new String[]{r17, r18, r19, r20, r21, new String(r117, r3).intern()};
        byte[] r118 = {47, 94, -92, UnsignedBytes.MAX_POWER_OF_TWO, 39, -76, -100, 98, 0, 19, Ascii.SUB, -37};
        a(r118, new byte[]{-4, Ascii.SI, 119, 86, 34, -87, 66, -77, 7, 92, -60, 74});
        String r172 = new String(r118, r3).intern();
        byte[] r119 = {Ascii.DEL, 91, -96, -77, 44, 120, -55, -67, Ascii.EM, 91, -65, 72, -14, Ascii.GS, 107, 106};
        a(r119, new byte[]{-84, 10, 115, 101, 41, 101, Ascii.ETB, 108, Ascii.RS, Ascii.DC4, 97, -39, -12, 74, -117, -5});
        String r182 = new String(r119, r3).intern();
        byte[] r1110 = {-104, 102, -49, -57, -43, -112, 17, Ascii.FF, -77, 88, 42, 112, Ascii.RS, 52, -102, -70, -7};
        a(r1110, new byte[]{75, 55, Ascii.FS, 17, -48, -115, -49, -35, -76, Ascii.ETB, -12, -31, 2, 100, 65, 106, -42});
        String r192 = new String(r1110, r3).intern();
        byte[] r1111 = {126, 51, -78, 61, -16, 94};
        a(r1111, new byte[]{-83, 83, 102, -10, -98, 113, -57, -89});
        String r202 = new String(r1111, r3).intern();
        byte[] r1112 = {85, -70, 60, -73, -46, 107, -11, 45};
        a(r1112, new byte[]{-122, -38, -37, 38, -44, 60, Ascii.NAK, -68});
        String r212 = new String(r1112, r3).intern();
        byte[] r1113 = {37, 68, -8, 42, 0, -103, 33, 113, -6};
        a(r1113, new byte[]{-10, 36, Ascii.US, -69, Ascii.ETB, -6, -9, -96, -43});
        String r22 = new String(r1113, r3).intern();
        byte[] r14 = {-26, -60, -22, -117, -67, -80, 57, 17, -119, -118, 125, -27};
        a(r14, new byte[]{53, -92, 1, 94, -91, -29, -26, UnsignedBytes.MAX_POWER_OF_TWO, -113, -35, -99, 116});
        String r23 = new String(r14, r3).intern();
        byte[] r16 = {-54, -60, 87, -101, -118, 34, -66, 120, -60, Ascii.VT, 63, 46, -84, 91, -2, 39, -100};
        a(r16, new byte[]{Ascii.EM, -92, -68, 78, -110, 113, 97, -23, -62, 92, -33, -65, 126, 9, Ascii.DC4, -15, -77});
        String r24 = new String(r16, r3).intern();
        byte[] r110 = {-44, -41, -121, -7, Ascii.NAK, 126, Ascii.GS, -23, -39, -9, -25, -27, -1, -50, 9, -8, Ascii.ETB, 53, -104, -38, 77};
        a(r110, new byte[]{7, -73, 108, 44, Ascii.CR, 45, -62, 120, -33, -96, 7, 116, -11, -127, -46, 54, 0, 122, SignedBytes.MAX_POWER_OF_TWO, Ascii.GS, 98});
        String r25 = new String(r110, r3).intern();
        byte[] r111 = {Ascii.FF, 62, -116, -97, -41, -34, Ascii.EM, -127, 118, -70, -79, -118, 123, -35, -2, 53};
        a(r111, new byte[]{-33, 94, 103, 74, -49, -115, -58, Ascii.DLE, 97, -24, Ascii.DLE, 80, 125, -118, Ascii.RS, -92});
        String r26 = new String(r111, r3).intern();
        byte[] r120 = {Ascii.CAN, 117, -51, 8, 39, 101, -49, -35, -48, -35, -61, -86, 95, -52, 62, -37, 120, 123, -86, -23, Ascii.DEL, 99, 97, -115, 17};
        a(r120, new byte[]{-53, Ascii.NAK, 38, -35, 63, 54, Ascii.DLE, 76, -55, -68, 39, 59, 68, -97, -95, Ascii.VT, 113, 40, 124, 102, 105, 62, UnsignedBytes.MAX_POWER_OF_TWO, 91, 62});
        String r27 = new String(r120, r3).intern();
        byte[] r121 = {75, -14, Ascii.RS, 89, -68, 52, 57, Ascii.CAN, -120, -22, -48, -105, -119};
        a(r121, new byte[]{-104, -110, -11, -116, -92, 103, -26, -119, -108, -70, Ascii.VT, 71, -90});
        String r28 = new String(r121, r3).intern();
        byte[] r122 = {-90, 108, -33, 40, 104, -4, -34};
        a(r122, new byte[]{117, 60, Ascii.FF, -19, 0, -103, -15, -111});
        String r29 = new String(r122, r3).intern();
        byte[] r123 = {95, -93, 5, Ascii.FS, -93, 111};
        a(r123, new byte[]{-116, -14, -42, -54, -62, SignedBytes.MAX_POWER_OF_TWO, -8, -26});
        String r30 = new String(r123, r3).intern();
        byte[] r124 = {6, -4, 49, -14, 9};
        a(r124, new byte[]{-43, -83, -26, 42, 38, 92, 121, 56});
        String r31 = new String(r124, r3).intern();
        byte[] r125 = {96, -81, -84, -112, Ascii.EM, 5, 37, 102};
        a(r125, new byte[]{-77, -49, 71, 69, 1, 86, -6, -9});
        f30374j = new String[]{r172, r182, r192, r202, r212, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, new String(r125, r3).intern()};
        byte[] r126 = {35, 54, Ascii.SI, Ascii.EM, -61};
        a(r126, new byte[]{-16, 103, -36, -49, -94, 51, -111, -61});
        String r173 = new String(r126, r3).intern();
        byte[] r127 = {92, -38, -8, -95, -72, 102, -27};
        a(r127, new byte[]{-113, -70, 19, 116, -52, 3, -120, 42});
        String r183 = new String(r127, r3).intern();
        byte[] r128 = {-84, -50, -115, -90, 19, -79, 9, 43, 69, 5, -50};
        a(r128, new byte[]{Ascii.DEL, -82, 102, 115, Ascii.VT, -30, -42, -70, 39, 108, -96});
        String r193 = new String(r128, r3).intern();
        byte[] r129 = {-7, -15, -100, 37, 100, 95, -8, -34, 58, 79, 104, Ascii.CR};
        a(r129, new byte[]{42, -111, 119, -16, 124, Ascii.FF, 39, 79, 45, Ascii.US, -77, -35});
        String r203 = new String(r129, r3).intern();
        byte[] r130 = {-14, 126, -84, 6, -2, 41, Ascii.ETB, -115, -102, -27, Ascii.FF, -22};
        a(r130, new byte[]{33, Ascii.RS, 71, -45, -26, 122, -56, Ascii.FS, -122, -75, -41, 58});
        String r213 = new String(r130, r3).intern();
        byte[] r131 = {17, 96, 0, -55, -78, 98, -108, Ascii.US, -37, -114, -119};
        a(r131, new byte[]{-62, 3, -41, Ascii.EM, -70, 63, 112, -114, -71, -25, -25});
        String r222 = new String(r131, r3).intern();
        byte[] r132 = {-57, -47, -118, -8, -30};
        a(r132, new byte[]{Ascii.DC4, -79, 94, 51, -116, -98, 104, 80});
        String r232 = new String(r132, r3).intern();
        byte[] r133 = {72, 6, -79, 46};
        a(r133, new byte[]{-101, 84, 87, -21, Ascii.VT, -48, -48, Ascii.CAN});
        String r242 = new String(r133, r3).intern();
        byte[] r134 = {-27, -91, 103, 82};
        a(r134, new byte[]{54, -59, -116, -121, -113, 3, -19, 111});
        String r252 = new String(r134, r3).intern();
        byte[] r135 = {-11, 78, 62, Ascii.ETB, -117};
        a(r135, new byte[]{38, 19, -38, -58, -24, -120, 53, -6});
        String r262 = new String(r135, r3).intern();
        byte[] r136 = {123, -91, -86, Ascii.CAN};
        a(r136, new byte[]{-88, -12, 125, -64, -100, 96, 48, -30});
        String r272 = new String(r136, r3).intern();
        byte[] r137 = {-49};
        a(r137, new byte[]{-32, 125, -31, -4, -74, -36, -110, -67});
        f30375k = new String[]{r173, r183, r193, r203, r213, r222, r232, r242, r252, r262, r272, new String(r137, r3).intern()};
        byte[] r138 = {85, Ascii.SYN, -80, -13, -79, -18, -127, 121, -118, 98, 86, 44, 77, 56, -42, -28, -114, -16, -108, -28};
        a(r138, new byte[]{92, 117, Ascii.DLE, 54, -67, -95, 90, -87, UnsignedBytes.MAX_POWER_OF_TWO, 53, -78, -21, -97, 88, 49, 54, -121, -112, 113, 51});
        String r174 = new String(r138, r3).intern();
        byte[] r139 = {-92, -52, -2, 3, -2, -32, -56, -96, -50, 32, 85, Ascii.ESC, 73};
        a(r139, new byte[]{83, -82, Ascii.FS, -60, -24, -125, 45, 103, -40, 60, -122, -55, 34});
        String r184 = new String(r139, r3).intern();
        byte[] r140 = {67, 93, -118, 83, -59, -55, 32, -78, -90, -1, 4, -99, 117};
        a(r140, new byte[]{-84, Ascii.VT, 106, -102, -42, -119, -63, 99, -66, -29, -41, 79, Ascii.RS});
        String r194 = new String(r140, r3).intern();
        byte[] r141 = {65, Ascii.SUB, -104, 124, -43, -8, 41, -27, 6, 46, -102, 77};
        a(r141, new byte[]{-82, 76, 120, -75, -61, -91, -56, 51, -44, 96, 120, UnsignedBytes.MAX_POWER_OF_TWO});
        String r204 = new String(r141, r3).intern();
        byte[] r142 = {Ascii.ETB, -19, Ascii.RS, -28, 75, 2, 34, 6, -49, -17, -57, -56, -6};
        a(r142, new byte[]{Ascii.SI, -80, -9, 35, 91, 98, -61, -41, -41, -13, Ascii.DC4, Ascii.SUB, -111});
        String r214 = new String(r142, r3).intern();
        byte[] r143 = {-84, -23, 114, 117, -2, 82, 51, -112, -115, -7, 109, Ascii.DC2, 59, -10, -30, -8, Ascii.US};
        a(r143, new byte[]{-85, -76, -83, -27, -15, 5, -45, 89, -98, -74, -113, -64, -23, -87, 3, 41, 107});
        String r223 = new String(r143, r3).intern();
        byte[] r144 = {-105, 60, -51, -100, -23, 0, -38, 61, -81, -83, -70, Ascii.SI, 93, Ascii.CR, 33, -37, -117, 19, 74, 59, 114};
        a(r144, new byte[]{-112, 97, Ascii.DC2, Ascii.FF, -26, 87, 58, -12, -71, -16, 91, -39, -113, 85, -6, Ascii.VT, UnsignedBytes.MAX_POWER_OF_TWO, 112, -81, -4, 0});
        String r233 = new String(r144, r3).intern();
        byte[] r145 = {-87, -34, Ascii.FF, 62, -51, -16, -69, -30, -78, -34, 83, -90, 49, -23, 46, -13, 113, -52, 66, -15};
        a(r145, new byte[]{-82, -125, -45, -82, -58, -93, 90, 40, -95, -68, -13, 112, 34, -116, -7, 61, 103, -111, -93, 39});
        String r243 = new String(r145, r3).intern();
        byte[] r146 = {83, -105, 37, Ascii.CAN, 115, -14, 6, -78, 119, -100, 40, 32, Ascii.RS, 49, -1, 100, 1};
        a(r146, new byte[]{84, -54, -6, -120, 101, -81, -25, 100, 99, -58, -49, -11, -52, 105, 36, -76, 102});
        String r253 = new String(r146, r3).intern();
        byte[] r147 = {126, 86, 52, 48, -94, 71, -39, -31, Ascii.CAN, -107, -81, 49, -14, 114, -120, -88, 36, 52, 91, -7, 97, -23, -79, 42, 56, 35, 68, -18, 96, -47, -125, -126, -16};
        a(r147, new byte[]{121, Ascii.VT, -21, -96, -75, Ascii.DLE, Ascii.SI, 34, -54, -50, 120, -24, -3, 37, 104, 97, 50, 105, -70, 47, 108, -75, 84, -4, 61, 121, -102, 41, 118, -126, 80, 87, -119});
        String r263 = new String(r147, r3).intern();
        byte[] r148 = {-83, 94, 19, -24, 100, -96, -56, -126, -29, 58, -71, -57, 41, -26, -33, -108, -35, -35, 58, -64, -97};
        a(r148, new byte[]{-86, 3, -52, 120, 104, -13, 34, 65, -14, 103, 109, 87, 37, -69, 54, 66, -50, -67, -37, 17, -21});
        String r273 = new String(r148, r3).intern();
        byte[] r149 = {-49, -10, -25, -24, Ascii.ETB, -48, 0, 47, 55, 50, Ascii.FS, -16, -24, 85, -71, 38, -91, 88, Ascii.GS, 52, -17, 77, -120, -4, -37, 114, 42, -16, -119, 57, 102, 93, -114, -101, -102, Ascii.FF, -84, -23, 38, -44, 126, -45, 34, -113};
        a(r149, new byte[]{-56, -85, 56, 120, Ascii.US, -125, -24, -28, 48, 97, -8, 33, -5, 55, Ascii.EM, -21, -88, 4, -60, -31, -22, Ascii.ETB, 86, 58, -46, Ascii.SYN, -15, 53, UnsignedBytes.MAX_POWER_OF_TWO, 37, -80, -102, -108, -52, 79, -53, -70, -76, -57, 2, 113, -124, -62, 70});
        String r282 = new String(r149, r3).intern();
        byte[] r150 = {90, 62, 1, Ascii.SUB, Ascii.ETB, 53, 77, 1, -105, -17, 86, -98, 70, -29, -61, 103, -36, 35, -47, -120, -4, 72, 112, Ascii.FS, 47, -1};
        a(r150, new byte[]{93, 99, -34, -118, 0, 100, -83, -111, -127, -78, -73, 72, 67, -65, Ascii.NAK, -77, -49, 70, 10, 94, -16, Ascii.NAK, -105, -54, 95, -100});
        String r292 = new String(r150, r3).intern();
        byte[] r151 = {-40, -17, 58, -69, -77, -26, -99, -104, -77, -80, -6, 61, -75, -112, -90, 102, -3, -113, -110, -123, 69, -36, 37, 113};
        a(r151, new byte[]{-33, -78, -27, 43, -88, -114, 74, 95, -91, -19, Ascii.ESC, -21, -74, -78, 2, -1, 32, -111, 55, Ascii.SYN, -105, -110, -57, -68});
        String r302 = new String(r151, r3).intern();
        byte[] r152 = {-127, 7, -9, Ascii.ESC, 98, 61, -120, Ascii.FS, 5, -85, -22, -30, -86, 111, 126, 91, 33, -43, 121, 116, 125, 55, Ascii.GS};
        a(r152, new byte[]{-122, 90, 40, -117, 124, 107, 83, -49, Ascii.FS, -11, 55, 114, -68, 50, -97, -115, -13, -127, -89, -91, Ascii.US, 86, 113});
        String r312 = new String(r152, r3).intern();
        byte[] r153 = {111, -67, -90, -85, 5, -77, 68, -73, -70, 108, -107, -78, -88, 73, 33, -87, -97, -5, 52, 110, -69, -127, 60};
        a(r153, new byte[]{104, -32, 121, 59, 0, -23, -109, 101, -74, 4, 70, 121, -70, 85, -7, 125, -102, -96, -25, -70, -44, -18, 72});
        String r32 = new String(r153, r3).intern();
        byte[] r154 = {-106, -27, -17, 66, -36, 82, 76, 109, -75, -111, 76, -12, -41, 122, -64, -62, -117, 6, -102, -75, -115};
        a(r154, new byte[]{-111, -72, 48, -46, -53, Ascii.SI, -108, -69, -67, -9, -20, 32, -60, 39, 38, 5, -125, 80, 65, 115, -24});
        String r33 = new String(r154, r3).intern();
        byte[] r155 = {74, 80, -6, -43, 0, Ascii.CR, -66, 3, 96, 67, -112, -62, -88, -8, 109, -126, 1, -17, 41, -37, -113, 42, 117, 113};
        a(r155, new byte[]{77, Ascii.CR, 37, 69, 8, 94, 86, -64, 104, 39, 67, Ascii.DC2, -81, -85, -51, 86, Ascii.DC2, -78, -49, Ascii.RS, -97, 119, -90, -68});
        String r34 = new String(r155, r3).intern();
        byte[] r156 = {-59, 111, -21, 10, -7, -107, 112, -8, 49, -36, 74, 2, 82, -31, 57, -107, -39, 119, 38, 111, -84, -38, 59, 120, -61, -75, 94, -68};
        a(r156, new byte[]{-62, 50, 52, -102, -15, -58, -104, 59, 57, -72, -103, -46, 85, -78, -103, 65, -54, 42, -64, -86, -68, -121, -24, -75, -41, -17, -71, 105});
        String r35 = new String(r156, r3).intern();
        byte[] r157 = {-46, 39, -91, -34, 62, -1, 124, 107, 116, -26, 52, 65, -81, 123, 8, 10, -101, 102, -107, 111, Ascii.RS, 100, -17, 126, 8, -64, -57, -66, -13, -15, 59, -92};
        a(r157, new byte[]{-38, 116, 5, 10, 45, -81, -108, -5, 113, -70, -30, -107, -68, 44, -34, -102, -121, 56, 116, -70, Ascii.ETB, 54, 79, -75, Ascii.SUB, -95, 33, 125, -29, -85, -20, 112});
        String r36 = new String(r157, r3).intern();
        byte[] r158 = {-39, Ascii.FF, 58, -42, 119, -26, -13, 98, 87, -53, 8, -2, 125, -78, -66, -87, 63, 41, 45, -100};
        a(r158, new byte[]{-34, 81, -27, 70, 96, -87, Ascii.DC4, -74, 90, -110, -88, 43, 100, -30, 91, Ascii.DEL, 41, 102, -53, 91});
        String r37 = new String(r158, r3).intern();
        byte[] r159 = {-114, -97, Ascii.EM, 46, Ascii.DEL, Ascii.FS, -102, Ascii.SUB, -62, -125, -24, -78, -112, Ascii.DEL, -97, 19, Ascii.DLE, 99, 87, -109, 114, 94, 101, 102, 61, 66, -126, -119, SignedBytes.MAX_POWER_OF_TWO, 83};
        a(r159, new byte[]{-119, -62, -58, -66, 97, 83, 79, -48, -43, -35, 9, 98, -101, 99, 121, -44, 1, 61, -77, 66, 97, 60, -127, -95, 44, Ascii.US, 106, 78, 42, 49});
        String r38 = new String(r159, r3).intern();
        byte[] r160 = {-13, 95, 56, -79, 83, 84, -32, -67, Ascii.VT, 90, -50, Ascii.GS, -60, 70, -94, 55, -115, 118, 76, 119, 96, -74, 91};
        a(r160, new byte[]{-12, 2, -25, 33, 86, Ascii.SI, 2, 119, Ascii.CAN, 58, Ascii.GS, -56, Ascii.SYN, 19, 121, -15, -124, 45, -89, -93, Ascii.SI, -39, 47});
        String r39 = new String(r160, r3).intern();
        byte[] r2 = {-33, -127, -27, 48, -99, -21, -92, 63, -119, -118, 45, 79, 102, Ascii.CR, 70, 121, Ascii.SUB, 93, Ascii.DLE, -20, 69, 17, -31, -62, -4, 10, -18, -47, 116};
        a(r2, new byte[]{-40, -36, 58, -96, -104, -80, 70, -11, -102, -22, -2, -102, -76, 88, -99, -65, 19, 6, -5, 56, 86, 76, 7, 1, -12, 94, 10, Ascii.SYN, 17});
        String r40 = new String(r2, r3).intern();
        byte[] r161 = {77, -29, 80, 69, 71, Ascii.ESC, 100, Ascii.CR, -83, -24, -11, -6, 10, -74, -112, -122, 115, -106, -33, -101, 71, -34, -5, -18, Ascii.SO, 10, -70};
        a(r161, new byte[]{74, -66, -113, -43, 77, 70, UnsignedBytes.MAX_POWER_OF_TWO, -62, -80, -66, 42, 106, 6, -31, 70, 65, 101, -53, 62, 77, -77, -127, 44, 33, 103, Ascii.DEL, -41});
        String r41 = new String(r161, r3).intern();
        byte[] r162 = {SignedBytes.MAX_POWER_OF_TWO, 59, -55, 0, Ascii.SUB, 123, 77, -39, 45, -111, Ascii.FS, 19, Ascii.GS, 48, 79, 83, -42, 40, -35, -15};
        a(r162, new byte[]{71, 102, Ascii.SYN, -112, Ascii.DLE, 38, -87, Ascii.SYN, 48, -57, -61, -125, 17, 103, -103, -108, -64, 117, 60, 39});
        String r422 = new String(r162, r3).intern();
        byte[] r163 = {87, -127, -1, -2, -114, 42, 106, -68, -115, -85, 3, 91, 42, -86, 52, 43, -83, Ascii.FS, 61, Ascii.CAN, -58, -78, SignedBytes.MAX_POWER_OF_TWO};
        a(r163, new byte[]{80, -36, 32, 110, -100, 119, -113, 118, -108, -1, -30, -116, -8, -28, -44, -19, -69, 65, -26, -34, -24, -63, 53});
        String r43 = new String(r163, r3).intern();
        byte[] r210 = {-100, -127, -39, 51, -92, 118, -120, 104, -22, Ascii.FS, 8, Ascii.DEL, -91, Ascii.FS, -121, 33, Ascii.ESC, 109, 108, -26, 108, 122, -37, -36, 95, Ascii.SUB, -105, 48, 82};
        a(r210, new byte[]{-101, -36, 6, -93, -74, 43, 109, -94, -13, 72, -23, -88, 119, 82, 103, -25, Ascii.CR, 48, -73, 32, -66, Ascii.SUB, 60, 76, 86, SignedBytes.MAX_POWER_OF_TWO, 76, -26, 55});
        String r44 = new String(r210, r3).intern();
        byte[] r164 = {-81, -99, -23, Ascii.SUB, -102, -87, 95, 81, -9, -85, 4, 53, -43, -78, 118, 87, -37, -12, -29, 93, -79, 4, 109, -88, -20, -65};
        a(r164, new byte[]{-88, -64, 54, -118, -107, -12, -72, -124, -5, -4, -39, -13, -52, -48, -112, -108, 9, -108, 4, -113, -72, 100, -118, 125, -119, -51});
        String r45 = new String(r164, r3).intern();
        byte[] r165 = {-48, -24, Ascii.GS, -108, 2, 55, -121, 48, 121, -71, 58, -19, -66, 32, -29, 79, 73, 83, -21, 55, -103, 34, -7, 32};
        a(r165, new byte[]{-41, -75, -62, 4, Ascii.SUB, 97, 92, -28, 113, -25, -23, 57, -90, 71, 67, -102, 80, Ascii.CR, 60, -29, UnsignedBytes.MAX_POWER_OF_TWO, 67, 46, -12});
        String r46 = new String(r165, r3).intern();
        byte[] r166 = {-65, -86, 114, 67, 7, -19, -14, -115, 126, -15, -89, Ascii.NAK, -60, -69, -50};
        a(r166, new byte[]{-72, -9, -83, -45, Ascii.SUB, -66, 44, 67, 109, -108, 112, -64, -22, -56, -69});
        String r47 = new String(r166, r3).intern();
        byte[] r167 = {-84, 1, Ascii.ESC, -24, -85, 108, 85, -79, 108, 103, -40, 108, -112, -33, 7, -66, -31, -45, 9, 105};
        a(r167, new byte[]{-85, 92, -60, 120, -77, 49, -73, 125, Ascii.DEL, 49, 56, -75, -119, -61, -40, 125, -22, -124, -20, -92});
        String r48 = new String(r167, r3).intern();
        byte[] r168 = {-70, -26, -68, 108, 32, -58, Ascii.RS, -127, Ascii.SUB, -32, -46, 107, 117, -95, 107, 88, 35, -76, -107, Ascii.VT, -45, -4, 10, 75, UnsignedBytes.MAX_POWER_OF_TWO, -5, 4};
        a(r168, new byte[]{-67, -69, 99, -4, 47, -101, -7, 84, Ascii.SYN, -73, Ascii.SI, -83, 108, -61, -115, -101, -15, -21, 116, -60, -62, -77, -22, -120, -25, -98, 118});
        String r49 = new String(r168, r3).intern();
        byte[] r169 = {0, -65, -109, -107, Ascii.VT, -121, -84, -20, -2, Ascii.DEL, -51, 125, 78, 120, -37, -127, 74, 88, 63, -22, -53, 47, 1, -91, 90, 89, 63, Ascii.ESC, -54, -89, -68, -42, 72, 105, 36};
        a(r169, new byte[]{7, -30, 76, 5, 4, -38, 75, 57, -14, 40, Ascii.DLE, -69, 87, Ascii.SUB, 61, 66, -104, 7, -34, 37, -38, 96, -31, 102, 81, 10, -37, -117, -38, -16, 105, 17, 38, Ascii.SUB, 65});
        String r50 = new String(r169, r3).intern();
        byte[] r170 = {-123, -61, -78, -97, 62, -45, -56, -57, -73, 113, 65, -65, 115, 98, 4, -49, -106, 110, 94, -16, -67, -33, 114, -48, 85, -90, 112};
        a(r170, new byte[]{-126, -98, 109, Ascii.SI, 54, -124, Ascii.ETB, Ascii.SYN, -91, Ascii.NAK, -102, 121, 122, 63, -92, 1, -113, 63, -125, 43, -87, -112, -108, Ascii.NAK, 61, -61, 2});
        String r51 = new String(r170, r3).intern();
        byte[] r211 = {104, 33, -101, -3, 103, 63, -73, 45, 90, -109, 45, 71, 17, 60, 93, -38, -79, -113, -94, 73, 46, -122};
        a(r211, new byte[]{111, 124, 68, 109, 96, 105, 96, -29, 78, -16, -56, -41, 1, 115, -120, Ascii.ETB, -84, -47, 113, -97, 77, -18});
        String r52 = new String(r211, r3).intern();
        byte[] r171 = {-81, 102, Ascii.RS, 106, 83, -121, 49, 83, 43, -42, -114, -39, -103, Ascii.EM, 120, Ascii.DEL, Ascii.SYN, 19, 95, 32, -48, -62, 67, 86, 71, -15};
        a(r171, new byte[]{-88, 59, -63, -6, 69, -56, -18, -107, 61, -117, 85, Ascii.US, 75, 87, -102, -83, 3, 112, -116, -12, -43, -98, -91, -99, 41, -108});
        String r53 = new String(r171, r3).intern();
        byte[] r175 = {-102, -29, -48, -51, -15, -68, 79, -32, -40, -59, 103, SignedBytes.MAX_POWER_OF_TWO, SignedBytes.MAX_POWER_OF_TWO, -49, Ascii.VT, -96, -53, 50, -84, -55, -38, -57, 92, 100, 121, 5, -91, 48, 93, -34, -83, 70, -106, 81, -18, -21, 95, -112, 74, -83, -21, -67, 101, 111, -79, Ascii.SO, -23, 56, 36, -111, -125, 45};
        a(r175, new byte[]{-99, -66, Ascii.SI, 93, -12, -32, -103, 52, -53, -110, -79, -48, 90, -100, -21, 102, -58, 110, 117, 89, -36, -112, -126, -86, 116, 89, 124, -96, -80, -123, Ascii.RS, -108, -126, 97, 53, 37, 79, -57, -86, 100, Ascii.FS, -17, -127, -73, -68, 95, 62, -88, -61, -83, 56, -99});
        String r54 = new String(r175, r3).intern();
        byte[] r176 = {-67, -11, -102, -17, -48, SignedBytes.MAX_POWER_OF_TWO, -82, -20, -49, 40, -5, 41, UnsignedBytes.MAX_POWER_OF_TWO, -107, -25, -123, -53, 93, -71, 59, -78, 10, -51, 17};
        a(r176, new byte[]{-70, -88, 69, Ascii.DEL, -41, Ascii.SYN, 121, 34, -37, 75, Ascii.RS, -71, -112, -10, 50, 72, -42, 3, 106, -19, -75, 92, Ascii.SUB, -59});
        String r55 = new String(r176, r3).intern();
        byte[] r215 = {4, 101, 115, 9, 77, 89, -73, -43, -75, -32, 85, 66, -14, 91, -80, 44, -57, -81, 36, Ascii.GS, -76, -5, 75, 75, Ascii.GS, Ascii.NAK, -50, Ascii.ESC, Ascii.SI};
        a(r215, new byte[]{3, 56, -84, -103, 91, Ascii.SYN, 104, 19, -93, -67, -114, -124, 32, Ascii.NAK, 82, -2, -46, -52, -9, -55, -79, -89, -83, UnsignedBytes.MAX_POWER_OF_TWO, Ascii.SI, 70, 44, -49, 96});
        String r56 = new String(r215, r3).intern();
        byte[] r177 = {Ascii.FF, Ascii.SUB, -124, Ascii.GS, 72, 32, 119, 65, 44, Ascii.CAN, -8, 2, -127, -32, 44, 19, -21, -111, 121, 122, -22};
        a(r177, new byte[]{Ascii.VT, 71, 91, -115, 77, 124, -95, -107, 63, 79, 46, -110, -106, -125, -50, -44, -3, -14, -100, -67, -104});
        String r57 = new String(r177, r3).intern();
        byte[] r178 = {-116, 92, -66, 39, 93, 68, -9, Ascii.CR, 80, -23, -23, 124, Ascii.RS, -63, 85, 113, -21, -93, -111, -61, Ascii.DC2, 9, -34, 62};
        a(r178, new byte[]{-127, 1, Ascii.RS, -18, 80, 38, 45, -38, 86, -11, 1, -92, Ascii.CAN, -31, -9, -23, 63, -72, 78, 0, Ascii.EM, 94, 59, -13});
        String r58 = new String(r178, r3).intern();
        byte[] r216 = {-80, -17, -4, 79, -112, Ascii.ESC, -29, 102, Ascii.SO, 113, 4, -84, 6, -112, -29, -42, -44, 42, Ascii.DC2, 19, -99, -45, -8, 60, 47, 118, -25, 87, Ascii.RS};
        a(r216, new byte[]{-67, -78, 92, -122, -99, 121, 57, -79, 8, 109, -20, 116, 0, -80, 65, 78, 0, 49, -51, -48, -106, -124, Ascii.GS, -15, -3, 47, 60, -127, 123});
        String r59 = new String(r216, r3).intern();
        byte[] r179 = {-28, -31, -25, 55, -15, 36, -116, -90, -43, 35, 95, 53, 54, 77, 41, 98, 85, 70, -124, -73, 99, 102, 125, 54, 1, 39, 67, Ascii.FS};
        a(r179, new byte[]{-9, -127, 62, -89, -32, 119, 109, Ascii.DEL, -46, 108, -71, -91, 63, Ascii.US, -61, -80, 70, 39, 83, 113, -79, 60, -82, -26, 4, 114, -108, -56});
        String r60 = new String(r179, r3).intern();
        byte[] r217 = {-13, -61, 89, -13, -51, Ascii.FF, -127, 100, 0, -39, 3, 86, -125, -97, 86, 112, 7, 89, -49};
        a(r217, new byte[]{-32, -93, UnsignedBytes.MAX_POWER_OF_TWO, 99, -35, 109, 99, -75, Ascii.ETB, -118, -43, -58, -110, -48, -74, -77, 96, 60, -67});
        String r61 = new String(r217, r3).intern();
        byte[] r180 = {0, 40, -64, -30, Ascii.DLE, -120, -52, 84, 74, -21, -106, -30, -63, -27, -44, -67, 112, 55, 58, 53, 123, Ascii.DC2, 77, -33, -36, -48, 40, -34};
        a(r180, new byte[]{Ascii.CAN, 117, 34, 114, Ascii.ETB, -57, 44, -113, 71, -72, 54, 36, -41, -74, 7, 114, 96, 120, -38, -13, -87, 72, -98, Ascii.SI, -39, -123, -1, 10});
        String r62 = new String(r180, r3).intern();
        byte[] r181 = {9, -84, -96, -27, -121, -91, 97, Ascii.GS, 92, -92, -40, 102, -119};
        a(r181, new byte[]{Ascii.CAN, -1, 0, 60, -114, -14, -124, -41, 69, -72, Ascii.SI, -68, -7});
        String r63 = new String(r181, r3).intern();
        byte[] r218 = {-83, -119, -66, 81, Ascii.CR, Ascii.CAN, 3, -17, -82, -25, Ascii.RS, 72, 114, -74, -20, Ascii.EM, 93, -38, -70};
        a(r218, new byte[]{-86, -44, 97, -63, 8, 68, -43, 59, -67, -80, -56, -40, 104, -27, Ascii.FF, -33, 52, -76, -36});
        String r64 = new String(r218, r3).intern();
        byte[] r185 = {82, 65, Ascii.SYN, -34, -98, 70, 71, -127, -75, Ascii.FS, 111, 0, 62, 77, 35, -68, 50, -47, -62, -29, -27, 122, 36, 42, 109, -11, 62};
        a(r185, new byte[]{67, Ascii.FS, -63, 78, -119, Ascii.DLE, -100, 93, -84, 69, -120, -112, 40, Ascii.RS, -11, 119, 36, -126, Ascii.ETB, 53, -14, Ascii.CAN, -59, -2, Ascii.FF, -110, 91});
        String r65 = new String(r185, r3).intern();
        byte[] r219 = {Ascii.SI, -118, 4, 19, 67, -114, -38, -55, -17, -82, -28, -77, -43, -63, -78, -2, 44, -68, 107, 91, -41, 102};
        a(r219, new byte[]{8, -41, -37, -125, 91, -17, 58, 0, 61, -5, 63, 117, -36, -102, 89, 61, 56, -30, -75, -112, -92, Ascii.DC2});
        String r66 = new String(r219, r3).intern();
        byte[] r186 = {48, -23, 60, -44, 121, 109, -34, -2, 19, 62, 33, 123, -55, -35, 85, -71, -93, 121, Ascii.ESC, -98, -19, 92, 65, -51};
        a(r186, new byte[]{55, -75, -100, Ascii.GS, 112, 62, 3, 40, Ascii.SYN, 98, -8, -21, -35, -67, -114, 97, -90, 40, -16, 75, -7, 19, -108, 10});
        String r67 = new String(r186, r3).intern();
        byte[] r187 = {88, Ascii.CAN, -116, Ascii.ESC, -78, -1, Ascii.VT, -14, -16, -126, 102, 80, -56, 98, -75, -73};
        a(r187, new byte[]{95, 69, 83, -117, -72, -94, -31, 102, -9, -33, -80, -105, Ascii.SUB, 56, 106, 120});
        f30376l = new String[]{r174, r184, r194, r204, r214, r223, r233, r243, r253, r263, r273, r282, r292, r302, r312, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r422, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, new String(r187, r3).intern()};
        f30377m = new String[0];
    }

    public static void a(byte[] r23, byte[] r24) {
        byte[] r2 = null;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r4 = -894652659;
        byte[] r3 = null;
    L3:
        int r12 = ((r4 & 16777216) * (r4 | 16777216)) + ((r4 & (-16777217)) * ((~r4) & 16777216));
        int r42 = r4 >>> 8;
        int r43 = (r42 + r12) - (r42 & r12);
        int r44 = (r43 ^ 1458005263) + ((r43 & 1458005263) * 2);
        int r15 = 145880015;
        int r16 = 1298988808;
        boolean r8 = true;
        switch(((r44 - 1434379843) + (((~r44) & 1434379843) * 2))) {
            case -1970406716: goto L40;
            case -1882653318: goto L34;
            case -625567707: goto L33;
            case 172635213: goto L26;
            case 614184219: goto L21;
            case 835516413: goto L12;
            case 1888416065: goto L6;
            default: goto L5;
        };
    L6:
        r7 = r3.length % 4;
        int r45 = ((r7 > 1 ? 1 : (r7 == 1 ? 0 : -1)) >>> 31) & 1;
        if (r45 == 0) goto L9;
        r16 = 196573321;
    L9:
        if (r45 == 0) goto L11;
    L25:
        r4 = -518432968;
    L11:
        r4 = r16;
        goto L3
    L12:
        int r22 = r23.length;
        int r32 = 0 - (0 - (r23.length % 4));
        if (((r22 ^ r32) - (((~r22) & r32) * 2)) > 0) goto L15;
        r8 = false;
    L15:
        if (r8 == false) goto L17;
        r15 = 196573321;
    L17:
        if (r8 == false) goto L19;
        r4 = -826922365;
    L20:
        r2 = r24;
        r3 = r23;
        r6 = 0;
        goto L3
    L19:
        r4 = r15;
        goto L20
    L21:
        int r46 = r3.length;
        int r72 = 0 - r5;
        int r9 = r72 * 3;
        int r10 = r.a(r72, -4, 1, r46);
        int r11 = r3.length;
        byte r112 = r3[(r11 ^ r72) + ((r11 & r72) * 2)];
        int r13 = r3.length;
        int r73 = 0 - r72;
        byte r74 = r2[(((~r73) & r13) * 2) - (r13 ^ r73)];
        r3[AbstractC4292o.a(0, (r46 & 2) | r10, r9, 1)] = (byte) (((byte) (r74 + r112)) - ((byte) (((byte) 2) * ((byte) (r74 & r112)))));
        r7 = ((-338014207) | r5) + (338014206 | r5);
        int r47 = ((r5 > 2 ? 1 : (r5 == 2 ? 0 : -1)) >>> 31) & 1;
        if (r47 == 0) goto L24;
        r16 = 196573321;
    L24:
        if (r47 == 0) goto L11;
    L26:
        int r92 = (r3.length & (0 - r7)) * 2;
        if ((r2[(r4 ^ r5) + r92] > Double.NaN ? 1 : (r2[(r4 ^ r5) + r92] == Double.NaN ? 0 : -1)) > (-1)) goto L29;
        r8 = false;
    L29:
        if (r8 == false) goto L31;
        r4 = -34715366;
    L32:
        r5 = r7;
        goto L3
    L31:
        r4 = 196573321;
        goto L32
    L33:
        return;
    L34:
        int r162 = (r6 - 1) - (r6 | (-4));
        byte r48 = r2[r162];
        int r49 = ((r48 & 16777216) * (r48 | 16777216)) + ((r48 & UnsignedBytes.MAX_VALUE) * ((~r48) & 16777216));
        int r18 = (r6 + 3) + (((-1) - r6) | (-3));
        int r93 = r2[r18] & UnsignedBytes.MAX_VALUE;
        int r94 = r93 * ((~r93) & 65536);
        int r410 = ~((r49 | ((~r94) | 1169991170)) - ((1169991170 & r94) | r49));
        int r95 = A.a(689061172 & r6, r6, 1, 689061173 & r6);
        int r102 = r2[r95] & UnsignedBytes.MAX_VALUE;
        int r82 = ((~r410) & (r102 * ((~r102) & 256))) + r410;
        int r83 = (r82 - 1) - ((~(r2[r6] & UnsignedBytes.MAX_VALUE)) | r82);
        byte r411 = r3[r162];
        int r412 = ((r411 & 16777216) * (r411 | 16777216)) + ((r411 & UnsignedBytes.MAX_VALUE) * ((~r411) & 16777216));
        int r103 = r3[r18] & UnsignedBytes.MAX_VALUE;
        int r104 = r103 * ((~r103) & 65536);
        int r413 = ~((r412 | ((~r104) | (-445685625))) - (((-445685625) & r104) | r412));
        int r105 = r3[r95] & UnsignedBytes.MAX_VALUE;
        int r106 = r105 * ((~r105) & 256);
        int r107 = (r106 + r413) - (r106 & r413);
        int r414 = r3[r6] & UnsignedBytes.MAX_VALUE;
        int r108 = (r107 & (~r414)) + r414;
        int r415 = r83 << ((r83 > Double.NaN ? 1 : (r83 == Double.NaN ? 0 : -1)) >>> 31);
        int r416 = (r415 + r108) - ((r415 & r108) * 2);
        int r84 = 659933421 - ((r416 & 2) | ((-1983400303) - r416));
        r3[r6] = (byte) r84;
        r3[r95] = (byte) (r84 >>> 8);
        r3[r18] = (byte) (r84 >>> 16);
        r3[r162] = (byte) (r84 >>> 24);
        r6 = (r6 ^ 4) + ((r6 & 4) * 2);
        int r96 = (r3.length & (0 - (r3.length % 4))) * 2;
        int r417 = ((r6 > ((r4 ^ r8) + r96) ? 1 : (r6 == ((r4 ^ r8) + r96) ? 0 : -1)) >>> 31) & 1;
        if (r417 == 0) goto L37;
        r15 = 196573321;
    L37:
        if (r417 != 0) goto L38;
        r4 = r15;
        goto L3
    L38:
        r4 = -826922365;
        goto L3
    L40:
        int r418 = r3.length;
        int r85 = 0 - r5;
        int r109 = ~r85;
        int r419 = ((r418 | r85) - ((602749225 & r109) & r418)) + ((602749225 | r85) & r418);
        byte r97 = r2[r419];
        int r113 = r3.length;
        byte r86 = r2[((r109 ^ r113) + ((r85 | r113) * 2)) + 1];
        int r1010 = ((byte) 0) - r97;
        r2[r419] = (byte) (((byte) (((byte) 2) * ((byte) (r86 & (~r1010))))) - ((byte) (r86 ^ r1010)));
        r4 = -34715366;
        goto L3
    L5:
        r4 = 196573321;
        goto L3
    }
}
