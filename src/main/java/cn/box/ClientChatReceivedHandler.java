package cn.box;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientChatReceivedHandler {
    @SubscribeEvent
    public void onClientChatReceivedEvent(ClientChatReceivedEvent event) {
        String message = event.message.getFormattedText().trim();
        System.out.println(message);
        String hypixelHelpStr = "§e§lHYPIXEL服务器§r";
        if (message.contains(hypixelHelpStr)) {
            Load.time.setEnd(System.currentTimeMillis());
            ChatComponentText delay = new ChatComponentText(Load.time.getMs());

            delay.getChatStyle().setColor(EnumChatFormatting.DARK_GREEN);
            EntityPlayerSP player = Minecraft.getMinecraft().thePlayer;


            NetHandlerPlayClient handler = player.sendQueue;
            NetworkPlayerInfo info = handler.getPlayerInfo(handler.getGameProfile().getId());
            ChatComponentText delay2 = new ChatComponentText("服务器返回的TCP延迟:"+ info.getResponseTime());
            delay2.getChatStyle().setColor(EnumChatFormatting.GOLD);
            player.addChatMessage(delay);
            player.addChatMessage(delay2);
            player.addChatMessage(new ChatComponentText("---------------"));
        }
    }
}
