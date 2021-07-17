package net.minelink.ctplus.compat.v1_17_R1;

import io.netty.channel.ChannelHandlerContext;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.SocketAddress;
import net.minecraft.network.EnumProtocol;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.PacketListener;
import net.minecraft.network.protocol.EnumProtocolDirection;
import net.minecraft.network.protocol.Packet;

public final class NpcNetworkManager extends NetworkManager {

    public NpcNetworkManager() {
        super(EnumProtocolDirection.a);
    }

    @Override
    public void channelActive(ChannelHandlerContext channelhandlercontext) throws Exception {

    }

    @Override
    public void setProtocol(EnumProtocol enumprotocol) {

    }

    @Override
    public void channelInactive(ChannelHandlerContext channelhandlercontext) {

    }

    @Override
    public void exceptionCaught(ChannelHandlerContext channelhandlercontext, Throwable throwable) {

    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelhandlercontext, Packet packet) {

    }

    @Override
    public void setPacketListener(PacketListener packetlistener) {

    }

    @Override
    public void sendPacket(Packet packet) {

    }

    @Override
    public void sendPacket(Packet packet, GenericFutureListener genericfuturelistener) {

    }

    @Override
    public SocketAddress getSocketAddress() {
        return new SocketAddress() {};
    }

    @Override
    public boolean isLocal() {
        return false;
    }

    @Override
    public boolean isConnected() {
        return true;
    }

    @Override
    public void stopReading() {

    }

    @Override
    public void handleDisconnection() {

    }

}
