package net.minelink.ctplus.compat.v1_17_R1;


import net.minecraft.network.chat.IChatBaseComponent;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.PacketPlayInAbilities;
import net.minecraft.network.protocol.game.PacketPlayInArmAnimation;
import net.minecraft.network.protocol.game.PacketPlayInBlockDig;
import net.minecraft.network.protocol.game.PacketPlayInBlockPlace;
import net.minecraft.network.protocol.game.PacketPlayInChat;
import net.minecraft.network.protocol.game.PacketPlayInClientCommand;
import net.minecraft.network.protocol.game.PacketPlayInCloseWindow;
import net.minecraft.network.protocol.game.PacketPlayInCustomPayload;
import net.minecraft.network.protocol.game.PacketPlayInEnchantItem;
import net.minecraft.network.protocol.game.PacketPlayInEntityAction;
import net.minecraft.network.protocol.game.PacketPlayInFlying;
import net.minecraft.network.protocol.game.PacketPlayInHeldItemSlot;
import net.minecraft.network.protocol.game.PacketPlayInKeepAlive;
import net.minecraft.network.protocol.game.PacketPlayInResourcePackStatus;
import net.minecraft.network.protocol.game.PacketPlayInSetCreativeSlot;
import net.minecraft.network.protocol.game.PacketPlayInSettings;
import net.minecraft.network.protocol.game.PacketPlayInSpectate;
import net.minecraft.network.protocol.game.PacketPlayInSteerVehicle;
import net.minecraft.network.protocol.game.PacketPlayInTabComplete;
import net.minecraft.network.protocol.game.PacketPlayInUpdateSign;
import net.minecraft.network.protocol.game.PacketPlayInUseEntity;
import net.minecraft.network.protocol.game.PacketPlayInWindowClick;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.EntityPlayer;
import net.minecraft.server.network.PlayerConnection;

public final class NpcPlayerConnection extends PlayerConnection {

    public NpcPlayerConnection(EntityPlayer entityplayer) {
        super(MinecraftServer.getServer(), new NpcNetworkManager(), entityplayer);
    }

    @Override
    public void disconnect(String s) {

    }

    @Override
    public void a(PacketPlayInSteerVehicle packetplayinsteervehicle) {

    }

    @Override
    public void a(PacketPlayInFlying packetplayinflying) {

    }

    @Override
    public void a(PacketPlayInBlockDig packetplayinblockdig) {

    }

    @Override
    public void a(PacketPlayInBlockPlace packetplayinblockplace) {

    }

    @Override
    public void a(PacketPlayInSpectate packetplayinspectate) {

    }

    @Override
    public void a(PacketPlayInResourcePackStatus packetplayinresourcepackstatus) {

    }

    @Override
    public void a(IChatBaseComponent ichatbasecomponent) {

    }

    @Override
    public void sendPacket(Packet packet) {

    }

    @Override
    public void a(PacketPlayInHeldItemSlot packetplayinhelditemslot) {

    }

    @Override
    public void a(PacketPlayInChat packetplayinchat) {

    }

    @Override
    public void chat(String s, boolean async) {

    }

    @Override
    public void a(PacketPlayInArmAnimation packetplayinarmanimation) {

    }

    @Override
    public void a(PacketPlayInEntityAction packetplayinentityaction) {

    }

    @Override
    public void a(PacketPlayInUseEntity packetplayinuseentity) {

    }

    @Override
    public void a(PacketPlayInClientCommand packetplayinclientcommand) {

    }

    @Override
    public void a(PacketPlayInCloseWindow packetplayinclosewindow) {

    }

    @Override
    public void a(PacketPlayInWindowClick packetplayinwindowclick) {

    }

    @Override
    public void a(PacketPlayInEnchantItem packetplayinenchantitem) {

    }

    @Override
    public void a(PacketPlayInSetCreativeSlot packetplayinsetcreativeslot) {

    }

    @Override
    public void a(PacketPlayInUpdateSign packetplayinupdatesign) {

    }

    @Override
    public void a(PacketPlayInKeepAlive packetplayinkeepalive) {

    }

    @Override
    public void a(PacketPlayInAbilities packetplayinabilities) {

    }

    @Override
    public void a(PacketPlayInTabComplete packetplayintabcomplete) {

    }

    @Override
    public void a(PacketPlayInSettings packetplayinsettings) {

    }

    @Override
    public void a(PacketPlayInCustomPayload packetplayincustompayload) {

    }

}
