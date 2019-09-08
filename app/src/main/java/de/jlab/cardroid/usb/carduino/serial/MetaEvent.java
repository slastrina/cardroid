package de.jlab.cardroid.usb.carduino.serial;

public enum MetaEvent {
    REQUEST_CONNECTION(0x00),
    START_SNIFFING(0x0a),
    STOP_SNIFFING(0x0b),
    CHANGE_BAUD_RATE(0x72);

    private byte command;

    MetaEvent(int command) {
        this.command = (byte)command;
    }

    public static MetaSerialPacket serialize(MetaEvent event, byte[] payload) {
        return new MetaSerialPacket(event.command, payload);
    }

}
