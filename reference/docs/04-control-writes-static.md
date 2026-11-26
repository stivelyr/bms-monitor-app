# Static write paths (not an operating guide)

This page records byte arrays constructed in the Swap Assistant APK. It is source-level evidence, not evidence that a pack accepts the writes or that they safely produce the named action. **No write was transmitted to any battery. Do not replay these values based only on this document.**

## Handshake write to `0x8901`

The connection setup enables notifications on service `0x8900` / characteristic `0x8901`, waits roughly 500 ms, then writes a fixed 17-byte payload consisting entirely of `0xFF` bytes to the same characteristic. It awaits a notification response for up to five seconds and treats a nonempty response with first byte `0x00` as success. See [transport and handshake](01-transport-and-handshake.md).

This payload is labeled an authentication payload in the app's logging strings. The code path shows a fixed app-embedded value and a one-byte response check; it does not establish a cryptographic protocol or the pack's authorization policy.

## Typed battery control operations

After the app has entered its ready state, its dispatcher maps these typed operations to three-byte arrays and writes them to service `0x8900` / characteristic `0x8910`.

| App model | Byte 0 | Byte 1 | Byte 2 | Static source mapping |
|---|---:|---:|---:|---|
| `SetPowerSwitch(isOn=true)` | `0x12` | `0x01` | `0x0B` | Exact array constructed in dispatcher |
| `SetPowerSwitch(isOn=false)` | `0x12` | `0x01` | `0x0A` | Exact array constructed in dispatcher |
| `ChargeMos(isOn=true)` | `0x11` | `0x01` | `0x0B` | Exact array constructed in dispatcher |
| `ChargeMos(isOn=false)` | `0x11` | `0x01` | `0x0A` | Exact array constructed in dispatcher |
| `DischargeMos(isOn=true)` | `0x12` | `0x01` | `0x0B` | Exact array constructed in dispatcher |
| `DischargeMos(isOn=false)` | `0x12` | `0x01` | `0x0A` | Exact array constructed in dispatcher |
| `Buzzer(isOn=true)` | `0x13` | `0x01` | `0x0B` | Exact array constructed in dispatcher |
| `Buzzer(isOn=false)` | `0x13` | `0x01` | `0x0A` | Exact array constructed in dispatcher |
| `Sleep` | `0x10` | `0x01` | `0x0A` | Exact array constructed in dispatcher |

The two power-path models `SetPowerSwitch` and `DischargeMos` map to the same first byte in the recovered dispatcher. This is recorded as-is; it is not normalized or explained by the APK.

The transport helper uses Android write-type constant `2` (`WRITE_TYPE_DEFAULT`) and awaits the characteristic-write callback. The callback status is a GATT transaction result only. No command-specific response frame, state reconciliation, interlock, retry policy, or physical action confirmation was found in this dispatcher path.

## Safety boundary

The arrays above can affect power, charge/discharge paths, buzzer, or sleep behavior if a compatible device accepts them. Static analysis cannot establish the battery's current state, safe operating conditions, model/firmware compatibility, or whether the application applies additional server-side or UI safeguards before the dispatcher is reached. Treat these as non-operational reverse-engineering notes, not commands to send.
