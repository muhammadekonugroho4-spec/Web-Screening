package androidx.camera.core.impl.utils;

import android.location.Location;
import androidx.camera.core.AbstractC2209b0;
import androidx.camera.core.W;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.gojek.ojosdk.exif.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final String f5546c = "f";
    public static final ThreadLocal d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f5547e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final ThreadLocal f5548f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final List f5549g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final List f5550h = null;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.exifinterface.media.a f5551a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5552b;

    public class a extends ThreadLocal {
        public a() {
        }

        public SimpleDateFormat a() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }

        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ Object initialValue() {
            return a();
        }
    }

    public class b extends ThreadLocal {
        public b() {
        }

        public SimpleDateFormat a() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }

        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ Object initialValue() {
            return a();
        }
    }

    public class c extends ThreadLocal {
        public c() {
        }

        public SimpleDateFormat a() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }

        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ Object initialValue() {
            return a();
        }
    }

    public static final class d {

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final double f5553a;

            public a(double r1) {
                this.f5553a = r1;
            }

            public double a() {
                return this.f5553a / 2.23694d;
            }
        }

        public static a a(double r3) {
            return new a(r3 * 0.621371d);
        }

        public static a b(double r3) {
            return new a(r3 * 1.15078d);
        }

        public static a c(double r1) {
            return new a(r1);
        }
    }

    static {
        d = new a();
        f5547e = new b();
        f5548f = new c();
        f5549g = n();
        f5550h = Arrays.asList(new String[]{"ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation"});
    }

    public f(androidx.exifinterface.media.a r2) {
        this.f5552b = false;
        this.f5551a = r2;
    }

    public static Date c(String r1) {
        return ((SimpleDateFormat) d.get()).parse(r1);
    }

    public static Date d(String r1) {
        return ((SimpleDateFormat) f5548f.get()).parse(r1);
    }

    public static Date e(String r1) {
        return ((SimpleDateFormat) f5547e.get()).parse(r1);
    }

    public static String f(long r2) {
        return ((SimpleDateFormat) f5548f.get()).format(new Date(r2));
    }

    public static f h(File r02) {
        return i(r02.toString());
    }

    public static f i(String r2) {
        return new f(new androidx.exifinterface.media.a(r2));
    }

    public static f j(W r1) {
        ByteBuffer r12 = r1.S()[0].g();
        r12.rewind();
        byte[] r02 = new byte[r12.capacity()];
        r12.get(r02);
        return k(new ByteArrayInputStream(r02));
    }

    public static f k(InputStream r2) {
        return new f(new androidx.exifinterface.media.a(r2));
    }

    public static List n() {
        return Arrays.asList(new String[]{"ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType"});
    }

    public void A() {
        if (this.f5552b == true) goto L5;
        a();
    L5:
        this.f5551a.c0();
    }

    public final void a() {
        long r02 = System.currentTimeMillis();
        String r2 = f(r02);
        this.f5551a.h0("DateTime", r2);
        String r03 = Long.toString(r02 - d(r2).getTime());     // Catch: ParseException -> L5
        this.f5551a.h0("SubSecTime", r03);     // Catch: ParseException -> L5
        return;
    }

    public void b(Location r2) {
        this.f5551a.i0(r2);
    }

    public void g(f r5) {
        ArrayList r02 = new ArrayList(f5549g);
        r02.removeAll(f5550h);
        Iterator r03 = r02.iterator();
    L4:
        if (r03.hasNext() == false) goto L10;
        String r1 = (String) r03.next();
        String r2 = this.f5551a.k(r1);
        String r3 = r5.f5551a.k(r1);
        if (r2 == null) goto L4;
        if (r2.equals(r3) == true) goto L4;
        r5.f5551a.h0(r1, r2);
        goto L4
    }

    public void l() {
        switch(r()) {
            case 2: goto L11;
            case 3: goto L10;
            case 4: goto L9;
            case 5: goto L8;
            case 6: goto L7;
            case 7: goto L6;
            case 8: goto L5;
            default: goto L4;
        };
    L4:
        int r02 = 2;
    L12:
        this.f5551a.h0("Orientation", String.valueOf(r02));
        return;
    L5:
        r02 = 7;
        goto L12
    L6:
        r02 = 8;
        goto L12
    L7:
        r02 = 5;
        goto L12
    L8:
        r02 = 6;
        goto L12
    L9:
        r02 = 3;
        goto L12
    L10:
        r02 = 4;
        goto L12
    L11:
        r02 = 1;
        goto L12
    }

    public void m() {
        switch(r()) {
            case 2: goto L11;
            case 3: goto L10;
            case 4: goto L9;
            case 5: goto L8;
            case 6: goto L7;
            case 7: goto L6;
            case 8: goto L5;
            default: goto L4;
        };
    L4:
        int r02 = 4;
    L12:
        this.f5551a.h0("Orientation", String.valueOf(r02));
        return;
    L5:
        r02 = 5;
        goto L12
    L6:
        r02 = 6;
        goto L12
    L7:
        r02 = 7;
        goto L12
    L8:
        r02 = 8;
        goto L12
    L9:
        r02 = 1;
        goto L12
    L10:
        r02 = 2;
        goto L12
    L11:
        r02 = 3;
        goto L12
    }

    public String o() {
        return this.f5551a.k("ImageDescription");
    }

    public int p() {
        return this.f5551a.m("ImageLength", 0);
    }

    public Location q() {
        String r1 = this.f5551a.k("GPSProcessingMethod");
        double[] r2 = this.f5551a.q();
        double r6 = this.f5551a.j(0.0d);
        double r8 = this.f5551a.l("GPSSpeed", 0.0d);
        String r3 = this.f5551a.k("GPSSpeedRef");
        if (r3 != null) goto L5;
        r3 = ExifInterface.GpsSpeedRef.KILOMETERS;
    L5:
        long r11 = y(this.f5551a.k("GPSDateStamp"), this.f5551a.k("GPSTimeStamp"));
        if (r2 != null) goto L9;
        return null;
    L9:
        if (r1 != null) goto L11;
        r1 = f5546c;
    L11:
        Location r13 = new Location(r1);
        r13.setLatitude(r2[0]);
        r13.setLongitude(r2[1]);
        if (r6 == 0.0d) goto L15;
        r13.setAltitude(r6);
    L15:
        if (r8 == 0.0d) goto L40;
        int r12 = r3.hashCode();
        if (r12 == 75) goto L30;
        if (r12 == 77) goto L27;
        if (r12 == 78) goto L24;
    L32:
        char r14 = 65535;
    L33:
        if (r14 == 0) goto L37;
        if (r14 == 1) goto L36;
        double r15 = d.a(r8).a();
    L38:
        r13.setSpeed((float) r15);
        goto L40
    L36:
        r15 = d.b(r8).a();
        goto L38
    L37:
        r15 = d.c(r8).a();
        goto L38
    L24:
        if (r3.equals("N") == false) goto L32;
        r14 = 1;
        goto L33
    L27:
        if (r3.equals("M") == false) goto L32;
        r14 = 0;
        goto L33
    L30:
        if (r3.equals(ExifInterface.GpsSpeedRef.KILOMETERS) == false) goto L32;
        r14 = 2;
    L40:
        if (r11 == (-1)) goto L42;
        r13.setTime(r11);
    L42:
        return r13;
    }

    public int r() {
        return this.f5551a.m("Orientation", 0);
    }

    public int s() {
        switch(r()) {
            case 3: goto L9;
            case 4: goto L9;
            case 5: goto L8;
            case 6: goto L7;
            case 7: goto L7;
            case 8: goto L6;
            default: goto L4;
        };
    L4:
        return 0;
    L6:
        return SubsamplingScaleImageView.ORIENTATION_270;
    L7:
        return 90;
    L8:
        return SubsamplingScaleImageView.ORIENTATION_270;
    L9:
        return SubsamplingScaleImageView.ORIENTATION_180;
    }

    public long t() {
        long r02 = x(this.f5551a.k("DateTimeOriginal"));
        if (r02 != (-1)) goto L5;
        return -1;
    L5:
        String r2 = this.f5551a.k("SubSecTimeOriginal");
        if (r2 == null) goto L19;
        long r22 = Long.parseLong(r2);     // Catch: NumberFormatException -> L14
    L9:
        if (r22 <= 1000) goto L13;
        r22 = r22 / 10;     // Catch: NumberFormatException -> L14
    L13:
        return r02 + r22;
    L20:
        return r02;
    L19:
        return r02;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", new Object[]{Integer.valueOf(u()), Integer.valueOf(p()), Integer.valueOf(s()), Boolean.valueOf(w()), Boolean.valueOf(v()), q(), Long.valueOf(t()), o()});
    }

    public int u() {
        return this.f5551a.m("ImageWidth", 0);
    }

    public boolean v() {
        if (r() == 2) goto L6;
        return false;
    L6:
        return true;
    }

    public boolean w() {
        int r02 = r();
        if (r02 != 4) goto L5;
    L10:
        return true;
    L5:
        if (r02 == 5) goto L10;
        if (r02 == 7) goto L10;
        return false;
    }

    public final long x(String r3) {
        if (r3 != null) goto L8;
        return -1;
    L8:
        return d(r3).getTime();
    L10:
        return -1;
    }

    public final long y(String r3, String r4) {
        if (r3 != null) goto L6;
        if (r4 != null) goto L6;
        return -1;
    L6:
        if (r4 == null) goto L16;
        if (r3 != null) goto L15;
        return e(r4).getTime();
    L13:
        return -1;
    L15:
        return x(r3 + " " + r4);
    L16:
        return c(r3).getTime();
    L9:
        return -1;
    }

    public void z(int r10) {
        if ((r10 % 90) == 0) goto L6;
        AbstractC2209b0.l(f5546c, String.format(Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", new Object[]{Integer.valueOf(r10)}));
        this.f5551a.h0("Orientation", String.valueOf(0));
        return;
    L6:
        int r102 = r10 % 360;
        int r02 = r();
    L8:
        if (r102 >= 0) goto L18;
        r102 = r102 + 90;
        switch(r02) {
            case 2: goto L17;
            case 3: goto L12;
            case 4: goto L16;
            case 5: goto L15;
            case 6: goto L14;
            case 7: goto L13;
            case 8: goto L12;
            default: goto L11;
        };
    L12:
        r02 = 6;
        goto L8
    L13:
        r02 = 2;
        goto L8
    L14:
        r02 = 1;
        goto L8
    L15:
        r02 = 4;
        goto L8
    L16:
        r02 = 7;
        goto L8
    L17:
        r02 = 5;
        goto L8
    L11:
        r02 = 8;
    L18:
        if (r102 <= 0) goto L29;
        r102 = r102 - 90;
        switch(r02) {
            case 2: goto L28;
            case 3: goto L27;
            case 4: goto L26;
            case 5: goto L25;
            case 6: goto L24;
            case 7: goto L23;
            case 8: goto L22;
            default: goto L21;
        };
    L22:
        r02 = 1;
        goto L18
    L23:
        r02 = 4;
        goto L18
    L24:
        r02 = 3;
        goto L18
    L25:
        r02 = 2;
        goto L18
    L26:
        r02 = 5;
        goto L18
    L27:
        r02 = 8;
        goto L18
    L28:
        r02 = 7;
        goto L18
    L21:
        r02 = 6;
        goto L18
    L29:
        this.f5551a.h0("Orientation", String.valueOf(r02));
    }
}
