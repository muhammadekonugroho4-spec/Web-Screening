package com.aheaditec.talsec.security;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/* renamed from: com.aheaditec.talsec.security.n0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4290n0 {

    /* renamed from: b, reason: collision with root package name */
    public static final String f30650b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final String f30651c = null;
    public static final String[] d = null;

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f30652a;

    static {
        byte[] r1 = {-125, 111, -104, -44};
        h(r1, new byte[]{-60, -25, 10, -96, 82, Ascii.SUB, 32, -52});
        Charset r2 = StandardCharsets.UTF_8;
        f30651c = new String(r1, r2).intern();
        StringBuilder r02 = new StringBuilder();
        char r12 = File.separatorChar;
        r02.append(r12);
        byte[] r4 = {-101, 84, -125, -16, -69, -29, 46, 122, 4, 78, Ascii.DC4, -102};
        h(r4, new byte[]{-1, Ascii.FF, -8, 105, -11, 87, -121, -15, -115, -5, -121, -48});
        r02.append(new String(r4, r2).intern());
        r02.append(r12);
        f30650b = r02.toString();
        byte[] r13 = {126, 103, -114, -16, -6, -81, -72, UnsignedBytes.MAX_POWER_OF_TWO, 98, -95, -88, 123, -123, -86, -58, 109, -91, 85, -75, 101, 100, -55, -37, -42, -116, -22, 90, 107, -126, Ascii.US, 42, -89, 49};
        h(r13, new byte[]{97, Ascii.CR, -35, -103, -70, -90, 7, -41, 81, -57, -28, 49, -12, -94, -104, 19, 2, -19, -10, -12, 78, -51, -76, -93, -8, -94, 44, 37, Ascii.SI, 71, 110, -38, SignedBytes.MAX_POWER_OF_TWO});
        String r42 = new String(r13, r2).intern();
        byte[] r14 = {-89, -92, -9, -101, 63, 5, 100, -89, 71, -116, -36, 42, -75, Ascii.FS, -76, 98, -24, 122, 92, -107, 33, -1, -6, -60, 0};
        h(r14, new byte[]{-39, -84, -50, -28, Ascii.GS, 76, 63, -59, 70, -74, -102, 47, -40, 39, -38, 1, -15, -27, Ascii.ESC, -88, 46, 124, -79, -99, 72});
        String r5 = new String(r14, r2).intern();
        byte[] r15 = {-28, -10, 125, 62, -81, -90, -73, 97, -97, 45, -65, -5, -103, -94, -56, 17, 111, 53, -82, -29, 97};
        h(r15, new byte[]{-66, -111, 34, 100, -6, -111, 7, 0, Ascii.CR, 63, -23, -78, Ascii.CR, -92, -69, Ascii.SI, 110, 48, 5, 122, 56});
        String r6 = new String(r15, r2).intern();
        byte[] r8 = {68, Ascii.DC2, UnsignedBytes.MAX_POWER_OF_TWO, -57, 111, -27, -4, Ascii.VT, 77, 38, -53, -62, -13, 35, -123, 104, 110, -64, 84, 67, -79, 95, -87, 37, Ascii.SI, -48, -78, 32, -83, 124, -62, 37, -76, -6, -52, -23, 33, 119, -73, 53};
        h(r8, new byte[]{42, -9, -10, 104, 57, 119, -60, 75, 47, -26, -101, 104, -100, 56, -1, 66, Ascii.GS, 87, 78, Ascii.DC2, 10, -21, 5, 62, -116, -117, -15, 58, -26, -11, Ascii.SI, 73, Ascii.SI, -112, -43, 119, 100, 1, -41, 89});
        String r03 = new String(r8, r2).intern();
        byte[] r9 = {-21, 87, Ascii.ETB, -104, 61, 38, Ascii.DC4, 10, 95, 90, -119, 99, -68, 61, 42, 109, 67, -125, 34, -15, 96, 8, 85, 0, -4, -89, -40, -118, 99, 55, UnsignedBytes.MAX_POWER_OF_TWO, 48, 69, UnsignedBytes.MAX_POWER_OF_TWO, 62, 37, -98, 45, -55, 94};
        h(r9, new byte[]{-69, Ascii.VT, -121, -121, 105, 17, 111, 42, -125, -21, 6, Ascii.ETB, -33, 58, 117, 66, 46, -123, 41, 122, 62, Ascii.RS, 56, 52, -63, 111, -81, -60, Ascii.GS, 78, -5, -25, 57, -59, 126, 4, 8, 17, -93, Ascii.EM});
        String r82 = new String(r9, r2).intern();
        byte[] r10 = {-60, -59, -16, -76, -104, 81, 110, -121, 62, -94, 76, 34, -59, 3, 97, 17, Ascii.SI, -114, -29, 65, 119, 9, 76, -124, 98, UnsignedBytes.MAX_POWER_OF_TWO, 122, -4, -47, -111, Ascii.FF, 61, -124, 47, 118, -117, -48, 103, 75, Ascii.CR};
        h(r10, new byte[]{-72, 121, -80, 103, 4, 53, SignedBytes.MAX_POWER_OF_TWO, -34, -106, -90, 69, -6, -76, 37, 32, 65, -123, -50, -22, Ascii.DC4, 102, Ascii.DC2, Ascii.US, -56, 69, -124, 76, -102, -72, -55, 87, 98, -13, 46, 51, -57, -85, 34, 58, 79});
        String r92 = new String(r10, r2).intern();
        byte[] r11 = {-87, -76, 113, 51, -4, UnsignedBytes.MAX_POWER_OF_TWO, -37, -117, -27, 7, -17, 17, 97, 109, -124, -127, 66, 47, Ascii.FS, -51, Ascii.FS, -77, -69, 33, -32, -62, 49, -123, -66, 102, -2, 75, Ascii.ETB, -107, -74};
        h(r11, new byte[]{4, -61, 91, 87, -92, -61, 2, -39, -104, 77, -11, 74, Ascii.RS, -36, -4, -73, 37, 73, -123, -101, 63, -91, 10, 54, -85, 100, -127, -69, Ascii.FF, -15, -50, 7, 94, -52, -14});
        String r102 = new String(r11, r2).intern();
        byte[] r122 = {-59, -70, 8, -122, -47, 115, -64, -117, -19, Ascii.DC4, -43, 123, -79, -106, -104, 38, 123, -49, 84, 120, SignedBytes.MAX_POWER_OF_TWO, -43, Ascii.CR, 107, -43, 120, -48, Ascii.FF, -109, 111, -15, 49, Ascii.SO, 57, -17, 77, 65, 123, -27, -2};
        h(r122, new byte[]{-90, -102, -126, -49, -57, -18, -50, -65, -50, 34, -6, 53, -96, -79, Ascii.DC2, 76, 78, 111, 40, -15, 47, -76, 93, 2, -46, -29, -83, 40, -62, -17, -54, 70, 112, 19, -14, 38, 37, -22, -14, -77});
        String r112 = new String(r122, r2).intern();
        byte[] r132 = {-98, 104, -7, 39, 125, -61, 55, -59, 3, 77, -15, 98, 121, -16, 124, -108, -108, Ascii.DEL, -82, 38, 125, 121, -37, 0, 91, Ascii.US, -83, -124, -54, -94, -46, 87, 105, -102, 43, 46, Ascii.NAK};
        h(r132, new byte[]{-19, 41, -43, 47, 36, -119, -122, 110, -123, -40, -49, Ascii.FF, 84, -111, 70, -29, Ascii.SI, -36, 17, 88, 85, 4, -72, 32, 84, Ascii.SYN, -42, -88, -58, -64, -87, Ascii.DC4, 83, -85, 113, 73, Ascii.DEL});
        String r123 = new String(r132, r2).intern();
        byte[] r142 = {112, -98, 96, -26, -85, -36, Ascii.US, -48, -27, 1, 34, 69, 82, -12, 61, Ascii.DEL, -84, 102, -104, 104, -44, -95, 95, -27, -108, Ascii.FS, -3, -16, 54, 92, -54, -78, -1, -116, 50};
        h(r142, new byte[]{60, -101, SignedBytes.MAX_POWER_OF_TWO, -58, -77, -76, -116, -90, -70, 56, 44, 19, 34, 104, -112, Ascii.NAK, -27, 3, -32, 33, -48, -80, 71, 119, -8, 74, -32, -88, 88, 53, -105, -57, -57, -18, 101});
        String r133 = new String(r142, r2).intern();
        byte[] r152 = {52, -76, 56, -114, 73, 113, 41, 99, -113, 116, SignedBytes.MAX_POWER_OF_TWO, -103, -28, 113, 5, 51, -105, -106, -64, 42, 35, -120, -87, -121, 46, 4, -40, -39, -74, 92, 122, -56, -29, 9};
        h(r152, new byte[]{-118, 87, 113, -37, -111, -29, -127, -20, -31, -17, Ascii.FS, -112, -71, -7, 92, 60, -24, -109, -101, 6, 120, -102, -16, -58, -109, Ascii.CAN, -89, -43, -12, -3, 33, -111, -79, 79});
        String r143 = new String(r152, r2).intern();
        byte[] r153 = {17, -122, -94, -52, 90, 2, -20, -118, -24, -38, -48, Ascii.ESC, 114, -103, 41, 109, 73, 37, 43, -99, 2, 37, 113, 74, -21, 66, 3, -27, Ascii.VT, -95, 89, -62, -24, -24};
        h(r153, new byte[]{62, -57, -18, -36, 52, SignedBytes.MAX_POWER_OF_TWO, -70, -91, -16, -122, -82, 95, Ascii.ETB, -97, 94, Ascii.SO, 39, 77, 98, -82, -127, 60, 54, 9, -96, -44, 70, 123, 99, -78, -127, 116, -96, -114});
        String r154 = new String(r153, r2).intern();
        byte[] r3 = {62, -20, 32, -77, 105, 70, -117, Ascii.DEL, Ascii.SUB, 2, 83, 33, 67, -119, 40, 97, -31, 126, 43, 48, 112, Ascii.DC2, -76, -73, 75, -108, -29, 1, -96, 87, 83, 119, -57, 93, -94, -3, -54, -6};
        h(r3, new byte[]{114, -119, -119, -52, 42, -3, -12, Ascii.CR, 105, 1, 83, 88, 66, -112, 90, Ascii.RS, -52, -22, -109, 65, 79, 48, -26, -52, 83, -83, -25, 42, -89, Ascii.VT, 119, Ascii.NAK, Ascii.NAK, -34, -43, 122, -102, -68});
        String r16 = new String(r3, r2).intern();
        byte[] r04 = {-88, Ascii.SYN, 4, -75, 109, -31, -5, 68, -99, -95, -94, -93, -108, 56, 9, 104, 55, -73, -95, 88, 92, -50, -6, -80, -100, -33, 104, -13, 49, -11, 92, 84, -42, 63, 73, 96, -7, 56, -123, 124};
        h(r04, new byte[]{-31, 77, 106, -83, 47, -124, -75, Ascii.SUB, -17, -95, -41, 120, -60, Ascii.GS, 78, -10, -110, -75, -7, 71, 69, -119, -46, -36, -62, 125, 56, -103, -115, -127, Ascii.RS, -11, -101, -39, 36, -1, -58, 44, -56, -19});
        String r05 = new String(r04, r2).intern();
        byte[] r7 = {UnsignedBytes.MAX_POWER_OF_TWO, 49, 34, -23, -22, 42, -71, -92, -84, 54, -59, 90, -103, -118, -81, -97, -2, -80, -14, -76, -14, -38, -26, 105, -51, -70, -116, -8, -31, 80, -104, 7, 1, -65, 113};
        h(r7, new byte[]{5, 46, 118, -59, -10, 67, -96, -125, -80, 69, -71, -4, -12, -109, -77, -49, -76, -75, -50, -53, -62, -123, -64, Ascii.SYN, 17, -57, -31, -78, -102, -28, Ascii.SI, 51, 77, -48, Ascii.RS});
        String r06 = new String(r7, r2).intern();
        byte[] r32 = {-3, -4, 99, -46, -101, 110, 114, -99, -55, -68, 39, 95, 98, -92, 55, -12, 79, -34, -59, SignedBytes.MAX_POWER_OF_TWO, -123, Ascii.RS, -27, -16, Ascii.ETB, -7, -121, -62, 123, 82, 119, 58, 73, -120, 2, -78, 7, 93, -67, -88, -71, -112, 115, -62, -121, -95, -68, 3, 36};
        h(r32, new byte[]{-54, -120, Ascii.GS, -57, -12, -17, Ascii.EM, -34, Ascii.DC2, 91, 122, -8, 60, -63, -118, -77, -106, 88, Ascii.FF, -20, -50, Ascii.GS, -91, 124, 118, 123, 7, -38, 45, -25, 41, 55, 74, -105, 119, -53, 123, -38, -18, -82, 3, -56, 80, -115, 1, -106, -17, 59, 93});
        String r17 = new String(r32, r2).intern();
        byte[] r72 = {41, -89, 104, 34, 44, 70, 41, Ascii.FS, -60, -84, 92, -73, -19, -42, 55, 35, 8, 69, 104, 111, -71, -28, 3, -34, 19, -24, -65, -88, -67, -22, 47, 19, -41, -8, -34, -65, -10, -47};
        h(r72, new byte[]{126, -101, Ascii.SYN, 87, -109, -37, 87, 81, -85, -87, 77, -26, -75, 126, 88, 53, 72, -10, 63, -4, -96, 119, -126, 121, 117, 97, -1, -26, -95, -88, 126, SignedBytes.MAX_POWER_OF_TWO, 6, -110, -83, -30, -102, -112});
        String r07 = new String(r72, r2).intern();
        byte[] r08 = {-64, 51, -28, -20, 47, 86, -49, 0, -111, -92, -74, -59, 54, -70, 125, -61, 51, -13, 46, 45, -4, 79, 119, -113, Ascii.DC4, 84, -105, -70, -24, -83, -75, -86, Ascii.ETB, Ascii.CAN, -127, 126, -49, -9, 98, -45};
        h(r08, new byte[]{-60, 68, -26, 114, -124, Ascii.VT, -72, 47, -69, 97, -30, -90, 110, -93, 52, 123, 33, 109, -126, 86, -42, 70, 76, -49, 92, 54, -16, -75, -48, -55, -27, -76, 59, -4, -41, -4, -64, 113, 39, 104});
        String r09 = new String(r08, r2).intern();
        byte[] r33 = {-112, -101, -57, 77, -46, -73, 97, -64, 116, 10, -91, -73, -27, 32, -35, -17, -101, 44, -22, 43, -12, 79, 74, 46, -96, -9, -16, -74, 121, -114, 84, 120, -108, -124, 10, Ascii.CR};
        h(r33, new byte[]{-34, 122, -73, 4, -57, -51, 39, -117, 87, 72, -26, -67, -55, 72, -82, 112, -33, 51, -71, 4, -93, -42, 47, 2, -25, Ascii.DEL, -79, -26, 76, -51, 38, -5, -36, -57, 119, 59});
        String r18 = new String(r33, r2).intern();
        byte[] r010 = {119, -5, Ascii.DC4, Ascii.SI, 65, -89, -121, 83, 122, 17, 57, 2, -85, 81, 107, 101, 118, -82, -111, 3, -118, -96, 118, -116, SignedBytes.MAX_POWER_OF_TWO, -78, -52, -115, -85, -26, -122, -37, 106, -32, 113, -13, 54, -49, 5, 74};
        h(r010, new byte[]{Ascii.ETB, 124, -117, 50, 37, -74, -23, 75, 99, 19, 112, 65, -7, 49, Ascii.EM, -13, 75, -78, -31, 59, -22, 96, 78, -74, -120, -88, Ascii.DC2, -48, 6, 89, Ascii.FF, -47, 73, 95, 70, -122, -120, 85, -118, Ascii.US});
        String r011 = new String(r010, r2).intern();
        byte[] r73 = {36, 9, Ascii.RS, -110, 106, -60, Ascii.ETB, -78, 83, -41, -18, Ascii.SYN, 57, -113, 40, -33, 65, 35, -45, 80, 89, 82, 79, 75, 114, -66, -11, -94, -28, -17, -112, -78, -51, 2, 80};
        h(r73, new byte[]{46, 51, 110, -79, Ascii.RS, 115, 93, 103, 82, -114, -80, 53, -127, -75, -110, -115, Ascii.US, SignedBytes.MAX_POWER_OF_TWO, -58, -23, 66, -41, 81, -15, 92, -83, -44, -127, -51, -116, -23, -53, -90, 48, 102});
        String r012 = new String(r73, r2).intern();
        byte[] r34 = {-74, -122, -41, -124, 48, 55, 92, 33, 17, -83, Ascii.ETB, -96, -98, -122, -76, 123, -72, 109, -100, -52, 114, -47, -117, -50, -41, 111, -104, 110, 33, -74, -21, -49, -60, 65, -78, -30, Ascii.NAK, 80, 65, -54};
        h(r34, new byte[]{10, -77, -101, -29, 109, 78, 75, 87, 98, -111, 102, -82, -3, -111, 8, -21, -29, 9, 9, -89, Ascii.FS, -75, -34, -96, -70, -20, -74, 8, 90, -111, -65, -96, -86, -5, -17, -94, 117, -10, 32, -91});
        String r013 = new String(r34, r2).intern();
        byte[] r35 = {-37, 115, 43, -119, -96, 95, 120, -103, -24, -113, 118, -105, 75, -96, -22, 75, 126, -19, 57, -117, 42, -77, -90, -89, -26, -124, -46, 63, 126, -14, -39, 81, -53, -67, 6, Ascii.DC2, 71, -94, -9, Ascii.SI};
        h(r35, new byte[]{-104, -10, 47, -89, -81, -29, 94, -60, -74, -88, 49, -43, 54, -96, -78, -23, Ascii.RS, 85, -122, -103, 98, -78, -38, -54, -58, -64, -48, 88, 32, -119, -44, 80, -43, -91, UnsignedBytes.MAX_POWER_OF_TWO, 10, 40, -106, -106, 71});
        String r014 = new String(r35, r2).intern();
        byte[] r36 = {-96, SignedBytes.MAX_POWER_OF_TWO, 103, 81, -110, 108, 116, -77, 106, 91, 65, -81, -100, -111, -77, -107, -24, -52, 6, -5, -32, -54, Ascii.GS, 102, -126, -39, -61, 53, -108, 105, 45, 36, -107, 82, 47, 113, 2, 103, 45, -114};
        h(r36, new byte[]{-37, -44, 44, -17, Ascii.VT, -11, 82, -80, 113, -35, 60, -56, 17, -51, 8, -57, -67, -123, 93, -118, -102, -118, -114, 10, 10, 102, -101, 97, 7, -42, 125, 41, -34, Ascii.SI, 48, Ascii.CR, 73, -16, -112, -48});
        String r015 = new String(r36, r2).intern();
        byte[] r37 = {-127, 106, 10, -33, -105, -54, -96, -80, 40, -31, 45, 124, -12, 65, -17, 37, 118, -23, -67, -100, 3, Ascii.US, -127, 62, -71, 39, -11, Ascii.SYN, -101, Ascii.DC4, 55, -31, -93, -99, -15, -9};
        h(r37, new byte[]{Ascii.VT, -44, 99, -105, -58, 109, -31, -80, 113, 122, 114, Ascii.SI, -28, -41, -17, -9, 73, 96, -18, -117, 103, 76, -50, 49, -29, 54, -62, 99, 4, 61, -107, -67, -18, -61, -103, -82});
        String r19 = new String(r37, r2).intern();
        byte[] r74 = {-91, -39, -109, -63, -26, -11, -72, 95, -75, 93, -113, -113, -74, 50, -77, -73, 113, 98, Ascii.FF, 114, -122, 62, 78, -121, -58, 8, Ascii.FS};
        h(r74, new byte[]{9, 102, -41, -105, -103, 86, -34, Ascii.CR, -22, Ascii.SI, -47, -82, 19, 70, -106, -64, 74, -30, 94, -15, -18, Ascii.FS, -110, -78, -10, 108, 119});
        String r016 = new String(r74, r2).intern();
        byte[] r017 = {-3, 126, 79, Ascii.EM, -90, 108, -5, 82, -120, 109, 48, -114, 62, -114, 85, -34, -7, -35, -27, -56, -98, Ascii.FS, -8, -103, -72, 58, Ascii.US, -74, 65, -6, -108, -18, -125, -36, 77};
        h(r017, new byte[]{-77, Ascii.EM, 77, Ascii.DC2, -29, 41, -88, Ascii.ESC, -40, -25, 103, -26, 115, -109, 119, -102, -45, 125, -61, -40, 0, 53, -80, -76, -27, 61, 111, -73, 35, -102, 9, Ascii.DEL, -27, -115, 2});
        String r018 = new String(r017, r2).intern();
        byte[] r019 = {-10, -13, 39, 107, 51, -81, 89, 93, 47, 68, 108, Ascii.NAK, 42, -15, -104, 62, 51, 40, -40, 83, 49, 0, 1, 86, -16, -109, Ascii.DEL, 114, 109, 6, -39, 74, -95, -124, 107, 70, 84, 38, 53, SignedBytes.MAX_POWER_OF_TWO};
        h(r019, new byte[]{-57, 109, 119, 0, -117, -112, Ascii.US, 35, 52, -33, 111, 66, 93, 113, -34, 45, UnsignedBytes.MAX_POWER_OF_TWO, Ascii.DLE, -43, -1, Ascii.FS, Ascii.FS, -118, -13, -69, -57, 73, -1, 50, 52, -61, 38, -81, -66, 34, 38, 83, Ascii.EM, Ascii.EM, Ascii.FF});
        String r020 = new String(r019, r2).intern();
        byte[] r38 = {66, -121, 54, -6, -106, 92, 52, -44, -74, -127, -118, -62, 10, 65, 58, -59, 102, -51, 79, -33, 123, -111, Ascii.SYN, 1, 122, 41, 90, -13, 34, -88, 67, -115, 17, 112, -41, 47, -96, -5, 44, -12};
        h(r38, new byte[]{65, -63, 100, -86, Ascii.DLE, 6, Ascii.ETB, -123, -26, -68, -7, 112, 113, 73, -121, 106, 76, 85, SignedBytes.MAX_POWER_OF_TWO, -108, 73, -77, -123, 32, 57, Ascii.DC4, 57, -83, 87, -63, 76, -95, 120, -27, -47, 74, -30, 115, -123, -109});
        String r322 = new String(r38, r2).intern();
        byte[] r39 = {-98, 10, 46, -40, 107, -113, 123, -127, Ascii.US, Ascii.SYN, -31, -88, -44, -101, 78, 66, -97, 79, -12, -59};
        h(r39, new byte[]{-22, Ascii.DC2, 111, -126, 32, -68, 98, -101, -107, Ascii.DC4, -65, -77, -98, -52, 33, 89, -3, -35, -78, 104});
        d = new String[]{r42, r5, r6, r03, r82, r92, r102, r112, r123, r133, r143, r154, r16, r05, r06, r17, r07, r09, r18, r011, r012, r013, r014, r015, r19, r016, r018, r020, r322, new String(r39, r2).intern()};
    }

    public AbstractC4290n0(Context r1, String r2, String[] r3) {
        this.f30652a = r1.getSharedPreferences(a(r1, r2, r3), 0);
    }

    private static void h(byte[] r23, byte[] r24) {
        byte[] r2 = null;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r4 = 1516727821;
        byte[] r3 = null;
    L3:
        int r12 = ((r4 & 16777216) * (r4 | 16777216)) + ((r4 & (-16777217)) * ((~r4) & 16777216));
        int r42 = r4 >>> 8;
        int r43 = A.a((650911840 & (~r12)) & r42, r42, r12, (r12 | 650911840) & r42);
        int r44 = (r43 ^ 642535957) + ((r43 & 642535957) * 2);
        int r16 = -365117735;
        boolean r9 = true;
        switch((((~r44) + ((r44 | 1) * 2)) ^ 962785775)) {
            case -1896910703: goto L41;
            case -1725904394: goto L38;
            case -1399959314: goto L31;
            case -1135475043: goto L30;
            case 180635757: goto L20;
            case 511524454: goto L16;
            case 961838909: goto L6;
            default: goto L19;
        };
    L16:
        int r45 = r3.length;
        int r72 = 0 - r5;
        int r11 = 0 - r72;
        int r10 = ((~r45) & r11) * 2;
        int r13 = r3.length;
        byte r132 = r3[((r13 | r72) * 2) - (r13 ^ r72)];
        int r14 = r3.length;
        byte r73 = r2[(r72 ^ r14) + ((r14 & r72) * 2)];
        r3[(r45 ^ r11) - r10] = (byte) (((byte) (r73 - r132)) + ((byte) (((byte) 2) * ((byte) ((~r73) & r132)))));
        r7 = AbstractC4317w1.a(r5, 3, (~r5) * 2, 1);
        if ((((r5 > 2 ? 1 : (r5 == 2 ? 0 : -1)) >>> 31) & 1) == 0) goto L19;
    L40:
        r4 = -458924450;
        goto L3
    L20:
        int r22 = r23.length;
        int r32 = 0 - (r23.length % 4);
        if ((((r22 ^ (~r32)) + ((r22 | r32) * 2)) + 1) > 0) goto L23;
        r9 = false;
    L23:
        if (r9 == false) goto L25;
        int r112 = -1605440657;
    L26:
        if (r9 == false) goto L28;
        r4 = r112;
    L29:
        r2 = r24;
        r3 = r23;
        r6 = 0;
        goto L3
    L28:
        r4 = -169475207;
        goto L29
    L25:
        r112 = -365117735;
        goto L26
    L30:
        return;
    L31:
        int r46 = A.a((-1205100636) & r6, r6, 3, (-1205100633) & r6);
        byte r8 = r2[r46];
        int r82 = ((r8 & 16777216) * (r8 | 16777216)) + ((r8 & UnsignedBytes.MAX_VALUE) * ((~r8) & 16777216));
        int r18 = r6 - 1;
        int r133 = r18 - (r6 | (-3));
        int r102 = r2[r133] & UnsignedBytes.MAX_VALUE;
        int r103 = r102 * ((~r102) & 65536);
        int r83 = AbstractC4289n.a(r103, r82, 1, ((-1) - r103) | ((-1) - r82));
        int r182 = r18 - (r6 | (-2));
        int r104 = r2[r182] & UnsignedBytes.MAX_VALUE;
        int r105 = r104 * ((~r104) & 256);
        int r106 = (r105 - 1) - ((~r83) | r105);
        int r84 = r2[r6] & UnsignedBytes.MAX_VALUE;
        int r85 = AbstractC4289n.a(r106, r84, 1, ((-1) - r106) | ((-1) - r84));
        byte r107 = r3[r46];
        int r108 = ((r107 & 16777216) * (r107 | 16777216)) + ((r107 & UnsignedBytes.MAX_VALUE) * ((~r107) & 16777216));
        int r113 = r3[r133] & UnsignedBytes.MAX_VALUE;
        int r114 = ((r113 * ((~r113) & 65536)) & (~r108)) + r108;
        int r109 = r3[r182] & UnsignedBytes.MAX_VALUE;
        int r1010 = r109 * ((~r109) & 256);
        int r1011 = ~((((~r1010) | 911399251) | r114) - ((911399251 & r1010) | r114));
        int r115 = r3[r6] & UnsignedBytes.MAX_VALUE;
        int r1012 = ~((((~r1011) | 1433568692) | r115) - ((1433568692 & r1011) | r115));
        int r86 = r85 << ((r85 > Double.NaN ? 1 : (r85 == Double.NaN ? 0 : -1)) >>> 31);
        int r116 = (-1254002618) - ((r86 & 2) | ((-1672003491) - r86));
        int r117 = (r116 + r1012) - ((r116 & r1012) * 2);
        r3[r6] = (byte) r117;
        r3[r182] = (byte) (r117 >>> 8);
        r3[r133] = (byte) (r117 >>> 16);
        r3[r46] = (byte) (r117 >>> 24);
        r6 = (r6 ^ 4) + ((r6 & 4) * 2);
        int r47 = r3.length;
        int r87 = 0 - (r3.length % 4);
        int r1013 = r87 * 3;
        int r88 = r.a(r87, -4, 1, r47);
        int r48 = ((r6 > AbstractC4292o.a(0, (r47 & 2) | r88, r1013, 1) ? 1 : (r6 == AbstractC4292o.a(0, (r47 & 2) | r88, r1013, 1) ? 0 : -1)) >>> 31) & 1;
        if (r48 == 0) goto L34;
        int r118 = -1605440657;
    L35:
        if (r48 != 0) goto L36;
        r4 = -169475207;
        goto L3
    L36:
        r4 = r118;
        goto L3
    L34:
        r118 = -365117735;
        goto L35
    L38:
        r7 = r3.length % 4;
        if ((((r7 > 1 ? 1 : (r7 == 1 ? 0 : -1)) >>> 31) & 1) == 0) goto L19;
    L41:
        int r49 = r3.length;
        int r89 = 0 - r5;
        int r410 = (r49 ^ r89) + ((r49 & r89) * 2);
        byte r92 = r2[r410];
        int r1014 = r3.length;
        int r810 = 0 - r89;
        int r119 = r810 | r1014;
        byte r811 = r2[C.a(r810, 2, r119, (r1014 ^ r810) ^ r119)];
        r2[r410] = (byte) (((byte) (((byte) 2) * ((byte) (r811 | r92)))) - ((byte) (r811 ^ r92)));
        r4 = -746753280;
    L19:
        r4 = -365117735;
        goto L3
    L6:
        int r411 = r3.length;
        int r52 = 0 - r7;
        int r1015 = (r52 | 165327505) & r411;
        int r812 = (165327505 & (~r52)) & r411;
        if ((r2[((r411 | r52) - r812) + r1015] > Double.NaN ? 1 : (r2[((r411 | r52) - r812) + r1015] == Double.NaN ? 0 : -1)) > (-1)) goto L9;
        r9 = false;
    L9:
        if (r9 == true) goto L12;
        r16 = 1093626513;
    L12:
        if (r9 == false) goto L14;
        r4 = -746753280;
    L15:
        r5 = r7;
        goto L3
    L14:
        r4 = r16;
        goto L15
    }

    public final String a(Context r4, String r5, String[] r6) {
        String r02 = b(r4, r6);     // Catch: Exception -> L11
        if (r02.isEmpty() == true) goto L5;
        return r02;
    L5:
        LinkedList r03 = new LinkedList();     // Catch: Exception -> L11
        i(r6, r03);     // Catch: Exception -> L11
        new File(r4.getFilesDir().getParent() + f30650b).mkdir();     // Catch: Exception -> L11
        String r62 = (String) r03.get(new Random().nextInt(r03.size()));     // Catch: Exception -> L11
        if (j(r4, r5) == false) goto L9;
        f(r4, r5, r62);     // Catch: Exception -> L11
        return r62;
    L9:
        e(r4, r62);     // Catch: Exception -> L11
        return r62;
    L11:
        return r5;
    }

    public final String b(Context r14, String[] r15) {
        String r142 = r14.getApplicationInfo().dataDir;
        byte[] r3 = {Ascii.CR, -93, Ascii.CAN, 73, 49, -6, -19, -113, 104, 87, -55, 57};
        h(r3, new byte[]{-107, -101, -113, 34, 107, 110, -56, -26, 49, 2, -59, 49});
        String[] r143 = new File(r142, new String(r3, StandardCharsets.UTF_8).intern()).list();
        if (r143 != null) goto L5;
        return "";
    L5:
        HashSet r1 = new HashSet(Arrays.asList(r143));
        String[] r144 = d;
        int r2 = r144.length;
        int r4 = 0;
    L6:
        if (r4 >= r2) goto L15;
        String r5 = r144[r4];
        int r6 = r15.length;
        int r7 = 0;
    L8:
        if (r7 >= r6) goto L14;
        String r8 = r15[r7];
        StringBuilder r9 = new StringBuilder();
        r9.append(r8);
        r9.append(r5);
        byte[] r11 = {88, -126, -118, -101};
        h(r11, new byte[]{-115, -54, -3, -34, 9, -107, 43, -105});
        r9.append(new String(r11, StandardCharsets.UTF_8).intern());
        if (r1.contains(r9.toString()) == true) goto L12;
        r7 = r7 + 1;
        goto L8
    L12:
        return r8 + r5;
    L14:
        r4 = r4 + 1;
        goto L6
    L15:
        return "";
    }

    public String c(String r3) {
        return this.f30652a.getString(r3, null);
    }

    public void d() {
        SharedPreferences.Editor r02 = this.f30652a.edit();
        r02.clear();
        r02.apply();
    }

    public final void e(Context r4, String r5) {
        StringBuilder r1 = new StringBuilder();
        r1.append(r4.getApplicationInfo().dataDir);
        r1.append(f30650b);
        r1.append(r5);
        byte[] r52 = {10, 52, -109, Ascii.FF};
        h(r52, new byte[]{59, Ascii.FS, Ascii.DC4, 72, -90, 97, 90, -91});
        Charset r2 = StandardCharsets.UTF_8;
        r1.append(new String(r52, r2).intern());
        if (new File(r1.toString()).createNewFile() == false) goto L5;
        return;
    L5:
        byte[] r02 = {0, -39, -61, -12, -38, -34, -3, -9, 96, -28, -37, -108, -97, -57, 57, 97, -67, -57, Ascii.SYN, 70, Ascii.SI, 126, -112, -85, -33, 96, 118, 80, -61, 111, 77, 69, 52, Ascii.SYN, 69, 101, -60, -24, -19, 76, 112, -28, -92, 60, Ascii.US, -50, -85, 111, -127, -13, 3, -61, -45, -16, -104, -94, -93, -2, -118, -113, 94, 61, Ascii.CAN, Ascii.SUB, -76, -115, -79, 49};
        h(r02, new byte[]{106, -127, -72, 109, -42, -118, -13, -114, 41, 81, -45, -40, 4, 115, 109, -23, -17, -124, 76, Ascii.DC2, -123, -23, Ascii.SO, -80, Ascii.SYN, -41, 52, 35, -67, Ascii.US, 59, 19, 113, 50, 123, -19, -62, 109, -105, Ascii.SI, 53, -109, -26, 3, -108, 123, -95, -13, 10, 103, 120, -98, -51, 100, -50, -89, -15, -82, 2, -50, 73, 40, -127, 74, -34, -55, -22, 67});
        throw new IOException(new String(r02, r2).intern());
    }

    public final void f(Context r9, String r10, String r11) {
        StringBuilder r2 = new StringBuilder();
        r2.append(r9.getApplicationInfo().dataDir);
        String r3 = f30650b;
        r2.append(r3);
        r2.append(r10);
        byte[] r5 = {89, 117, 80, -10};
        h(r5, new byte[]{-114, -35, 82, -127, 81, -78, -42, 48});
        Charset r7 = StandardCharsets.UTF_8;
        r2.append(new String(r5, r7).intern());
        File r1 = new File(r2.toString());
        StringBuilder r22 = new StringBuilder();
        r22.append(r9.getApplicationInfo().dataDir);
        r22.append(r3);
        r22.append(r11);
        byte[] r112 = {-98, 101, 112, Ascii.DLE};
        h(r112, new byte[]{-57, -19, 50, 99, 92, -94, -64, 42});
        r22.append(new String(r112, r7).intern());
        if (r1.renameTo(new File(r22.toString())) == false) goto L5;
        return;
    L5:
        byte[] r113 = {-17, -46, 109, -101, 4, -102, -59, 38, -127, 91, Ascii.DEL, 59, 126, -73, 73, -85, Ascii.DLE, -89, Ascii.SYN, -63, -36, 32, 74, -22, Ascii.NAK, 45, -70, -99, 7, 40, 107, Ascii.FF, 58, 9, -122, 39, 3, 4, -120, -85, -5, 108, -25, 6, 119, 126, 40, -30, -20, 105, -66, -74, -49, -49, 59, 73, 58, 50, -59, 72, 93, -32, 81, -100, -66, -92, -44, 59, -74, 9, 59, -23};
        h(r113, new byte[]{-73, UnsignedBytes.MAX_POWER_OF_TWO, 33, -43, -114, -55, -70, 57, -1, 4, 39, 2, 42, -82, 68, -64, -120, -93, -107, -107, -55, -48, 62, 108, 119, 17, -12, -38, 55, 44, 97, 101, 118, 55, -3, 49, 125, -12, -4, -64, -87, -37, -93, 79, 45, -30, Ascii.GS, -99, -92, -43, -30, -70, -61, -65, 94, 8, 114, Ascii.DLE, -74, 19, -108, 96, 57, -32, -17, -111, -68, 69, -17, 58, 116, -127});
        throw new IOException(new String(r113, r7).intern());
    }

    public void g(String r2, String r3) {
        SharedPreferences.Editor r02 = this.f30652a.edit();
        r02.putString(r2, r3);
        r02.apply();
    }

    public final void i(String[] r10, List r11) {
        String[] r02 = d;
        int r1 = r02.length;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        String r4 = r02[r3];
        int r5 = r10.length;
        int r6 = 0;
    L5:
        if (r6 >= r5) goto L7;
        r11.add(r10[r6] + r4);
        r6 = r6 + 1;
        goto L5
    L7:
        r3 = r3 + 1;
        goto L3
    }

    public final boolean j(Context r4, String r5) {
        StringBuilder r1 = new StringBuilder();
        r1.append(r4.getApplicationInfo().dataDir);
        r1.append(f30650b);
        r1.append(r5);
        byte[] r52 = {-69, -90, -79, 86};
        h(r52, new byte[]{-84, -82, -14, 33, 34, -76, 107, Ascii.DC2});
        r1.append(new String(r52, StandardCharsets.UTF_8).intern());
        return new File(r1.toString()).exists();
    }

    public boolean k(String r2) {
        return this.f30652a.contains(r2);
    }

    public void l(String r2) {
        SharedPreferences.Editor r02 = this.f30652a.edit();
        r02.remove(r2);
        r02.apply();
    }
}
