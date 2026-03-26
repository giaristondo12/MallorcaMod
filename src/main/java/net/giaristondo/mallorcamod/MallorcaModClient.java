package net.giaristondo.mallorcamod;

import net.fabricmc.api.ClientModInitializer;
import net.giaristondo.mallorcamod.item.ModItems;

public class MallorcaModClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        ModItems.registerModItems();
    }
}
