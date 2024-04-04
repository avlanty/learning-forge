package net.avlanty.learningforge.item;

import net.avlanty.learningforge.LearningForge;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs{

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LearningForge.MOD_ID);

    public static final RegistryObject<CreativeModeTab> LEARNING_FORGE = CREATIVE_MODE_TABS.register("learning_forge",() -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BANANA.get()))
            .title(Component.translatable("creativetab.learning_forge")).displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.BANANA.get());
            }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
