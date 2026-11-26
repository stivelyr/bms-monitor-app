package defpackage;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class xe0 extends BluetoothGattCallback {
    public final /* synthetic */ gf0 a;

    public xe0(gf0 gf0Var) {
        this.a = gf0Var;
    }

    public final void a(UUID uuid, byte[] bArr) {
        g47 g47Var = as7.a;
        Arrays.toString(bArr).getClass();
        uuid.toString();
        g47Var.getClass();
        g47.a(new Object[0]);
        this.a.d.k(new hh5(uuid, bArr));
    }

    public final void b(int i, byte[] bArr) {
        gf0 gf0Var = this.a;
        me0 me0Var = gf0Var.h;
        if (me0Var == null) {
            return;
        }
        if (i == 0) {
            me0Var.a(bArr);
        } else {
            me0Var.b(new hf0(f44.m(i, "Read failed with status: ")));
        }
        gf0Var.h = null;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        bluetoothGatt.getClass();
        bluetoothGattCharacteristic.getClass();
        UUID uuid = bluetoothGattCharacteristic.getUuid();
        uuid.getClass();
        byte[] value = bluetoothGattCharacteristic.getValue();
        value.getClass();
        a(uuid, value);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        bluetoothGatt.getClass();
        bluetoothGattCharacteristic.getClass();
        byte[] value = bluetoothGattCharacteristic.getValue();
        value.getClass();
        b(i, value);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        bluetoothGatt.getClass();
        bluetoothGattCharacteristic.getClass();
        gf0 gf0Var = this.a;
        me0 me0Var = gf0Var.h;
        if (me0Var == null) {
            return;
        }
        if (i == 0) {
            me0Var.a(h28.a);
        } else {
            me0Var.b(new hf0(f44.m(i, "Write failed with status: ")));
        }
        gf0Var.h = null;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
        Object wd6Var;
        rf1 rf1Var = rf1.c;
        gf0 gf0Var = this.a;
        o47 o47Var = gf0Var.b;
        bluetoothGatt.getClass();
        as7.a.getClass();
        g47.a(new Object[0]);
        if (i2 == 2 && i == 0) {
            rf1 rf1Var2 = rf1.a;
            o47Var.getClass();
            o47Var.n(null, rf1Var2);
            me0 me0Var = gf0Var.h;
            if (me0Var != null) {
                try {
                    wd6Var = Boolean.valueOf(bluetoothGatt.discoverServices());
                } catch (Throwable th) {
                    wd6Var = new wd6(th);
                }
                Boolean bool = Boolean.FALSE;
                if (wd6Var instanceof wd6) {
                    wd6Var = bool;
                }
                if (((Boolean) wd6Var).booleanValue()) {
                    return;
                }
                gf0Var.a();
                me0Var.a(bool);
                gf0Var.h = null;
                return;
            }
            return;
        }
        if (i2 == 0) {
            me0 me0Var2 = gf0Var.h;
            o47Var.getClass();
            o47Var.n(null, rf1Var);
            gf0Var.a();
            if (me0Var2 != null) {
                me0Var2.a(Boolean.FALSE);
                return;
            }
            return;
        }
        if (i != 0) {
            me0 me0Var3 = gf0Var.h;
            o47Var.getClass();
            o47Var.n(null, rf1Var);
            gf0Var.a();
            if (me0Var3 != null) {
                me0Var3.a(Boolean.FALSE);
            }
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        bluetoothGatt.getClass();
        bluetoothGattDescriptor.getClass();
        gf0 gf0Var = this.a;
        me0 me0Var = gf0Var.h;
        if (me0Var == null) {
            return;
        }
        if (i == 0) {
            me0Var.a(h28.a);
        } else {
            me0Var.b(new hf0(f44.m(i, "Descriptor write failed: ")));
        }
        gf0Var.h = null;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
        bluetoothGatt.getClass();
        gf0 gf0Var = this.a;
        me0 me0Var = gf0Var.h;
        if (me0Var == null) {
            return;
        }
        if (i == 0) {
            me0Var.a(Boolean.TRUE);
        } else {
            gf0Var.a();
            me0Var.a(Boolean.FALSE);
        }
        gf0Var.h = null;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i) {
        bluetoothGatt.getClass();
        bluetoothGattCharacteristic.getClass();
        bArr.getClass();
        b(i, bArr);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        bluetoothGatt.getClass();
        bluetoothGattCharacteristic.getClass();
        bArr.getClass();
        UUID uuid = bluetoothGattCharacteristic.getUuid();
        uuid.getClass();
        a(uuid, bArr);
    }
}
