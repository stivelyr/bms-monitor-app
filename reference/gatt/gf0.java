package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.content.Context;
import android.content.IntentFilter;
import java.io.Serializable;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class gf0 {
    public final Context a;
    public final o47 b;
    public final t16 c;
    public final yu6 d;
    public final r16 e;
    public BluetoothGatt f;
    public final cu4 g;
    public me0 h;
    public final xe0 i;

    public gf0(Context context) {
        this.a = context;
        o47 o47VarR = mu1.r(rf1.c);
        this.b = o47VarR;
        this.c = new t16(o47VarR);
        yu6 yu6VarM = ol8.m(0, 64, kj0.c);
        this.d = yu6VarM;
        this.e = new r16(yu6VarM);
        this.g = new cu4();
        context.registerReceiver(new qo(1, this), new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        this.i = new xe0(this);
    }

    public final void a() {
        try {
            BluetoothGatt bluetoothGatt = this.f;
            if (bluetoothGatt != null) {
                as7.a.getClass();
                g47.a(new Object[0]);
                bluetoothGatt.close();
            }
        } catch (Exception unused) {
            as7.a.getClass();
            g47.e(new Object[0]);
        }
        this.f = null;
        rf1 rf1Var = rf1.c;
        o47 o47Var = this.b;
        o47Var.getClass();
        o47Var.n(null, rf1Var);
        this.h = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, yi1 yi1Var) throws Throwable {
        ne0 ne0Var;
        int i;
        au4 au4Var;
        au4 au4Var2;
        if (yi1Var instanceof ne0) {
            ne0Var = (ne0) yi1Var;
            int i2 = ne0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ne0Var.label = i2 - Integer.MIN_VALUE;
            } else {
                ne0Var = new ne0(this, yi1Var);
            }
        } else {
            ne0Var = new ne0(this, yi1Var);
        }
        Object obj = ne0Var.result;
        int i3 = ne0Var.label;
        bl1 bl1Var = bl1.b;
        try {
            if (i3 == 0) {
                lf2.J(obj);
                ne0Var.L$0 = str;
                cu4 cu4Var = this.g;
                ne0Var.L$1 = cu4Var;
                ne0Var.I$0 = 0;
                ne0Var.label = 1;
                if (cu4Var.e(ne0Var) != bl1Var) {
                    i = 0;
                    au4Var = cu4Var;
                }
                return bl1Var;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    pu1.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                au4Var2 = (au4) ne0Var.L$1;
                try {
                    lf2.J(obj);
                    au4Var2 = au4Var2;
                    Boolean bool = (Boolean) obj;
                    bool.getClass();
                    ((cu4) au4Var2).h(null);
                    return bool;
                } catch (Throwable th) {
                    th = th;
                    ((cu4) au4Var2).h(null);
                    throw th;
                }
            }
            int i4 = ne0Var.I$0;
            au4 au4Var3 = (au4) ne0Var.L$1;
            String str2 = (String) ne0Var.L$0;
            lf2.J(obj);
            au4Var = au4Var3;
            i = i4;
            str = str2;
            Object systemService = this.a.getSystemService("bluetooth");
            systemService.getClass();
            BluetoothAdapter adapter = ((BluetoothManager) systemService).getAdapter();
            if (adapter == null || !adapter.isEnabled()) {
                throw new hf0("Bluetooth is disabled");
            }
            if (this.f != null) {
                a();
            }
            o47 o47Var = this.b;
            rf1 rf1Var = rf1.b;
            try {
                o47Var.getClass();
                o47Var.n(null, rf1Var);
                k21 k21Var = bc2.c;
                long jF = ec2.F(10);
                pe0 pe0Var = new pe0(this, str, null);
                ne0Var.L$0 = null;
                ne0Var.L$1 = au4Var;
                ne0Var.L$2 = null;
                ne0Var.L$3 = null;
                ne0Var.I$0 = i;
                ne0Var.I$1 = 0;
                ne0Var.label = 2;
                Object objP = yd.P(jF, pe0Var, ne0Var);
                if (objP != bl1Var) {
                    au4 au4Var4 = au4Var;
                    obj = objP;
                    au4Var2 = au4Var4;
                    Boolean bool2 = (Boolean) obj;
                    bool2.getClass();
                    ((cu4) au4Var2).h(null);
                    return bool2;
                }
                return bl1Var;
            } catch (Throwable th2) {
                th = th2;
                au4Var2 = au4Var;
                ((cu4) au4Var2).h(null);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(yi1 yi1Var) throws Throwable {
        qe0 qe0Var;
        Object obj;
        int i;
        Object obj2;
        Exception e;
        Object obj3;
        if (yi1Var instanceof qe0) {
            qe0Var = (qe0) yi1Var;
            int i2 = qe0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qe0Var.label = i2 - Integer.MIN_VALUE;
            } else {
                qe0Var = new qe0(this, yi1Var);
            }
        } else {
            qe0Var = new qe0(this, yi1Var);
        }
        Object obj4 = qe0Var.result;
        int i3 = qe0Var.label;
        bl1 bl1Var = bl1.b;
        try {
            try {
                try {
                    if (i3 == 0) {
                        lf2.J(obj4);
                        cu4 cu4Var = this.g;
                        qe0Var.L$0 = cu4Var;
                        qe0Var.I$0 = 0;
                        qe0Var.label = 1;
                        if (cu4Var.e(qe0Var) != bl1Var) {
                            i = 0;
                            obj = cu4Var;
                        }
                        return bl1Var;
                    }
                    if (i3 != 1) {
                        if (i3 != 2) {
                            pu1.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = (au4) qe0Var.L$0;
                        try {
                            lf2.J(obj4);
                            obj2 = obj2;
                            as7.a.getClass();
                            g47.a(new Object[0]);
                            obj3 = obj2;
                        } catch (Exception e2) {
                            e = e2;
                            g47 g47Var = as7.a;
                            e.getMessage();
                            g47Var.getClass();
                            g47.i(new Object[0]);
                            obj3 = obj2;
                        }
                        a();
                        obj = obj3;
                        obj = obj;
                        h28 h28Var = h28.a;
                        ((cu4) obj).h(null);
                        return h28Var;
                    }
                    i = qe0Var.I$0;
                    au4 au4Var = (au4) qe0Var.L$0;
                    lf2.J(obj4);
                    obj = au4Var;
                    BluetoothGatt bluetoothGatt = this.f;
                    if (bluetoothGatt == null) {
                        obj = obj;
                    } else if (!jp3.r(this.b.getValue(), rf1.c)) {
                        obj = obj;
                        as7.a.getClass();
                        g47.a(new Object[0]);
                        try {
                            k21 k21Var = bc2.c;
                            long jF = ec2.F(2);
                            re0 re0Var = new re0(this, bluetoothGatt, null);
                            qe0Var.L$0 = obj;
                            qe0Var.L$1 = null;
                            qe0Var.I$0 = i;
                            qe0Var.I$1 = 0;
                            qe0Var.label = 2;
                            if (yd.P(jF, re0Var, qe0Var) != bl1Var) {
                                obj2 = obj;
                                as7.a.getClass();
                                g47.a(new Object[0]);
                                obj3 = obj2;
                                a();
                                obj = obj3;
                            }
                            return bl1Var;
                        } catch (Exception e3) {
                            obj2 = obj;
                            e = e3;
                            g47 g47Var2 = as7.a;
                            e.getMessage();
                            g47Var2.getClass();
                            g47.i(new Object[0]);
                            obj3 = obj2;
                        } catch (Throwable th) {
                            th = th;
                            a();
                            throw th;
                        }
                    }
                    obj = obj;
                    h28 h28Var2 = h28.a;
                    ((cu4) obj).h(null);
                    return h28Var2;
                } catch (Throwable th2) {
                    th = th2;
                    ((cu4) obj).h(null);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            obj = qe0Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object d(UUID uuid, UUID uuid2, yi1 yi1Var) throws Throwable {
        se0 se0Var;
        UUID uuid3;
        au4 au4Var;
        int i;
        au4 au4Var2;
        if (yi1Var instanceof se0) {
            se0Var = (se0) yi1Var;
            int i2 = se0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                se0Var.label = i2 - Integer.MIN_VALUE;
            } else {
                se0Var = new se0(this, yi1Var);
            }
        } else {
            se0Var = new se0(this, yi1Var);
        }
        Object obj = se0Var.result;
        int i3 = se0Var.label;
        bl1 bl1Var = bl1.b;
        try {
            if (i3 == 0) {
                lf2.J(obj);
                se0Var.L$0 = uuid;
                se0Var.L$1 = uuid2;
                cu4 cu4Var = this.g;
                se0Var.L$2 = cu4Var;
                se0Var.I$0 = 0;
                se0Var.label = 1;
                if (cu4Var.e(se0Var) != bl1Var) {
                    uuid3 = uuid2;
                    au4Var = cu4Var;
                    i = 0;
                }
                return bl1Var;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    pu1.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                au4Var2 = (au4) se0Var.L$2;
                try {
                    lf2.J(obj);
                    h28 h28Var = h28.a;
                    ((cu4) au4Var2).h(null);
                    return h28Var;
                } catch (Throwable th) {
                    th = th;
                    ((cu4) au4Var2).h(null);
                    throw th;
                }
            }
            int i4 = se0Var.I$0;
            au4Var = (au4) se0Var.L$2;
            uuid3 = (UUID) se0Var.L$1;
            UUID uuid4 = (UUID) se0Var.L$0;
            lf2.J(obj);
            i = i4;
            uuid = uuid4;
            BluetoothGatt bluetoothGattF = f();
            BluetoothGattService service = bluetoothGattF.getService(uuid);
            if (service == null) {
                throw new hf0("Service not found: " + uuid);
            }
            BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid3);
            if (characteristic == null) {
                throw new hf0("Char not found: " + uuid3);
            }
            boolean characteristicNotification = bluetoothGattF.setCharacteristicNotification(characteristic, true);
            if (!characteristicNotification) {
                throw new hf0("setCharacteristicNotification failed");
            }
            BluetoothGattDescriptor descriptor = characteristic.getDescriptor(UUID.fromString("00002902-0000-1000-8000-00805f9b34fb"));
            if (descriptor == null) {
                throw new hf0("CCC descriptor not found");
            }
            k21 k21Var = bc2.c;
            long jF = ec2.F(5);
            te0 te0Var = new te0(this, bluetoothGattF, descriptor, null);
            se0Var.L$0 = null;
            se0Var.L$1 = null;
            se0Var.L$2 = au4Var;
            se0Var.L$3 = null;
            se0Var.L$4 = null;
            se0Var.L$5 = null;
            se0Var.L$6 = null;
            se0Var.L$7 = null;
            se0Var.I$0 = i;
            se0Var.I$1 = 0;
            se0Var.Z$0 = characteristicNotification;
            se0Var.label = 2;
            if (yd.P(jF, te0Var, se0Var) != bl1Var) {
                au4Var2 = au4Var;
                h28 h28Var2 = h28.a;
                ((cu4) au4Var2).h(null);
                return h28Var2;
            }
            return bl1Var;
        } catch (Throwable th2) {
            th = th2;
            au4Var2 = au4Var;
            ((cu4) au4Var2).h(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(long j, yi1 yi1Var, String str) throws Throwable {
        ue0 ue0Var;
        long j2;
        au4 au4Var;
        int i;
        au4 au4Var2;
        if (yi1Var instanceof ue0) {
            ue0Var = (ue0) yi1Var;
            int i2 = ue0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ue0Var.label = i2 - Integer.MIN_VALUE;
            } else {
                ue0Var = new ue0(this, yi1Var);
            }
        } else {
            ue0Var = new ue0(this, yi1Var);
        }
        Object objQ = ue0Var.result;
        int i3 = ue0Var.label;
        bl1 bl1Var = bl1.b;
        try {
            if (i3 == 0) {
                lf2.J(objQ);
                ue0Var.L$0 = str;
                cu4 cu4Var = this.g;
                ue0Var.L$1 = cu4Var;
                ue0Var.J$0 = j;
                ue0Var.I$0 = 0;
                ue0Var.label = 1;
                if (cu4Var.e(ue0Var) != bl1Var) {
                    j2 = j;
                    au4Var = cu4Var;
                    i = 0;
                }
                return bl1Var;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    pu1.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                au4Var2 = (au4) ue0Var.L$1;
                try {
                    lf2.J(objQ);
                    String str2 = (String) objQ;
                    ((cu4) au4Var2).h(null);
                    return str2;
                } catch (Throwable th) {
                    th = th;
                    ((cu4) au4Var2).h(null);
                    throw th;
                }
            }
            i = ue0Var.I$0;
            j2 = ue0Var.J$0;
            au4Var = (au4) ue0Var.L$1;
            str = (String) ue0Var.L$0;
            lf2.J(objQ);
            Object systemService = this.a.getSystemService("bluetooth");
            systemService.getClass();
            BluetoothAdapter adapter = ((BluetoothManager) systemService).getAdapter();
            if (adapter != null && adapter.isEnabled()) {
                BluetoothLeScanner bluetoothLeScanner = adapter.getBluetoothLeScanner();
                if (bluetoothLeScanner == null) {
                    ((cu4) au4Var).h(null);
                    return null;
                }
                we0 we0Var = new we0(bluetoothLeScanner, str, null);
                ue0Var.L$0 = null;
                ue0Var.L$1 = au4Var;
                ue0Var.L$2 = null;
                ue0Var.L$3 = null;
                ue0Var.L$4 = null;
                ue0Var.J$0 = j2;
                ue0Var.I$0 = i;
                ue0Var.I$1 = 0;
                ue0Var.label = 2;
                objQ = yd.Q(j2, we0Var, ue0Var);
                if (objQ != bl1Var) {
                    au4Var2 = au4Var;
                    String str3 = (String) objQ;
                    ((cu4) au4Var2).h(null);
                    return str3;
                }
                return bl1Var;
            }
            Object[] objArr = new Object[0];
            try {
                as7.a.getClass();
                g47.d(objArr);
                ((cu4) au4Var).h(null);
                return null;
            } catch (Throwable th2) {
                th = th2;
                au4Var2 = au4Var;
                ((cu4) au4Var2).h(null);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final BluetoothGatt f() throws hf0 {
        BluetoothGatt bluetoothGatt = this.f;
        if (bluetoothGatt == null || !jp3.r(this.b.getValue(), rf1.a)) {
            throw new hf0("Device not connected");
        }
        return bluetoothGatt;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r13v8, types: [byte[], java.io.Serializable] */
    public final Serializable g(UUID uuid, UUID uuid2, yi1 yi1Var) throws Throwable {
        bf0 bf0Var;
        UUID uuid3;
        au4 au4Var;
        int i;
        au4 au4Var2;
        if (yi1Var instanceof bf0) {
            bf0Var = (bf0) yi1Var;
            int i2 = bf0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bf0Var.label = i2 - Integer.MIN_VALUE;
            } else {
                bf0Var = new bf0(this, yi1Var);
            }
        } else {
            bf0Var = new bf0(this, yi1Var);
        }
        Object objP = bf0Var.result;
        int i3 = bf0Var.label;
        bl1 bl1Var = bl1.b;
        try {
            if (i3 == 0) {
                lf2.J(objP);
                bf0Var.L$0 = uuid;
                bf0Var.L$1 = uuid2;
                cu4 cu4Var = this.g;
                bf0Var.L$2 = cu4Var;
                bf0Var.I$0 = 0;
                bf0Var.label = 1;
                if (cu4Var.e(bf0Var) != bl1Var) {
                    uuid3 = uuid2;
                    au4Var = cu4Var;
                    i = 0;
                }
                return bl1Var;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    pu1.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                au4Var2 = (au4) bf0Var.L$2;
                try {
                    lf2.J(objP);
                    ?? r13 = (byte[]) objP;
                    ((cu4) au4Var2).h(null);
                    return r13;
                } catch (Throwable th) {
                    th = th;
                    ((cu4) au4Var2).h(null);
                    throw th;
                }
            }
            int i4 = bf0Var.I$0;
            au4Var = (au4) bf0Var.L$2;
            uuid3 = (UUID) bf0Var.L$1;
            UUID uuid4 = (UUID) bf0Var.L$0;
            lf2.J(objP);
            i = i4;
            uuid = uuid4;
            BluetoothGatt bluetoothGattF = f();
            BluetoothGattService service = bluetoothGattF.getService(uuid);
            if (service == null) {
                throw new hf0("Service not found: " + uuid);
            }
            BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid3);
            if (characteristic == null) {
                throw new hf0("Char not found: " + uuid3);
            }
            k21 k21Var = bc2.c;
            long jF = ec2.F(5);
            cf0 cf0Var = new cf0(this, bluetoothGattF, characteristic, null);
            bf0Var.L$0 = null;
            bf0Var.L$1 = null;
            bf0Var.L$2 = au4Var;
            bf0Var.L$3 = null;
            bf0Var.L$4 = null;
            bf0Var.L$5 = null;
            bf0Var.I$0 = i;
            bf0Var.I$1 = 0;
            bf0Var.label = 2;
            objP = yd.P(jF, cf0Var, bf0Var);
            if (objP != bl1Var) {
                au4Var2 = au4Var;
                ?? r14 = (byte[]) objP;
                ((cu4) au4Var2).h(null);
                return r14;
            }
            return bl1Var;
        } catch (Throwable th2) {
            th = th2;
            au4Var2 = au4Var;
            ((cu4) au4Var2).h(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object h(UUID uuid, UUID uuid2, byte[] bArr, yi1 yi1Var) throws Throwable {
        ef0 ef0Var;
        UUID uuid3;
        byte[] bArr2;
        au4 au4Var;
        UUID uuid4;
        int i;
        au4 au4Var2;
        if (yi1Var instanceof ef0) {
            ef0Var = (ef0) yi1Var;
            int i2 = ef0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ef0Var.label = i2 - Integer.MIN_VALUE;
            } else {
                ef0Var = new ef0(this, yi1Var);
            }
        } else {
            ef0Var = new ef0(this, yi1Var);
        }
        ef0 ef0Var2 = ef0Var;
        Object obj = ef0Var2.result;
        int i3 = ef0Var2.label;
        bl1 bl1Var = bl1.b;
        try {
            if (i3 == 0) {
                lf2.J(obj);
                ef0Var2.L$0 = uuid;
                ef0Var2.L$1 = uuid2;
                ef0Var2.L$2 = bArr;
                cu4 cu4Var = this.g;
                ef0Var2.L$3 = cu4Var;
                ef0Var2.I$0 = 0;
                ef0Var2.label = 1;
                if (cu4Var.e(ef0Var2) != bl1Var) {
                    uuid3 = uuid2;
                    bArr2 = bArr;
                    au4Var = cu4Var;
                    uuid4 = uuid;
                    i = 0;
                }
                return bl1Var;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    pu1.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                au4Var2 = (au4) ef0Var2.L$3;
                try {
                    lf2.J(obj);
                    h28 h28Var = h28.a;
                    ((cu4) au4Var2).h(null);
                    return h28Var;
                } catch (Throwable th) {
                    th = th;
                    ((cu4) au4Var2).h(null);
                    throw th;
                }
            }
            int i4 = ef0Var2.I$0;
            au4 au4Var3 = (au4) ef0Var2.L$3;
            byte[] bArr3 = (byte[]) ef0Var2.L$2;
            uuid3 = (UUID) ef0Var2.L$1;
            uuid4 = (UUID) ef0Var2.L$0;
            lf2.J(obj);
            i = i4;
            bArr2 = bArr3;
            au4Var = au4Var3;
            BluetoothGatt bluetoothGattF = f();
            BluetoothGattService service = bluetoothGattF.getService(uuid4);
            if (service == null) {
                throw new hf0("Service not found: " + uuid4);
            }
            BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid3);
            if (characteristic == null) {
                throw new hf0("Char not found: " + uuid3);
            }
            k21 k21Var = bc2.c;
            long jF = ec2.F(5);
            ff0 ff0Var = new ff0(this, bluetoothGattF, characteristic, bArr2, null);
            ef0Var2.L$0 = null;
            ef0Var2.L$1 = null;
            ef0Var2.L$2 = null;
            ef0Var2.L$3 = au4Var;
            ef0Var2.L$4 = null;
            ef0Var2.L$5 = null;
            ef0Var2.L$6 = null;
            ef0Var2.I$0 = i;
            ef0Var2.I$1 = 0;
            ef0Var2.label = 2;
            if (yd.P(jF, ff0Var, ef0Var2) != bl1Var) {
                au4Var2 = au4Var;
                h28 h28Var2 = h28.a;
                ((cu4) au4Var2).h(null);
                return h28Var2;
            }
            return bl1Var;
        } catch (Throwable th2) {
            th = th2;
            au4Var2 = au4Var;
            ((cu4) au4Var2).h(null);
            throw th;
        }
    }
}
