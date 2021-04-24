package cn.box;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class Command extends CommandBase {
    @Override
    public String getCommandName() {
        return "realping";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/realping";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args)  {
        if (args != null) {
            ChatComponentText text = new ChatComponentText("Check Ping....");
            text.getChatStyle().setColor(EnumChatFormatting.RED);
            sender.addChatMessage(new ChatComponentText("---------------"));
            sender.addChatMessage(text);
            Load.time.setBegin(System.currentTimeMillis());
            Minecraft.getMinecraft().thePlayer.sendChatMessage("/help");


        }

    }

    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }
}
